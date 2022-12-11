# Postgres run for vagrant vm with docker-compose port 5332
PGPASSWORD=password psql -p 5332 -U amigoscode

\l
\du
CREATE DATABASE customer;


# SQL inserts
insert into customer(id, name, email, age) values (nextval('customer_id_sequence'), 'Alex', 'alex@gmail.com', 22)

INSERT INTO CUSTOMER(id, name, email, age) VALUES (nextval('customer_id_sequence'), 'Dżesika', 'jes@gmail.com', 44)

# Hibernate is one of the most known implementation of the JPA (Java Persistence API)
# Framework responds for easier communication with databases
# + fastest development
# - delays in access time
#

# Spring Beans
# Annotations
# @Configuration - class is configuration
# @Service - class provides something, some service
# @Component - class is used by Spring but there are no clearly defined goals
# @ComponentScan - tells the Spring in what location looks for components


