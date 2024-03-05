*** Settings ***
Library     SeleniumLibrary
Library     OperatingSystem

*** Test Cases ***
Website Login
    [Tags]      17
    Open Browser                        https://www.saucedemo.com/         Headless Chrome      
    Maximize Browser Window
    Wait Until Element Is Visible       id:user-name
    Input Text                          id:user-name                        standard_user
    Input Password                      id:password                         secret_sauce
    Click Element                       id:login-button
    Sleep                               5s
    Close Browser

Enter Username and Password
    [Tags]      18
    Open Browser                        https://www.saucedemo.com/         Headless Chrome      
    Maximize Browser Window
    Wait Until Element Is Visible       id:user-name
    Input Text                          id:user-name                        standard_user
    Input Password                      id:password                         secret_sauce
    Click Element                       id:login-button
    Sleep                               5s
    Close Browser

Home page is displayed
    [Tags]      19
    Open Browser                        https://www.saucedemo.com/         Headless Chrome      
    Maximize Browser Window
    Wait Until Element Is Visible       id:user-name
    Input Text                          id:user-name                        standard_user
    Input Password                      id:password                         sec_sauce
    Click Element                       id:login-button
    Sleep                               5s
    Close Browser

Click on Logout button 
    [Tags]      20
    Open Browser                        https://www.saucedemo.com/         Headless Chrome      
    Maximize Browser Window
    Wait Until Element Is Visible       id:user-name
    Input Text                          id:user-name                        standard_user
    Input Password                      id:pasord                         secret_sauce
    Click Element                       id:login-button
    Sleep                               5s
    Close Browser