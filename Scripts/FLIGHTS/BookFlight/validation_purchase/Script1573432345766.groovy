import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

dataPurchase = CustomKeywords.'auxiliar.validations.PurchaseMessage.validateFlightPurchase'()

if (WebUI.verifyEqual(dataPurchase.get(1), false, FailureHandling.OPTIONAL)) {
    KeywordUtil.markFailed(((('\n\n ' + dataPurchase.get(0)) + ' -> ') + dataPurchase.get(1)) + '\n\n')
} else {
    KeywordUtil.markPassed(((('\n\n ' + dataPurchase.get(0)) + ' -> ') + dataPurchase.get(1)) + '\n\n')
}