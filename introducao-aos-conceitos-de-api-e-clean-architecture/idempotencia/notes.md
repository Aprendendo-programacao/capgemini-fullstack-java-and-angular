# Idempotência

### Requisição idempotênte 

* É uma requisição que não tem efeito colateral, ou seja, independente do número de vezes que ela é executada, ela deve possuir o mesmo comportamento

* **POST**: altera estado no servidor (criação de recurso), logo não é idempotênte

* **GET**, **PUT**, **DELETE**, **HEAD**, **OPTIONS** e **TRACE**:  são idempotênte