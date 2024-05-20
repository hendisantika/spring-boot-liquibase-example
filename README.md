# spring-boot-liquibase-example

### What is Liquibase?

![FlywayDB Flow](img/flow.png "FlywayDB Flow")

Liquibase is an open-source tool for keeping track of database schema script revisions. It works with a variety
of database types and accepts a variety of file formats for defining the database structure.

Liquibase can roll changes back and forward from a given point, removing the need to remember what was the last update
or script you executed on a particular DB instance.

When it becomes necessary to update/revert changes in a database or migrate it from one version to another, database
schema migration is done. Liquibase and Flyway are the two main migrating tools.

### What is Flyway?

Flyway is an open source database migration software. It has Migrate, Clean, Info, Validate, Undo, Baseline, and Repair
seven basic commands, SQL (database-specific syntax (such as PL/SQL, T-SQL, etc.) or Java migrations are supported (for
advanced data transformations or dealing with LOBs).

You can also refer Java base migration
using [Spring Boot + Flyway Example.](https://www.techgeeknext.com/spring-boot/spring-boot-flyway-example)

Refer example for [Flyway Command Line base migration.](https://www.techgeeknext.com/flyway-command-line-migration)

Differences between Flyway and Liquibase
Refer [Liquibase VS Flyway for more details.](https://www.techgeeknext.com/liquibase-vs-flyway)

|                                                                                                          | FlywayDB      | Liquibase            |
|----------------------------------------------------------------------------------------------------------|---------------|----------------------|
| Diff utility to compare two databases                                                                    | No            | Yes                  |
| Generates SQL for you	                                                                                   | Yes           | 	No                  |
| Rollback	                                                                                                | Paid Service	 | Yes, available       |
| Targeted rollback for any single change and Targeted rollback for a set of changes	                      | No	           | Paid Service         |
| Ability to manage change files in a variety of ways and can use the monitoring and reporting dashboard.	 | No	           | Yes                  |
| Specifying changes file	                                                                                 | SQL	          | SQL, XML, JSON, YAML |
| Repeatable migrations	                                                                                   | Yes           | 	Yes                 |
| Dry runs	                                                                                                | Paid Service	 | Yes, available       |
| Preconditions	                                                                                           | No            | 	Yes                 |
