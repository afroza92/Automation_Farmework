package luma_Stepdefination;

import org.testng.Assert;
import io.cucumber.java.en.*;
import luma_Base_page.Super_class;
import luma_elements_page.Page_Factory_Elements;
import luma_genaric_functions.CommonMethods;
import luma_genaric_functions.Waithelper;

public class Functional_step_Def extends Super_class  {

	Page_Factory_Elements pf;

	
	@Given("user able to login the application")
	public void user_able_to_login_the_application() throws InterruptedException {

		pf = new Page_Factory_Elements();
		log.info(">>>>>>user able to login the application<<<<<<<");
		pf.applicationLogin();
		
//CommonMethods.captureScreenshot(driver,"loginpage");
	}

	@When("user able to select Jackets from Men module")
	public void user_able_to_select_jackets_from_men_module() throws InterruptedException {
		
		log.info(">>>>>>user able to select Jackets from Men module<<<<<<<");
		Waithelper.seleniumWait(pf.getSelectMenModule());
		CommonMethods.HoverOver(pf.getSelectMenModule());
		
		log.info(">>>>>>user able to select tops from Men module<<<<<<<");
		Waithelper.seleniumWait(pf.getSelecttopsfromeMenModule());
		CommonMethods.HoverOver(pf.getSelecttopsfromeMenModule());
		
		log.info(">>>>>>user able to click Jackets from Men module<<<<<<<");
		Waithelper.seleniumWait(pf.getclickJacket());
		CommonMethods.actionClick(pf.getclickJacket());

	}

	@When("user able to select a Jacket product's size, color, quantity")
	public void user_able_to_select_a_jacket_product_s_size_color_quantity() throws InterruptedException {
		
		log.info(">>>>>>user able to clickPrFitJacket<<<<<<<");
		Waithelper.seleniumWait(pf.getclickPrFitJacket());
		CommonMethods.actionClick(pf.getclickPrFitJacket());

		log.info(">>>>>>user able to selectsize<<<<<<<");
		Waithelper.seleniumWait(pf.getselectsize());
		CommonMethods.actionClick(pf.getselectsize());
		
	//	CommonMethods.captureScreenshot(driver, "Fail select color");//{Screenshot}
		log.info(">>>>>>user able to selectcolor<<<<<<<");
		Waithelper.seleniumWait(pf.getselectcolor());
		CommonMethods.actionClick(pf.getselectcolor());
		
		
		log.info(">>>>>>user able to selectquantity<<<<<<<");
		Waithelper.seleniumWait(pf.getselectQuantity());
		CommonMethods.actionClick(pf.getselectQuantity());// clear the existing value
		
		log.info(">>>>>>user able to selectquantity<<<<<<<");
		Waithelper.seleniumWait(pf.getselectQuantity());
		pf.getselectQuantity().clear();
        pf.getselectQuantity().sendKeys("2");

	}

	@When("user able to click add to cart button")
	public void user_able_to_click_add_to_cart_button() {
		log.info(">>>>>>user able to add to cart button<<<<<<<");
		Waithelper.seleniumWait(pf.getClickonAddtocart());
		CommonMethods.actionClick(pf.getClickonAddtocart());
	}

	@When("user able to click on the shopping cart pop-up")
	public void user_able_to_click_on_the_shopping_cart_pop_up() {
		log.info(">>>>>>user able click on the shopping cart pop-up<<<<<<<");
		Waithelper.seleniumWait(pf.getclickshoppingcart());
		CommonMethods.actionClick(pf.getclickshoppingcart());

	}

	@When("user able to click on the proceed to checkout")
	public void user_able_to_click_on_the_proceed_to_checkout() {
		log.info(">>>>>>user able to click on the proceed to checkout<<<<<<<");
		Waithelper.seleniumWait(pf.getclickPrcdChkt());
		CommonMethods.actionClick(pf.getclickPrcdChkt());
	}

	@When("user able to add shipping information")
	public void user_able_to_add_shipping_information() {
		log.info(">>>>>>user able to add shipping information<<<<<<<");
		pf.newAddress();
	}

	@When("user able to select shipping method radial button and click on next button")
	public void user_able_to_select_shipping_method_radial_button_and_click_on_next_button() {

		log.info(">>>>>>user able to select shipping method radial button<<<<<<<");
		CommonMethods.pagerefresh();
        Waithelper.seleniumWait(pf.getShipRadio());
		CommonMethods.actionClick(pf.getShipRadio());

		Waithelper.seleniumWait(pf.getShipRadio());
		CommonMethods.actionClick(pf.getClickNext());

	}

	@When("user able to click on the place order button")
	public void user_able_to_click_on_the_place_order_button() {
		log.info(">>>>>>user able to click on the place order button<<<<<<<");
		Waithelper.seleniumWait(pf.getCheckBox());
		CommonMethods.actionClick(pf.getCheckBox());

		log.info(">>>>>>user able to click on the place order button<<<<<<<");
		Waithelper.seleniumWait(pf.getPlaceOrder());
		CommonMethods.actionClick(pf.getPlaceOrder());

	}

	@Then("user able to verify the confirmation message {string}")
	public void user_able_to_verify_the_confirmation_message(String expectedResult) {
		log.info(">>>>>>user able to verify the confirmation message<<<<<<<");
	    Assert.assertEquals(expectedResult, pf.getconfirmationmessage().getText());
	    System.out.println("order Confirmation:"+pf.getconfirmationmessage().getText());
	    
	}
}
