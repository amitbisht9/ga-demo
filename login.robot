*** Settings ***
Library     SeleniumLibrary

*** Variables ***
${URL}            https://www.example.com
${BROWSER}        chrome
${CHROME_OPTIONS}    headless=True disable-gpu=True window-size=1920,1080

*** Test Cases ***
Login
    Open Browser    ${URL}    ${BROWSER}    chrome_options=${CHROME_OPTIONS}
    Maximize Browser Window
    Wait Until Element Is Visible       id:user-name
    Input Text                          id:user-name                        standard_user
    Input Password                      id:password                         secret_sauce
    Click Element                       id:login-button
    Sleep                               5s
    Close Browser