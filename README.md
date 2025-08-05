# Exchange rates REST API

Spring Boot application providing a REST API to save and show exchange rate data.

## Setup instructions

### 1. Clone the repository

### 2. Set up a MySQL database manually

```bash
CREATE DATABASE exchange_rates_db;
```
### 3. Configure application.properties
In src/main/resources/application.properties, set up your MySQL database connection – your username and your password.

### 4. Run the app

```bash
./mvnw spring-boot:run
```

#### 4.1. Access the BE
Open a browser and navigate to:

http://localhost:8080/?useDb=true — to fetch from the local database

http://localhost:8080/?useDb=false — to fetch from the current list of exchange rate tickets
system in Česká spořitelna and save them to the DB

#### 4.2. Access the FE
Open a browser and navigate to:

http://localhost:8080/index.html
