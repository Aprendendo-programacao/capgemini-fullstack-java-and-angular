# Apache Avro

### Introdução

* Geração do código Java a partir de um esquema Avro (Avro Schema `.avsc`)

### Configuração com Gradle

* `settings.gradle` (Não é necessário se estiver usando Spring)

  ```gradle
  pluginManagement {
      repositories {
          mavenCentral()
          gradlePluginPortal() // Não tem mais suporte desde a versão 1.0+
      }
  }
  ```

* `build.gradle`

  ```gradle
  plugins {
      id "com.github.davidmc24.gradle.plugin.avro" version "VERSION"
  }

  // Dependências do Avro
  repositories {
    mavenCentral()
  }

  dependencies {
      compileOnly 'org.apache.avro:avro:1.10.1'
  }

  // Geração do código Java a partir de um "avro schema" na pasta "src/main/resources/avro"
  avro {
    fieldVisibility = "PRIVATE"
  }

  generateAvroJava {
      source 'src/main/resources/avro'
  }
  ```

* **Exemplo**

  ```gradle
  plugins {
    id "com.github.davidmc24.gradle.plugin.avro" version "1.2.0"
    id 'org.springframework.boot' version '2.5.4'
    id 'io.spring.dependency-management' version '1.0.11.RELEASE'
    id 'java'
  }

  group = 'me.gabreuw'
  version = '0.0.1-SNAPSHOT'
  sourceCompatibility = '11'

  configurations {
      compileOnly {
          extendsFrom annotationProcessor
      }
  }

  repositories {
      mavenCentral()
      maven {
          url 'https://packages.confluent.io/maven/'
      }
  }

  ext {
      set('springCloudVersion', "2020.0.3")
      set('kafkaAvroVersion', "5.5.0")
      set('apacheAvroVersion', "1.10.1")
  }

  dependencies {
      implementation 'org.springframework.boot:spring-boot-starter-web'
      implementation 'org.apache.kafka:kafka-streams'
      implementation 'org.springframework.cloud:spring-cloud-starter-sleuth'
      implementation 'org.springframework.cloud:spring-cloud-stream'
      implementation 'org.springframework.cloud:spring-cloud-stream-binder-kafka-streams'
      implementation "io.confluent:kafka-avro-serializer:${kafkaAvroVersion}"

      def lombok = 'org.projectlombok:lombok'
      compileOnly lombok
      annotationProcessor lombok

      runtimeOnly 'org.postgresql:postgresql'

      compileOnly "org.apache.avro:avro:${apacheAvroVersion}"

      testImplementation('org.springframework.boot:spring-boot-starter-test') {
          exclude group: 'org.junit.vintage', module: 'junit-vintage-engine'
      }
      testImplementation 'org.springframework.cloud:spring-cloud-stream-test-support'
  }

  dependencyManagement {
      imports {
          mavenBom "org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"
      }
  }

  test {
      useJUnitPlatform()
  }

  avro {
      fieldVisibility = "PRIVATE"
  }

  generateAvroJava {
      source 'src/main/resources/avro'
  }
  ```

### Execução (**no Intellij IDEA**)

* Abrir a aba do Gradle

  ![](./assets/aba-gradle.png)

* Executar a task `generateAvroJava` 

  ![](./assets/executar-task-generateavrojava.png)

  * O código Java será gerado na pasta `build/generated-main-avro-java`

    ![](./assets/pasta-com-o-codigo-java.png)