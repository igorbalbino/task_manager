# Task manager

## Description
Task manager made as a test for a company.

Made based on the tutorials from the original site: `https://spring.io/quickstart` and this video tutorial `https://youtu.be/ssj0CGxv60k?si=18ORlYzxa_Lz7LXr`.
Project created at site: `https://start.spring.io/`,
with config:
```
JAVA: 21
Project: Gradle - Groovy
Springboot: 3.1.5
Packaging: Jar
Dependencies: Lombok, Spring Web and Spring Data MongoDB

Package name: com.example.avaliacao
```

### The Test
```
Parte 1

Precisamos criar uma API de gerenciamento de tarefas para disponibilizar para nossa equipe de front.

Requisitos:

- A API deve ser REST

- Cada pessoa terá um id, nome, departamento e  lista de tarefas

- Cada tarefa terá id, título, descrição, prazo, departamento, duração, pessoa alocada e se já foi finalizado.

Funcionalidades desejadas:

- Adicionar um pessoa (post/pessoas)

 - Alterar um pessoa (put/pessoas/{id})

 - Remover pessoa (delete/pessoas/{id})

 - Adicionar um tarefa (post/tarefas)

 - Alocar uma pessoa na tarefa que tenha o mesmo departamento (put/tarefas/alocar/{id})

 - Finalizar a tarefa (put/tarefas/finalizar/{id})

 - Listar pessoas trazendo nome, departamento, total horas gastas nas tarefas.(get/pessoas)

 - Buscar pessoas por nome e período, retorna média de horas gastas por tarefa. (get/pessoas/gastos)

 - Listar 3 tarefas que estejam sem pessoa alocada com os prazos mais antigos. (get/tarefas/pendentes)

 - Listar departamento e quantidade de pessoas e tarefas (get/departamentos)

 OBS: A linguagem para realização do desafio deve ser em Java.

Framework SprintBoot ou Quarkus.

Bancos de dados: MongoDB, PostgreSQL.

 * ---------------------------------- *
 
 
```