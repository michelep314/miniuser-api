# Simple REST API with Hibernate & H2

This is a minimal **REST API** project built with **Hibernate** and an in-memory **H2 database**.  
It exposes basic CRUD operations (`GET`, `POST`, `PUT`, `DELETE`) on a single `User` table.

---

## Features

- **H2 in-memory database** – lightweight and fast, resets on each restart  
- **Hibernate ORM** – handles persistence and mapping  
- **REST endpoints** – simple CRUD for `User` entity  

---

## Tech Stack

- Java (Spring Boot / Jakarta EE depending on setup)
- Hibernate ORM
- H2 Database
- REST (JAX-RS / Spring Web)

---

## User Entity

Example structure:

```java
public class User {
    private Long id;
    private String name;
    private String email;
}
