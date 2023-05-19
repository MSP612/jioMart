package com.pageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.action.ActionClass;

public class HomePage_MidBanner extends ActionClass{
	
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
			+ "/a[contains(text(),'Sports, Toys & Luggage'')]")
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
	
	public HomePage_MidBanner(WebDriver ldriver) {
		PageFactory.initElements(ldriver, this);
	}
		
	/**
	 * @param visibleText = Top, Groceries,Premium Fruits,Home & Kitchen, Fashion, Electronics, Beauty, Home Improvement, 
	 * @param Sports Toys & Luggage
	 * @return Top returns list of visible text on top banner
	 * @return Groceries and other objects parameters returns list available directly under them 
	 */
	public ArrayList<String> fetchList(String visibleText) {
		visibleText = visibleText.toLowerCase().replaceAll("\\s", "");
		switch(visibleText) {
		case "top":
			return ActionClass.stringList(topBanner_list);
		case "groceries":
			ActionClass.mouseHover(groceries_item);
			return ActionClass.stringList(groceries_list);
		case "premiumfruits":
			ActionClass.mouseHover(premiumFruits_item);
			return ActionClass.stringList(premiumFruits_list);
		case "home&kitchen":
			ActionClass.mouseHover(homeKitchen_item);
			return ActionClass.stringList(homeKitchen_list);
		case "fashion":
			ActionClass.mouseHover(fashion_item);
			return ActionClass.stringList(fashion_list);
		case "electronics":
			ActionClass.mouseHover(electronics_item);
			return ActionClass.stringList(electronics_list);
		case "beauty":
			ActionClass.mouseHover(beauty_item);
			return ActionClass.stringList(beauty_list);
		case "homeimprovement":
			ActionClass.mouseHover(homeImprovement_item);
			return ActionClass.stringList(homeImprovement_list);
		case "sportstoys&luggage":
			ActionClass.mouseHover(sportsToysLuggage_item);
			return ActionClass.stringList(sportsToysLuggage_list);
		}
		System.out.println("Parameter provided to the method is either not added to the framework or"
				+ " name is incorrect");
		return null;
	}
	
}
