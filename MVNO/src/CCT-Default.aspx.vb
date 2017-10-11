Imports System.Net
Imports System.Web.Services
Imports System.Web.Services.Protocols
Imports System.Web.Services.Protocols.SoapHttpClientProtocol

Partial Public Class _Default
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

        Dim appError As Boolean = False
        Dim appErrorMessage As String = ""

        '*********************************************************************************************
        Dim logDirectory As String = "C:\Verizon\CCT\Logs\"
        Dim soapErrorPath As String = "C:\Verizon\CCT\SOAPExceptions\"
        Dim userID As String = "r0hougr"
        Dim cctUserName As String = "APPL-RSS_BudgetPre"
        Dim cctPassword As String = "Li9!g!Z35Gp!"
        Dim providerID As String = "8400"
        Dim rsid As String = "032012"
        Dim submissionURL_AccountGateway As String = "https://wholesaleapi.vzwcorp.com/AccountGateway"
        Dim submissionURL_UsageGateway As String = "https://wholesaleapi.vzwcorp.com/UsageGateway"

        Dim detailedLogging As Boolean = True
        Dim traceRequest As Boolean = True
        Dim traceResponse As Boolean = True
        Dim submitTimeout As Integer = 30000
        '*********************************************************************************************

        TraceExtension.username = cctUserName
        TraceExtension.password = cctPassword

        'Dim mdn As String = "3185537555"
        'Dim mdn As String = "7026594541"
        'Dim mdn As String = "8709977188"
        'Dim mdn As String = "3185179495"
        Dim mdn As String = "3183499730"

        'Dim mdn As String = "3185537556"
        'Dim rowID As String = "AAw9CbACvAAN9pNAAB"
        Dim rowID As String = "AAxMEyABnAACzJbAAF"

        'ProcessSearchSubscriberInfo(userID, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessGetAutoReplenish(userID, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessAddAutoReplenish(userID, rsid, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessUpdateAutoReplenish(userID, rsid, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessUpdateAccountBalance(userID, providerID, rsid, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessSearchBucketInfo(userID, providerID, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        ProcessAddBucket(userID, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessUpdateBucket(userID, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessDeleteBucket(userID, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessDeleteAllBuckets(userID, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessUpdateCredit(userID, providerID, rsid, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessUpdateSubscriberField(userID, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessSearchCDR(userID, providerID, submissionURL_UsageGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessSearchCDRDetail(userID, providerID, rowID, submissionURL_UsageGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)
        'ProcessRevertCalls(userID, providerID, rowID, submissionURL_AccountGateway, submitTimeout, logDirectory, soapErrorPath, traceRequest, traceResponse, detailedLogging, mdn, appError, appErrorMessage)

        If appError Then

            EventLog.WriteEntry("Verizon_CCT", "Application Error: " & appErrorMessage, EventLogEntryType.Error)

        End If

    End Sub

    Sub ProcessRevertCalls(ByVal userID As String, ByVal providerID As String, ByVal rowID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myRevertCallsResponse As New AccountGateway.RevertCallsResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitRevertCalls(userID, providerID, rowID, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myRevertCallsResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "RevertCalls", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitRevertCalls(ByVal userID As String, ByVal providerID As String, ByVal rowID As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myRevertCallsResponse As AccountGateway.RevertCallsResponse)

        Dim myRevertCalls As New AccountGateway.revertCalls()
        Dim myRevertCallsRequest As New AccountGateway.RevertCallsRequest()
        Dim myRevertCallsInputCall() As AccountGateway.RevertCallsInputCall = {New AccountGateway.RevertCallsInputCall()}

        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myRevertCallsInputCall(0).ROWID = rowID
            myRevertCallsRequest.inputCallList = myRevertCallsInputCall

            myRevertCallsRequest.providerID = providerID
            myRevertCallsRequest.userID = userID
            myRevertCallsRequest.mdn = mdn

            myRevertCalls.inputRevertCalls = myRevertCallsRequest
            
            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myRevertCallsResponse = myAccountGatewayInterfaceHTTPService.revertCalls(myRevertCalls)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "RevertCalls request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "RevertCalls request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessSearchCDRDetail(ByVal userID As String, ByVal providerID As String, ByVal rowID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim mySearchCDRDetailResponse As New UsageGateway.searchCDRDetailResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitSearchCDRDetail(userID, providerID, rowID, submissionURL, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, mySearchCDRDetailResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "SearchCDRDetail", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitSearchCDRDetail(ByVal userID As String, ByVal providerID As String, ByVal rowID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef mySearchCDRDetailResponse As UsageGateway.searchCDRDetailResponse)

        Dim mySearchCDRDetail As New UsageGateway.searchCDRDetail()
        Dim myMARSGenDetRequest As New UsageGateway.MARSGenDetRequest()
        Dim myMARSGatewayInterfaceHTTPService As New UsageGateway.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpService()

        If Not appError Then

            myMARSGenDetRequest.userID = userID
            myMARSGenDetRequest.providerID = providerID
            myMARSGenDetRequest.rowID = rowID

            mySearchCDRDetail.SearchCDRDetRequest = myMARSGenDetRequest

            myMARSGatewayInterfaceHTTPService.Url = submissionURL
            myMARSGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                mySearchCDRDetailResponse = myMARSGatewayInterfaceHTTPService.searchCDRDetail(mySearchCDRDetail)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "SearchCDRDetail request submission for rowID " & rowID & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "SearchCDRDetail request submission for rowID " & rowID & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessSearchCDR(ByVal userID As String, ByVal providerID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim mySearchCDRResponse As New UsageGateway.searchCDRResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitSearchCDR(userID, providerID, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, mySearchCDRResponse)
            
            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "SearchCDR", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitSearchCDR(ByVal userID As String, ByVal providerID As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef mySearchCDRResponse As UsageGateway.searchCDRResponse)

        Dim mySearhCDR As New UsageGateway.searchCDR()
        Dim myMARSGenSumRequest As New UsageGateway.MARSGenSumRequest()
        Dim myMARSGatewayInterfaceHTTPService As New UsageGateway.MARSGatewayInterfaceExport2_MARSGatewayInterfaceHttpService()

        If Not appError Then

            myMARSGenSumRequest.userID = userID
            myMARSGenSumRequest.mdn = mdn
            myMARSGenSumRequest.providerID = providerID
            'myMARSGenSumRequest.startDate = "11/16/2011 00:00:01"
            'myMARSGenSumRequest.endDate = "11/17/2011 00:00:01"
            myMARSGenSumRequest.startDate = "02/01/2013 00:00:01"
            myMARSGenSumRequest.endDate = "02/17/2013 00:00:01"
            myMARSGenSumRequest.recordCount = 200
            myMARSGenSumRequest.recordCountSpecified = True
            myMARSGenSumRequest.usageFilter = UsageGateway.MARSGenSumRequestUsageFilter.ALL_EVENTS
            myMARSGenSumRequest.usageFilterSpecified = True

            mySearhCDR.SearchCDRRequest = myMARSGenSumRequest

            myMARSGatewayInterfaceHTTPService.Url = submissionURL
            myMARSGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                mySearchCDRResponse = myMARSGatewayInterfaceHTTPService.searchCDR(mySearhCDR)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "SearchCDR request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "SearchCDR request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessUpdateSubscriberField(ByVal userID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myUpdateSubscriberFieldResponse As New AccountGateway.updateSubscriberFieldResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitUpdateSubscriberField(userID, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myUpdateSubscriberFieldResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "UpdateSubscriberField", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitUpdateSubscriberField(ByVal userID As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myUpdateSubscriberFieldResponse As AccountGateway.updateSubscriberFieldResponse)

        Dim myUpdateSubscriberField As New AccountGateway.updateSubscriberField()
        Dim myUpdateSubscriberFieldRequest As New AccountGateway.updateSubscriberFieldRequest()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myUpdateSubscriberFieldRequest.userId = userID
            myUpdateSubscriberFieldRequest.mdn = mdn
            myUpdateSubscriberFieldRequest.fieldname = AccountGateway.updateSubscriberFieldRequestFieldname.LANGUAGE
            'myUpdateSubscriberFieldRequest.fieldvalue = "SPANISH"
            myUpdateSubscriberFieldRequest.fieldvalue = "ENGLISH"

            myUpdateSubscriberField.updateSubscriberField1 = myUpdateSubscriberFieldRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myUpdateSubscriberFieldResponse = myAccountGatewayInterfaceHTTPService.updateSubscriberField(myUpdateSubscriberField)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "UpdateSubscriberField request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "UpdateSubscriberField request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessUpdateCredit(ByVal userID As String, ByVal providerID As String, ByVal rsid As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myUpdateCreditResponse As New AccountGateway.updateCreditResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitUpdateCredit(userID, providerID, rsid, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myUpdateCreditResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "UpdateCredit", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitUpdateCredit(ByVal userID As String, ByVal providerID As String, ByVal rsid As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myUpdateCreditResponse As AccountGateway.updateCreditResponse)

        Dim myUpdateCredit As New AccountGateway.updateCredit()
        Dim myUpdateAccBalRequest As New AccountGateway.UpdateAccBalRequest()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myUpdateAccBalRequest.userId = userID
            myUpdateAccBalRequest.mdn = mdn
            myUpdateAccBalRequest.providerId = providerID
            myUpdateAccBalRequest.balanceType = AccountGateway.UpdateAccBalRequestBalanceType.primary
            myUpdateAccBalRequest.amount = "1"
            myUpdateAccBalRequest.tranType = AccountGateway.UpdateAccBalRequestTranType.credit
            'myUpdateAccBalRequest.tranType = AccountGateway.UpdateAccBalRequestTranType.debit
            myUpdateAccBalRequest.tranTypeSpecified = True
            myUpdateAccBalRequest.rsid = rsid

            myUpdateCredit.inputUpdateCredit = myUpdateAccBalRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myUpdateCreditResponse = myAccountGatewayInterfaceHTTPService.updateCredit(myUpdateCredit)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "UpdateCredit request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "UpdateCredit request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessDeleteAllBuckets(ByVal userID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myDeleteAllBucketsResponse As New AccountGateway.deleteAllBucketsResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitDeleteAllBuckets(userID, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myDeleteAllBucketsResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "DeleteAllBuckets", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitDeleteAllBuckets(ByVal userID As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myDeleteAllBucketsResponse As AccountGateway.deleteAllBucketsResponse)

        Dim myDeleteAllBuckets As New AccountGateway.deleteAllBuckets()
        Dim myDeleteAllBuckets1 As New AccountGateway.deleteAllBuckets1()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myDeleteAllBuckets1.userId = userID
            myDeleteAllBuckets1.mdn = mdn

            myDeleteAllBuckets.deleteAllBucketsRequest = myDeleteAllBuckets1

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myDeleteAllBucketsResponse = myAccountGatewayInterfaceHTTPService.deleteAllBuckets(myDeleteAllBuckets)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "DeleteAllBuckets request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "DeleteAllBuckets request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessDeleteBucket(ByVal userID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myDeleteBucketResponse As New AccountGateway.deleteBucketResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitDeleteBucket(userID, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myDeleteBucketResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "DeleteBucket", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitDeleteBucket(ByVal userID As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myDeleteBucketResponse As AccountGateway.deleteBucketResponse)

        Dim myDeleteBucket As New AccountGateway.deleteBucket()
        Dim myBucketDeleteRequest As New AccountGateway.BucketDeleteRequest()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myBucketDeleteRequest.userId = userID
            myBucketDeleteRequest.mdn = mdn
            myBucketDeleteRequest.bucketID = "BG1"

            myDeleteBucket.deleteBucketRequest = myBucketDeleteRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myDeleteBucketResponse = myAccountGatewayInterfaceHTTPService.deleteBucket(myDeleteBucket)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "DeleteBucket request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "DeleteBucket request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessUpdateBucket(ByVal userID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myUpdateBucketResponse As New AccountGateway.updateBucketResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitUpdateBucket(userID, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myUpdateBucketResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "UpdateBucket", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitUpdateBucket(ByVal userID As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myUpdateBucketResponse As AccountGateway.updateBucketResponse)

        Dim myUpdateBucket As New AccountGateway.updateBucket()
        Dim myBucketUpdateRequest As New AccountGateway.BucketUpdateRequest()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myBucketUpdateRequest.userId = userID
            myBucketUpdateRequest.mdn = mdn
            'myBucketUpdateRequest.bucketID = "BGS"
            myBucketUpdateRequest.bucketID = "BGV"
            'myBucketUpdateRequest.adjustmentType = AccountGateway.BucketUpdateRequestAdjustmentType.INCR
            'myBucketUpdateRequest.adjustmentType = AccountGateway.BucketUpdateRequestAdjustmentType.DECR
            myBucketUpdateRequest.adjustmentType = AccountGateway.BucketUpdateRequestAdjustmentType.SETEXPIRATION
            myBucketUpdateRequest.adjustmentTypeSpecified = True
            'myBucketUpdateRequest.adjustmentValue = "2470"
            'myBucketUpdateRequest.adjustmentValue = "2"
            myBucketUpdateRequest.adjustmentValue = "05/29/2013"

            myUpdateBucket.updateBucketRequest = myBucketUpdateRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myUpdateBucketResponse = myAccountGatewayInterfaceHTTPService.updateBucket(myUpdateBucket)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "UpdateBucket request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "UpdateBucket request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessAddBucket(ByVal userID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myAddBucketResponse As New AccountGateway.addBucketResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitAddBucket(userID, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myAddBucketResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "AddBucket", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitAddBucket(ByVal userID As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myAddBucketResponse As AccountGateway.addBucketResponse)

        Dim myAddBucket As New AccountGateway.addBucket()
        Dim myBucketAddRequest As New AccountGateway.BucketAddRequest()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myBucketAddRequest.userId = userID
            myBucketAddRequest.mdn = mdn
            myBucketAddRequest.endDate = "09/30/2013"
            'myBucketAddRequest.bucketID = "BGV"
            'myBucketAddRequest.bucketValue = "2000"
            'myBucketAddRequest.bucketID = "BGM"
            'myBucketAddRequest.bucketValue = "100"
            myBucketAddRequest.bucketID = "BGD"
            myBucketAddRequest.bucketValue = "100000"

            myAddBucket.addBucketRequest = myBucketAddRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myAddBucketResponse = myAccountGatewayInterfaceHTTPService.addBucket(myAddBucket)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "AddBucket request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "AddBucket request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessSearchBucketInfo(ByVal userID As String, ByVal providerID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim mySearchBucketInfoResponse As New AccountGateway.searchBucketInfoResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitSearchBucketInfo(userID, providerID, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, mySearchBucketInfoResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "SearchBucketInfo", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitSearchBucketInfo(ByVal userID As String, ByVal providerID As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef mySearchBucketInfoResponse As AccountGateway.searchBucketInfoResponse)

        Dim mySearchBucketInfo As New AccountGateway.searchBucketInfo()
        Dim myBucketInfoRequest As New AccountGateway.BucketInfoRequest()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myBucketInfoRequest.userId = userID
            myBucketInfoRequest.mdn = mdn
            myBucketInfoRequest.providerId = providerID
            myBucketInfoRequest.balanceType = AccountGateway.BucketInfoRequestBalanceType.primary
            'myBucketInfoRequest.sweepOn = AccountGateway.BucketInfoRequestSweepOn.true
            'myBucketInfoRequest.sweepOnSpecified = True

            mySearchBucketInfo.inputSearchBucketInfo = myBucketInfoRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                mySearchBucketInfoResponse = myAccountGatewayInterfaceHTTPService.searchBucketInfo(mySearchBucketInfo)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "SearchBucketInfo request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "SearchBucketInfo request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessUpdateAccountBalance(ByVal userID As String, ByVal providerID As String, ByVal rsid As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myUpdateAccountBalanceResponse As New AccountGateway.updateAccountBalanceResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitUpdateAccountBalance(userID, providerID, rsid, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myUpdateAccountBalanceResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "UpdateAccountBalance", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitUpdateAccountBalance(ByVal userID As String, ByVal providerID As String, ByVal rsid As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myUpdateAccountBalanceResponse As AccountGateway.updateAccountBalanceResponse)

        Dim myUpdateAccountBalance As New AccountGateway.updateAccountBalance()
        Dim myUpdateAccBalRequest As New AccountGateway.UpdateAccBalRequest()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myUpdateAccBalRequest.userId = userID
            myUpdateAccBalRequest.mdn = mdn
            myUpdateAccBalRequest.providerId = providerID
            myUpdateAccBalRequest.balanceType = AccountGateway.UpdateAccBalRequestBalanceType.primary
            myUpdateAccBalRequest.amount = "1"
            myUpdateAccBalRequest.tranType = AccountGateway.UpdateAccBalRequestTranType.credit
            'myUpdateAccBalRequest.tranType = AccountGateway.UpdateAccBalRequestTranType.debit
            myUpdateAccBalRequest.tranTypeSpecified = True
            myUpdateAccBalRequest.rsid = rsid

            myUpdateAccountBalance.inputUpdateAccountBalance = myUpdateAccBalRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myUpdateAccountBalanceResponse = myAccountGatewayInterfaceHTTPService.updateAccountBalance(myUpdateAccountBalance)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "UpdateAccountBalance request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "UpdateAccountBalance request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessUpdateAutoReplenish(ByVal userID As String, ByVal rsid As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myUpdateAutoReplenishResponse As New AccountGateway.UpdateAutoReplenishResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitUpdateAutoReplenish(userID, rsid, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myUpdateAutoReplenishResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "UpdateAutoReplenish", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitUpdateAutoReplenish(ByVal userID As String, ByVal rsid As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myUpdateAutoReplenishResponse As AccountGateway.UpdateAutoReplenishResponse)

        Dim myUpdateAutoReplenish As New AccountGateway.updateAutoReplenish()
        Dim myUpdateAutoReplenishRequest As New AccountGateway.UpdateAutoReplenishRequest()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myUpdateAutoReplenishRequest.userId = userID
            myUpdateAutoReplenishRequest.mdn = mdn
            myUpdateAutoReplenishRequest.active = "ON"
            myUpdateAutoReplenishRequest.startDate = "11/08/2011"
            myUpdateAutoReplenishRequest.amount = "1"
            myUpdateAutoReplenishRequest.frequencyType = "EVERY_X_DAYS"
            myUpdateAutoReplenishRequest.frequencyValueSpecified = True
            myUpdateAutoReplenishRequest.frequencyValue = 30
            myUpdateAutoReplenishRequest.rsid = rsid

            myUpdateAutoReplenish.updateAutoReplenishRequest = myUpdateAutoReplenishRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myUpdateAutoReplenishResponse = myAccountGatewayInterfaceHTTPService.updateAutoReplenish(myUpdateAutoReplenish)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "UpdateAutoReplenish request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "UpdateAutoReplenish request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessAddAutoReplenish(ByVal userID As String, ByVal rsid As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myAddAutoReplenishResponse As New AccountGateway.AddAutoReplenishResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitAddAutoReplenish(userID, rsid, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myAddAutoReplenishResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "AddAutoReplenish", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitAddAutoReplenish(ByVal userID As String, ByVal rsid As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myAddAutoReplenishResponse As AccountGateway.AddAutoReplenishResponse)

        Dim myAddAutoReplenish As New AccountGateway.addAutoReplenish()
        Dim myAddAutoReplenishRequest As New AccountGateway.AddAutoReplenishRequest()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myAddAutoReplenishRequest.userId = userID
            myAddAutoReplenishRequest.mdn = mdn
            myAddAutoReplenishRequest.active = "ON"
            myAddAutoReplenishRequest.startDate = "06/15/2013"
            myAddAutoReplenishRequest.amount = "0.01"
            myAddAutoReplenishRequest.frequencyType = "EVERY_X_DAYS"
            myAddAutoReplenishRequest.frequencyValueSpecified = True
            myAddAutoReplenishRequest.frequencyValue = 2
            myAddAutoReplenishRequest.rsid = rsid

            myAddAutoReplenish.addAutoReplenishRequest = myAddAutoReplenishRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myAddAutoReplenishResponse = myAccountGatewayInterfaceHTTPService.addAutoReplenish(myAddAutoReplenish)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "AddAutoReplenish request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "AddAutoReplenish request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessGetAutoReplenish(ByVal userID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim myGetAutoReplenishResponse As New AccountGateway.GetAutoReplenishResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitGetAutoReplenish(userID, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, myGetAutoReplenishResponse)

            '***************
            submitError = False
            '***************

            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "GetAutoReplenish", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitGetAutoReplenish(ByVal userID As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef myGetAutoReplenishResponse As AccountGateway.GetAutoReplenishResponse)

        Dim myGetAutoReplenish As New AccountGateway.getAutoReplenish()
        Dim myGetAutoReplenishRequest As New AccountGateway.GetAutoReplenishRequest()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            myGetAutoReplenishRequest.userId = userID
            myGetAutoReplenishRequest.mdn = mdn

            myGetAutoReplenish.getAutoReplenishRequest = myGetAutoReplenishRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                myGetAutoReplenishResponse = myAccountGatewayInterfaceHTTPService.getAutoReplenish(myGetAutoReplenish)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "GetAutoReplenish request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "GetAutoReplenish request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessSearchSubscriberInfo(ByVal userID As String, ByVal submissionURL As String, ByVal submitTimeout As Integer, ByVal logDirectory As String, ByVal soapErrorPath As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal detailedLogging As Boolean, ByVal mdn As String, ByRef appError As Boolean, ByRef appErrorMessage As String)

        Dim dateAndTimeString As String
        Dim submitError As Boolean
        Dim soapException As Boolean
        Dim writeEventLogError As Boolean
        Dim eventLogErrorMessage As String = ""

        Dim mySearchSubscriberInfoResponse As New AccountGateway.searchSubscriberInfoResponse()

        If Not appError Then

            dateAndTimeString = BuildDateAndTimeString()

            SubmitSearchSubscriberInfo(userID, submissionURL, mdn, submitTimeout, detailedLogging, submitError, soapException, writeEventLogError, eventLogErrorMessage, appError, mySearchSubscriberInfoResponse)
            ProcessSubmitErrors(submitError, soapException, writeEventLogError, eventLogErrorMessage, dateAndTimeString, mdn, soapErrorPath, appError)
            ProcessTraceOutput(submitError, "SearchSubscriberInfo", traceRequest, traceResponse, logDirectory, mdn, dateAndTimeString, appError)

        End If

    End Sub

    Sub SubmitSearchSubscriberInfo(ByVal userID As String, ByVal submissionURL As String, ByVal mdn As String, ByVal submitTimeout As Integer, ByVal detailedLogging As Boolean, ByRef submitError As Boolean, ByRef soapException As Boolean, ByRef writeEventLogError As Boolean, ByRef eventLogErrorMessage As String, ByVal appError As Boolean, ByRef mySearchSubscriberInfoResponse As AccountGateway.searchSubscriberInfoResponse)

        Dim mySearchSubscriberInfo As New AccountGateway.searchSubscriberInfo()
        Dim mySubscriberInfoRequest As New AccountGateway.SubscriberInfoRequest()
        Dim mySubscriberInfoRequestBalanceType As New AccountGateway.SubscriberInfoRequestBalanceType()
        Dim myAccountGatewayInterfaceHTTPService As New AccountGateway.AccountGatewayInterfaceExport1_AccountGatewayInterfaceHttpService()

        If Not appError Then

            mySubscriberInfoRequestBalanceType = AccountGateway.SubscriberInfoRequestBalanceType.both

            mySubscriberInfoRequest.userId = userID
            mySubscriberInfoRequest.mdn = mdn
            mySubscriberInfoRequest.balanceType = mySubscriberInfoRequestBalanceType

            mySearchSubscriberInfo.inputSearchSubscriberInfo = mySubscriberInfoRequest

            myAccountGatewayInterfaceHTTPService.Url = submissionURL
            myAccountGatewayInterfaceHTTPService.Timeout = submitTimeout

            submitError = False
            soapException = False
            writeEventLogError = False

            Try

                mySearchSubscriberInfoResponse = myAccountGatewayInterfaceHTTPService.searchSubscriberInfo(mySearchSubscriberInfo)

            Catch wex As WebException

                submitError = True

                If detailedLogging Then

                    writeEventLogError = True
                    eventLogErrorMessage = "SearchSubscriberInfo request submission for MDN " & mdn & " resulted in a web exception.  Type: """ & wex.Status.ToString & """ Message: """ & wex.Message & """."

                End If

            Catch sex As SoapException

                submitError = True
                soapException = True

            Catch ex As Exception

                submitError = True

                writeEventLogError = True
                eventLogErrorMessage = "SearchSubscriberInfo request submission for MDN " & mdn & " resulted in an error.  Message: """ & ex.Message & """."

            End Try

        End If

    End Sub

    Sub ProcessTraceOutput(ByVal submitError As Boolean, ByVal functionName As String, ByVal traceRequest As Boolean, ByVal traceResponse As Boolean, ByVal logDirectory As String, ByVal mdn As String, ByVal dateAndTimeString As String, ByVal appError As Boolean)

        If Not appError Then

            If Not submitError Then

                If traceRequest Then

                    TraceExtension.XmlRequest.Save(logDirectory & mdn & "_" & functionName & "_request_" & dateAndTimeString & ".xml")

                End If

                If traceResponse Then

                    TraceExtension.XmlResponse.Save(logDirectory & mdn & "_" & functionName & "_response_" & dateAndTimeString & ".xml")

                End If

            End If

        End If

    End Sub

    Sub ProcessSubmitErrors(ByVal submitError As Boolean, ByVal soapException As Boolean, ByVal writeEventLogError As Boolean, ByVal eventLogErrorMessage As String, ByVal dateAndTimeString As String, ByVal mdn As String, ByVal soapErrorPath As String, ByVal appError As Boolean)

        If Not appError Then

            If submitError Then

                If writeEventLogError Then

                    EventLog.WriteEntry("Verizon_CCT", eventLogErrorMessage, EventLogEntryType.Error)

                End If

                If soapException Then

                    TraceExtension.XmlResponse.Save(soapErrorPath & mdn & "_" & dateAndTimeString & ".xml")

                End If

            End If

        End If

    End Sub

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

    Function fnAddLeadingZeros(ByVal characters As Integer, ByVal originalValue As String) As String

        If Len(originalValue) < characters Then

            fnAddLeadingZeros = originalValue.PadLeft(characters, "0")

        Else

            fnAddLeadingZeros = originalValue

        End If

    End Function

End Class