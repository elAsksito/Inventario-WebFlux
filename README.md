# Inventario-WebFlux

Este proyecto es una API de inventario construida con **Spring WebFlux** y **R2DBC**, utilizando una arquitectura reactiva con **MySQL** como base de datos. Se gestiona la base de datos con **Flyway** para el versionado de esquemas.

## Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3.4.3**
- **Spring WebFlux**
- **Spring Data R2DBC**
- **MySQL**
- **Flyway**

## Cómo ejecutar el proyecto

1. Clonar el repositorio:
   ```sh
   git clone https://github.com/elAsksito/Inventario-WebFlux.git
   ```
2. Ir al directorio del proyecto:
   ```sh
   cd Inventario-WebFlux
   ```
3. Compilar y ejecutar la aplicación:
   ```sh
   ./mvnw spring-boot:run
   ```
   O si usas Maven instalado:
   ```sh
   mvn spring-boot:run
   ```

## Endpoints principales

| Método | Endpoint         | Descripción                    |
|--------|-----------------|--------------------------------|
| GET    | `/productos`     | Listar todos los productos    |
| POST   | `/productos`     | Crear un nuevo producto       |
| GET    | `/productos/{id}` | Obtener un producto por ID    |
| PUT    | `/productos/{id}` | Actualizar un producto        |
| DELETE | `/productos/{id}` | Eliminar un producto         |

## Migraciones con Flyway

Cada vez que inicies la aplicación, Flyway verificará y aplicará las migraciones necesarias para mantener la base de datos actualizada.
Si necesitas ejecutar las migraciones manualmente, usa:

```sh
mvn flyway:migrate
```


## Autor

**elAsksito** - [GitHub](https://github.com/elAsksito)


