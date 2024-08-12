# Santander Dev Week API
![Badge Status](http://img.shields.io/static/v1?label=STATUS&message=Concluído&color=GREEN&style=for-the-badge)

## Sobre o projeto

##### [Santander API](https://michael-santander-api-prod.up.railway.app/swagger-ui/index.html) Este projeto foi desenvolvido durante o treinamento educacional da DIO na formacao Claro - Java com Spring Boot.


## :hammer: Tecnologias utilizadas
- `Java 17:` 
- `Spring Boot 3:` 
- `Spring Data JPA:` 
- `Lombok:` 
- `OpenAPI (Swagger):` 
- `PostgreSQL/H2:` 
- `Railway:` facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.
Link do Figma
## [Link do Figma](https://www.figma.com/design/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?node-id=0-1&t=o4YkkfKo9LLsaa7h-0) 
foi utilizado para a abstração do domínio desta API, sendo útil na análise e projeto da solução.
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

## 

<div>
  <a href="https://www.linkedin.com/in/michael-trindade-772b06108" target="_blank"><img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"></a>
  <a href="https://www.instagram.com/michael_dev_software/" target="_blank"><img src="https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white"></a>
</div>
