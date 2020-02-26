package pojoclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasses.BaseClass;

public class PojoShowroom extends BaseClass{
private PojoShowroom() {
	PageFactory.initElements(d, this);
}
static PojoShowroom obj=null;
public static PojoShowroom method() {
	if (obj==null) {
		obj=new PojoShowroom();
		return obj;
	}
	else {
	return obj;
	}
}
@FindBy(xpath="//*[@class='opal-icon-search']")
private WebElement searchico;
@FindBy(xpath="//input[@class='elementor-search-form__input']")
private WebElement searchbar;
@FindBy(xpath="//span[@class='opal-icon-account']")
private WebElement logicon;
@FindBy(id="username")
private WebElement user;
@FindBy(id="password")
private WebElement pass;
@FindBy(xpath="(//button[@type='submit'])[2]")
private WebElement loginbtn;
public WebElement getLogicon() {
	return logicon;
}
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
public WebElement getSearchico() {
	return searchico;
}
public WebElement getSearchbar() {
	return searchbar;
}


	
	

}
