import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

def sheet = ExcelKeywords.getExcelSheetByName('Vuelos.xlsx', 'DatosPasajeros')

for (countPassengers = 0; countPassengers <= totalPassengers-1; countPassengers++) {
    namePassenger = ExcelKeywords.getCellValueByIndex(sheet, rowDataPassenger, 0)

    lastNamePassenger = ExcelKeywords.getCellValueByIndex(sheet, rowDataPassenger, 1)

    WebUI.setText(findTestObject('FLIGHTS/BookFlight/input_firstname', [('noPass') : countPassengers.toString()]), namePassenger)

    WebUI.setText(findTestObject('FLIGHTS/BookFlight/input_lastname', [('noPass') : countPassengers.toString()]), lastNamePassenger)

    rowDataPassenger++
}

WebUI.setText(findTestObject('FLIGHTS/BookFlight/input_numbercard'), '1234567891234567')

WebUI.click(findTestObject('FLIGHTS/BookFlight/button_securepurchase'))