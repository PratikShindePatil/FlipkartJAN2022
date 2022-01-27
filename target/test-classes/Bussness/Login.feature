Feature: Login feature

Background: User is successfully logged in
Given User open "Chrome" browser with exe "E:\Automation support\\chromedriver.exe"
Given User open url as "https://www.flipkart.com/"


Scenario: Loging functionality with valid credintials
When User click on cancel button
When User move on Login DropDown
When User click on My Profile
When User enter "8484035135" as username
When User enter "Pratik1999" as password
When User click on Login button
Then Application shows user profile to user