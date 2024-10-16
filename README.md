# Test Java Neoris

Aplicación que expone una API RESTful de creación de usuarios.

## Authors

- [@CristobalValenzuela](https://github.com/CristobalValenzuela)

## Run Locally

Clone the project

```bash
  git clone https://github.com/CristobalValenzuela/test-java-neoris.git
```

Go to the project directory

```bash
  cd test-java-neoris
```

Build project

```bash
  ./gradlew build
```

Start the server

```bash
  java -jar ./build/libs/api-users-1.0.0.jar
```

Open Swagger

[http://localhost:8080/users/swagger-ui/index.html](http://localhost:8080/users/swagger-ui/index.html)

![Swagger Image](img/swagger.png)

## Environment Variables

Yo can modify in application.yml, the default value or set in a container over Kubernetes

| Name                | Description                           |
| :------------------ | :------------------------------------ |
| SERVICE_PORT        | Port for the application              |
| SECRET_KEY_JWT      | Secret for use JWT generation token   |
| EXPIRATION_TIME_JWT | Time of durarion generate token       |
| DB_URL              | Url for data base                     |
| DB_USER             | User for connect to the data base     |
| DB_PASSWORD         | Password for connect to the data base |
| EMAIL_REGEX         | Regexp for validation email           |
| PASSWORD_REGEX      | Regexp for validation password        |

## API Reference

| Method | URL                         | Parameter | Type   | Description               |
| :----- | :-------------------------- | :-------: | :----- | :------------------------ |
| GET    | localhost:8080/users/       |           |        | Listar los usuarios       |
| GET    | localhost:8080/users/{uuid} |   uuid    | String | Obtener un usuario por ID |
| POST   | localhost:8080/users/       |           |        | Crear un usuario          |
| PUT    | localhost:8080/users/{uuid} |   uuid    | String | Crear un usuario          |
| DELETE | localhost:8080/users/{uuid} |   uuid    | String | Eliminar un usuario       |

## Ejemplos

### Creacion de usuario

```http
POST http://localhost:8080/users/
Content-Type: application/json

{
  "name": "Juan Rodriguez",
  "email": "juan@rodriguez.org",
  "password": "hunter2",
  "phones": [
    {
      "number": "1234567",
      "citycode": "1",
      "contrycode": "57"
    }
  ]
}
```

### Respuesta

```
{
  "mensaje": "usuario creado",
  "data": {
    "id": "546f6306-beb7-4e29-bdab-63702546982f",
    "name": "Juan Rodriguez",
    "email": "juan@rodriguez.org",
    "password": "hunter2",
    "phones": [
      {
        "number": 1234567,
        "cityCode": 1,
        "countryCode": null
      }
    ],
    "created": "2024-10-16 10:54:52",
    "modified": "2024-10-16 10:54:52",
    "lastLogin": "2024-10-16 10:54:52",
    "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJKdWFuIFJvZHJpZ3VleiIsImlhdCI6MTcyOTA4Njg5MiwiZXhwIjoxNzI5MDkwNDkyfQ.CcyCpRdD80xN2tXV1LUpHJpd6jrxIouzXmfI1Uqtc3I",
    "isActive": true
  }
}
```

### Listar usuarios

```http
GET http://localhost:8080/users/
```

### Respuesta

```
{
  "data": [
    {
      "id": "546f6306-beb7-4e29-bdab-63702546982f",
      "name": "Juan Rodriguez",
      "email": "juan@rodriguez.org",
      "password": "hunter2",
      "phones": [
        {
          "number": 1234567,
          "cityCode": 1,
          "countryCode": null
        }
      ],
      "created": "2024-10-16 10:54:52",
      "modified": "2024-10-16 10:54:52",
      "lastLogin": "2024-10-16 10:54:52",
      "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJKdWFuIFJvZHJpZ3VleiIsImlhdCI6MTcyOTA4Njg5MiwiZXhwIjoxNzI5MDkwNDkyfQ.CcyCpRdD80xN2tXV1LUpHJpd6jrxIouzXmfI1Uqtc3I",
      "isActive": true
    }
  ]
}
```

### Usuario ya existente

```http
POST http://localhost:8080/users/
Content-Type: application/json

{
  "name": "Juan Rodriguez",
  "email": "juan@rodriguez.org",
  "password": "hunter2",
  "phones": [
    {
      "number": "1234567",
      "citycode": "1",
      "contrycode": "57"
    }
  ]
}
```

### Respuesta

```
{
  "mensaje": "Correo ya registrado"
}
```

## Postman Collection

[Api User.postman_collection.json](https://raw.githubusercontent.com/CristobalValenzuela/test-java-neoris/master/Api%20User.postman_collection.json)

## Running Tests

To run tests, run the following command

```bash
  ./gradlew test
```

```bash
  cd build/reports/jacoco/test/html
  #open index.html in browser
```

### Coverage Result

![Coverage Test](img/test-result.png)
