# Conceitos iniciais sobre reverter commits

### Introdução

* Não é recomendado reverter commits muito antigos

### git reset

* **Reverter um commit a partir do seu hash**

  * **Sintaxe**: `$ git reset <hash>`

  * **Exemplo**: `$ git reset 8fs7lxc1`

* **Reverter um commit a partir da tag HEAD**

  * **Sintaxe**: `$ git reset <tag HEAD>`

  * **Exemplo**: `$ git reset HEAD~1`

    > `HEAD~1` = commit anterior a tag HEAD

    > `HEAD~2` = 2 commits antes da tag HEAD

* **Flags**

  * `--soft`

    * **Função**: voltar um commit para o index (*staging area*)

    * **Sintaxe**
      
      * `$ git reset --soft`

        > Ao não especificar um commit, o Git entenderá como HEAD~1 (commit anterior a tag HEAD)

      * `$ git reset --soft HEAD~1`

    * **Exemplo**: `$ git reset --soft HEAD~1`

  * `--mixed`

    * **Função**: voltar um commit para a área de trabalho (*working directory*)

    * **Sintaxe**
      
      * `$ git reset --mixed`

        > Ao não especificar um commit, o Git entenderá como HEAD~1 (commit anterior a tag HEAD)

      * `$ git reset --mixed HEAD~1`
    
    * **Exemplo**: `$ git reset --mixed HEAD~1`

  * `--hard`

### git revert