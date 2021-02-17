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
