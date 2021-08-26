# Versionamento

### Definição

* Permitir a evolução de um API sem trazer quebras de contratos para os cliente (mudança em requisições e respostas, remoção de uma funcionalidade da API)

### Tipos de versionamento para API REST

* **URI**

  * **Exemplos**

    * `https://api.exemple.com/v1`

    * `https://exemple.com/api/v1`

    * `https://apiv1.exemple.com`

* **Header Customizado**

  * **Exemplos** 
    
    * `Accept-version: v1`

* **Content Negotiation (accept header)**

  * **Exemplos**

    * `accept: application/vnd.example.v1+json`

    * `accept: application/vnd.example+json;version=1.0`

      > `...example...` é o nome de um recurso da API