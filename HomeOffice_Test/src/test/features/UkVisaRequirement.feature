@visaX
Feature: Confirm whether a visa is required to visit the UK
  As a user
  I want to use the homeoffice visa application
  so that i know if a visa is required to visit the UK

  Background: User visits check UK visa website
    Given I visit check UK visa web site

   @visa
  Scenario: A Japanese visiting to study for 6 months
  Given I provide a nationality of Japan
   And I select the reason Study
   And I state I am intending to stay for more than 6 months
   When I submit the form
   Then I will be informed You’ll need a visa to study in the UK
  #@visa
  #Scenario: A Japanese visiting for Tourism
    #Given I provide a nationality of Japan
    #And I select the reason Tourism
    #When I submit the form
    #Then I will be informed You won’t need a visa to come to the UK
 @visa
 Scenario: A Russian visiting for Tourism
 Given I provide a nationality of Russia
 And I select the reason Tourism
 And I state I am not travelling or visiting a partner or family
 When I submit the form
 Then I will be informed You’ll need a visa to study in the UK
