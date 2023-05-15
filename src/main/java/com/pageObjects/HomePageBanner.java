package com.pageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.action.ActionClass;

public class HomePageBanner extends ActionClass{
	@FindAll({@FindBy(xpath = "//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]/a")})
	private List<WebElement> topBanner_list;
	
	@FindAll({@FindBy(xpath = "//li[contains(@id,'nav_cat_2')]/div[@class = 'header-nav-l2-wrapper']/ul/li")})
	private List<WebElement> groceries_list;
	
	@FindAll({@FindBy(xpath = "(//ul[contains(@class,'header-nav-l1')]//li[contains(@id,'nav_cat')]/a)[1]")})
	private WebElement groceries;
	
	public HomePageBanner(WebDriver ldriver) {
		PageFactory.initElements(ldriver, this);
	}
	

	public ArrayList<String> topBanner_items() {
		return ActionClass.stringList(topBanner_list);
	}
	
	public ArrayList<String> groceries_item() {
		ActionClass.mouseHover(groceries);
		return ActionClass.stringList(groceries_list);
	}
	
}
