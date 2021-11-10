Feature:   - for this feature you have to have an existing account



Scenario: Register as an Affiliate user with Cheque Payment Method
Given User is on Retail website 
And User click  on MyAccount
When  User click on Login 
And User enter username 'ku@gmail.com' and password 'saikanish12'
And User click on Login button
Then User should be logged in to MyAccount dashboard
When User click on ‘Register for an Affiliate Account’ link 
And User fill affiliate form with below information
|compName|websiteName|taxNo|chequepayee|
|saitech|sitech|AB30303030|AC10101010|
And User check on About us check box 
And User click on Continue button 
Then User should see a success message


Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
Given User is on Retail website 
And User click  on MyAccount
When  User click on Login 
And User enter username 'ku@gmail.com' and password 'saikanish12' 
And User click on Login button
Then User should be logged in to MyAccount dashboard
When User click on ‘Edit your affiliate informationlink 
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankInfo|branchInfo|swiftCodeInfo|AccountInfo|AccountNo|
|WellsFargo|PL908790|123456|Kumar|90908080|
And User click on Continue button 
Then User should see a success message 


Scenario: Edit your account Information 
Given User is on Retail website 
And User click  on MyAccount
When  User click on Login 
And User enter username 'ku@gmail.com' and password 'saikanish12' 
And User click on Login button
Then User should be logged in to MyAccount dashboard
When User click on ‘Edit your account information’ link 
And User modify below information 
|fName|lName|e_mail|phoneValue|
|Kuma|ila|kuila|1010101|
And User click on Continue button 
Then User should see a message ‘Success: Your account has been successfully updated.’


