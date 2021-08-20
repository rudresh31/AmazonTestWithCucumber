package com.amazon.stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.pages.MainPage;
import com.amazon.utilities.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearchSteps extends BaseClass {
	
	static String datan;
	Actions a = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@When("we enter ProductName {string} in the search field")
	public void we_enter_product_name_in_the_search_field(String product) {
	    MainPage.EnterValueSearchField(product);
	    if(product.equalsIgnoreCase("hp laptops"))
			datan=product;
	    
	    datan = product;
	}

	@And("Select data {string}")
	public void select_data(String productName) {
		List<WebElement> elements = MainPage.getDataList();
		if(datan.equals("hp laptops")) {
		    for(WebElement e : elements) {
		    	String data = "hp laptops "+e.getText();
		    	if(productName.equalsIgnoreCase(data)) { 
		    		wait.until(ExpectedConditions.elementToBeClickable(e));
		    		e.click();
		    		break;
		    	}	
		    }
		}
	}

	@And("click on the Search button")
	public void click_on_the_search_button() {
		if(!datan.equalsIgnoreCase("hp laptops")) {
			MainPage.ClickSearchBtn();
		}
	}

	@Then("product Will appears")
	public void product_will_appears() {
	    
	}

}
