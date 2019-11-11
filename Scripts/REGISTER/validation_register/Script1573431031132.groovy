import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

dataRegister = CustomKeywords.'auxiliar.validations.RegistrationMessage.validateMessage'('Nombre Prueba Apellido Prueba', 
    GlobalVariable.USER_NAME)

if (WebUI.verifyEqual(dataRegister.get(1), false, FailureHandling.OPTIONAL)) {
    KeywordUtil.markFailed(((('\n\n ' + dataRegister.get(0)) + ' -> ') + dataRegister.get(1)) + '\n\n')
} else {
    KeywordUtil.markPassed(((('\n\n ' + dataRegister.get(0)) + ' -> ') + dataRegister.get(1)) + '\n\n')
}