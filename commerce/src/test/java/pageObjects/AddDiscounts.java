package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddDiscounts {
		public WebDriver ldriver;
		
		public AddDiscounts(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		By lnkpromotions_menu=By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]");
		By lnkdiscounts_menuitem=By.xpath("//p[contains(text(),'Discounts')]");
		
		By btnAddnew=By.xpath("//a[@class='btn btn-primary']");
		By txtname=By.xpath("//input[@id='Name']");
		By discounttype=By.xpath("//select[@id='DiscountTypeId']");
		By usepercentage=By.xpath("//input[@id='UsePercentage']");
		By discountamount=By.xpath("//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[2]/div[5]/div[1]/div[2]/span[1]/span[1]/input[1]");
		By requiredcode=By.xpath("//input[@id='RequiresCouponCode']");
		
		public String getPageTitle()
		{
			return ldriver.getTitle();
		}
		
		public void clickOnPromotionsMenu() {
			ldriver.findElement(lnkpromotions_menu).click();
		}
		
		public void clickOnDiscounts() {
			ldriver.findElement(lnkdiscounts_menuitem).click();
			
		}
		
		public void clickOnAddnew() {
			ldriver.findElement(btnAddnew).click();
		}
		
		public void setName(String name) {
			ldriver.findElement(txtname).sendKeys(name);
		}
		
		public void setDiscountType(String value) {
			Select drp=new Select(ldriver.findElement(discounttype));
			drp.selectByVisibleText(value);
		}
		
		public void setPercentage() {
			ldriver.findElement(usepercentage).click();
		}
		
		public void enterDiscount(String Value) {
			
			ldriver.findElement(discountamount).sendKeys(Keys.chord(Keys.CONTROL, "a"), Value);
		
		}
		
		public void setRequiredCode() {
			ldriver.findElement(requiredcode).click();
		}
		
		
	}

