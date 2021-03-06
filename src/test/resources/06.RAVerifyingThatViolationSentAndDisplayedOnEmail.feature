Feature: verifying that violation is sent and displayed on email

  Scenario: 6.001 Check that the violation is sent and displayed on email
    Given open google start page
    When click on the Enter button
    Then title is displayed on Yahoo Email page
    When enter "guettamaster@yahoo.com" email in the Yahoo Email Address field
    When click on the Next button on Yahoo Email page
    Then "guettamaster@yahoo.com" email is appeared on the top
    When enter "ivanoleg15028819" password in the Yahoo Password field
    When click on the Next button below password field on Yahoo Email page
    When navigate on user icon
    Then "guettamaster@yahoo.com" account is connected
    When click on Compose button in the left navigation menu
    Then send message form is displayed
    When enter "frank@traden.onmicrosoft.com" email in the To field
    When enter "test message" subject in the Subject field
    When enter "beaner word" message in the Message field
    When click on Send button
    When open RA login page
    When enter "o.ivankovckyi@aimprosoft.com" email in the Email Address field
    When click on the Next button
    Then "o.ivankovckyi@aimprosoft.com" email is displayed above Password field
    When enter "Ivanoleg150288#" password in the Password field
    When click on Sign In button
    Then "Oleg Ivankovskyi" user name is displayed in the left navigation menu
    Then RA Inbox page is displayed
    Then "test message" from Mike Foyle is displayed
