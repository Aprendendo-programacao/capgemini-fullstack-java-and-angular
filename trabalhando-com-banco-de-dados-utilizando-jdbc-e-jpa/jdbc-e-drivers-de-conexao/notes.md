# JDBC e drivers de conexão

### JDBC

> **JDBC** = Java Database Connectivity

* É uma API com diversas classes e interfaces escritas na linguagem Java (presentes nos pacotes java.sql e javax.sql)

* Permitir programas em Java a realizarem conexções em bancos de dados para realizar consultas

* **Classes e Interfaces**

  * **Driver JDBC**: serve para intermediar a interação de um código Java com um banco de dados

  * Classe **DriverManager**

    * Responsável pela comunicação com os drivers disponíveis

    * A partir dela, é possível criar uma conexão (*Connection*) com o banco de dados através de uma **URL**

      > Na URL contém informações/configurações do banco de dados, como: driver, localização e nome

  * Interface **Connection**

    * Representação da conexão com o banco de dados

    * Criação de *statements* que constroem consultas SQL

* **Vantagens**

  * **Facilita a interação com um banco de dados**, pois sem a API JDBC seria necessário conhecer o protocolo proprietário de cada banco de dados para se conectar e realizar consultas nela

  * **Simplicidade**, pois com apenas 1 interface Java é possível se conectar com qualquer banco de dados

  * **Maior produtividade**, o desenvolvedor não precisa perder tempo com configurações específicas de cada banco de dados, basta selecionar o driver do banco de dados desejado e criar as queries (consultas em SQL)