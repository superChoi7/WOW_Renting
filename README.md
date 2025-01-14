# WOW_Renting

This is the final project for DB course.

Please find details about the database in the folder [db](https://github.com/Ethan-zc/WOW_Renting/tree/master/db), details about the frontend in [material-kit-react-main](https://github.com/Ethan-zc/WOW_Renting/tree/master/material-kit-react-main), and details about the backend in the current directory.

Please find the final report [here](https://github.com/superChoi7/WOW_Renting/blob/master/Project_Part_II.pdf).

# Architecture

![architecture](./material-kit-react-main/src/assets/report/arch.png)

# Authentication flow

![authentication](./material-kit-react-main/src/assets/report/auth.png)

# Directory of backend source codes

```
WOW_Renting/src/main/java/com/wow/rent/
├── WowRentingApplication.java
├── config                    <-- Configuration
├── controller                <-- Process incoming REST requests
├── dao                       <-- Data access objects
├── demo
├── entry                     <-- Entry classes
├── model                     <-- Result class for sending formatted messages to frontend
└── service                   <-- Service implementations
```

# Features

- RESTful API
- Swagger UI for API testing
- Separating privileges for different roles of users
- Prevent SQL injection using Mybatis PreparedStatement
- Prevent XSS
- Request validation 
- Password Encryption 
- Session evaluation for identification
- Mybatis projects java method to SQL statement
- Handle most logics
