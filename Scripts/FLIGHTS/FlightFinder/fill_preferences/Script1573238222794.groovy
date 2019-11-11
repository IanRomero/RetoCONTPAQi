import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

switch (serviceClass) {
	case "E":
		WebUI.click(findTestObject('FLIGHTS/FligthFinder/Preferences/radio_serviceclass', [('servclass') : 'Coach']))
		break
	case "B":
		WebUI.click(findTestObject('FLIGHTS/FligthFinder/Preferences/radio_serviceclass', [('servclass') : 'Business']))
		break
	case "F":
		WebUI.click(findTestObject('FLIGHTS/FligthFinder/Preferences/radio_serviceclass', [('servclass') : 'First']))
		break
}