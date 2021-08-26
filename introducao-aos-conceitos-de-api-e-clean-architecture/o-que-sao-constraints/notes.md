# O que são constraints

### Definição

* Existem 6 *constraints*

### Interface Uniform

* Baseado em recursos/interfaces

* Padronização na comunicação (requisição e resposta) entre cliente e servidor

### Cliente-Servidor

* Cliente e servidor são independentes entre si

* Desenvolvimento da aplicação front-end e back-end de forma separadamente

### Sem estado

* Servidor não tem a responsabilidade de armazenar estado e sessão (necessário para realizar requisições)

* Para cada requisição o cliente informa ao servidor

* Aplicações *stateless* (sem estado) são de fácil escalonamento

### Cache

* Permitir o reaproveitamento de dados que já foram carregados (sem a necessidade de consultar o servidor/banco de dados)

  * Para isso é necessário algumas configurações

* O Cache pode ser gerenciado de modo *client-side* ou *server-side*

### Sistema em camadas

* Por ser sem estado, permite distribuir as implementações e/ou recursos 

* **Exemplo**: servidor, *data storage* e serviço de autenticação em servidores separados

### Código sobre demanda

* Possibilidade de retornar "executáveis" via API para renderização de algum componente, se necessário