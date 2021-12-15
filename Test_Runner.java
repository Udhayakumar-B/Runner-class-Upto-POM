package com.Runner;

import org.openqa.selenium.WebDriver;
import com.Maven_Project.Base_Class;
import com.PomofPom.com.Page_Object_Manager;

public class Test_Runner extends Base_Class {
	
	public static WebDriver driver = getBrowser("Chrome");

	 public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException {

		launchUrl("http://automationpractice.com/index.php?");
		clickOnElement(pom.getInstanceHp().getLogin_btn());
		
		inputValue(pom.getInstanceLp().getUsername(), "udhayabalavanit@gmail.com");

		inputValue(pom.getInstanceLp().getPassword(), "Savukath@12345");

		clickOnElement(pom.getInstanceLp().getLogin());
		

		actionsMethod("move",pom.getInstancePc().getWoman());
		
		actionsMethod("move",pom.getInstancePc().getDress());
		
		actionsMethod("click",pom.getInstancePc().getDress());
		
		clickOnElement(pom.getInstanceCc().getSize());

		clickOnElement(pom.getInstanceCc().getColor());

		clickOnElement(pom.getInstanceCc().getStyle());

		clickOnElement(pom.getInstanceCc().getProperties());

		clickOnElement(pom.getInstanceCc().getManufact());

		clickOnElement(pom.getInstanceCc().getAvailable());

		clickOnElement(pom.getInstanceCc().getCondition());

		clickOnElement(pom.getInstanceAc().getImage());
		
		sleep(2000);

		frameConcept(pom.getInstanceAc().getFrame(), "singleframe");

		actionsMethod("move", pom.getInstanceAc().getAddtocart());
		
		System.out.println("Executed");
        
		
		sleep(5000);
		
		clickOnElement(pom.getInstanceAc().getAddtocart());
        
		System.out.println("Running");
		
		outOfFrame();
		
		System.out.println("outofFrame Running...");
		
		sleep(3000);
		
		clickOnElement(pom.getInstancePp().getProceed());

		clickOnElement(pom.getInstanceS().getTocheckout());

		clickOnElement(pom.getInstanceS().getAddress());
		
		clickOnElement(pom.getInstanceS().getTickbox());
	
		clickOnElement(pom.getInstanceS().getSubmit());

	}

}