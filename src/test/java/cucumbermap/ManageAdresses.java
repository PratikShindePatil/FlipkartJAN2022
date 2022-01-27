package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import support.HTMLReportGenerator;
import support.One;

public class ManageAdresses 
{
	@When("^user click on manage address$")
	public void user_click_on_MangeAdresses() throws Throwable
	{
		Object[] input1=new Object[1];
		input1[0]="(//*[@class='NS64GK'])[1]";
		Hashtable<String, Object> output1=One.clickonElement(input1);
		HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"^User click on MangeAdresses$" , output1.get("MESSAGE").toString());

	}

	@When("^user click on Add a new address$")
	public void user_click_on_Add_a_new_Address() throws Throwable
	{
		 Object[] input1=new Object[1];
         input1[0]="//*[@class='_1QhEVk']";
         Hashtable<String, Object> output1=One.clickonElement(input1);
         HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "^user click on Add a new address$", output1.get("MESSAGE").toString());	}

	@When("^user enter \"([^\"]*)\" as a name$")
	public void user_enter_as_Name(String arg1) throws Throwable 
	{
		Object[] input3=new Object[2];
		input3[0]="//*[@class = '_1w3ZZo _2mFmU7'][1]";
		input3[1]=arg1;
		Hashtable<String, Object> output3=One.LoginId(input3);

				HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^User enter \"([^\"]*)\" as Name$", output3.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as a mobile number$")
	public void user_enter_as_Mobile_number(String arg1) throws Throwable 
	{
		Object[] input4=new Object[2];
		input4[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
		input4[1]=arg1;
		Hashtable<String, Object> output4=One.LoginId(input4);

	HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^User enter \"([^\"]*)\" as Mobile number$ ", output4.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as a pincode$")
	public void user_enter_as_pincode(String arg1) throws Throwable
	{
Object[] input5 = new Object [2];
input5[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
input5[1]=arg1;
Hashtable<String, Object> output5=One.LoginId(input5);
HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^User enter \"([^\"]*)\" as pincode$" , output5.get("MESSAGE").toString());

	}

	@When("^user enter \"([^\"]*)\" as a locality$")
	public void user_enter_as_Locality(String arg1) throws Throwable 
	{Object[] input6 = new Object [2];
	input6[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
	input6[1]=arg1;
	Hashtable<String, Object> output6=One.LoginId(input6);
	HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^User enter \"([^\"]*)\" as Locality$" , output6.get("MESSAGE").toString());

	   
	}

	@When("^user enter \"([^\"]*)\" as a address$")
	public void user_enter_as_Address(String arg1) throws Throwable
	{
		Object[] input7 = new Object [2];
		input7[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
		input7[1]=arg1;
		Hashtable<String, Object> output7=One.LoginId(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^User enter \"([^\"]*)\" as Address$" , output7.get("MESSAGE").toString());


	}

	@When("^user select Home as a address type$")
	public void user_select_Home_as_address_type() throws Throwable
	{
		Object[] input8=new Object[1];
		input8[0]="(//*[@class='_1XFPmK'])[1]";
		Hashtable<String, Object> output8=One.clickonElement(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^user select Home as address type$", output8.get("MESSAGE").toString());
		Thread.sleep(2000);
	
	}

	@When("^user click on save button$")
	public void user_click_on_save_button() throws Throwable
	{
		Object[] input9=new Object[1];
		input9[0]="(//*[@type='button'])[2]";
		Hashtable<String, Object> output9=One.clickonElement(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^User click on save button$", output9.get("MESSAGE").toString());


	}

	@Then("^application shows new address added successfully$")
	public void application_shows_new_address_added_successfully() throws Throwable
	{
		Object[] input10=new Object[2];
		input10[0]="//*[@ class = '_3q7S5O']";
		input10[1]="Manage Addresses";
		Hashtable<String, Object> output10=One.gettext(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(),"^Application shows new address added successfully$", output10.get("MESSAGE").toString());

	}



}
