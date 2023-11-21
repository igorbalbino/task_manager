# Task manager

## Description
Task manager made as a test for a company.

Made based on the tutorials from the original site: `https://spring.io/quickstart`, video tutorials `https://youtu.be/k5PeywcbVYc?si=wbuDFtmbNApfKVSI` and `https://youtu.be/ssj0CGxv60k?si=18ORlYzxa_Lz7LXr`.
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

To create de MongoDB database, I used the following tutorial: `https://www.mongodb.com/basics/create-database`.

Command: `show dbs` will show de created dbs.

There is no word to create a db in mongo console, so, to create one, you just switch to the db name you want to create and add same data to collection or table `use taskmanager`.

To create the logic from the auto-increment ID, I used the following tutorial: `https://www.mongodb.com/docs/v2.2/tutorial/create-an-auto-incrementing-field/`;

The `_id` from mongo is an strange object with letters and numbers so I created a table to count the IDs of my table `departamento`: `db.counters.insertOne({id: "idDepartamento", seq: 0})`.

This function is to make the id incrementation automatic. It can be called when adding data to the `departamento` table:
```
function getNextSequence(name) {
    var ret = db.counters.findAndModify(
        {
            query: { id: name },
            update: { $inc: { seq: 1 } },
            new: true
        }
    );

    return ret.seq;
}
```

Adding data with auto-increment IDs:
```
db.departamento.insertOne({id: getNextSequence("idDepartamento"), titulo: "Financeiro"})
db.departamento.insertOne({id: getNextSequence("idDepartamento"), titulo: "Recursos Humanos"})
```

Now, our db will appear in the `show dbs` command.

And we can select data from our `departamento` table: `db.departamento.find()`;

To delete the table, use command: `db.departamento.drop()`.

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