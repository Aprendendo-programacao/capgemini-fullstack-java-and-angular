# Conceitos iniciais sobre reverter commits

### git reset

* **Reverter um commit a partir do seu hash**

  * **Sintaxe**: `$ git reset <hash>`

  * **Exemplo**: `$ git reset 8fs7lxc1`

* **Reverter um commit a partir da tag HEAD**

  * **Sintaxe**: `$ git reset <tag HEAD>`

  * **Exemplo**: `$ git reset HEAD~1`

* **Flags**

  * `--soft`

  * `--mixed`

  * `--hard`

### git revert