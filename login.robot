*** Settings ***
Library     SeleniumLibrary
Library     OperatingSystem

*** Test Cases ***
Login
    [Tags]      17
    Open Browser                        https://www.saucedemo.com/         Headless Chrome      
    Maximize Browser Window
    Wait Until Element Is Visible       id:user-name
    Input Text                          id:user-name                        standard_user
    Input Password                      id:password                         secret_sauce
    Click Element                       id:login-button
    Sleep                               5s
    Close Browser

Cart Page
    [Tags]      18
    Open Browser                        https://www.saucedemo.com/         Headless Chrome      
    Maximize Browser Window
    Wait Until Element Is Visible       id:user-name
    Input Text                          id:user-name                        standard_user
    Input Password                      id:password                         secret_sauce
    Click Element                       id:login-button
    Sleep                               5s
    Close Browser

Checkout Page
    [Tags]      19
    Open Browser                        https://www.saucedemo.com/         Headless Chrome      
    Maximize Browser Window
    Wait Until Element Is Visible       id:user-name
    Input Text                          id:user-name                        standard_user
    Input Password                      id:password                         secret_sauce
    Click Element                       id:login-button
    Sleep                               5s
    Close Browser

Logout 
    [Tags]      20
    Open Browser                        https://www.saucedemo.com/         Headless Chrome      
    Maximize Browser Window
    Wait Until Element Is Visible       id:user-name
    Input Text                          id:user-name                        standard_user
    Input Password                      id:password                         secret_sauce
    Click Element                       id:login-button
    Sleep                               5s
    Close Browser