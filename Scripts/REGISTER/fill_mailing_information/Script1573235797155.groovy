import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.setText(findTestObject('REGISTER/MailingInformation/input_city'), 'Ciudad Prueba')

WebUI.setText(findTestObject('REGISTER/MailingInformation/input_state'), 'Estado Prueba')

WebUI.setText(findTestObject('REGISTER/MailingInformation/input_postalcode'), '12345')

WebUI.selectOptionByLabel(findTestObject('REGISTER/MailingInformation/select_country'), 'MEXICO', false)