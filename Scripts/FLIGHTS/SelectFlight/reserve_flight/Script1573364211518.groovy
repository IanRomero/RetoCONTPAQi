import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

lastHourDepart = CustomKeywords.'auxiliar.validations.SelectFlight.selectLastFlightDepart'()

lastHourReturn = CustomKeywords.'auxiliar.validations.SelectFlight.selectLastFlightReturn'()

WebUI.click(findTestObject("FLIGHTS/SelectFlight/radio_departflight" , [('lastHour') : lastHourDepart]))

WebUI.click(findTestObject("FLIGHTS/SelectFlight/radio_returnflight" , [('lastHour') : lastHourReturn]))

WebUI.click(findTestObject("FLIGHTS/SelectFlight/button_continue"))

WebUI.verifyElementVisible(findTestObject("FLIGHTS/BookFlight/button_securepurchase"))
