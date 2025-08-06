package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleMainMethod 
{
	@Test
	public void register()//3rd this will execute..
	{
		Reporter.log("Welcome to register", true);
	}
	@Test
	public void login()//2nd this will execute..
	{
		Reporter.log("Welcome to login", true);
	}
	@Test
	public void addToCart()//1st this will execute..
	{
		Reporter.log("Welcome to addToCart",true);
	}
}
//It will execute according to alphabatical order..