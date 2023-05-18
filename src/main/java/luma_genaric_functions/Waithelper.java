package luma_genaric_functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import luma_Base_page.Super_class;

public class Waithelper extends Super_class {

	

	public static void seleniumWait(WebElement ele) {
		WebDriverWait wait =new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
}
