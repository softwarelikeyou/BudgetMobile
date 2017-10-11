package com.budgetprepay.webservice.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.util.Base64;
import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.utils.writer.MTOMAwareOMBuilder;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.util.WSSecurityUtil;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

import com.budgetprepay.model.entity.ClassOfService;
import com.budgetprepay.model.entity.User;
import com.budgetprepay.model.facade.ClassOfServiceFacade;
import com.budgetprepay.viewcontroller.util.ResourceUtil;
import com.budgetprepay.webservice.endpoints.VerizonEndpoint;
import com.verizonwireless.oas.AddDeleteType;
import com.verizonwireless.oas.CityType;
import com.verizonwireless.oas.CountryType;
import com.verizonwireless.oas.DirectionalIndicatorType;
import com.verizonwireless.oas.DrvLicenseStateType;
import com.verizonwireless.oas.FeatureType;
import com.verizonwireless.oas.LnpAddressType;
import com.verizonwireless.oas.LnpNameType;
import com.verizonwireless.oas.LnpPersonNameType;
import com.verizonwireless.oas.LnpType;
import com.verizonwireless.oas.MdnType;
import com.verizonwireless.oas.MessageHeaderType;
import com.verizonwireless.oas.NextAvailableMDNType;
import com.verizonwireless.oas.NpaNxxType;
import com.verizonwireless.oas.OasSingleCharacterType;
import com.verizonwireless.oas.OasString10Type;
import com.verizonwireless.oas.OasString160Type;
import com.verizonwireless.oas.OasString60Type;
import com.verizonwireless.oas.OasStringType;
import com.verizonwireless.oas.OspAccountNoType;
import com.verizonwireless.oas.PersonNameType;
import com.verizonwireless.oas.PinType;
import com.verizonwireless.oas.PlanType;
import com.verizonwireless.oas.ReferenceNumberType;
import com.verizonwireless.oas.StateType;
import com.verizonwireless.oas.StreetNameType;
import com.verizonwireless.oas.ZipCodeType;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub;
import com.vzw.www.wcct._int.api.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.EndDate_type1;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.ProviderID_type1;
import com.vzw.www.wcct._int.api.cdr.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpServiceStub.ProviderID_type3;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub;
import com.vzw.www.wcct._int.api.west.WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub;
import com.vzw.www.wwct._int.api.west.WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub;

public class VerizonUtil extends CommonUtil {
		
	public enum RequestType {
		ORDER,
		STATUS,
		INQUIRE,
		PRLINQUIRE
	}
	
	public enum OrderType {
		MNTMLND,
		INQSLND,
		INQPRL,
		QUALINFO
	}

	public static void validatePlanCode(final User user, final String planCode) throws Exception {
		if (user == null)
			throw new Exception("ERROR: user is null");
		if (planCode == null)
			throw new Exception("ERROR: plan code is null");
		ClassOfService classOfService = ClassOfServiceFacade.retrieveByName(planCode);
		if (classOfService == null)
			throw new Exception("ERROR-Invalid plan code");
		else if (!user.getGroup().getClassOfServices().contains(classOfService))
			throw new Exception("ERROR-Invalid plan code");
	}
	
	public static String JAXB2XML(final Object object) throws Exception {
		return JAXB2XML(object, VerizonEndpoint.NAMESPACE_URI);
	}
	
	public static String pojo2XML(final XmlObject object) throws Exception {
		XmlOptions xmlOptions = new XmlOptions();
		xmlOptions.setUseDefaultNamespace();
		xmlOptions.setSavePrettyPrint();
		xmlOptions.setSavePrettyPrintIndent(1);
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n" + object.xmlText(xmlOptions);
	}
	
	public static Object XML2Pojo(final String xml, final Class<?> clazz) throws Exception {
		Object object = clazz.newInstance();
		JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
		Unmarshaller um = jaxbContext.createUnmarshaller();
		object = um.unmarshal(new ByteArrayInputStream(xml.getBytes()));
		return object;
    }
	
	public static String ADB2XML(final ADBBean bean, final QName qName) throws Exception {
		 MTOMAwareOMBuilder omwriter = new MTOMAwareOMBuilder(); 
		 bean.serialize(qName, omwriter);    
         return omwriter.getOMElement().toStringWithConsume();
	}
	
	public static String writeADBBean(ADBBean aBean) throws Exception {
	    if (null == aBean)
	        return "null";
	    OMElement omElement;
	    try {
	        QName qname;
	        try {
	            Field qnameField = aBean.getClass().getField("MY_QNAME");
	            qname = (QName)qnameField.get(aBean);
	        } 
	        catch (Exception e) {
	            qname = new QName(aBean.getClass().getCanonicalName());
	        }
	        Method getOMElement = aBean.getClass().getMethod("getOMElement", QName.class, OMFactory.class);
	        omElement = (OMElement)getOMElement.invoke(aBean, qname, OMAbstractFactory.getOMFactory());
	    } 
	    catch (Exception e) {
	        throw new XMLStreamException("Cannot serialize " + aBean.toString(), e);
	    } 
	    catch (NoClassDefFoundError e) {
	        throw new XMLStreamException("Cannot serialize " + aBean.toString(), e);
	    }
	    String serialized = omElement.toStringWithConsume();
	    return serialized;
	}
	
	public static String getDateTime(final String format) throws Exception {
		DateFormat formatter = new SimpleDateFormat(format);
    	return formatter.format(new Date());
	}
	
	public static String getDateTimeZulu(final String format) throws Exception {
		DateFormat zulu = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    	zulu.setTimeZone(TimeZone.getTimeZone("UTC"));
    	Calendar rightNow = Calendar.getInstance();
    	rightNow.setTime(new Date());
    	return zulu.format(rightNow.getTime());
	}
	
	public static OasStringType getOasStringType(final String value) throws Exception {
		OasStringType oasStringType = OasStringType.Factory.newInstance();
		oasStringType.setStringValue(value);
		return oasStringType;
	}
	
	public static com.budgetprepay.webservice.client.verizon.rss.pojo.OasStringType getOasStringType38(final String value) throws Exception {
		com.budgetprepay.webservice.client.verizon.rss.pojo.OasStringType oasStringType = new com.budgetprepay.webservice.client.verizon.rss.pojo.OasStringType();
		oasStringType.setValue(value);
		return oasStringType;
	}
	
	public static OasString60Type getOasString60Type(final String value) throws Exception {
		OasString60Type oasStringType = OasString60Type.Factory.newInstance();
		oasStringType.setStringValue(value);
		return oasStringType;
	}
	
	public static OasString160Type getOasString160Type(final String value) throws Exception {
		OasString160Type oasStringType = OasString160Type.Factory.newInstance();
		oasStringType.setStringValue(value);
		return oasStringType;
	}
	
	public static DirectionalIndicatorType.Enum getDirectionalIndicatorType(final String value) {
        switch(value) {
		    case "E":
			    return DirectionalIndicatorType.E;
		    case "W":
			    return DirectionalIndicatorType.W;
		    case "S":
			    return DirectionalIndicatorType.S;
		    case "N":
			    return DirectionalIndicatorType.N;
		    case "NE":
			    return DirectionalIndicatorType.NE;
		    case "NW":
			    return DirectionalIndicatorType.NW;
		    case "SE":
			    return DirectionalIndicatorType.SE;
		    case "SW":
			    return DirectionalIndicatorType.SW;
	    }
        return DirectionalIndicatorType.E;
	}
	
	public static OasString10Type getOasString10Type(final String value) throws Exception {
		OasString10Type oasStringType = OasString10Type.Factory.newInstance();
		oasStringType.setStringValue(value);
		return oasStringType;
	}
	
	public static OspAccountNoType getOspAccountNoType(final String value) throws Exception {
		OspAccountNoType aspAccountNoType = OspAccountNoType.Factory.newInstance();
		aspAccountNoType.setStringValue(value);
		return aspAccountNoType;
	}

	public static PersonNameType getPersonNameType(final String value) throws Exception {
		PersonNameType personNameType = PersonNameType.Factory.newInstance();
		personNameType.setStringValue(value);
		return personNameType;
	}
	
	public static PinType getPinType(final String value) throws Exception {
		PinType pinType = PinType.Factory.newInstance();
		pinType.setStringValue(value);
		return pinType;
	}
	
	public static OasSingleCharacterType getOasSingleCharacterType(final String value) throws Exception {
		OasSingleCharacterType oasSingleCharacterType = OasSingleCharacterType.Factory.newInstance();
		oasSingleCharacterType.setStringValue(value);
		return oasSingleCharacterType;
	}

	public static ReferenceNumberType getReferenceNumberType() throws Exception {
		ReferenceNumberType referenceNumber = ReferenceNumberType.Factory.newInstance();
		referenceNumber.setStringValue(ResourceUtil.get("verizon.rss.reference.number.prefix") + VerizonUtil.getRandom());
		return referenceNumber;
	}
	
	public static ReferenceNumberType getReferenceNumberType(final String value) throws Exception {
		if (value == null)
			throw new Exception("Reference number cannot be null");
		ReferenceNumberType referenceNumber = ReferenceNumberType.Factory.newInstance();
		referenceNumber.setStringValue(value);
		return referenceNumber;
	}
	
	public static com.budgetprepay.webservice.client.verizon.rss.pojo.ReferenceNumberType getReferenceNumberType38(final String value) throws Exception {
		if (value == null)
			throw new Exception("Reference number cannot be null");
		com.budgetprepay.webservice.client.verizon.rss.pojo.ReferenceNumberType referenceNumber = new com.budgetprepay.webservice.client.verizon.rss.pojo.ReferenceNumberType();
		referenceNumber.setValue(value);
		return referenceNumber;
	} 
	public static PlanType getPlanType(final String value) throws Exception {
		if (value == null)
			throw new Exception("Plan type cannot be null");
		PlanType planType = PlanType.Factory.newInstance();
		planType.setPlanCode(VerizonUtil.getOasStringType(value));
		return planType;
	}
	
	public static MdnType getMdnType(final String value) throws Exception {
		if (value == null)
			throw new Exception("MDN cannot be null");
		MdnType mdnType = MdnType.Factory.newInstance();
		mdnType.setStringValue(value);
		return mdnType;
	}
	
	public static WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Mdn_type1 getMdn_type1WEST(final String value) throws Exception {
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Mdn_type1 mdn = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Mdn_type1();
		try {
	        mdn.setMdn_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("MDN format invalid");
		}
		return mdn;
	}
	
	public static WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Pin_type1 getPin_type1Update(final String value) throws Exception {
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Pin_type1 pin = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Pin_type1();
		try {
	        pin.setPin_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("PIN format invalid");
		}
		return pin;
	}
	
	public static WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Pin_type1 getPin_type1Void(final String value) throws Exception {
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Pin_type1 pin = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Pin_type1();
		try {
	        pin.setPin_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("PIN format invalid");
		}
		return pin;
	}
	
	public static WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.BeginningSerial_type1 getBeginningSerial_type1Void(final String value) throws Exception {
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.BeginningSerial_type1 serial = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.BeginningSerial_type1();
		try {
	        serial.setBeginningSerial_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Serial format invalid");
		}
		return serial;
	}
	
	public static WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.EndingSerial_type1 getEndingSerial_type1Void(final String value) throws Exception {
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.EndingSerial_type1 serial = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.EndingSerial_type1();
		try {
	        serial.setEndingSerial_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Serial format invalid");
		}
		return serial;
	}
	
	public static WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Group_type7 getGroup_type7Void(final String value) throws Exception {
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Group_type7 group = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Group_type7();
		try {
	        group.setGroup_type6(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Group format invalid");
		}
		return group;
	}
	
	public static WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Group_type1 getGroup_type1Void(final String value) throws Exception {
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Group_type1 group = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Group_type1();
		try {
	        group.setGroup_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Group format invalid");
		}
		return group;
	}
	
	public static WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type7 getProviderCode_type7Void(final String value) throws Exception {
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type7 provider = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type7();
		try {
	        provider.setProviderCode_type6(Integer.valueOf(value));
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format invalid");
		}
		return provider;
	}
	
	public static EndDate_type1 getEndDate(final String date) throws Exception {
		EndDate_type1 endDate = new EndDate_type1();
		try {
	        endDate.setEndDate_type0(date);
		}
		catch (RuntimeException e) {
			throw new Exception("End date must be of format MM/dd/yyyy");
		}
		return endDate;
	}
	
	public static ProviderID_type1 getProviderId1(final String value) throws Exception {
		ProviderID_type1 provider = new ProviderID_type1();
		try {
			provider.setProviderID_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static ProviderID_type3 getProviderId3(final String value) throws Exception {
		ProviderID_type3 provider = new ProviderID_type3();
		try {
			provider.setProviderID_type2(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Batch_type7 getBatch_type7Search(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Batch_type7 batch = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Batch_type7();
		try {
			batch.setBatch_type6(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Batch format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Batch format is invalid");
		}
		return batch;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Batch_type1 getBatch_type1Search(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Batch_type1 batch = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Batch_type1();
		try {
			batch.setBatch_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Batch format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Batch format is invalid");
		}
		return batch;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Group_type9 getGroup_type9Search(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Group_type9 group = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Group_type9();
		try {
			group.setGroup_type8(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Group format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Group format is invalid");
		}
		return group;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Group_type1 getGroup_type1Search(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Group_type1 group = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Group_type1();
		try {
			group.setGroup_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Group format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Group format is invalid");
		}
		return group;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Group_type3 getGroup_type3Search(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Group_type3 group = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Group_type3();
		try {
			group.setGroup_type2(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Group format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Group format is invalid");
		}
		return group;
	}
	
	public static WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Group_type3 getGroup_type3Update(final String value) throws Exception {
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Group_type3 group = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Group_type3();
		try {
			group.setGroup_type2(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Group format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Group format is invalid");
		}
		return group;
	}
	
	public static WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Group_type5 getGroup_type5Update(final String value) throws Exception {
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Group_type5 group = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Group_type5();
		try {
			group.setGroup_type4(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Group format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Group format is invalid");
		}
		return group;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Mdn_type1 getMdn_type1Search(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Mdn_type1 mdn = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Mdn_type1();
		try {
			mdn.setMdn_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("MDN format is invalid");
		}
		catch (Exception e) {
			throw new Exception("MDN format is invalid");
		}
		return mdn;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Pin_type1 getPin_type1Search(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Pin_type1 pin = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Pin_type1();
		try {
			pin.setPin_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("PIN format is invalid");
		}
		catch (Exception e) {
			throw new Exception("PIN format is invalid");
		}
		return pin;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.ProviderCode_type5 getProviderCode_type5Search(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.ProviderCode_type5 provider = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.ProviderCode_type5();
		try {
			provider.setProviderCode_type4(Integer.valueOf(value));
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.ProviderCode_type1 getProviderCode_type1Search(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.ProviderCode_type1 provider = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.ProviderCode_type1();
		try {
			provider.setProviderCode_type0(Integer.valueOf(value));
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.ProviderCode_type3 getProviderCode_type3Search(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.ProviderCode_type3 provider = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.ProviderCode_type3();
		try {
			provider.setProviderCode_type2(Integer.valueOf(value));
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.ProviderId_type1 getProviderId_type1Update(final String value) throws Exception {
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.ProviderId_type1 provider = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.ProviderId_type1();
		try {
			provider.setProviderId_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format " + value + " is invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format " + value + " is invalid");
		}
		return provider;
	}
	
	public static WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ProviderCode_type3 getProviderCode_type3Update(final String value) throws Exception {
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ProviderCode_type3 provider = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ProviderCode_type3();
		try {
			provider.setProviderCode_type2(Integer.valueOf(value));
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ProviderCode_type5 getProviderCode_type5Update(final String value) throws Exception {
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ProviderCode_type5 provider = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ProviderCode_type5();
		try {
			provider.setProviderCode_type4(Integer.valueOf(value));
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Serial_type1E getSerial_type1ESearch(final String value) throws Exception {
		WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Serial_type1E serial = new WESTCoarseGrainSearchInterfaceExport1_WESTCoarseGrainSearchInterfaceHttpServiceStub.Serial_type1E();
		try {
			serial.setSerial_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Serial format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Serial format is invalid");
		}
		return serial;
	}
	
	public static WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ProviderCode_type1 getProviderId1Update(final String value) throws Exception {
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ProviderCode_type1 provider = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.ProviderCode_type1();
		try {
			provider.setProviderCode_type0(Integer.valueOf(value));
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type1 getProviderId1Void(final String value) throws Exception {
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type1 provider = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type1();
		try {
			provider.setProviderCode_type0(Integer.valueOf(value));
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type3 getProviderCode_type3Void(final String value) throws Exception {
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type3 provider = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type3();
		try {
			provider.setProviderCode_type2(Integer.valueOf(value));
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type5 getProviderCode_type5Void(final String value) throws Exception {
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type5 provider = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.ProviderCode_type5();
		try {
			provider.setProviderCode_type4(Integer.valueOf(value));
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		catch (Exception e) {
			throw new Exception("Provider format is invalid");
		}
		return provider;
	}
	
	public static WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Batch_type1 getBatch_type1Void(final String value) throws Exception {
		WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Batch_type1 batch = new WESTCoarseGrainVoidInterfaceExport1_WESTCoarseGrainVoidInterfaceHttpServiceStub.Batch_type1();
		try {
			batch.setBatch_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		return batch;
	}
	
	public static WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Batch_type3 getBatch_type3Update(final String value) throws Exception {
		WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Batch_type3 batch = new WESTCoarseGrainUpdateInterfaceExport1_WESTCoarseGrainUpdateInterfaceHttpServiceStub.Batch_type3();
		try {
			batch.setBatch_type2(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Provider format is invalid");
		}
		return batch;
	}
	
	public static AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Amount_type1 getAmount_type1Update(final String value) throws Exception {
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Amount_type1 amount = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Amount_type1();
		try {
			amount.setAmount_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("Amount format " + value + " is invalid");
		}
		catch (Exception e) {
			throw new Exception("Amount format " + value + " is invalid");
		}
		return amount;
	}
	
	public static AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Rsid_type1 getRsid_type1Update(final String value) throws Exception {
		AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Rsid_type1 rsid = new AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpServiceStub.Rsid_type1();
		try {
			rsid.setRsid_type0(value);
		}
		catch (RuntimeException e) {
			throw new Exception("RSID format " + value + " is invalid");
		}
		catch (Exception e) {
			throw new Exception("RSID format " + value + " is invalid");
		}
		return rsid;
	}
	
	public static FeatureType[] addFeatures(final List<com.budgetprepay.webservice.pojos.verizon.FeatureType> features) throws Exception {
		if (features == null)
			throw new Exception("Features cannot be null");
		FeatureType[] featureTypes = new FeatureType[features.size()];
		int index = 0;
		for (com.budgetprepay.webservice.pojos.verizon.FeatureType feature : features) {
			FeatureType featureType = FeatureType.Factory.newInstance();
			featureType.setFeatureCode(VerizonUtil.getOasStringType(feature.getFeatureCode()));
			AddDeleteType addDeleteType = AddDeleteType.Factory.newInstance();
			if (feature.getSubscribe().toString().equals("A"))
			    addDeleteType.setStringValue("A");
			else
				addDeleteType.setStringValue("D");
			featureType.setSubscribe(addDeleteType);
			featureTypes[index++] = featureType;
		}
		return featureTypes;
	}
	
	public static NextAvailableMDNType nextMDN_NPANXX(final String npaNxx) throws Exception {
		if (npaNxx == null)
			throw new Exception("NpaNxx cannot be null");
		NextAvailableMDNType nextAvaliableMDNType = NextAvailableMDNType.Factory.newInstance();
		NpaNxxType npaNxxType = NpaNxxType.Factory.newInstance();
		npaNxxType.setStringValue(npaNxx);
		nextAvaliableMDNType.setNpaNxx(npaNxxType);
		return nextAvaliableMDNType;
	}
	
	public static NextAvailableMDNType nextMDN_ZIPCODE(final String zipCode) throws Exception {
		if (zipCode == null)
			throw new Exception("Zip code cannot be null");
		NextAvailableMDNType nextAvaliableMDNType = NextAvailableMDNType.Factory.newInstance();
		ZipCodeType zipCodeType = ZipCodeType.Factory.newInstance();
		zipCodeType.setStringValue(zipCode);
		nextAvaliableMDNType.setZipCode(zipCodeType);
		return nextAvaliableMDNType;
	}
	
	public static NextAvailableMDNType nextMDN_CITY_STATE(final String city, final String state) throws Exception {
		if (city == null)
			throw new Exception("City cannot be null");
		if (state == null)
			throw new Exception("State cannot be null");
		NextAvailableMDNType nextAvaliableMDNType = NextAvailableMDNType.Factory.newInstance();
		CityType cityType = CityType.Factory.newInstance();
		cityType.setStringValue(city);
		nextAvaliableMDNType.setCity(cityType);
		DrvLicenseStateType stateType = DrvLicenseStateType.Factory.newInstance();
		stateType.setStringValue(state);
		nextAvaliableMDNType.setState(stateType);
		return nextAvaliableMDNType;
	}
	
	public static LnpType getName(final String first,
			                      final String initial, 
			                      final String last,
			                      final String address1,
			                      final String address2,
			                      final String city,
			                      final String state,
			                      final String zip,
			                      final String country) throws Exception {
		if (first == null)
			throw new Exception("First name cannot be null");
		if (last == null)
			throw new Exception("Last name cannot be null");
		if (address1 == null)
			throw new Exception("Address 1 cannot be null");
		if (city == null)
			throw new Exception("City cannot be null");
		if (state == null)
			throw new Exception("State cannot be null");
		if (zip == null)
			throw new Exception("Zip code cannot be null");
		
		LnpType lnpType = LnpType.Factory.newInstance();
        LnpNameType lnpName = LnpNameType.Factory.newInstance();
        LnpPersonNameType personName = LnpPersonNameType.Factory.newInstance();
        
        PersonNameType firstName = PersonNameType.Factory.newInstance();
        firstName.setStringValue(first);
        personName.setFirst(firstName);
        
        if (initial != null) {
            OasSingleCharacterType middleInitial = OasSingleCharacterType.Factory.newInstance();
            middleInitial.setStringValue(initial);
            personName.setMiddleInitial(middleInitial);
	    }
        
        PersonNameType lastName = PersonNameType.Factory.newInstance();
        lastName.setStringValue(last);
        personName.setLast(lastName);
        
        lnpName.setName(personName);
        lnpType.setLnpName(lnpName);
        
        LnpAddressType addressType = LnpAddressType.Factory.newInstance();
        StreetNameType address1Type = StreetNameType.Factory.newInstance();
        address1Type.setStringValue(address1);
        addressType.setAddressLine1(address1Type);
        if (address2 != null) {
            StreetNameType address2Type = StreetNameType.Factory.newInstance();
            address2Type.setStringValue(address1);
            addressType.setAddressLine2(address2Type);
        }
        
        CityType cityType = CityType.Factory.newInstance();
        cityType.setStringValue(city);
        addressType.setCity(cityType);
        
        StateType stateType = StateType.Factory.newInstance();
        stateType.setStringValue(state);
        addressType.setState(stateType);
        
        ZipCodeType zipType = ZipCodeType.Factory.newInstance();
        zipType.setStringValue(zip);
        addressType.setZip(zipType);
        
        if (country != null) {
            CountryType countryType = CountryType.Factory.newInstance();
            countryType.setStringValue(country);
            addressType.setCountry(countryType);
        }
        
        lnpType.setAddress(addressType);
        return lnpType;
	}
	
	public static MessageHeaderType getMessageHeader(final ReferenceNumberType referenceType, final String vendorId, final RequestType requestType, final OrderType orderType) throws Exception {
		MessageHeaderType messageHeader = MessageHeaderType.Factory.newInstance();
		messageHeader.setReferenceNumber(referenceType);
		messageHeader.setVendorId(vendorId);
		messageHeader.setRequestType(requestType.name());
		messageHeader.setOrderType(orderType.name());
		messageHeader.setReturnURL(ResourceUtil.get("verizon.rss.callback.url"));
		messageHeader.setAsyncErrorURL(ResourceUtil.get("verizon.rss.callback.url"));
		return messageHeader;
	}
	
	public static com.budgetprepay.webservice.client.verizon.rss.pojo.MessageHeaderType getMessageHeader38(final com.budgetprepay.webservice.client.verizon.rss.pojo.ReferenceNumberType referenceType, final String vendorId, final RequestType requestType, final OrderType orderType) throws Exception {
		com.budgetprepay.webservice.client.verizon.rss.pojo.MessageHeaderType messageHeader = new com.budgetprepay.webservice.client.verizon.rss.pojo.MessageHeaderType();
		messageHeader.setReferenceNumber(referenceType);
		messageHeader.setVendorId(vendorId);
		messageHeader.setRequestType(requestType.name());
		messageHeader.setOrderType(orderType.name());
		messageHeader.setReturnURL(ResourceUtil.get("verizon.rss.callback.url"));
		messageHeader.setAsyncErrorURL(ResourceUtil.get("verizon.rss.callback.url"));
		return messageHeader;
	}
	
	public static String getDefaultVendorId() throws Exception {
		return ResourceUtil.get("verizon.rss.vendorid");
	}
	
	public static String fixRootAttributes(String document) throws Exception {
		String text2Replace = "xmlns=\"http://www.verizonwireless.com/oas\"";
		StringBuilder text2Insert = new StringBuilder();
		text2Insert.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" ");
		text2Insert.append("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" ");
		text2Insert.append("xsi:schemaLocation=\"http://www.verizonwireless.com/oas http://localhost:8080/schema/reseller.xsd\" ");
		text2Insert.append("xmlns=\"http://www.verizonwireless.com/oas\"");
		return document.replaceAll(text2Replace, text2Insert.toString());
	}
	
	public static XmlObject fixOasOrderInquiry(final String xml) throws Exception {
	    return XmlObject.Factory.parse(xml.replaceAll("<oasOrderResponse>", "<oasOrderResponse xmlns=\"http://www.verizonwireless.com/oas\">"));
	}
	
	public static XmlObject fixOasValidateDeviceResponse(final String xml) throws Exception {
	    return XmlObject.Factory.parse(xml.replaceAll("<oasValidateDeviceResponse>", "<oasValidateDeviceResponse xmlns=\"http://www.verizonwireless.com/oas\">"));
	}
	
	public static XmlObject fixLineInquiry(final String xml) throws Exception {
	    return XmlObject.Factory.parse(xml.replaceAll("<resellerLineResponse>", "<resellerLineResponse xmlns=\"http://www.verizonwireless.com/oas\">"));
	}
	
	public static boolean validateMEID(final String meid) throws Exception {
		if (meid.length() == 8)
			return true;
		if (meid.length() == 11)
			return true;
		if (meid.length() == 14)
			return true;
		return false;
	}
	
	public ReturnMessage postXml(final String xml, final String urlString) throws Exception {
		ReturnMessage returnMessage = new ReturnMessage();
		URL url = null;
		HttpURLConnection connection = null;
		
		try {
			url = new URL(urlString);
			connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setReadTimeout(5000);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/xml");
			OutputStream os = connection.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			osw.write(xml);
			osw.flush();
			osw.close();
			
			returnMessage.setCode(connection.getResponseCode());
			returnMessage.setText(read(connection.getInputStream()));
		}
		catch (Exception e) {
			returnMessage.setCode(connection.getResponseCode());
			returnMessage.setText("Unable to post xml to : " + urlString);
		}
		finally {
			if (connection != null)
			    connection.disconnect();
		}
		return returnMessage;
	}
	
	public static String read(final InputStream inputStream) throws Exception {
		if (inputStream == null)
			throw new Exception("Input stream cannot be null");
		
	    StringBuilder stringBuilder = new StringBuilder();
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
	    char[] charBuffer = new char[128];
	    int bytesRead = -1;
	    while ((bytesRead = bufferedReader.read(charBuffer)) > 0)
	        stringBuilder.append(charBuffer, 0, bytesRead);
	    bufferedReader.close();
	    return stringBuilder.toString();
	}
	
	public static OMElement createSecurityHeader(final String username, final String password) throws Exception {
		OMFactory omFactory = OMAbstractFactory.getOMFactory();
        OMElement omSecurityElement = omFactory.createOMElement(WSConstants.WSSE_LN, WSConstants.WSSE_NS, WSConstants.WSSE_PREFIX);
        omSecurityElement.declareNamespace(WSConstants.WSU_NS, WSConstants.WSU_PREFIX);
        omSecurityElement.addAttribute("soapenv:mustUnderstand", "1", null);
        
        try {
            OMElement omusertoken = omFactory.createOMElement(WSConstants.USERNAME_TOKEN_LN, WSConstants.WSSE_NS, WSConstants.WSSE_PREFIX);
            omusertoken.addAttribute("wsu:Id", "UsernameToken-7", null);
        
            OMElement omuserName = omFactory.createOMElement(WSConstants.USERNAME_LN, WSConstants.WSSE_NS, WSConstants.WSSE_PREFIX);
            omuserName.setText(username);
            omusertoken.addChild(omuserName);
        
            OMElement omPassword = omFactory.createOMElement(WSConstants.PASSWORD_LN, WSConstants.WSSE_NS, WSConstants.WSSE_PREFIX );
            omPassword.addAttribute(WSConstants.PASSWORD_TYPE_ATTR, WSConstants.PASSWORD_TEXT, null );
            omPassword.setText(password);
            omusertoken.addChild(omPassword);
        
            byte[] nonceValue = null;
            nonceValue = WSSecurityUtil.generateNonce(16);
     
            OMElement omNonce = omFactory.createOMElement(WSConstants.NONCE_LN, WSConstants.WSSE_NS, WSConstants.WSSE_PREFIX );
            omNonce.addAttribute("EncodingType", WSConstants.SOAPMESSAGE_NS + "#Base64Binary", null );
            omNonce.setText(Base64.encode(nonceValue));
            omusertoken.addChild(omNonce);
        
            DateFormat zulu = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    	    zulu.setTimeZone(TimeZone.getTimeZone("UTC"));
    	    Calendar rightNow = Calendar.getInstance();
        	rightNow.setTime(new Date());
            OMElement omCreated = omFactory.createOMElement(WSConstants.CREATED_LN, WSConstants.WSU_NS, WSConstants.WSU_PREFIX);
            omCreated.setText(zulu.format(rightNow.getTime()));
            omusertoken.addChild(omCreated);
        
            omSecurityElement.addChild(omusertoken);
        }
        catch (Exception e) {
        	throw new Exception("Unable to add WS-Security", e);
        }
        return omSecurityElement;
	}
	
	private static Map<String, String> CCTError = new HashMap<String, String>();
	
	static {
		CCTError.put("000001","Unknown Error");
		CCTError.put("000002","User is not authorized");
		CCTError.put("000003","Failed to retrieve Transaction ID");
		CCTError.put("000004","Database Error");
		CCTError.put("000005","Invalid Input");
		CCTError.put("000006","No Records Found");
		CCTError.put("000007","Transaction Timed Out");
		CCTError.put("000008","Failure in Authorization Module");
		CCTError.put("000009","Adjustment amount exceeds user max amount");
		CCTError.put("000099","System Overload");
		CCTError.put("000100","User Authorization System Connection Failure");
		CCTError.put("000101","Invalid Field Returned");
		CCTError.put("000102","Unable to Authorize User");
		CCTError.put("000103","MDN not found");
		CCTError.put("000104","RSS Database error");
		CCTError.put("000400","Unknown Backend Error");
		CCTError.put("000401","Switch Network Connection Failure");
		CCTError.put("000200","Unknown Backend Error");
		CCTError.put("000201","Accounting system Connection Failure");
		CCTError.put("001100","Calls revert failed due to having already been reverted.");
		CCTError.put("001101","Calls revert failed due to backend system call failure.");
		CCTError.put("001102","Revert call failed for unknown reason");
		CCTError.put("001103","Bad ending account balance received back from reverted call.");
		CCTError.put("001104","Failed to mark reverted call as reverted, (though call amount was credited in external system).");
		CCTError.put("001105","RSID value is null. RSID found in Usage request by ROWID was not found or set to null");
		CCTError.put("001106","Usage data for ROWID was not found or not retrieved from usage systerm.");
		CCTError.put("020001","Invalid or missing parameters");
		CCTError.put("020002","Invalid Subscriber Details");
		CCTError.put("020004","Invalid Merchant ID");
		CCTError.put("020007","Invalid Currency Label.");
		CCTError.put("020035","Insufficient funds or balance");
		CCTError.put("020037","Transaction ID used");
		CCTError.put("020038","Transaction ID Committed");
		CCTError.put("020041","Transaction ID in progress");
		CCTError.put("020043","Cannot find the last recharge record event");
		CCTError.put("020106","Invalid SubscriberIDType.");
		CCTError.put("020111","Improper XML syntax.");
		CCTError.put("020112","SERVLET XML VALIDATION ERROR");
		CCTError.put("020145","Server eCS could not be located for MDN");
		CCTError.put("020165","Subscriber not found in eSM");
		CCTError.put("000402","Invalid MDN.");
		CCTError.put("000403","Invalid XML format to switch network.");
		CCTError.put("060000","Unknown Error while attempting to access PIN System");
		CCTError.put("060001","PIN System Connection Failure");
		CCTError.put("060701","Invalid MDN");
		CCTError.put("060702","Invalid PIN");
		CCTError.put("060703","MDN not found");
		CCTError.put("060704","PIN not found");
		CCTError.put("060705","PIN is already active");
		CCTError.put("060706","PIN has retired");
		CCTError.put("060707","PIN has expired");
		CCTError.put("060710","Database error, PIN is locked by another transaction or database/timeout error has occurred");
		CCTError.put("060711","No activations for this MDN");
		CCTError.put("060712","Exceeded Daily activation Limit");
		CCTError.put("060713","Host Error");
		CCTError.put("060715","Technical difficulties with Surepay platform");
		CCTError.put("060717","Unauthorized Request");
		CCTError.put("060718","Unauthorized Request");
		CCTError.put("060719","Invalid Request Error message from the prepaid platform");
		CCTError.put("060722","Transaction Timed out");
		CCTError.put("060726","Specified Group not found in database");
		CCTError.put("060725","Specified Provider Code not found in database.");
		CCTError.put("060727","Specified Batch not found in database");
		CCTError.put("060728","Specified Serial not found in database");
		CCTError.put("060729","Entire Serial Number Range is not contained in one Group.");
		CCTError.put("000007","JDBC Connection Timed Out");
		CCTError.put("000300","Failed to Establish JDBC Connection");
		CCTError.put("000006","No records were returned for the specified input.");
	}
	
	public static String getCCTErrorDescriton(final String errorCode) {
		return CCTError.get(errorCode);
	}
	
	public static Double getDemonination(final String value) throws Exception {
		try {
			return Double.valueOf(value);
		}
		catch (Exception e) {
			throw new Exception ("Demonination format invalid");
		}
	}
	
	public static Date getExpirationDate(final String value) throws Exception {
		try {
			DateFormat formatter = new SimpleDateFormat(SHORT_DATE_FORMAT);
			return formatter.parse(value);
		}
		catch (Exception e) {
			throw new Exception ("Expiration date must be of format " + SHORT_DATE_FORMAT);
		}
	}
}
