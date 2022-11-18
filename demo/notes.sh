# PSQL
\l
\du
CREATE DATABASE student

CREATE ROLE amigoscode WITH LOGIN ENCRYPTED PASSWORD 'password';

GRANT ALL PRIVILEGES ON DATABASE "student" TO postgres;
GRANT ALL PRIVILEGES ON DATABASE "student" TO amigoscode;

DROP ROLE amigoscode;

# Hibernate is one othe most known implementation of the JPA (Java Persistence API)
# Framework responds for easier communication with databases
# + fastest development
# - delays in access time
#

# Sring Beans
# Annotations
# @Configuration - class is configuration
# @Service - class provides something, some service
# @Component - class is used by Spring but there are no clearly defined goals


