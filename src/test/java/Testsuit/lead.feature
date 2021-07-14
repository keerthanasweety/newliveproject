@Lead
Feature: Create new lead

@Createlead
Scenario: Check the new lead button
Given user is on salesforce dashboard page
When click lead object and click New
Then user is on new lead form page

@FillForm
Scenario Outline: Fill the new lead
Given user is on NewLead
When Enter <salutation> and <LastName> and <Company> and <Industry>
Then new lead should be created
Examples:
 |salutation|LastName|Company|Industry|
 |Ms.|keerthana|magnitia|Not For Profit|
 |Dr|GrahameBell|TCS|Other|
 
@deleteForm
Scenario: Edit the new lead form
Given user is on newleadpage
When click on delete option 
Then Lead should be deleted
@editForm
Scenario Outline: Fill the edit form
Given user is on editpage
When Enter <Title> and <Email> and "<No.ofEmp>" in editpage
Then Lead should Edited
Examples:
	|Title |Email                         |No.ofEmp|
  |airtel|devathukeerthana@gmail.com |50|
  |jio |sweety.shetnila@gmail.com    |120|
@convert
Scenario: convert lead to contact
Given user is on Leadpage
When click on next stages
Then Lead is converted into lead

  