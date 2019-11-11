import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('FLIGHTS/FlightFinder/fill_flight_details'), [('type') : type, ('departingFrom') : depFrom, ('noPassengers') : noPass], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('FLIGHTS/FlightFinder/fill_preferences'), [('serviceClass') : servClass], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('FLIGHTS/FligthFinder/Preferences/button_continue'))

WebUI.verifyElementVisible(findTestObject("FLIGHTS/SelectFlight/button_continue"), FailureHandling.STOP_ON_FAILURE)