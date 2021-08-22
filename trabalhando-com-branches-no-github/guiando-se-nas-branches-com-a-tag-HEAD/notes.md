# Guiando-se nas branches com a tag HEAD

### Definição de tag

* É um nome específico atribuído ao um determinado local do tempo

### Definição da tag HEAD

* É uma tag que faz referência ao último *commit* válido de uma *branch*

* Essa tag serve para o usuário se localizar no histórico de *commits*

### Comandos

* **Adicionar um repositório remoto**

  * **Sintaxe**: `$ git remote add <nome> <url>`

  * **Exemplo**: `$ git remote add origin https://github.com/meu-usario/meu-repositorio`

* **Listagem das branches do repositório corrente**: `$ git branch`

* **Criar uma nova branch**

  * **Sintaxe**: `$ git checkout -b <nome da branch>`

  * **Exemplo**: `$ git checkout -b nova-branch`