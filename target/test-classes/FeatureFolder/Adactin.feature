Feature: Verifying Adactin Hotel details

  Scenario Outline: Verifying login details with valid credentials
    Given User is on the Adactin Hotel page
    When User should perform lolgin "<username>" and "<password>"
    And User should search hotel "<location>","<hotels>","<roomType>","<noOfRoom>","<check-in-date>", "<check-out-date>", "<adultsPerRoom>" and "<childrenPerfRoom>"
    And User should select hotel
    And User should book a hotel "<firstName>", "<lastName>", "<billingAddress>", "<creditCardNO>", "<creditCardType>", "<expiryMonth>", "<expiryYear>" and "<ccvNo>"
    And User should confrim booking
    Then user should verify Order id

    Examples: 
      | username      | password | location | hotels      | roomType | noOfRoom | check-in-date | check-out-date | adultsPerRoom | ChildrenPerRoom | firstName | lastName | billingAddress            | creditCardNO     | creditCardType | expiryMonth | expiryYear | ccvNo |
      | VigneshChidam | XE607K   | Sydney   | Hotel Creek | Standard | 1 - One  | 20/06/2022    | 21/06/2022     | 2 - Two       | 1 - One         | vignesh   | cv       | mirattunilai, Pudukkottai | 1234123412345678 | VISA           | September   |       2022 |   123 |
      #| VigneshChidam | XE607K   | Sydney      | Hotel Creek    | Double       | 1 - One  | 20/06/2022    | 21/06/2022     | 2 - Two       | 1 - One         | vignesh   | cv       | mirattunilai, Pudukkottai | 1234123412345678 | VISA           | September   |       2022 |   123 |
      #| VigneshChidam | XE607K   | London      | Hotel Creek    | Deluxe       | 1 - One  | 20/06/2022    | 21/06/2022     | 2 - Two       | 1 - One         | vignesh   | cv       | mirattunilai, Pudukkottai | 1234123412345678 | VISA           | September   |       2022 |   123 |
      #| VigneshChidam | XE607K   | London      | Hotel Sunshine | Double       | 1 - One  | 20/06/2022    | 21/06/2022     | 2 - Two       | 1 - One         | vignesh   | cv       | mirattunilai, Pudukkottai | 1234123412345678 | VISA           | September   |       2022 |   123 |
      #| VigneshChidam | XE607K   | New York    | Hotel Sunshine | Standard     | 1 - One  | 20/06/2022    | 21/06/2022     | 2 - Two       | 1 - One         | vignesh   | cv       | mirattunilai, Pudukkottai | 1234123412345678 | VISA           | September   |       2022 |   123 |
      #| VigneshChidam | XE607K   | New York    | Hotel Sunshine | Deluxe       | 1 - One  | 20/06/2022    | 21/06/2022     | 2 - Two       | 1 - One         | vignesh   | cv       | mirattunilai, Pudukkottai | 1234123412345678 | VISA           | September   |       2022 |   123 |
      #| VigneshChidam | XE607K   | Paris       | Hotel Hervey   | Standard     | 1 - One  | 20/06/2022    | 21/06/2022     | 2 - Two       | 1 - One         | vignesh   | cv       | mirattunilai, Pudukkottai | 1234123412345678 | VISA           | September   |       2022 |   123 |
      #| VigneshChidam | XE607K   | Paris       | Hotel Hervey   | Double       | 1 - One  | 20/06/2022    | 21/06/2022     | 2 - Two       | 1 - One         | vignesh   | cv       | mirattunilai, Pudukkottai | 1234123412345678 | VISA           | September   |       2022 |   123 |
      #| VigneshChidam | XE607K   | Los Angeles | Hotel Hervey   | Deluxe       | 1 - One  | 20/06/2022    | 21/06/2022     | 2 - Two       | 1 - One         | vignesh   | cv       | mirattunilai, Pudukkottai | 1234123412345678 | VISA           | September   |       2022 |   123 |
      #| VigneshChidam | XE607K   | Los Angeles | Hotel Hervey   | Super Deluxe | 1 - One  | 20/06/2022    | 21/06/2022     | 2 - Two       | 1 - One         | vignesh   | cv       | mirattunilai, Pudukkottai | 1234123412345678 | VISA           | September   |       2022 |   123 |
