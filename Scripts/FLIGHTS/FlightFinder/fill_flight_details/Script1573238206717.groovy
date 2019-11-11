import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Calendar calen = Calendar.getInstance()

expectedMonth = calen.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH)

day = calen.get(Calendar.DATE)

WebUI.click(findTestObject('FLIGHTS/FligthFinder/FlightDetails/radio_triptype', [('type') : type]))

WebUI.selectOptionByLabel(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_passengers'), noPassengers, false)

WebUI.selectOptionByLabel(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_departingfrom'), departingFrom, false)

fromActualMonth = WebUI.getText(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_onmonth'))

if (WebUI.verifyNotMatch(fromActualMonth, expectedMonth, false)) {
	WebUI.selectOptionByLabel(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_onmonth'), expectedMonth, false)
} else {
	WebUI.selectOptionByLabel(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_onmonth'), fromActualMonth, false)
}

WebUI.selectOptionByLabel(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_onday'), day.toString(), false)

WebUI.selectOptionByLabel(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_arrivingin'), departingFrom, false)

arrivingActualMonth = WebUI.getText(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_returningmonth'))

if (WebUI.verifyNotMatch(arrivingActualMonth, expectedMonth, false)) {
	WebUI.selectOptionByLabel(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_returningmonth'), expectedMonth, false)
} else {
	WebUI.selectOptionByLabel(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_returningmonth'), arrivingActualMonth, false)
}

WebUI.selectOptionByLabel(findTestObject('FLIGHTS/FligthFinder/FlightDetails/select_returningday'), String.valueOf(day + 1), false)