Feature: verifying the content inside the email with a violation

  Background: Check that RA "Inbox" page is opened
    Given open RA authentication page
    When enter "o.ivankovckyi@aimprosoft.com" email in the Email Address field
    When click on the Next button
    Then "o.ivankovckyi@aimprosoft.com" email is displayed above Password field
    When enter "Ivanoleg150288#" password in the Password field
    When click on Sign In button
    Then "Oleg Ivankovskyi" user name is displayed in the left navigation menu
    Then RA Inbox page is displayed
    Then "test message" from Mike Foyle is displayed

  Scenario: 7.001 Check that the email with a violation is opened
    When click on the "test message" from Mike Foyle
    Then "test message" is opened

  Scenario: 7.002 Check that the risk from the "Open Issues" list matches the risk inside the email
    Then "test message" with High risk is displayed on the Open Issues list
    When click on the "test message" with High risk
    Then "test message" is opened
    Then "test message" with High risk is displayed in the Message Details pop-up

  Scenario: 7.003 Check that the risk flag (taken from the list of flags) is correctly displayed in the "Open Issues" list and inside the email
    Then "test message" with High risk is displayed on the Open Issues list
    When open CID login page
    Then "Oleg Ivankovskyi" user name is displayed in the left navigation menu
    Then Dashboard page is displayed
    Then "Risk Policies" link is displayed in the Left Navigation menu
    When click on "Risk Policies" link
    Then Expanded menu is appeared
    Then Flags sub-link is displayed in the Expanded menu
    When click on Flags sub-link
    Then Flags page is opened
    Then "beaner" flag is displayed
    Then "beaner" flag with High risk is displayed on the Flags page
    When choose "beaner" flag from the flags list
#    Then "beaner" flag pop-up is opened
    Then "beaner" flag with High risk is displayed inside Flag pop-up
