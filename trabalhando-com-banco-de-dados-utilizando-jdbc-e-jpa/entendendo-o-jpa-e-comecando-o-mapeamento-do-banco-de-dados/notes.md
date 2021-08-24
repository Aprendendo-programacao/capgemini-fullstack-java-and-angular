# Entendo o JPA e começando o mapeamento do banco

### Problemas do JDBC

* Problema de produtividade no desenvolvimento de aplicações Web (muito tempo gasto na criação de queries SQL com JDBC)

* Paradigmas diferentes entre Java (orientado a objetos) e SGBDs tradicionais (entidade relacional), levando a esquematizar 2 modelos para um mesmo sistema

* **Solução**: **ORM**

### ORM

* Mapeamento Objeto Relacional (modelo de mapeamento)

* Representação de tabelas através de classes Java

* **Exemplo de mapeamento**

  * Tabela <=> Classe

  * Coluna <==> Atributo

  * Registro <=> Objeto

### Problemas do ORM

* Ao longo do tempo, foram criadas diversos provedores de ORM o que dificultava a manutenção, uma vez que não havia uma padronização dessa ferramenta

* **Solução**: JPA

### JPA

> JPA = Java Persistence API

* Especificação oficial para padronizar as interfaces das implementações ORM

* Definir o comportamento dos frameworks Java ORM que implementam as especificações do JPA

* **JPA é uma especificação**, ou seja, não é possível executar operações entre a aplicação e banco de dados (para que isso ocorra é necessário escolher uma implementação)

* Possui algumas artefatos como: classes, interfaces e anotações

  * Ajudar o desenvolvedor a abstrair o código

  * Presentes no pacote `javax.persistence`

* Utilizar os artefatos do JPA para manter o código independente de implementação

* `persistence.xml`

  * É uma arquivo de configuração

  * **Função**

    * Definir a interação com o banco de dados, usando as especificações do JPA

    * Especificar o framework de implementação do JPA

    * Definir as classes mapeadas, como

      * Entidades

      * Url de conexão

      * Usuário

      * Senha

      * Driver (normalmente JDBC para banco de dados relacionais)

* **Principais artefatos do JPA**

  * `@Entity`: indicar que os objetos da classe especificada serão persistidos no banco de dados

    * Anotações para auxiliar no mapeamento da classe

      * `@Id`: definir um atributo como chave primário

      * `@GeneratedValue(strategy = GenerationType.IDENTITY)`: geração da chave primário será de responsabilidade do banco de dados

      * `@Column`: especificar comportamentos da coluna

      * `@Table`: especificar comportamentos da tabela

      * **Anotações de relacionamento**

        * **Função**: representar os relacionamentos entre tabelas através das chaves estrangeiras

        * **Tipos de relacionamentos**

          * **Unidirecional**: é possível acessar uma instância de A para B, porém o contrário não

          * **Bidirecional**: é possível acessar uma instância de A para B e vice-versa

        * **Propriedade `fetch`**

          * **EAGER** (ansioso): a entidade mapeada com esse atributo **sempre será carregada** quando a entidade que está mapeando for consultada (mesmo se ela não foi utilizada durante a execução da aplicação)

          * **LAZY** (preguiçoso): a entidade mapeada com esse atributo somente será carreada quando esta for explicitamente consultada pela entidade que está mapeando

            > Essa propriedade é recomendado, em situações no qual não é sabido o número de frequência de consultas

        * **Principais anotações**
        
          * `@ManyToMany`: relação "muitos para muitos"

          * `@OneToMany`: relação "1 para muitos"

          * `@ManyToOne`: relação "muitos para 1"

          * `@OneToOne`: relação "1 para 1"

  * Interface `EntityManager`: gerenciar o ciclo de vida das entidades

    * **Principais métodos de interação com entidades**

      * `find`: buscar uma entidade, persistida no banco de dados, a partir da sua chave primária

      * `persist`: persistir (salvar) uma entidade no banco de dados (requer uma **transação**)

      * `remove`: excluir uma entidade do banco de dados (requer uma **transação**)

    * **Transação**

      * É obrigatório para persistir dados com as entidades mapeadas

      * Método, do `EntityManager`, para manipular transações: `getTransaction`

        * **Função**: retornar uma `EntityTransaction`

    * `EntityTransaction`

      * **Função**: utilizado em alguns métodos que realizam alterações no banco de dados

      * **Métodos**

        * `begin`: iniciar uma transação

        * `commit`: finalizar uma transação com a persistência de todos os dados modificados durante a transação, do início ao fim dela

        * `rollback`: finalizar uma transação com a reversão de todos os dados modificados durante a transação, do início ao fim dela