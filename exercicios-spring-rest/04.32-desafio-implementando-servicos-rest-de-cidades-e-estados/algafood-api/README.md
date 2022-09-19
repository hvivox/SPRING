## Sobre o algafood
* Sistema de controle de delivery para restaurantes

## Recurso utilizados no desenvolvimento
```
* openjdk version "17.0.4" 2022-07-19
* Spring Boot (v2.7.3)
* Tomcat/9.0.65
* Mysql 5.7 ou superior
* IntelliJ IDEA 2022.2.2 (Ultimate Edition)
  *  Este projeto foi desenvolvido com a IDE intellij, 
  mas pode ser utlizar com a IDE de sua escolha
```
## Instruções para execução
* Faça o clone deste projeto através do git clone
* Importar o projeto para IDE desejada
* Alterar o arquivo application.properties com os parametros de banco de dados etc
  *  spring.jpa.hibernate.ddl-auto=create irá criar a estrutura do projeto ao inicializar a aplicação
  *  spring.jpa.hibernate.ddl-auto=update atualiza a estrutura do banco se apagar os dados
* Executa a classe AlgafoodApiApplication.java para inicializar o projeto
* Para acessar as rotas utilize qualquer API Client como o Postman 
utilizando o caminho localhost:SUA_PORTA/Nome_Recurso
  * localhost:8080/restaurante

## Instruções opcionais
* O arquivo import.sql foi criado para dar uma carga
inicial ao banco dados ao iniciar a aplicação, se
necessário basta incluir as cargas necessárias
* As classes que estão em com.algaworks.algafood.jpa
podem ser utilizadas para fazer testes na consulta e transações

## Implementações
* CRUD complento dos dominios Cozinha
  * Get, Post, Delete, Patch 
* Nesta versão foi incluído os recursos de lista e buca
de restaurantes
* Implementação de classes de serviço restaurante, cidade, estado