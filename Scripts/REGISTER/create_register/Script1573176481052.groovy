import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('REGISTER/fill_contact_information'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('REGISTER/fill_mailing_information'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('REGISTER/fill_user_information'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('REGISTER/UserInformation/button_submit'))

WebUI.callTestCase(findTestCase('REGISTER/validation_register'), [:], FailureHandling.STOP_ON_FAILURE)

