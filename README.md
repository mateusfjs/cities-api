# cities-api
API Rest de consulta de cidades do Brasil

API contruida na aula do Andre Gomes no bootCamp NTT DATA Quality Assurance Beginner #3

# Foi utilizado 

- Git
- Java 8
- Docker
- IntelliJ Community
- Heroku CLI

Foi Criado um conteiner Docker para o banco de dados PostgresSQL

docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

Os dados utilizados foram do repositorio 

https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL

# Comandos

cd ~/workspace/sql-paises-estados-cidades/PostgreSQL

docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;


# Spring Boot

- Java 8
- Gradle Project
- Jar
- Spring Web
- Spring Data JPA
- PostgreSQL Driver
