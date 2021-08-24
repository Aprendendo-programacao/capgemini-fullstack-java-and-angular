# Implementações do JPA

### Introdução

* É necessário a utilização de alguma implementação do JPA para funcionar

  > Relembrando: JPA é apenas a especificação ("contrato"). Analogicamente, JPA é o contratante, ou seja, é aquele que instrui (orienta) o contratado (Hibernate, EclipseLink) a executar uma determinada ação (método)

### Hibernate

* É uma ferramenta ORM open source

* É a mais utilizada no mercado

* A API nativa (ainda não existia o JPA) dessa ferramenta é sem a implementação do JPA, mas nas versões mais recentes já possui compatibilidade com essa especificação

  * A implementação nativa é mais flexível porém traz uma complexidade maior em relação ao JPA (recomendado nas versões mais atuais)

### EclipseLinK

* É um projeto open source de persistência da Eclipse Foundation

* É a implementação de referência do JPA

* Permite a interação com vários serviços de data, como

  * Banco de dados

  * Web services

  * OXM (Object XML Mapping)

  * EIS (Enterprise Information Systems)

* Padrões suportados

  * JPA

  * JAXB

  * JCA

  * SOD

### Especificar a API de implementação do JPA

* Baixar a API (Hibernate ou EclipseLink) através do Gradle ou Maven

* Definir a tag `<provider>` no arquivo de configuração do JPA (`persistence.xml`) e assim indicar a classe de implementação