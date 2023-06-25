package com.pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllObjects {
	@FindAll({@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]/a")})
	private List<WebElement> topBanner_list;
	
	@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]"
			+ "/a[contains(text(),'Groceries')]") 
	private WebElement groceries_item;
	
	@FindAll({@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//a[contains(text(),'Groceries')]"
			+ "/parent::li//*[contains(@id,'nav_sub_cat')]/a")})
	private List<WebElement> groceries_list;
	
	@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]"
			+ "/a[contains(text(),'Premium Fruits')]")
	private WebElement premiumFruits_item;
	
	@FindAll({@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//a[contains(text(),'Premium Fruits')]"
			+ "/parent::li//*[contains(@id,'nav_sub_cat')]/a")})
	private List<WebElement> premiumFruits_list;

	@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]"
			+ "/a[contains(text(),'Home & Kitchen')]")
	private WebElement homeKitchen_item;
	
	@FindAll({@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//a[contains(text(),'Home & Kitchen')]"
			+ "/parent::li//*[contains(@id,'nav_sub_cat')]/a")})
	private List<WebElement> homeKitchen_list;

	@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]"
			+ "/a[contains(text(),'Fashion')]")
	private WebElement fashion_item;
	
	@FindAll({@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//a[contains(text(),'Fashion')]"
			+ "/parent::li//*[contains(@id,'nav_sub_cat')]/a")})
	private List<WebElement> fashion_list;
	
	@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]"
			+ "/a[contains(text(),'Electronics')]")
	private WebElement electronics_item;
	
	@FindAll({@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//a[contains(text(),'Electronics')]"
			+ "/parent::li//*[contains(@id,'nav_sub_cat')]/a")})
	private List<WebElement> electronics_list;
	
	@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]"
			+ "/a[contains(text(),'Home Improvement')]")
	private WebElement homeImprovement_item;
	
	@FindAll({@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//a[contains(text(),'Home Improvement')]"
			+ "/parent::li//*[contains(@id,'nav_sub_cat')]/a")})
	private List<WebElement> homeImprovement_list;
	
	@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]"
			+ "/a[contains(text(),'Sports, Toys & Luggage')]")
	private WebElement sportsToysLuggage_item;
	
	@FindAll({@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//a[contains(text(),'Sports, Toys & Luggage')]"
			+ "/parent::li//*[contains(@id,'nav_sub_cat')]/a")})
	private List<WebElement> sportsToysLuggage_list;
	
	@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]"
			+ "/a[contains(text(),'Beauty')]")
	private WebElement beauty_item;
	
	@FindAll({@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//a[contains(text(),'Beauty')]"
			+ "/parent::li//*[contains(@id,'nav_sub_cat')]/a")})
	private List<WebElement> beauty_list;
	
	
	public AllObjects(WebDriver ldriver) {
		PageFactory.initElements(ldriver, this);
	}
	
	public WebElement element(String element_name) {
		switch (element_name){
		case ("Groceries"):{
			return groceries_item;
			}
		case ("Premium Fruits"):{
			return premiumFruits_item;
			}
		case ("Home & Kitchen"):{
			return homeKitchen_item;
			}
		case ("Fashion"):{
			return fashion_item;
			}
		case ("Electronics"):{
			return electronics_item;
			}
		case ("Home Improvement"):{
			return homeImprovement_item;
			}
		case ("Sports, Toys & Luggage"):{
			return sportsToysLuggage_item;
			}
		case ("Beauty"):{
			return beauty_item;
			}
		}
		return groceries_item;
	}
	
	public List<WebElement> elements(String element_name) {
		switch (element_name){
		case ("Top Banner"):{
			return topBanner_list;
			}
		case ("Groceries"):{
			return groceries_list;
			}
		case ("Premium Fruits"):{
			return premiumFruits_list;
			}
		case ("Home & Kitchen"):{
			return homeKitchen_list;
			}
		case ("Fashion"):{
			return fashion_list;
			}
		case ("Electronics"):{
			return electronics_list;
			}
		case ("Home Improvement"):{
			return homeImprovement_list;
			}
		case ("Sports, Toys & Luggage"):{
			return sportsToysLuggage_list;
			}
		case ("Beauty"):{
			return beauty_list;
			}
		}
		return groceries_list;
	}
	
	
}
