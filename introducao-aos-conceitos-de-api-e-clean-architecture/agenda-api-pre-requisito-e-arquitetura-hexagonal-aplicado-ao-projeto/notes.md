# Agenda - API: Pré-requisito e Arquitetura hexagonal aplicado ao projeto

### Arquitetura hexagonal

* **Application Layer**

  * Configurações (`Config`)

    * Configuração de Beans injetáveis (apenas para o Spring)

  * Controladores (`Controller`)

    * DTOs (Classes de transferência de dados)
      
      * DTOs para requisições

      * DTOs para respostas

    * Bean validations

    * Init blinders (validações customizadas)

    * Error handlers

    * Endpoints

* **Domain Layer**

  * Entidades (`Entity`)

  * Portas (`Interface`)

  * Serviços (`Service`)

* **Resource Layer**

  * Interação com o banco de dados (`Repository`)

  * Proxy Repository

  * Entidades mapeadas com anotações de acordo com o banco de dados escolhido para o projeto

* **Test**

  * Testes unitários