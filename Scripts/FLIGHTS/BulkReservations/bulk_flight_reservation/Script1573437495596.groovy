import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('FLIGHTS/FlightFinder/search_flight'), [('type') : type, ('depFrom') : depForm, ('servClass') : servClass
        , ('noPass') : noPass], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FLIGHTS/SelectFlight/reserve_flight'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FLIGHTS/BookFlight/purchase_flight'), [('totalPassengers') : Integer.parseInt(noPass)], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FLIGHTS/BookFlight/validation_purchase'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FLIGHTS/PurchaseMessage/button_backtoflight'))

WebUI.waitForElementVisible(findTestObject('FLIGHTS/FligthFinder/Preferences/button_continue'), 3)