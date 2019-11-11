import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.verifyElementClickable(findTestObject("MENU/SideMenu/option_flights"), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject("MENU/SideMenu/option_flights"))

WebUI.waitForElementVisible(findTestObject("FLIGHTS/FligthFinder/Preferences/button_continue"), 5)