# new feature
# Tags: optional

Feature:
  Verify different GET operations using REST-assured

  Scenario: Verify one author of the post
    Given I perform GET operation for "/post"
    And I perform GET for the post number "2"
    Then I should see the author name as "Sam Oun"

  Scenario: Verify collection of authors in the post
    Given I perform GET operation for "/post"
    Then I should see the author names