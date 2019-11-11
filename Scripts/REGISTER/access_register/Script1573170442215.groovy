import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.verifyElementClickable(findTestObject("MENU/TopMenu/option_register"), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject("MENU/TopMenu/option_register"))

WebUI.waitForElementVisible(findTestObject("REGISTER/UserInformation/button_submit"), 5)