package com.budgetprepay.verizon.rss.pojos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _ResellerAddSubscriberTypeIccid_QNAME = new QName("http://www.verizonwireless.com/oas", "iccid");
    private final static QName _ResellerAddSubscriberTypePortInFlag_QNAME = new QName("http://www.verizonwireless.com/oas", "portInFlag");
    private final static QName _ResellerAddSubscriberTypeMobileIPAddress_QNAME = new QName("http://www.verizonwireless.com/oas", "mobileIPAddress");
    private final static QName _ResellerAddSubscriberTypeSubOrgID_QNAME = new QName("http://www.verizonwireless.com/oas", "SubOrgID");
    private final static QName _ResellerAddSubscriberTypeLdc_QNAME = new QName("http://www.verizonwireless.com/oas", "ldc");
    private final static QName _ResellerAddSubscriberTypeMPNPoolName_QNAME = new QName("http://www.verizonwireless.com/oas", "MPNPoolName");
    private final static QName _ResellerAddSubscriberTypeMin_QNAME = new QName("http://www.verizonwireless.com/oas", "min");
    private final static QName _ResellerAddSubscriberTypeNextAvailableMDN_QNAME = new QName("http://www.verizonwireless.com/oas", "nextAvailableMDN");
    private final static QName _ResellerAddSubscriberTypeFeature_QNAME = new QName("http://www.verizonwireless.com/oas", "feature");
    private final static QName _ResellerAddSubscriberTypeMdn_QNAME = new QName("http://www.verizonwireless.com/oas", "mdn");
    private final static QName _ResellerAddSubscriberTypeFUSFExemptFlag_QNAME = new QName("http://www.verizonwireless.com/oas", "FUSFExemptFlag");
    private final static QName _ResellerAddSubscriberTypeIec_QNAME = new QName("http://www.verizonwireless.com/oas", "iec");
    private final static QName _ResellerAddSubscriberTypeDeviceId_QNAME = new QName("http://www.verizonwireless.com/oas", "deviceId");
    private final static QName _ResellerAddSubscriberTypeGlobalSIMCard_QNAME = new QName("http://www.verizonwireless.com/oas", "globalSIMCard");
    private final static QName _ResellerAddSubscriberTypeEsn_QNAME = new QName("http://www.verizonwireless.com/oas", "esn");
    private final static QName _ResellerAddSubscriberTypePlan_QNAME = new QName("http://www.verizonwireless.com/oas", "plan");
    private final static QName _ResellerAddSubscriberTypeMeid_QNAME = new QName("http://www.verizonwireless.com/oas", "meid");
    private final static QName _LnpTypePhoneUserName_QNAME = new QName("http://www.verizonwireless.com/oas", "phoneUserName");
    private final static QName _LnpTypeDesiredDueDate_QNAME = new QName("http://www.verizonwireless.com/oas", "desiredDueDate");
    private final static QName _LnpTypeOspAccountNo_QNAME = new QName("http://www.verizonwireless.com/oas", "ospAccountNo");
    private final static QName _LnpTypeSsnOrTaxId_QNAME = new QName("http://www.verizonwireless.com/oas", "ssnOrTaxId");
    private final static QName _LnpTypeAuthorizationStatus_QNAME = new QName("http://www.verizonwireless.com/oas", "authorizationStatus");
    private final static QName _LnpTypeHotCut_QNAME = new QName("http://www.verizonwireless.com/oas", "hotCut");
    private final static QName _LnpTypeDirectionalIndicator_QNAME = new QName("http://www.verizonwireless.com/oas", "directionalIndicator");
    private final static QName _LnpTypeAuthorizedSigner_QNAME = new QName("http://www.verizonwireless.com/oas", "authorizedSigner");
    private final static QName _LnpTypeRemark_QNAME = new QName("http://www.verizonwireless.com/oas", "remark");
    private final static QName _LnpTypePin_QNAME = new QName("http://www.verizonwireless.com/oas", "pin");
    private final static QName _LnpTypeAddress_QNAME = new QName("http://www.verizonwireless.com/oas", "address");
    private final static QName _LnpTypeLnpName_QNAME = new QName("http://www.verizonwireless.com/oas", "lnpName");
    private final static QName _ResellerAsyncResponseTypeErrorCode_QNAME = new QName("http://www.verizonwireless.com/oas", "errorCode");
    private final static QName _ResellerAsyncResponseTypeErrorDescription_QNAME = new QName("http://www.verizonwireless.com/oas", "errorDescription");
    private final static QName _ResellerAsyncResponseTypeErrorMessage_QNAME = new QName("http://www.verizonwireless.com/oas", "errorMessage");
    private final static QName _ResellerAsyncResponseTypeStatusCode_QNAME = new QName("http://www.verizonwireless.com/oas", "statusCode");

    public ObjectFactory() { }

    public ResellerReserveResponse createResellerReserveResponse() {
        return new ResellerReserveResponse();
    }

    public MessageHeaderType createMessageHeaderType() {
        return new MessageHeaderType();
    }

    public ResellerReserveResponseType createResellerReserveResponseType() {
        return new ResellerReserveResponseType();
    }

    public OrderInquiry createOrderInquiry() {
        return new OrderInquiry();
    }

    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    public ResellerLineResponse createResellerLineResponse() {
        return new ResellerLineResponse();
    }

    public ResellerLineResponseType createResellerLineResponseType() {
        return new ResellerLineResponseType();
    }

    public ValidateDeviceResponse createValidateDeviceResponse() {
        return new ValidateDeviceResponse();
    }

    public DeviceResponseType createDeviceResponseType() {
        return new DeviceResponseType();
    }

    public OasOrderResponse createOasOrderResponse() {
        return new OasOrderResponse();
    }

    public OrderInquiryResponseType createOrderInquiryResponseType() {
        return new OrderInquiryResponseType();
    }

    public ResellerOrder createResellerOrder() {
        return new ResellerOrder();
    }

    public ResellerOrderType createResellerOrderType() {
        return new ResellerOrderType();
    }

    public ResellerAsyncResponse createResellerAsyncResponse() {
        return new ResellerAsyncResponse();
    }

    public ResellerAsyncResponseType createResellerAsyncResponseType() {
        return new ResellerAsyncResponseType();
    }

    public ResellerDeviceResponseType createResellerDeviceResponseType() {
        return new ResellerDeviceResponseType();
    }

    public ResellerHBQualInfoResponse createResellerHBQualInfoResponse() {
        return new ResellerHBQualInfoResponse();
    }

    public QualificationResponseType createQualificationResponseType() {
        return new QualificationResponseType();
    }

    public ResellerPRLResponse createResellerPRLResponse() {
        return new ResellerPRLResponse();
    }

    public ResellerPRLResponseType createResellerPRLResponseType() {
        return new ResellerPRLResponseType();
    }

    public ResellerOrderResponse createResellerOrderResponse() {
        return new ResellerOrderResponse();
    }

    public ResellerOrderResponseType createResellerOrderResponseType() {
        return new ResellerOrderResponseType();
    }

    public ResellerDeviceNotification createResellerDeviceNotification() {
        return new ResellerDeviceNotification();
    }

    public SimOtaDeviceChangeNotificationType createSimOtaDeviceChangeNotificationType() {
        return new SimOtaDeviceChangeNotificationType();
    }

    public AddressInfoListType createAddressInfoListType() {
        return new AddressInfoListType();
    }

    public MeidWithOldEsnMeidType createMeidWithOldEsnMeidType() {
        return new MeidWithOldEsnMeidType();
    }

    public IncludedWithPlanType createIncludedWithPlanType() {
        return new IncludedWithPlanType();
    }

    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    public OasDateType createOasDateType() {
        return new OasDateType();
    }
    
    public CityType createCityType() {
        return new CityType();
    }

    public FeatureType createFeatureType() {
        return new FeatureType();
    }

    public ResellerFUSFExemptUpdateType createResellerFUSFExemptUpdateType() {
        return new ResellerFUSFExemptUpdateType();
    }

    public ResellerAddSubscriberByESNType createResellerAddSubscriberByESNType() {
        return new ResellerAddSubscriberByESNType();
    }

    public LnpAddressType createLnpAddressType() {
        return new LnpAddressType();
    }

    public ResellerChangeESNType createResellerChangeESNType() {
        return new ResellerChangeESNType();
    }

    public CompetitorCodeType createCompetitorCodeType() {
        return new CompetitorCodeType();
    }

    public MdnWithOldMdnType createMdnWithOldMdnType() {
        return new MdnWithOldMdnType();
    }

    public EquipmentType createEquipmentType() {
        return new EquipmentType();
    }

    public OasSingleCharacterType createOasSingleCharacterType() {
        return new OasSingleCharacterType();
    }

    public LnpType createLnpType() {
        return new LnpType();
    }

    public LdcOrIecType createLdcOrIecType() {
        return new LdcOrIecType();
    }

    public CountryType createCountryType() {
        return new CountryType();
    }

    public ResellerReconnectType createResellerReconnectType() {
        return new ResellerReconnectType();
    }

    public OasString60Type createOasString60Type() {
        return new OasString60Type();
    }

    public SubReferenceNumberType createSubReferenceNumberType() {
        return new SubReferenceNumberType();
    }

    public ResellerSuspendSubscriberType createResellerSuspendSubscriberType() {
        return new ResellerSuspendSubscriberType();
    }

    public ResellerSubOrderBaseType createResellerSubOrderBaseType() {
        return new ResellerSubOrderBaseType();
    }

    public ReasonCodeType createReasonCodeType() {
        return new ReasonCodeType();
    }

    public ResellerLineInquiryType createResellerLineInquiryType() {
        return new ResellerLineInquiryType();
    }

    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    public UpdatePortInType createUpdatePortInType() {
        return new UpdatePortInType();
    }

    public ResellerHBQualificationInfoType createResellerHBQualificationInfoType() {
        return new ResellerHBQualificationInfoType();
    }

    public ResellerHotlineSubscriberType createResellerHotlineSubscriberType() {
        return new ResellerHotlineSubscriberType();
    }

    public ResellerRestoreSubscriberType createResellerRestoreSubscriberType() {
        return new ResellerRestoreSubscriberType();
    }

    public SIMCardWithOldSIMCardType createSIMCardWithOldSIMCardType() {
        return new SIMCardWithOldSIMCardType();
    }

    public DeviceIdWithOldDeviceIdType createDeviceIdWithOldDeviceIdType() {
        return new DeviceIdWithOldDeviceIdType();
    }

    public ResellerPRLInquiryType createResellerPRLInquiryType() {
        return new ResellerPRLInquiryType();
    }

    public SsnOrTaxIdType createSsnOrTaxIdType() {
        return new SsnOrTaxIdType();
    }

    public EsnWithOldEsnType createEsnWithOldEsnType() {
        return new EsnWithOldEsnType();
    }

    public MdnType createMdnType() {
        return new MdnType();
    }

    public AddDeleteType createAddDeleteType() {
        return new AddDeleteType();
    }

    public ResellerChangeSIMType createResellerChangeSIMType() {
        return new ResellerChangeSIMType();
    }

    public ValidateDeviceType createValidateDeviceType() {
        return new ValidateDeviceType();
    }

    public OasString100Type createOasString100Type() {
        return new OasString100Type();
    }

    public OspAccountNoType createOspAccountNoType() {
        return new OspAccountNoType();
    }

    public AddressInfoType createAddressInfoType() {
        return new AddressInfoType();
    }

    public ResellerReserveMDNType createResellerReserveMDNType() {
        return new ResellerReserveMDNType();
    }

    public NextAvailableReserveMDNType createNextAvailableReserveMDNType() {
        return new NextAvailableReserveMDNType();
    }

    public YesNoType createYesNoType() {
        return new YesNoType();
    }

    public ResellerResetFeatureType createResellerResetFeatureType() {
        return new ResellerResetFeatureType();
    }
    
    public StateType createStateType() {
        return new StateType();
    }

    public ZipCodeType createZipCodeType() {
        return new ZipCodeType();
    }

    public FeatureRPType createFeatureRPType() {
        return new FeatureRPType();
    }

    public OasString10Type createOasString10Type() {
        return new OasString10Type();
    }

    public ReferenceNumberType createReferenceNumberType() {
        return new ReferenceNumberType();
    }

    public ResellerChangeNumberType createResellerChangeNumberType() {
        return new ResellerChangeNumberType();
    }

    public NextAvailableMDNType createNextAvailableMDNType() {
        return new NextAvailableMDNType();
    }

    public ResellerAddHotlineSubscriberType createResellerAddHotlineSubscriberType() {
        return new ResellerAddHotlineSubscriberType();
    }

    public PlanType createPlanType() {
        return new PlanType();
    }

    public SystemDataType createSystemDataType() {
        return new SystemDataType();
    }

    public ResellerSubscribeFeatureType createResellerSubscribeFeatureType() {
        return new ResellerSubscribeFeatureType();
    }

    public ResellerAddHotlineSubscriberByESNType createResellerAddHotlineSubscriberByESNType() {
        return new ResellerAddHotlineSubscriberByESNType();
    }

    public ResellerAddSubscriberPortInType createResellerAddSubscriberPortInType() {
        return new ResellerAddSubscriberPortInType();
    }

    public PinType createPinType() {
        return new PinType();
    }

    public ResellerValidateMDNPortabilityType createResellerValidateMDNPortabilityType() {
        return new ResellerValidateMDNPortabilityType();
    }

    public ResellerAddSubscriberType createResellerAddSubscriberType() {
        return new ResellerAddSubscriberType();
    }

    public OasDecimalType createOasDecimalType() {
        return new OasDecimalType();
    }

    public RatePlanType createRatePlanType() {
        return new RatePlanType();
    }

    public MinWithOldMinType createMinWithOldMinType() {
        return new MinWithOldMinType();
    }

    public StreetNameType createStreetNameType() {
        return new StreetNameType();
    }

    public NpaNxxType createNpaNxxType() {
        return new NpaNxxType();
    }

    public OasString120Type createOasString120Type() {
        return new OasString120Type();
    }

    public ResellerRemoveHotlineType createResellerRemoveHotlineType() {
        return new ResellerRemoveHotlineType();
    }

    public OasString500Type createOasString500Type() {
        return new OasString500Type();
    }

    public ResellerChangeRatePlanType createResellerChangeRatePlanType() {
        return new ResellerChangeRatePlanType();
    }

    public ResellerDeleteSubscriberType createResellerDeleteSubscriberType() {
        return new ResellerDeleteSubscriberType();
    }

    public OasStringType createOasStringType() {
        return new OasStringType();
    }

    /**
     * Create an instance of {@link LnpPersonNameType }
     * 
     */
    public LnpPersonNameType createLnpPersonNameType() {
        return new LnpPersonNameType();
    }

    public ResellerSubOrderType createResellerSubOrderType() {
        return new ResellerSubOrderType();
    }

    public LnpNameType createLnpNameType() {
        return new LnpNameType();
    }
    
    public NextAvailablewithOldMDNType createNextAvailablewithOldMDNType() {
        return new NextAvailablewithOldMDNType();
    }

    public EsnWithOldEsnMeidType createEsnWithOldEsnMeidType() {
        return new EsnWithOldEsnMeidType();
    }

    public OasString160Type createOasString160Type() {
        return new OasString160Type();
    }

    public ResellerDeviceInquiryType createResellerDeviceInquiryType() {
        return new ResellerDeviceInquiryType();
    }

    public InputAddressType createInputAddressType() {
        return new InputAddressType();
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "iccid", scope = ResellerAddSubscriberType.class)
    public JAXBElement<String> createResellerAddSubscriberTypeIccid(String value) {
        return new JAXBElement<String>(_ResellerAddSubscriberTypeIccid_QNAME, String.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "portInFlag", scope = ResellerAddSubscriberType.class)
    public JAXBElement<YesNoType> createResellerAddSubscriberTypePortInFlag(YesNoType value) {
        return new JAXBElement<YesNoType>(_ResellerAddSubscriberTypePortInFlag_QNAME, YesNoType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "mobileIPAddress", scope = ResellerAddSubscriberType.class)
    public JAXBElement<OasStringType> createResellerAddSubscriberTypeMobileIPAddress(OasStringType value) {
        return new JAXBElement<OasStringType>(_ResellerAddSubscriberTypeMobileIPAddress_QNAME, OasStringType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "SubOrgID", scope = ResellerAddSubscriberType.class)
    public JAXBElement<OasStringType> createResellerAddSubscriberTypeSubOrgID(OasStringType value) {
        return new JAXBElement<OasStringType>(_ResellerAddSubscriberTypeSubOrgID_QNAME, OasStringType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "ldc", scope = ResellerAddSubscriberType.class)
    public JAXBElement<LdcOrIecType> createResellerAddSubscriberTypeLdc(LdcOrIecType value) {
        return new JAXBElement<LdcOrIecType>(_ResellerAddSubscriberTypeLdc_QNAME, LdcOrIecType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "MPNPoolName", scope = ResellerAddSubscriberType.class)
    public JAXBElement<OasStringType> createResellerAddSubscriberTypeMPNPoolName(OasStringType value) {
        return new JAXBElement<OasStringType>(_ResellerAddSubscriberTypeMPNPoolName_QNAME, OasStringType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "min", scope = ResellerAddSubscriberType.class)
    public JAXBElement<String> createResellerAddSubscriberTypeMin(String value) {
        return new JAXBElement<String>(_ResellerAddSubscriberTypeMin_QNAME, String.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "nextAvailableMDN", scope = ResellerAddSubscriberType.class)
    public JAXBElement<NextAvailableMDNType> createResellerAddSubscriberTypeNextAvailableMDN(NextAvailableMDNType value) {
        return new JAXBElement<NextAvailableMDNType>(_ResellerAddSubscriberTypeNextAvailableMDN_QNAME, NextAvailableMDNType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "feature", scope = ResellerAddSubscriberType.class)
    public JAXBElement<FeatureType> createResellerAddSubscriberTypeFeature(FeatureType value) {
        return new JAXBElement<FeatureType>(_ResellerAddSubscriberTypeFeature_QNAME, FeatureType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "mdn", scope = ResellerAddSubscriberType.class)
    public JAXBElement<MdnType> createResellerAddSubscriberTypeMdn(MdnType value) {
        return new JAXBElement<MdnType>(_ResellerAddSubscriberTypeMdn_QNAME, MdnType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "FUSFExemptFlag", scope = ResellerAddSubscriberType.class)
    public JAXBElement<YesNoType> createResellerAddSubscriberTypeFUSFExemptFlag(YesNoType value) {
        return new JAXBElement<YesNoType>(_ResellerAddSubscriberTypeFUSFExemptFlag_QNAME, YesNoType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "iec", scope = ResellerAddSubscriberType.class)
    public JAXBElement<LdcOrIecType> createResellerAddSubscriberTypeIec(LdcOrIecType value) {
        return new JAXBElement<LdcOrIecType>(_ResellerAddSubscriberTypeIec_QNAME, LdcOrIecType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "deviceId", scope = ResellerAddSubscriberType.class)
    public JAXBElement<String> createResellerAddSubscriberTypeDeviceId(String value) {
        return new JAXBElement<String>(_ResellerAddSubscriberTypeDeviceId_QNAME, String.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "globalSIMCard", scope = ResellerAddSubscriberType.class)
    public JAXBElement<String> createResellerAddSubscriberTypeGlobalSIMCard(String value) {
        return new JAXBElement<String>(_ResellerAddSubscriberTypeGlobalSIMCard_QNAME, String.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "esn", scope = ResellerAddSubscriberType.class)
    public JAXBElement<String> createResellerAddSubscriberTypeEsn(String value) {
        return new JAXBElement<String>(_ResellerAddSubscriberTypeEsn_QNAME, String.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "plan", scope = ResellerAddSubscriberType.class)
    public JAXBElement<PlanType> createResellerAddSubscriberTypePlan(PlanType value) {
        return new JAXBElement<PlanType>(_ResellerAddSubscriberTypePlan_QNAME, PlanType.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "meid", scope = ResellerAddSubscriberType.class)
    public JAXBElement<String> createResellerAddSubscriberTypeMeid(String value) {
        return new JAXBElement<String>(_ResellerAddSubscriberTypeMeid_QNAME, String.class, ResellerAddSubscriberType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "phoneUserName", scope = LnpType.class)
    public JAXBElement<OasStringType> createLnpTypePhoneUserName(OasStringType value) {
        return new JAXBElement<OasStringType>(_LnpTypePhoneUserName_QNAME, OasStringType.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "desiredDueDate", scope = LnpType.class)
    public JAXBElement<XMLGregorianCalendar> createLnpTypeDesiredDueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LnpTypeDesiredDueDate_QNAME, XMLGregorianCalendar.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "ospAccountNo", scope = LnpType.class)
    public JAXBElement<OspAccountNoType> createLnpTypeOspAccountNo(OspAccountNoType value) {
        return new JAXBElement<OspAccountNoType>(_LnpTypeOspAccountNo_QNAME, OspAccountNoType.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "ssnOrTaxId", scope = LnpType.class)
    public JAXBElement<SsnOrTaxIdType> createLnpTypeSsnOrTaxId(SsnOrTaxIdType value) {
        return new JAXBElement<SsnOrTaxIdType>(_LnpTypeSsnOrTaxId_QNAME, SsnOrTaxIdType.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "authorizationStatus", scope = LnpType.class)
    public JAXBElement<AuthorizationStatusType> createLnpTypeAuthorizationStatus(AuthorizationStatusType value) {
        return new JAXBElement<AuthorizationStatusType>(_LnpTypeAuthorizationStatus_QNAME, AuthorizationStatusType.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "hotCut", scope = LnpType.class)
    public JAXBElement<HotCutType> createLnpTypeHotCut(HotCutType value) {
        return new JAXBElement<HotCutType>(_LnpTypeHotCut_QNAME, HotCutType.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "directionalIndicator", scope = LnpType.class)
    public JAXBElement<DirectionalIndicatorType> createLnpTypeDirectionalIndicator(DirectionalIndicatorType value) {
        return new JAXBElement<DirectionalIndicatorType>(_LnpTypeDirectionalIndicator_QNAME, DirectionalIndicatorType.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "authorizedSigner", scope = LnpType.class)
    public JAXBElement<OasString60Type> createLnpTypeAuthorizedSigner(OasString60Type value) {
        return new JAXBElement<OasString60Type>(_LnpTypeAuthorizedSigner_QNAME, OasString60Type.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "remark", scope = LnpType.class)
    public JAXBElement<OasString160Type> createLnpTypeRemark(OasString160Type value) {
        return new JAXBElement<OasString160Type>(_LnpTypeRemark_QNAME, OasString160Type.class, LnpType.class, value);
    }
    
    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "pin", scope = LnpType.class)
    public JAXBElement<PinType> createLnpTypePin(PinType value) {
        return new JAXBElement<PinType>(_LnpTypePin_QNAME, PinType.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "address", scope = LnpType.class)
    public JAXBElement<LnpAddressType> createLnpTypeAddress(LnpAddressType value) {
        return new JAXBElement<LnpAddressType>(_LnpTypeAddress_QNAME, LnpAddressType.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "lnpName", scope = LnpType.class)
    public JAXBElement<LnpNameType> createLnpTypeLnpName(LnpNameType value) {
        return new JAXBElement<LnpNameType>(_LnpTypeLnpName_QNAME, LnpNameType.class, LnpType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "errorCode", scope = ResellerAsyncResponseType.class)
    public JAXBElement<String> createResellerAsyncResponseTypeErrorCode(String value) {
        return new JAXBElement<String>(_ResellerAsyncResponseTypeErrorCode_QNAME, String.class, ResellerAsyncResponseType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "iccid", scope = ResellerAsyncResponseType.class)
    public JAXBElement<String> createResellerAsyncResponseTypeIccid(String value) {
        return new JAXBElement<String>(_ResellerAddSubscriberTypeIccid_QNAME, String.class, ResellerAsyncResponseType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "errorDescription", scope = ResellerAsyncResponseType.class)
    public JAXBElement<String> createResellerAsyncResponseTypeErrorDescription(String value) {
        return new JAXBElement<String>(_ResellerAsyncResponseTypeErrorDescription_QNAME, String.class, ResellerAsyncResponseType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "mobileIPAddress", scope = ResellerAsyncResponseType.class)
    public JAXBElement<OasStringType> createResellerAsyncResponseTypeMobileIPAddress(OasStringType value) {
        return new JAXBElement<OasStringType>(_ResellerAddSubscriberTypeMobileIPAddress_QNAME, OasStringType.class, ResellerAsyncResponseType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "mdn", scope = ResellerAsyncResponseType.class)
    public JAXBElement<String> createResellerAsyncResponseTypeMdn(String value) {
        return new JAXBElement<String>(_ResellerAddSubscriberTypeMdn_QNAME, String.class, ResellerAsyncResponseType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "errorMessage", scope = ResellerAsyncResponseType.class)
    public JAXBElement<String> createResellerAsyncResponseTypeErrorMessage(String value) {
        return new JAXBElement<String>(_ResellerAsyncResponseTypeErrorMessage_QNAME, String.class, ResellerAsyncResponseType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "statusCode", scope = ResellerAsyncResponseType.class)
    public JAXBElement<String> createResellerAsyncResponseTypeStatusCode(String value) {
        return new JAXBElement<String>(_ResellerAsyncResponseTypeStatusCode_QNAME, String.class, ResellerAsyncResponseType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.verizonwireless.com/oas", name = "min", scope = ResellerAsyncResponseType.class)
    public JAXBElement<String> createResellerAsyncResponseTypeMin(String value) {
        return new JAXBElement<String>(_ResellerAddSubscriberTypeMin_QNAME, String.class, ResellerAsyncResponseType.class, value);
    }
}
