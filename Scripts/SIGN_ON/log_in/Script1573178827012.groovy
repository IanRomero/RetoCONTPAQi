import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable




WebUI.setText(findTestObject('SIGN_ON/input_username'), GlobalVariable.USER_NAME)

WebUI.setText(findTestObject('SIGN_ON/input_password'), 'Contpaqi_2019')

WebUI.click(findTestObject("SIGN_ON/button_submit"))

WebUI.waitForElementVisible(findTestObject("FLIGHTS/FligthFinder/Preferences/button_continue"), 5)