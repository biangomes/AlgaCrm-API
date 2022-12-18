### Welcome to the AlgaCrm-API!

AlgaCrm-API is a simple API used to study and practice spring boot framework. It has a simple create and read operation and uses H2 as database, which is a database in-memory. It is helpful to test your REST operations, but be careful because datas can't be persisted.

### Use by yourself

For use it, you must have JDK installed (my personal JDK is 17) and maven.

Run it and test it with Postman for instance.

### Endpoints

- `GET`: `http://localhost:8080/clientes`

- `POST`: `http://localhost:8080/clientes`
 ```json
{
    "nome": "Test"
}
```