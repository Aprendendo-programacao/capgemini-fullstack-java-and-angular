# Linguagens de consulta orientada a objetos

### JPQL

> JPQL = Java Persistence Query Language

* **Definição**

  * É uma linguagem de consulta independente orientada a objetos definida pelo JPA

  * É inspirado no SQL (sintaxe), poém ele interage com o banco de dados através das entidades do JPA, ao invés de interagir diretamente nas tabelas do banco de dados (como é no SQL)

* **Função** 

  * Realizar consultas no banco de dados

  * É possível utilizar as propriedades de orientação a objetos nas consultas realizadas no banco de dados, através das entidades mapeadas (como herança)

* **Vantagens em relação aos métodos do `EntityManager`**

  * Operações de busca, atualização e remoção de entidades em massa

    * Realizar operações não apenas com as chaves primárias (como são nos métodos do `EntityManager`)

    * Não é possível fazer a listagem de todos os registros do banco de dados
  
  * Realizar consultas mais complexas

  * Realizar funções de agregação

* **Vantagens em relação ao SQL**

  * Anotações de relacionamento (`@OneToMany`, `@OneToOne`) fazem os `JOINs` de tabelas automaticamente durante uma consulta -> mais produtividade

  * Funcionalidade de carregamento (`LAZY`, `EAGER`) nos relacionamentos entre entidades -> maior eficiência nas consultas

  * Consultas podem ser cacheadas -> mais performance

### Outras linguagens de consulta

* **Introdução**

  * Existem outras linguagens para realizar consultas através dos frameworks ORM

* **HQL**

  > HQL = Hibernate Query Language

  * **Definição**

    * Linguagem de consulta orientado a objetos 

    * Inspiração para a criação do JPQL

    * É necessário utilizar as anotações nativas do Hibernate (`Sessions` e `sessionFactory`)


  * **Função**

    * Realizar operações nas tabelas e colunas da base dados através do Hibernate (classes e objetos)

* **EQL**

  > EQL = EclipseLink Query Language

  * **Definição**

    * Fornece diversas extensões para a especificação padrão do JPQL

    * Provê acesso as funcionalidades padrões do SQL e específicas do EclipseLink

* **JPA Criteria API**

    * **Introdução**

      * Alternativa do JPQL a partir do JPA 2.0

      * Muito útil para criação de consultas dinâmicas

    * **JPQL VS JPA Criteria API**

      * **No JPQL**

        * Consultas são verificadas apenas em tempo de execução, portanto não é possível detectar erros de sintaxe, em uma consulta, em tempo de compilação

          > As consultas são definidas apenas como `String`

        * Simplicidade

          > Para consultas estáticas simples, é preferível utilizar o JPQL

      * **No JPA Criteria API**

        * É possível detectar erros em tempo de compilação

          > As consultas são definidas como instâncias de objetos Java (JPA Metamodel)

        * Complexidade

          > Para consultas dinâmicas, é recomendável o JPA Criteria API

      * **Em comum**

        * Ambos possuem poder e eficiência equivalentes, nas consultas

          > A escolha de qual linguagem de consulta para um projeto de software é muito complicado

    * **JPA Metamodel**: 

      * **Definição**

        * Possibilita a examinação dos modelos de persistência de um objeto para consultar os detalhes de uma entidade JPA

        * Cada entidade tem uma classes *metamodel* com o mesmo nome

          > A classe *metamodel* tem o *underline* (`_`) depois do nome

          * Os atributos da classe *metamodel* são estáticos (representam os campos de persistência)

      * **Função**: responsável por possibilitar a exibição de erros em tempo de compilação, além de ser necessário para referencias os atributos das entidades mapeadas

      * **OBS**: sem a utilização do *JPA Metamodel*, os atributos serão referenciados através de `String`, com isso perdendo seu principal objeto: "prever erros em tempo de compilação"