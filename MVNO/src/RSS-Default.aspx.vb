Imports System.Net

Partial Public Class _Default
    Inherits System.Web.UI.Page

    '*********************************************************************************************
    Const logDirectory As String = "C:\Verizon\RSS\Logs\"

    Const vendorID As String = "BUDGETPREPAY"

    'Production
    Const submissionURL As String = "http://durpdp00.ddc.vzwcorp.com:8080/servlet/ETMOrderRequest"

    'Test
    'Const submissionURL As String = "http://durbdt01.ddc.vzwcorp.com:8080/servlet/ETMOrderRequest"

    Const accountNumber As String = "1223"
    'Const accountNumber As String = "112"
    '    Const hotlineNumber As String = "3186715000"
    Const hotlineNumber As String = "3182867462"

    'Const returnURL As String = "http://10.253.114.110:80/verizon/notifications/notificationlistener.asmx"
    'Const asynchErrorURL As String = "http://10.253.114.110:80/verizon/notifications/notificationlistener.asmx"

    'Const returnURL As String = "http://10.253.114.110:80/verizon/dev/notifications/listener.aspx"
    'Const asynchErrorURL As String = "http://10.253.114.110:80/verizon/dev/notifications/listener.aspx"

    Const returnURL As String = "http://10.253.114.110:80/verizon/notifications/listener.aspx"
    Const asynchErrorURL As String = "http://10.253.114.110:80/verizon/notifications/listener.aspx"

    Const traceRequest As Boolean = True
    Const traceResponse As Boolean = True
    '*********************************************************************************************

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load


        Dim dateAndTimeString As String = ""
        dateAndTimeString = BuildDateAndTimeString()

        'Dim referenceNumber As String = "BUDGETPREPAY_43"
        Dim referenceNumber As String = "BUDGETPREPAY_TEST_" & dateAndTimeString
        Dim zipCode As String = "71111"
        'Dim deviceID As String = "25400009121"
        'Dim deviceID As String = "A100000010D012"
        'Dim deviceID As String = "10107952274"
        'Dim deviceID As String = "A0000018DD7115"

        'Dim deviceID As String = "02409905782"
        'Dim deviceID As String = "02209910892"
        'Dim deviceID As String = "02211810477"
        'Dim deviceID As String = "13211722771"
        'Dim deviceID As String = "07605857475"
        'Dim deviceID As String = "a1000019782e61"
        'Dim deviceID As String = "A1000001634436"
        'Dim deviceID As String = "A1000000F60AB3"
        'Dim deviceID As String = "A0000018DD7115"
        'Dim deviceID As String = "03212802520"
        'Dim deviceID As String = "99000023283230"
        'Dim deviceID As String = "A000002449688F"
        'Dim deviceID As String = "A0000029B1A1A5"
        'Dim deviceID As String = "A0000022AF8E39"
        'Dim deviceID As String = "A0000022BC73C7"
        'Dim deviceID As String = "A0000015E97F0A"
        'Dim deviceID As String = "A000000FAFDB1D"
        'Dim deviceID As String = "A00000218D707F"
        'Dim deviceID As String = "09100905883"
        Dim deviceID As String = "A0000030D39E75"

        05403672917
        A000000CA33E99
        A00000072B20DF
        A100000010D012

        Dim planCode As String = "FTEBULKTIER_BUDGET"
        'Dim planCode As String = "FTEBULKTIER_BUDG250"
        'Dim planCode As String = "FTEBULKTIER_BUDG350"

        Dim planCode_Old As String = "FTEBULKTIER_BUDGET"

	
        Dim orderTypeDescription As String = ""
        'Dim mdn As String = "3182051791"
        'Dim mdn As String = "3185536967"
        'Dim mdn As String = "3185536874"

        'Dim mdn As String = "3185536873"
        'Dim mdn As String = "3186715769"
        'Dim mdn As String = "3184018934"
        'Dim mdn As String = "3184022011"
        'Dim mdn As String = "3183494538"
        'Dim mdn As String = "3183494538"
        Dim mdn As String = "3184228733"

        'Dim min As String = "3182053073"
        Dim min As String = "9893338034"
        'Dim deviceID_Old As String = "25400009101"
        'Dim deviceID_Old As String = "02211810477"
        'Dim deviceID_old As String = "07605857475"
        Dim deviceID_old As String = "A0000022EFF9F8"

        Dim voiceMailFeatureCode As String = "VMSURE"
        Dim resetFeature_ResetID As String = "1"
        Dim resetFeature_Password As String = "1111"

        Dim myRSSRequestDocument As New System.Xml.XmlDocument()
        Dim myRSSResponseDocument As New System.Xml.XmlDocument()


        Dim addSubscriberFeatures_Add(0) As String
        addSubscriberFeatures_Add(0) = "SMS_25_IRM"
        Dim addSubscriberFeatures_Add_Present As Boolean = False

        Dim addSubscriberFeatures_Delete(0) As String
        addSubscriberFeatures_Delete(0) = "SMS03"
        Dim addSubscriberFeatures_Delete_Present As Boolean = False

        '***Asynchronous Responses*********

        'BuildResellerAddSbuscriberRequest requires unique referenceNumber
        BuildResellerAddSubscriberRequest(referenceNumber, zipCode, deviceID, planCode, addSubscriberFeatures_Add_Present, addSubscriberFeatures_Add, addSubscriberFeatures_Delete_Present, addSubscriberFeatures_Delete, orderTypeDescription, myRSSRequestDocument)

        'BuildResellerAddSubscriberPortIn(referenceNumber, mdn, deviceID, planCode, orderTypeDescription, myRSSRequestDocument)

        'BuildDeviceInquiry requires unique referenceNumber
        'BuildDeviceInquiry(referenceNumber, deviceID, orderTypeDescription, myRSSRequestDocument)

        'BuildSuspendSubscriber requires unique referenceNumber
        'BuildSuspendSubscriber(referenceNumber, mdn, orderTypeDescription, myRSSRequestDocument)

        'BuildRestoreSubscriber requires unique referenceNumber
        'BuildRestoreSubscriber(referenceNumber, mdn, orderTypeDescription, myRSSRequestDocument)

        'BuildDeleteSubscriber requires unique referenceNumber
        'BuildDeleteSubscriber(referenceNumber, mdn, orderTypeDescription, myRSSRequestDocument)

        'BuildReconnect requires unique referenceNumber
        'BuildReconnect requires deviceID
        'BuildReconnect(referenceNumber, mdn, deviceID, orderTypeDescription, myRSSRequestDocument)

        'BuildChangeESN requires unique referenceNumber
        'BuildChangeESN(referenceNumber, mdn, deviceID, deviceID_old, orderTypeDescription, myRSSRequestDocument)

        'BuildChangeNumber requires unique referenceNumber
        'BuildChangeNumber requires deviceID
        'BuildChangeNumber returns 01 - Reference Number: BUDGETPREPAY_15_6 pending on mdn: 3182053073
        'Changed to new account with all new reference numbers and got success response
        ' BuildChangeNumber(referenceNumber, zipCode, mdn, deviceID, orderTypeDescription, myRSSRequestDocument)

        'BuildPRLInquiry returns E1023 - PRL info not found for the MDN: 3182053073
        'BuildPRLInquiry(referenceNumber, mdn, deviceID, min, orderTypeDescription, myRSSRequestDocument) '

        'BuildResellerValidateMDNPortability requires unique referenceNumber
        'BuildResellerValidateMDNPortability(referenceNumber, mdn, orderTypeDescription, myRSSRequestDocument)

        'BuildResellerResetFeature requires unique referenceNumber
        'BuildResellerResetFeature(referenceNumber, mdn, resetFeature_ResetID, voiceMailFeatureCode, resetFeature_Password, orderTypeDescription, myRSSRequestDocument)

        '***Synchronous Responses**********

        'BuildOrderInquiry(referenceNumber, orderTypeDescription, myRSSRequestDocument)
        'BuildLineInquiry(referenceNumber, mdn, orderTypeDescription, myRSSRequestDocument)

        '***Other**************************

        'BuildHotlineSubscriber returns E2003 - Hotline type REGULAR not in hotline_type table for:BUDGETPREPAY
        'BuildHotlineSubscriber(referenceNumber, mdn, orderTypeDescription, myRSSRequestDocument)

        'BuildRemoveHotline returns E2301 - Unable to Remove Hotline.  Line is currently ACTIVE
        'BuildRemoveHotline(referenceNumber, mdn, orderTypeDescription, myRSSRequestDocument)

        'ResellerAddHotlineSubscriber requires MDN.  How do I retrieve MDN?  Is it for port in only?
        'ChangeRatePlan - any way to test for future use considering we only have one rate plan?

        'ResellerAddSubscriberPortIn requires information about the ported number/user.  Is there specific information I should use?  Will any requests be forwarded?

        'Receiving errors when submitting changes orders on certain accounts indicating previous pending reference numbers.

        Dim changeFeatures_Add(0) As String
        Dim changeFeatures_Add_Present As Boolean = True

        'changeFeatures_Add(0) = "SMS_1000_IRM"
        changeFeatures_Add(0) = "SMS_2000_IRM"
        'changeFeatures_Add(1) = "DATAADDPP_25MB"

        Dim changeFeatures_Delete(0) As String
        Dim changeFeatures_Delete_Present As Boolean = True
        'Dim changeFeatures_Delete_Present As Boolean = False

        'changeFeatures_Delete(0) = "SMS03"
        changeFeatures_Delete(0) = "SMS_25_IRM"

        'BuildSubscribeFeature(referenceNumber, mdn, changeFeatures_Add_Present, changeFeatures_Add, changeFeatures_Delete_Present, changeFeatures_Delete, orderTypeDescription, myRSSRequestDocument)

        Dim changeRatePlanFeatures_Add(0) As String
        changeRatePlanFeatures_Add(0) = "SMS_25_IRM"
        Dim changeRatePlanFeatures_Add_Present As Boolean = True

        Dim changeRatePlanFeatures_Delete(0) As String
        changeRatePlanFeatures_Delete(0) = "SMS03"
        Dim changeRatePlanFeatures_Delete_Present As Boolean = True

        'BuildChangeRatePlanRequest(referenceNumber, mdn, changeRatePlanFeatures_Add_Present, changeRatePlanFeatures_Add, changeRatePlanFeatures_Delete_Present, changeRatePlanFeatures_Delete, planCode, planCode_Old, orderTypeDescription, myRSSRequestDocument)

        SubmitRSSRequest(myRSSRequestDocument, submissionURL, myRSSResponseDocument)
        ProcessTraceOutput(traceRequest, traceResponse, logDirectory, referenceNumber, orderTypeDescription, myRSSRequestDocument, myRSSResponseDocument)

    End Sub

    Sub ProcessTraceOutput(ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal logDirectory As String, ByVal referenceNumber As String, ByVal orderTypeDescription As String, ByVal myRSSRequestDocument As System.Xml.XmlDocument, ByVal myRSSResponseDocument As System.Xml.XmlDocument)

        Dim dateAndTimeString As String

        dateAndTimeString = BuildDateAndTimeString()

        If traceRequest Then

            myRSSRequestDocument.Save(logDirectory & referenceNumber & "_" & orderTypeDescription & "_request_" & dateAndTimeString & ".xml")

        End If

        If traceResponse Then

            myRSSResponseDocument.save(logDirectory & referenceNumber & "_" & orderTypeDescription & "_response_" & dateAndTimeString & ".xml")

        End If

    End Sub

    Sub SubmitRSSRequest(ByVal myRSSRequestDocument As System.Xml.XmlDocument, ByVal submissionURL As String, ByRef myRSSResponseDocument As System.Xml.XmlDocument)

        'Dim myHTTPRequest As New MSXML2.ServerXMLHTTP40

        'myHTTPRequest.setTimeouts(30000, 30000, 300000, 30000)
        'myHTTPRequest.open("POST", submissionURL, False, "", "")
        'myHTTPRequest.send(myRSSRequestDocument.InnerXml)

        'myRSSResponseDocument = myHTTPRequest.responseXML

        Dim objRequest As HttpWebRequest = WebRequest.Create(submissionURL)
        objRequest.Timeout = 30000
        objRequest.Method = "POST"
        objRequest.ContentType = "application/xml"
        objRequest.KeepAlive = False

        Dim encoding As New System.Text.ASCIIEncoding()
        Dim byte1 As Byte() = Text.Encoding.UTF8.GetBytes(myRSSRequestDocument.InnerXml.ToString)

        objRequest.ContentLength = byte1.Length

        Dim streamToSend As System.IO.Stream = objRequest.GetRequestStream()
        streamToSend.Write(byte1, 0, byte1.Length)
        streamToSend.Close()

        Dim objResponse As HttpWebResponse = objRequest.GetResponse()
        Dim StreamReader As System.IO.StreamReader = New System.IO.StreamReader(objResponse.GetResponseStream())

        myRSSResponseDocument.loadXML(StreamReader.ReadToEnd())


    End Sub

    Sub BuildOrderInquiry(ByVal referenceNumber As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myOrderInquiry As New orderInquiry()
        Dim myMessageHeader As New messageHeaderType()

        orderTypeDescription = "OrderInquiry"

        BuildMessageHeader("STATUS", "INQSLND", referenceNumber, myMessageHeader)

        myOrderInquiry.messageHeader = myMessageHeader

        myRSSRequestDocument = ConvertObjectToXmlDocument(myOrderInquiry)

    End Sub

    Sub BuildDeviceInquiry(ByVal referenceNumber As String, 
                           ByVal deviceID As String, 
                           ByRef orderTypeDescription As String, 
                           ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerDeviceInquiry As New resellerDeviceInquiryType()
        Dim myItem1Choice As New Item1ChoiceType14()

        orderTypeDescription = "DeviceInquiry"

        If Len(deviceID) = 11 Or Len(deviceID) = 8 Then

            myItem1Choice = Item1ChoiceType14.esn

        ElseIf Len(deviceID) = 14 Then

            myItem1Choice = Item1ChoiceType14.meid

        End If

        myResellerDeviceInquiry.Item1ElementName = myItem1Choice
        myResellerDeviceInquiry.Item1 = deviceID

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerDeviceInquiry, myRSSRequestDocument)

    End Sub

    Sub BuildResellerResetFeature(ByVal referenceNumber As String, ByVal mdn As String, ByVal resetFeature_ResetID As String, ByVal voiceMailFeatureCode As String, ByVal resetFeature_Password As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerResetFeature As New resellerResetFeatureType()
        Dim myMDN As New mdnType()
        Dim myFeatureCode As New oasStringType()
        Dim myPassword As New oasStringType()

        orderTypeDescription = "ResetFeature"

        myMDN.Value = mdn
        myFeatureCode.Value = voiceMailFeatureCode
        myPassword.Value = resetFeature_Password

        myResellerResetFeature.mdn = myMDN
        myResellerResetFeature.resetId = resetFeature_ResetID
        myResellerResetFeature.password = myPassword
        myResellerResetFeature.featureCode = myFeatureCode

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerResetFeature, myRSSRequestDocument)

    End Sub

    Sub BuildResellerValidateMDNPortability(ByVal referenceNumber As String, ByVal mdn As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerValidateMDNPortability As New resellerValidateMDNPortabilityType()
        Dim myMDN As New mdnType()

        orderTypeDescription = "ValidateMDNPortability"

        myMDN.Value = mdn

        myResellerValidateMDNPortability.mdn = myMDN

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerValidateMDNPortability, myRSSRequestDocument)

    End Sub

    Sub BuildSubscribeFeature(ByVal referenceNumber As String, ByVal mdn As String, ByVal changeFeatures_Add_Present As Boolean, ByVal changeFeatures_Add As String(), ByVal changeFeatures_Delete_Present As Boolean, ByVal changeFeatures_Delete As String(), ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerSubscribeFeature As New resellerSubscribeFeatureType()
        Dim myMDN As New mdnType()
        Dim myFeature() As featureType = {New featureType}
        Dim myFeature_Item As New featureType()
        'Dim myFeature As New featureType()
        Dim myFeatureCodeField As New oasStringType()
        Dim mySubscribeField As New addDeleteType()
        Dim featureCounter As Integer = 0

        If changeFeatures_Add_Present Or changeFeatures_Delete_Present Then

            If changeFeatures_Add_Present And changeFeatures_Delete_Present Then
                ReDim myFeature(UBound(changeFeatures_Add) + UBound(changeFeatures_Delete) + 1)
            ElseIf changeFeatures_Add_Present Then
                ReDim myFeature(UBound(changeFeatures_Add))
            Else
                ReDim myFeature(UBound(changeFeatures_Delete))
            End If

            orderTypeDescription = "SubscribeFeature"

            myMDN.Value = mdn

            myResellerSubscribeFeature.mdn = myMDN

            If changeFeatures_Add_Present Then

                For counter As Integer = 0 To UBound(changeFeatures_Add)

                    myFeature_Item = New featureType
                    myFeatureCodeField = New oasStringType
                    mySubscribeField = New addDeleteType

                    myFeatureCodeField.Value = changeFeatures_Add(counter)
                    mySubscribeField.Value = "A"

                    myFeature_Item.featureCode = myFeatureCodeField
                    myFeature_Item.subscribe = mySubscribeField

                    myFeature(featureCounter) = myFeature_Item
                    featureCounter = featureCounter + 1

                Next

            End If

            If changeFeatures_Delete_Present Then

                For counter As Integer = 0 To UBound(changeFeatures_Delete)

                    myFeature_Item = New featureType
                    myFeatureCodeField = New oasStringType
                    mySubscribeField = New addDeleteType

                    myFeatureCodeField.Value = changeFeatures_Delete(counter)
                    mySubscribeField.Value = "D"

                    myFeature_Item.featureCode = myFeatureCodeField
                    myFeature_Item.subscribe = mySubscribeField

                    myFeature(featureCounter) = myFeature_Item
                    featureCounter = featureCounter + 1

                Next

            End If

            myResellerSubscribeFeature.feature = myFeature

            BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerSubscribeFeature, myRSSRequestDocument)

        End If

    End Sub

    Sub BuildRemoveHotline(ByVal referenceNumber As String, ByVal mdn As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerRemoveHotline As New resellerRemoveHotlineType()
        Dim myMDN As New mdnType()

        orderTypeDescription = "RemoveHotline"

        myMDN.Value = mdn

        myResellerRemoveHotline.mdn = myMDN

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerRemoveHotline, myRSSRequestDocument)

    End Sub

    Sub BuildRestoreSubscriber(ByVal referenceNumber As String, ByVal mdn As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerRestoreSubscriber As New resellerRestoreSubscriberType()
        Dim myMDN As New mdnType()

        orderTypeDescription = "RestoreSubscriber"

        myMDN.Value = mdn

        myResellerRestoreSubscriber.mdn = myMDN

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerRestoreSubscriber, myRSSRequestDocument)

    End Sub

    Sub BuildChangeESN(ByVal referenceNumber As String, ByVal mdn As String, ByVal deviceID As String, ByVal deviceID_Old As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerChangeESN As New resellerChangeESNType()
        Dim myMDN As New mdnType()
        Dim myDeviceChoice_ESN As New esnWithOldEsnMeidType()
        Dim myDeviceChoice_MEID As New meidWithOldEsnMeidType()

        orderTypeDescription = "ChangeESN"

        myMDN.Value = mdn

        myResellerChangeESN.mdn = myMDN

        If Len(deviceID) = 11 Or Len(deviceID) = 8 Then

            myDeviceChoice_ESN.Value = deviceID
            myDeviceChoice_ESN.old = deviceID_Old

            myResellerChangeESN.Item1 = myDeviceChoice_ESN

        ElseIf Len(deviceID) = 14 Then

            myDeviceChoice_MEID.Value = deviceID
            myDeviceChoice_MEID.old = deviceID_Old

            myResellerChangeESN.Item1 = myDeviceChoice_MEID

        End If

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerChangeESN, myRSSRequestDocument)

    End Sub

    Sub BuildReconnect(ByVal referenceNumber As String, ByVal mdn As String, ByVal deviceID As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerReconnect As New resellerReconnectType()
        Dim myMDN As New mdnType()
        Dim myDeviceChoice As New ItemChoiceType3()

        orderTypeDescription = "Reconnect"

        myMDN.Value = mdn

        myResellerReconnect.mdn = myMDN

        If Len(deviceID) = 11 Or Len(deviceID) = 8 Then

            myDeviceChoice = ItemChoiceType3.esn

        ElseIf Len(deviceID) = 14 Then

            myDeviceChoice = ItemChoiceType3.meid

        End If

        myResellerReconnect.ItemElementName = myDeviceChoice
        myResellerReconnect.Item = deviceID

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerReconnect, myRSSRequestDocument)

    End Sub

    Sub BuildDeleteSubscriber(ByVal referenceNumber As String, ByVal mdn As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerDeleteSubscriber As New resellerDeleteSubscriberType()
        Dim myMDN As New mdnType()
        Dim mySubReferenceNumber As New subReferenceNumberType()

        orderTypeDescription = "DeleteSubscriber"

        myMDN.Value = mdn
        myResellerDeleteSubscriber.mdn = myMDN

        mySubReferenceNumber.Value = referenceNumber & "-1"
        myResellerDeleteSubscriber.subReferenceNumber = mySubReferenceNumber

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerDeleteSubscriber, myRSSRequestDocument)

    End Sub

    Sub BuildSuspendSubscriber(ByVal referenceNumber As String, ByVal mdn As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerSuspendSubscriber As New resellerSuspendSubscriberType()
        Dim myMDN As New mdnType()

        orderTypeDescription = "SuspendSubscriber"

        myMDN.Value = mdn

        myResellerSuspendSubscriber.mdn = myMDN

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerSuspendSubscriber, myRSSRequestDocument)

    End Sub

    Sub BuildHotlineSubscriber(ByVal referenceNumber As String, ByVal mdn As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerHotlineSubscriber As New resellerHotlineSubscriberType()
        Dim myMDN As New mdnType()
        Dim myHotlineType As New oasStringType()
        Dim myHotlineNumberChoice As New Item2ChoiceType1()
        Dim myHotlineNumber As New phoneType()

        orderTypeDescription = "HotlineSubscriber"

        myMDN.Value = mdn

        myHotlineType.Value = "BUDGETPREPAYREGULAR"
        'myHotlineType.Value = "FRAUD"
        'myHotlineType.Value = "ROAMING"
        myHotlineNumberChoice = Item2ChoiceType1.hotlineNumber
        myHotlineNumber.Value = hotlineNumber

        myResellerHotlineSubscriber.mdn = myMDN
        myResellerHotlineSubscriber.hotlineType = myHotlineType
        myResellerHotlineSubscriber.Item2ElementName = myHotlineNumberChoice
        myResellerHotlineSubscriber.Item2 = myHotlineNumber

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerHotlineSubscriber, myRSSRequestDocument)

    End Sub

    Sub BuildPRLInquiry(ByVal referenceNumber As String, ByVal mdn As String, ByVal deviceID As String, ByVal min As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerPRLInquiry As New resellerPRLInquiryType()
        Dim myMDN As New mdnType()
        Dim myDeviceChoice As New Item1ChoiceType13()

        orderTypeDescription = "PRLInquiry"

        myMDN.Value = mdn

        myResellerPRLInquiry.mdn = myMDN
        myResellerPRLInquiry.min = min

        If Len(deviceID) = 11 Or Len(deviceID) = 8 Then

            myDeviceChoice = Item1ChoiceType13.esn

        ElseIf Len(deviceID) = 14 Then

            myDeviceChoice = Item1ChoiceType13.meid

        End If

        myResellerPRLInquiry.Item1ElementName = myDeviceChoice
        myResellerPRLInquiry.Item1 = deviceID

        BuildResellerOrder_WithSubOrder(referenceNumber, "PRLINQUIRE", "INQPRL", myResellerPRLInquiry, myRSSRequestDocument)

    End Sub

    Sub BuildLineInquiry(ByVal referenceNumber As String, ByVal mdn As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerLineInquiry As New resellerLineInquiryType()
        Dim myMDN As New mdnType()

        orderTypeDescription = "LineInquiry"

        myMDN.Value = mdn
        myResellerLineInquiry.Item1 = myMDN

        BuildResellerOrder_WithSubOrder(referenceNumber, "INQUIRE", "INQSLND", myResellerLineInquiry, myRSSRequestDocument)

    End Sub

    Sub BuildChangeNumber(ByVal referenceNumber As String, ByVal zipCode As String, ByVal mdn As String, ByVal deviceID As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerChangeNumber As New resellerChangeNumberType()
        Dim myNextAvailableWithOldMDNType As New nextAvailablewithOldMDNType()
        Dim myMDN As New mdnType()
        Dim myZipCode As New zipCodeType()
        Dim myDeviceChoice As New Item2ChoiceType2()

        orderTypeDescription = "ChangeNumber"

        myMDN.Value = mdn
        myZipCode.Value = zipCode

        myNextAvailableWithOldMDNType.oldMdn = myMDN
        myNextAvailableWithOldMDNType.zipCode = myZipCode

        myResellerChangeNumber.Item1 = myNextAvailableWithOldMDNType

        If Len(deviceID) = 11 Or Len(deviceID) = 8 Then

            myDeviceChoice = Item2ChoiceType2.esn

        ElseIf Len(deviceID) = 14 Then

            myDeviceChoice = Item2ChoiceType2.meid

        End If

        myResellerChangeNumber.Item2ElementName = myDeviceChoice
        myResellerChangeNumber.Item2 = deviceID

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerChangeNumber, myRSSRequestDocument)

    End Sub

    Sub BuildResellerAddSubscriberPortIn(ByVal referenceNumber As String, ByVal mdn As String, ByVal deviceID As String, ByVal planCode As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerAddSubscriberPortIn As New resellerAddSubscriberPortInType()
        Dim myMDN As New mdnType()
        Dim myDeviceChoice As New Item1ChoiceType2()
        Dim myLNP As New lnpType()
        Dim myLNPName As New lnpNameType()
        Dim myLNPPersonName As New lnpPersonNameType()
        Dim myFirst As New personNameType()
        Dim myLast As New personNameType()
        Dim myLNPAddress As New lnpAddressType()
        Dim myAddressLine1 As New streetNameType()
        Dim myAddressLine2 As New streetNameType()
        Dim myCity As New cityType()
        Dim myState As New stateType()
        Dim myZIP As New zipCodeType()
        Dim myAuthorizationStatus As New authorizationStatusType()
        Dim mySSN As New oasStringType()
        Dim mySSNorTaxIDChoice() As ssnOrTaxIdType = {New ssnOrTaxIdType}
        Dim myPlanCode As New oasStringType()
        Dim myPlan As New planType()
        Dim myAuthorizedSigner As New oasString60Type()

        orderTypeDescription = "AddSubscriberPortIn"

        myMDN.Value = mdn

        myFirst.Value = "Tess"
        myLast.Value = "Ting"

        myAuthorizedSigner.Value = myFirst.Value & " " & myLast.Value

        myAddressLine1.Value = "1325 Barksdale Blvd"
        myAddressLine2.Value = "Suite 200"
        myCity.Value = "Bossier City"
        myState.Value = "LA"
        myZIP.Value = "71111"

        myAuthorizationStatus = authorizationStatusType.Y

        mySSN.Value = "123456789"
        mySSNorTaxIDChoice(0).ItemElementName = ItemChoiceType2.ssn
        mySSNorTaxIDChoice(0).Item = mySSN

        myPlanCode.Value = planCode
        myPlan.planCode = myPlanCode

        If Len(deviceID) = 11 Or Len(deviceID) = 8 Then

            myDeviceChoice = Item1ChoiceType2.esn

        ElseIf Len(deviceID) = 14 Then

            myDeviceChoice = Item1ChoiceType2.meid

        End If

        myLNPPersonName.first = myFirst
        myLNPPersonName.last = myLast

        myLNPName.Item = myLNPPersonName

        myLNPAddress.addressLine1 = myAddressLine1
        myLNPAddress.addressLine2 = myAddressLine2
        myLNPAddress.city = myCity
        myLNPAddress.state = myState
        myLNPAddress.zip = myZIP

        myLNP.lnpName = myLNPName
        myLNP.address = myLNPAddress
        myLNP.authorizedSigner = myAuthorizedSigner

        myLNP.authorizationStatus = myAuthorizationStatus
        myLNP.Items = mySSNorTaxIDChoice

        myResellerAddSubscriberPortIn.mdn = myMDN
        myResellerAddSubscriberPortIn.Item1ElementName = myDeviceChoice
        myResellerAddSubscriberPortIn.Item1 = deviceID
        myResellerAddSubscriberPortIn.lnp = myLNP
        myResellerAddSubscriberPortIn.plan = myPlan

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerAddSubscriberPortIn, myRSSRequestDocument)

    End Sub

    Sub BuildChangeRatePlanRequest(ByVal referenceNumber As String, ByVal mdn As String, ByVal changeRatePlanFeatures_Add_Present As Boolean, ByVal changeRatePlanFeatures_Add As String(), ByVal changeRatePlanFeatures_Delete_Present As Boolean, ByVal changeRatePlanFeatures_Delete As String(), ByVal planCode As String, ByVal planCode_Old As String, ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerChangeRatePlan As New resellerChangeRatePlanType()
        Dim myMDN As New mdnType()

        Dim myPlan As New planType()
        Dim myPlanCode As New oasStringType()
        Dim myRatePlan As New ratePlanType()

        Dim myFeatureRP() As featureRPType = {New featureRPType}
        Dim myFeatureRP_Item As New featureRPType()
        Dim myFeatureCodeField As New oasStringType()
        Dim mySubscribeField As New addDeleteType()
        Dim featureRPCounter As Integer = 0

        orderTypeDescription = "ChangeRatePlan"
        myMDN.Value = mdn

        If changeRatePlanFeatures_Add_Present Or changeRatePlanFeatures_Delete_Present Then

            If changeRatePlanFeatures_Add_Present And changeRatePlanFeatures_Delete_Present Then
                ReDim myFeatureRP(UBound(changeRatePlanFeatures_Add) + UBound(changeRatePlanFeatures_Delete) + 1)
            ElseIf changeRatePlanFeatures_Add_Present Then
                ReDim myFeatureRP(UBound(changeRatePlanFeatures_Add))
            Else
                ReDim myFeatureRP(UBound(changeRatePlanFeatures_Delete))
            End If

            If changeRatePlanFeatures_Add_Present Then

                For counter As Integer = 0 To UBound(changeRatePlanFeatures_Add)

                    myFeatureRP_Item = New featureRPType
                    myFeatureCodeField = New oasStringType
                    mySubscribeField = New addDeleteType

                    myFeatureCodeField.Value = changeRatePlanFeatures_Add(counter)
                    mySubscribeField.Value = "A"

                    myFeatureRP_Item.featureCode = myFeatureCodeField
                    myFeatureRP_Item.subscribe = mySubscribeField

                    myFeatureRP(featureRPCounter) = myFeatureRP_Item
                    featureRPCounter = featureRPCounter + 1

                Next

            End If

            If changeRatePlanFeatures_Delete_Present Then

                For counter As Integer = 0 To UBound(changeRatePlanFeatures_Delete)

                    myFeatureRP_Item = New featureRPType
                    myFeatureCodeField = New oasStringType
                    mySubscribeField = New addDeleteType

                    myFeatureCodeField.Value = changeRatePlanFeatures_Delete(counter)
                    mySubscribeField.Value = "D"

                    myFeatureRP_Item.featureCode = myFeatureCodeField
                    myFeatureRP_Item.subscribe = mySubscribeField

                    myFeatureRP(featureRPCounter) = myFeatureRP_Item
                    featureRPCounter = featureRPCounter + 1

                Next

            End If

        End If

        myPlanCode.Value = planCode
        myPlan.planCode = myPlanCode

        myRatePlan.plan = myPlan
        myRatePlan.feature = myFeatureRP

        myResellerChangeRatePlan.mdn = myMDN
        myResellerChangeRatePlan.newRatePlan = myRatePlan

        myPlan = New planType
        myPlanCode = New oasStringType
        myRatePlan = New ratePlanType

        myPlanCode.Value = planCode_Old
        myPlan.planCode = myPlanCode
        myRatePlan.plan = myPlan

        myResellerChangeRatePlan.oldRatePlan = myRatePlan

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerChangeRatePlan, myRSSRequestDocument)

    End Sub

    Sub BuildResellerAddSubscriberRequest(ByVal referenceNumber As String, ByVal zipCode As String, ByVal deviceID As String, ByVal planCode As String, ByVal addSubscriberFeatures_Add_Present As Boolean, ByVal addSubscriberFeatures_Add As String(), ByVal addSubscriberFeatures_Delete_Present As Boolean, ByVal addSubscriberFeatures_Delete As String(), ByRef orderTypeDescription As String, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerAddSubscriber As New resellerAddSubscriberType()
        Dim myNextAvailableMdn As New nextAvailableMDNType()
        Dim myZipCode As New zipCodeType()

        Dim myPlanCode As New oasStringType()
        Dim myItem2Choice As New Item2ChoiceType()
        Dim myPlan As New planType()

        Dim myFeature() As featureType = {New featureType}
        Dim myFeature_Item As New featureType()
        Dim myFeatureCode As New oasStringType()
        Dim mySubscribe As New addDeleteType()
        Dim featureCounter As Int16 = 0

        orderTypeDescription = "AddSubscriber"

        myZipCode.Value = zipCode
        myNextAvailableMdn.zipCode = myZipCode

        If Len(deviceID) = 11 Or Len(deviceID) = 8 Then

            myItem2Choice = Item2ChoiceType.esn

        ElseIf Len(deviceID) = 14 Then

            myItem2Choice = Item2ChoiceType.meid

        End If

        myPlanCode.Value = planCode
        myPlan.planCode = myPlanCode

        myResellerAddSubscriber.Item1 = myNextAvailableMdn
        myResellerAddSubscriber.Item2ElementName = myItem2Choice
        myResellerAddSubscriber.Item2 = deviceID

        If addSubscriberFeatures_Add_Present Or addSubscriberFeatures_Delete_Present Then

            If addSubscriberFeatures_Add_Present And addSubscriberFeatures_Delete_Present Then
                ReDim myFeature(UBound(addSubscriberFeatures_Add) + UBound(addSubscriberFeatures_Delete) + 1)
            ElseIf addSubscriberFeatures_Add_Present Then
                ReDim myFeature(UBound(addSubscriberFeatures_Add))
            Else
                ReDim myFeature(UBound(addSubscriberFeatures_Delete))
            End If

            If addSubscriberFeatures_Add_Present Then

                For counter As Int16 = 0 To UBound(addSubscriberFeatures_Add)

                    myFeature_Item = New featureType
                    myFeatureCode = New oasStringType
                    mySubscribe = New addDeleteType

                    myFeatureCode.Value = addSubscriberFeatures_Add(counter)
                    mySubscribe.Value = "A"

                    myFeature_Item.featureCode = myFeatureCode
                    myFeature_Item.subscribe = mySubscribe

                    myFeature(featureCounter) = myFeature_Item
                    featureCounter = featureCounter + 1

                Next

            End If

            If addSubscriberFeatures_Delete_Present Then

                For counter As Int16 = 0 To UBound(addSubscriberFeatures_Delete)

                    myFeature_Item = New featureType
                    myFeatureCode = New oasStringType
                    mySubscribe = New addDeleteType

                    myFeatureCode.Value = addSubscriberFeatures_Delete(counter)
                    mySubscribe.Value = "D"

                    myFeature_Item.featureCode = myFeatureCode
                    myFeature_Item.subscribe = mySubscribe

                    myFeature(featureCounter) = myFeature_Item
                    featureCounter = featureCounter + 1

                Next

            End If

            myResellerAddSubscriber.feature = myFeature

        End If

        myResellerAddSubscriber.plan = myPlan

        BuildResellerOrder_WithSubOrder(referenceNumber, "ORDER", "MNTMLND", myResellerAddSubscriber, myRSSRequestDocument)

    End Sub

    Sub BuildResellerOrder_WithSubOrder(ByVal referenceNumber As String, ByVal requestType As String, ByVal orderType As String, ByVal mySubOrderObject As Object, ByRef myRSSRequestDocument As System.Xml.XmlDocument)

        Dim myResellerOrder As New resellerOrder()
        Dim myMessageHeader As New messageHeaderType()
        Dim myOrder As New resellerOrderType()
        Dim mySubOrder As New resellerSubOrderType()
        Dim myOrderTimeStamp As New oasStringType()
        Dim myAccountNumber As New oasStringType()

        BuildMessageHeader(requestType, orderType, referenceNumber, myMessageHeader)

        myResellerOrder.messageHeader = myMessageHeader

        myOrderTimeStamp.Value = BuildOrderTimeStamp()
        myOrder.orderTimeStamp = myOrderTimeStamp

        myAccountNumber.Value = accountNumber
        myOrder.accountNumber = myAccountNumber

        mySubOrder.Item = mySubOrderObject

        myOrder.subOrder = mySubOrder

        myResellerOrder.order = myOrder

        myRSSRequestDocument = ConvertObjectToXmlDocument(myResellerOrder)

    End Sub

    Sub BuildMessageHeader(ByVal requestType As String, ByVal orderType As String, ByVal referenceNumber As String, ByRef myMessageHeader As messageHeaderType)

        Dim myReferenceNumber As New referenceNumberType()
        myReferenceNumber.Value = referenceNumber

        myMessageHeader.referenceNumber = myReferenceNumber
        myMessageHeader.vendorId = vendorID
        myMessageHeader.requestType = requestType
        myMessageHeader.orderType = orderType
        myMessageHeader.returnURL = returnURL
        myMessageHeader.asyncErrorURL = asynchErrorURL

    End Sub

    Function ConvertObjectToXmlDocument(ByVal objectToConvert As Object) As System.Xml.XmlDocument
        Dim myXmlDocument As New System.Xml.XmlDocument()
        Dim myMemoryStream As New System.IO.MemoryStream()
        Dim myXmlSerializer As New System.Xml.Serialization.XmlSerializer(objectToConvert.GetType())

        myXmlSerializer.Serialize(myMemoryStream, objectToConvert)
        myMemoryStream.Seek(0, System.IO.SeekOrigin.Begin)

        myXmlDocument.Load(myMemoryStream)
        myMemoryStream.Close()

        Return myXmlDocument
    End Function

    Function BuildDateAndTimeString() As String

        Dim dtMoment As DateTime

        dtMoment = DateTime.Now

        BuildDateAndTimeString = Convert.ToString(dtMoment.Year) & _
        fnAddLeadingZeros(2, Convert.ToString(dtMoment.Month)) & _
        fnAddLeadingZeros(2, Convert.ToString(dtMoment.Day)) & _
        fnAddLeadingZeros(2, Convert.ToString(dtMoment.Hour)) & _
        fnAddLeadingZeros(2, Convert.ToString(dtMoment.Minute)) & _
        fnAddLeadingZeros(2, Convert.ToString(dtMoment.Second))

    End Function

    Function BuildOrderTimeStamp() As String

        Dim dtMoment As DateTime

        dtMoment = DateTime.Now

        BuildOrderTimeStamp = fnAddLeadingZeros(2, Convert.ToString(dtMoment.Month)) & _
        "/" & _
        fnAddLeadingZeros(2, Convert.ToString(dtMoment.Day)) & _
        "/" & _
        Convert.ToString(dtMoment.Year) & _
        " " & _
        fnAddLeadingZeros(2, Convert.ToString(dtMoment.Hour)) & _
        ":" & _
        fnAddLeadingZeros(2, Convert.ToString(dtMoment.Minute)) & _
        ":" & _
        fnAddLeadingZeros(2, Convert.ToString(dtMoment.Second))

    End Function

    Function fnAddLeadingZeros(ByVal characters As Integer, ByVal originalValue As String) As String

        If Len(originalValue) < characters Then

            fnAddLeadingZeros = originalValue.PadLeft(characters, "0")

        Else

            fnAddLeadingZeros = originalValue

        End If

    End Function
End Class
