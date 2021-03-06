Feature: verifying that lexicon has the Never Block option selected in the Blocking Policy

  Background: Check that "Dashboard" page is opened
    Given open authentication page
    When enter "o.ivankovckyi@aimprosoft.com" email in the Email Address field
    When click on the Next button
    Then "o.ivankovckyi@aimprosoft.com" email is displayed above Password field
    When enter "Ivanoleg150288#" password in the Password field
    When click on Sign In button
    Then "Oleg Ivankovskyi" user name is displayed in the left navigation menu
    Then Dashboard page is displayed

  Scenario: 3.001 Check that the lexicon has the Never Block option selected in the Blocking Policy
    Then "Risk Policies" link is displayed in the Left Navigation menu
    When click on "Risk Policies" link
    Then Expanded menu is appeared
    Then Lexicons sub-link is displayed in the Expanded menu
    When click on Lexicons sub-link
    Then Lexicons page is opened
    When choose "Lexicon test November 2020" lexicon from the lexicons list
    Then "Lexicon test November 2020" lexicon page is opened
    Then Edit lexicon button is displayed
    When click on Edit lexicon button
    Then Edit Lexicon pop-up is appeared
    Then Never Block radio button is selected
