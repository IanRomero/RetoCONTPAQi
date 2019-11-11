import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.setText(findTestObject('REGISTER/UserInformation/input_username'), 'ContpaqPrueba001')

WebUI.setText(findTestObject('REGISTER/UserInformation/input_password'), 'Contpaqi_2019')

WebUI.setText(findTestObject('REGISTER/UserInformation/input_confirmpassword'), 'Contpaqi_2019')