import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




WebUI.verifyElementClickable(findTestObject("MENU/TopMenu/option_signon"), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject("MENU/TopMenu/option_signon"))

WebUI.waitForElementVisible(findTestObject("Object Repository/SIGN_ON/button_submit"), 5)