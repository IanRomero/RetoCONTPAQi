package auxiliar.validations

import java.text.DateFormat
import java.text.SimpleDateFormat

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory


public class SelectFlight {

	DateFormat readFormat = new SimpleDateFormat( "hh:mm");

	WebDriver driver = DriverFactory.getWebDriver()

	String lastHour = ""

	@Keyword
	public String selectLastFlightDepart(){

		List hoursDepart = []

		List<WebElement> departHour = driver.findElements(By.xpath("//table/tbody/tr/td/font/b/font[text()= 'DEPART']/ancestor::tbody[2]//tr/td[@class='data_center_mono']"))

		for(WebElement x : departHour){
			hoursDepart.add(readFormat.parse(x.getText()))
		}

		Collections.sort(hoursDepart)

		Date hourDepart = hoursDepart.get(hoursDepart.size()-1)

		return lastHour = hourDepart.getHours() + ":" + hourDepart.getMinutes()
	}

	@Keyword
	public String selectLastFlightReturn(){
		List hoursReturn = []
		
		List<WebElement> returnHour = driver.findElements(By.xpath("//table/tbody/tr/td/font/b/font[text()= 'RETURN']/ancestor::tbody[2]//tr/td[@class='data_center_mono']"))
		
		for(WebElement y : returnHour){
			hoursReturn.add(readFormat.parse(y.getText()))
		}

		Collections.sort(hoursReturn)

		Date hourReturn = hoursReturn.get(hoursReturn.size()-1)

		return hourReturn.getHours() + ":" + hourReturn.getMinutes()
	}
}
