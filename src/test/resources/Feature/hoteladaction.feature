Feature: Verify  adacton hotel details

  Scenario Outline: verifying adatin hotel page with valid credientals
    Given customer is in a adaction hotel login page
    When customer should giver "<username>" and "<password>"
    And customer should click login button
    And customer should fill the search hotel page "<Location>" "<Hotels>" "<Room Type>" "<Number of Rooms>" "<Check In Date>" "<Check Out Date>" "<Adults per Room>" "<Children per Room>"
    And customer should click the search button
    And customer should select the hotel and click to continue button
    And customer should book a hotel "<First Name>" "<Last Name>" "<Billing Address>" "<Credit Card No>" "<Credit Card Type>" "<Expiry month>" "<Expiry year>" "<CVV Number>"
    And customer should click on Book Now button
    And customer should check booking conformation and get the oder id
    Then customer should verify the sucessful message

    Examples: 
      | username  | password  | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name  | Billing Address     | Credit Card No     | Credit Card Type | Expiry month | Expiry year | CVV Number |
      | yuvashree | Test@1234 | Paris    | Hotel Creek | Double    | 1 - One         | 29/12/2021    | 30/12/2021     | 1 - One         | 1 - One           | ravikanth  | rajklumar  | 223 toraipakkam omr | 876754321234528756 | VISA             | January      |   2022      | 123        |
			| yuvashree | Test@1234 | Paris    | Hotel Creek | Double    | 1 - One         | 29/12/2021    | 30/12/2021     | 1 - One         | 1 - One           | ravikanth  | rajklumar  | 223 toraipakkam omr | 876754321234528756 | VISA             | January      |   2022      | 123        |
			| yuvashree | Test@1234 | New York | Hotel Creek | Double    | 1 - One         | 29/12/2021    | 30/12/2021     | 1 - One         | 1 - One           | ravikanth  | rajklumar  | 223 toraipakkam omr | 876754321234528756 | VISA             | January      |   2022      | 123        |
			| yuvashree | Test@1234 | Paris    | Hotel Creek | Double    | 1 - One         | 29/12/2021    | 30/12/2021     | 1 - One         | 1 - One           | ravikanth  | rajklumar  | 223 toraipakkam omr | 876754321234528756 | VISA             | January      |   2022      | 123        |
			| yuvashree | Test@1234 | Paris    | Hotel Creek | Double    | 1 - One         | 29/12/2021    | 30/12/2021     | 1 - One         | 1 - One           | ravikanth  | rajklumar  | 223 toraipakkam omr | 876754321234528756 | VISA             | January      |   2022      | 123        |
			| yuvashree | Test@1234 | Paris    | Hotel Creek | Double    | 1 - One         | 29/12/2021    | 30/12/2021     | 1 - One         | 1 - One           | ravikanth  | rajklumar  | 223 toraipakkam omr | 876754321234528756 | VISA             | January      |   2022      | 123        |
			| yuvashree | Test@1234 | Paris    | Hotel Creek | Double    | 1 - One         | 29/12/2021    | 30/12/2021     | 1 - One         | 1 - One           | ravikanth  | rajklumar  | 223 toraipakkam omr | 876754321234528756 | VISA             | January      |   2022      | 123        |
			| yuvashree | Test@1234 | Paris    | Hotel Creek | Double    | 1 - One         | 29/12/2021    | 30/12/2021     | 1 - One         | 1 - One           | ravikanth  | rajklumar  | 223 toraipakkam omr | 876754321234528756 | VISA             | January      |   2022      | 123        |
			| yuvashree | Test@1234 | Paris    | Hotel Creek | Double    | 1 - One         | 29/12/2021    | 30/12/2021     | 1 - One         | 1 - One           | ravikanth  | rajklumar  | 223 toraipakkam omr | 876754321234528756 | VISA             | January      |   2022      | 123        |
			| yuvashree | Test@1234 | Paris    | Hotel Creek | Double    | 1 - One         | 29/12/2021    | 30/12/2021     | 1 - One         | 1 - One           | ravikanth  | rajklumar  | 223 toraipakkam omr | 876754321234528756 | VISA             | January      |   2022      | 123        |
			