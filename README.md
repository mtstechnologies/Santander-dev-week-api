# Santander Dev Week API
Java RESTful API criada durante o treinamento Java/Spring da DIO

## Diagrama de classes

```mermaid
classDiagram
  class User {
      -String name
      -Account account
      -Feature[] features
      -Card card
      -News[] news
    }
    
  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }
    
  class Feature {
    -String icon
    -String description
  }
    
  class Card {
    -String number
    -Number limit
  }
    
  class News {
    -String icon
    -String description
  }
    
User "1" *-- "1" Account
User "1" *-- "n" Feature
User "1" *-- "1" Card
User "1" *-- "n" News
```
