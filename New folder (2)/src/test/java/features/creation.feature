Feature: new repository validation     
Scenario Outline: Creation of new repository by using special characters
Given Intialize the chrome browser
When the link provided is "https://github.com/login"
When loogin credentials are "username" and "password"               
Then  Click on the dropdown menu
Then Next,click on the new repository
And  Enter the credentials in <names>
And Click on the create repository

#pre-requestie that user is logged in with valid credentials

Examples:
|names|
|textbox|
|1234|
|@#$%|
|^&00|
|4acd|