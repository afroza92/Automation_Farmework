package luma_usa_Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma_Base_page.Super_class;

public class My_Hooks extends Super_class {


	@Before
	public void setup() {
		System.out.println("automation starts");
		Super_class.initialization();	
	}
	@After
	public void teardown() {
		System.out.println("automation complate");
		driver.quit();
	}
}
