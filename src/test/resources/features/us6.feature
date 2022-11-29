Feature: As a user, I should be able to remove from favorites and upload a file directly
  User story: As a user, I should be able to edit favorites files

  Background: For the scenarios user is expected to be on dashboard page
    Given user is on a dashboard page
    When the user clicks the Files module


  Scenario: Verify users are able to remove files from Favorites

    When the user click action-icon from any file on the page to remove
    And user choose the Remove from favorites option
    And user click the Favorites sub-module on the left side
    Then verify that the file is removed from the Favorites sub-module's table

  @wip
    Scenario: Verify users are able to to upload a file from Files
      #Given user is on a dashboard page
      #When the user clicks the Files module
      When the user clicks the add icon on the top
      And user uploads file with the upload file option
      Then verify the file is displayed on the page