# N+1 em REST APIs

### Problema de "N+1" em REST APIs

* **Problema**: "Necessidade de realizar 3 requisições no servidor para criar um componente no lado do cliente"

* **Solução**: conceito de **Compose API**

  * É possível aplicar esse conceito em 2 camadas

    * Na camada da aplicação

    * Na camada acima da aplicação, antes do cliente

  * Geralmente a composição da requisições é feita no *gateway* (responsável pelo load balance), uma vez que ele conhece todos os serviços da aplicação, logo é mais eficiente e performático do que realizar isso em um serviço externo da aplicação