Feature: Manage Address Functionality

Background: User is successfully logged in
Given User open "Chrome" browser with exe "E:\Automation support\\chromedriver.exe"
Given User open url as "https://www.flipkart.com/"
Given User click on cancel button
Given User move on Login DropDown
Given User click on My Profile
Given User enter "8484035135" as username
Given User enter "Pratik1999" as password
Given User click on Login button

@SmokeTest
Scenario: Manage Addresses functionality with valid data
When user click on manage address
When user click on Add a new address
When user enter "pratik" as a name
When user enter "8484035135" as a mobile number
When user enter "414002" as a pincode
When user enter "Agadgaon Road" as a locality
When user enter "Deogaon" as a address
When user select Home as a address type
When user click on save button
Then application shows new address added successfully