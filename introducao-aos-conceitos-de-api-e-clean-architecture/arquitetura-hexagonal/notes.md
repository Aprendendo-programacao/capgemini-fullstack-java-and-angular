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

  * Não pode ter interação com outras camadas da aplicação

  * Entidades (`Entity`)

    * **NÃO** são entidades anémicas 

  * Portas (`Interface`)
  
    * Responsável da comunicação entre a camada de domínio e da camada da aplicação/infraestrutura

  * Serviços (`Service`)

* **Resource Layer**

  > Também pode ser chamado de camada de infraestrutura (Infrastructure Layer)

  * Interação com o banco de dados (`Repository`)

  * Proxy Repository (composição com Spring Data e implementação dos repositórios da camada de domínio)

  * Entidades mapeadas com anotações de acordo com o banco de dados escolhido para o projeto

* **Test**

  * Testes unitários