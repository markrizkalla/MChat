# mChat - A Real-Time Chat Application

### Introduction
mChat is a real-time chat application built using Spring Boot and PostgreSQL. It provides users with the ability to log in, sign up, and engage in real-time conversations. 

### Technologies Used
* **Backend:** Spring Boot
* **Database:** PostgreSQL
* **Real-Time Communication:** Spring WebSockets

### Project Structure
```
mchat-backend/
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.mchat
│   │   │       ├── config
│   │   │       ├── controller
│   │   │       ├── model
│   │   │       ├── chat
│   │   │       └── security
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com.mchat   

│               └── test
├── pom.xml
```
### Features
* **User Authentication:**
  * Login and signup functionalities.
  * Password hashing for security.
* **Real-Time Chat:**
  * WebSocket-based communication for instant messaging.
 
### Getting Started
1. **Clone the Repository:**
   ```bash
   git clone (https://github.com/markrizkalla/MChat.git)

2. **Set Up Environment:**
    * **Create a PostgreSQL database and user:**
        You'll need a PostgreSQL server installed and running. Follow your preferred method for creating a database and user on your system.
      
    * **Update the `application.properties` file with your database credentials:**
        Open the `application.properties` file located in the `src/main/resources` directory. Edit the following properties with your specific database details:
      
            * `spring.datasource.url`: The URL of your PostgreSQL database server.
      
            * `spring.datasource.username`: The username for your PostgreSQL database user.
      
            * `spring.datasource.password`: The password for your PostgreSQL database user.
      

3. **Build and Run (Use with caution - adapt commands to your environment):**
    Open a terminal and navigate to the root directory of your project (where the `pom.xml` file is located).

    ```bash
    cd mchat-backend
    mvn clean install
    mvn spring-boot:run
    ```

    These commands will build your project, install dependencies, and then start the application.

### Usage
* **API Endpoints:**
  * **Authentication:**
    * `/req/login` - Login endpoint for user authentication.
    * `/req/signup` - Signup endpoint for user registration.
  * **Chat:**
    * `/index` - Endpoint to the global chat.

### Contributing
Contributions are welcome! Please feel free to submit pull requests or issues.
