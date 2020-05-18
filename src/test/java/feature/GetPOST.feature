# new feature
# Tags: optional

Feature:
  Verify different GET operations using REST-assured

  Scenario: Verify one author of the post
    Given I perform GET operation for "/posts"
    And I perform GET for the post number "2"
    Then I should see the author name as "Sam Oun"

  Scenario: Verify collection of authors in the post
    Given I perform GET operation for "/posts"
    Then I should see the author names

  Scenario: Verify Parameter of GET
    Given I perform GET operation for "/posts"
    Then I should see verify GET Parameter