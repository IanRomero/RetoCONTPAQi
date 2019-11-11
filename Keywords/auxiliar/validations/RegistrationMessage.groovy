package auxiliar.validations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class RegistrationMessage {

	@Keyword
	public List validateMessage(String nameandlast, String userName){

		List dataRegister = []

		boolean flag = false

		String actualMessage = ""

		String expectedMessage = ""

		actualMessage = WebUI.getText(findTestObject('Object Repository/REGISTER/RegistrationMessage/p_from')) +
				WebUI.getText(findTestObject('Object Repository/REGISTER/RegistrationMessage/p_body')) +
				WebUI.getText(findTestObject('Object Repository/REGISTER/RegistrationMessage/p_note'))

		expectedMessage = "Dear " + nameandlast + "," +
				"Thank you for registering. You may now sign-in using the user name and password you've just entered." +
				"Note: Your user name is " + userName + "."

		flag = WebUI.verifyMatch(actualMessage, expectedMessage, false, FailureHandling.OPTIONAL)

		dataRegister.add(WebUI.getText(findTestObject('Object Repository/REGISTER/RegistrationMessage/p_note')))

		dataRegister.add(flag)

		return dataRegister
	}
}
