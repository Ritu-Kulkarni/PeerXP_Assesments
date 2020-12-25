Feature: Application login

Scenario Outline: login page validation with positive  and negative scenario
Given Intialise the chrome browser
When Navigation link provided "https://github.com/login"
Then User enter <username> and <password> and logs in   
Then Verify whether the home page is display if not 




#add valid username  and passwords in the examples below



Examples: 
|username                 |password|
|username1                 |password!| 
|username2               |Mpassword@ |
|username3               |Password#|
|username4               |Password$|


