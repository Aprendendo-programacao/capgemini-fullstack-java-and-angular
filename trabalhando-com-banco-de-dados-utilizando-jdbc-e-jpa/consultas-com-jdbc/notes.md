# Consultas com JDBC

### Interfaces da API JDBC parra montar comandos SQL

* `Statement`: executar comandos SQL estático (não é comum e não é recomendado)

* `PreparedStatement`: executar comandos SQL (mais utilizado)

  * Vantagens em relação ao `Statement`

    * Prevenir *SQL Injection*

    * Melhor legibilidade

    * Melhor desempenho

* `CallableStatement`: executar *stored procedures*

### Métodos para executar Comandos SQL

* `execute`: executar qualquer tipo de SQL

* `executeQuery`: executar comandos de consultas (`SELECT`)

* `executeUpdate`: executar comandos de alteração (`INSERT`, `UPDATE`, `DELETE`, `CREATE`, `ALTER`)

### ResultSet

* Objeto que contém os dados de uma determinada consulta no banco de dados (normalmente com `SELECT`)

* São utilizados os métodos `getters` (`getInt`, `getFloat`, `getString`) para buscar dados do ResultSet

* Método `next`

  * É utilizado para percorrer os registros do **ResultSet** (normalmente utilizado junto com o `while`)