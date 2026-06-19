# Dependencias, JaCoCo y anotaciones para testing

## Dependencias

```xml
<dependencies>

    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.2</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>5.11.0</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-junit-jupiter</artifactId>
        <version>5.11.0</version>
        <scope>test</scope>
    </dependency>

</dependencies>
```

## JaCoCo

```xml
<build>
    <plugins>

        <plugin>
            <groupId>org.jacoco</groupId>
            <artifactId>jacoco-maven-plugin</artifactId>
            <version>0.8.11</version>

            <executions>
                <execution>
                    <goals>
                        <goal>prepare-agent</goal>
                    </goals>
                </execution>

                <execution>
                    <id>report</id>
                    <phase>test</phase>

                    <goals>
                        <goal>report</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>

    </plugins>
</build>
```

## Java recomendada

```xml
<properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
```

## Imports y anotaciones de JUnit

```java
import org.junit.jupiter.api.Test;
```

```java
@Test
void nombreDelTest() {
}
```

## Imports y anotaciones de Mockito

```java
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
```

```java
@ExtendWith(MockitoExtension.class)
class ServicioTest {

    @Mock
    private Repositorio repositorio;

    @InjectMocks
    private Servicio servicio;
}
```

## Regla para recordar

```text
@Mock = dependencia simulada

@InjectMocks = clase que se está probando

@ExtendWith(MockitoExtension.class) = activa Mockito con JUnit 5

@Test = marca un método como prueba
```
