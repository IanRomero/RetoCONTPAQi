import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.setText(findTestObject('REGISTER/ContactInformation/input_firstname'), firstName)

WebUI.setText(findTestObject('REGISTER/ContactInformation/input_lastname'), lastName)

WebUI.setText(findTestObject('REGISTER/ContactInformation/input_phone'), '123456780')

WebUI.setText(findTestObject('REGISTER/ContactInformation/input_email'), 'prueba@prueba.com')

WebUI.setText(findTestObject('REGISTER/MailingInformation/input_address1'), 'Dirección Prueba')