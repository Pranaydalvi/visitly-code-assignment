# Visitly Code Assignment

This repository contains a full-stack web application developed for the **Visitly Code Assignment**. The backend is implemented using **Spring Boot** and the frontend is built using **React** (or **Angular**). The application provides basic user management functionalities, where users can be added and listed from a **MySQL** database.

---

## Table of Contents

- [Backend Overview](#backend-overview)
- [Frontend Overview](#frontend-overview)
- [Technologies Used](#technologies-used)
- [Instructions to Run](#instructions-to-run)
  - [Running Backend](#running-backend)
  - [Running Frontend](#running-frontend)
- [API Endpoints](#api-endpoints)
- [Folder Structure](#folder-structure)
- [License](#license)
- [Contact](#contact)

---

## Backend Overview

The backend is built with **Spring Boot** to handle business logic and **Spring Data JPA** for database interaction. The backend communicates with a **MySQL** database to manage users. The application provides endpoints for adding a new user and retrieving a list of all users.

### Key Features:
- **Spring Boot**: Backend service for managing user data.
- **Spring Data JPA**: Handles CRUD operations with the MySQL database.
- **MySQL**: Stores user data.
- **Lombok**: Reduces boilerplate code for entities and services.
- **RESTful APIs**: Exposes endpoints to interact with user data.
- **Security**: (Optional) Can be enhanced with authentication and authorization (e.g., JWT).

### Folder Structure:

- `src/main/java/com/pranay/backend`: Contains the core Java files for backend implementation.
- `src/main/resources`: Configuration files, including `application.properties` for database configuration.
- `src/test/java/com/pranay/backend`: Contains test cases for the backend.

---

## Frontend Overview

The frontend is developed using **React** (or **Angular**), providing a user-friendly interface to interact with the backend API. The UI allows users to view a list of all users and add new users through a form.

### Key Features:
- **React/Angular**: Provides an interactive UI with smooth navigation.
- **React Bootstrap/Angular Material**: For styling UI components.
- **API Integration**: Connects to the backend to fetch user data and post new user data.
- **State Management**: Manages frontend state for the UI components.
- **User Interaction**: Users can add new entries through a form and see a list of existing users.

### Folder Structure:

- `src/components`: Contains reusable components (e.g., UserList, UserForm).
- `src/services`: Manages API calls to the backend.
- `src/assets`: Contains static assets like images and icons.

---

## Technologies Used

- **Backend**:
  - **Spring Boot**: For building Java-based web applications.
  - **Spring Data JPA**: For handling database operations using Hibernate.
  - **MySQL**: The relational database used to store user data.
  - **Lombok**: To reduce boilerplate code in Java classes.
  
- **Frontend**:
  - **React** or **Angular**: The frontend framework used to build the user interface.
  - **React Bootstrap** or **Angular Material**: UI component libraries for styling and responsive design.
  - **Axios** (or **HttpClient** in Angular): For making API calls to the backend.

- **Other**:
  - **Node.js**: To run the frontend development server.
  - **Maven**: For building and managing the backend project dependencies.

---

## Instructions to Run

### Running Backend

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/Pranaydalvi/visitly-code-assignment.git
   ```
2. Navigate to the `backend` directory:
   ```bash
   cd visitly-code-assignment/backend
   ```
3. Install required dependencies (if needed):
   ```bash
   ./mvnw install
   ```
4. Set up the database in MySQL and configure the connection in the `src/main/resources/application.properties` file:
   - Configure the **Database URL**, **Username**, and **Password**.
   - Example:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/visitlydb
     spring.datasource.username=root
     spring.datasource.password=password
     ```

5. Start the Spring Boot backend application:
   ```bash
   ./mvnw spring-boot:run
   ```
   The backend will be available at `http://localhost:8080` by default.

---

### Running Frontend

1. Navigate to the `frontend` directory:
   ```bash
   cd visitly-code-assignment/frontend
   ```
2. Install the required dependencies:
   ```bash
   npm install
   ```
3. Start the frontend development server:
   ```bash
   npm start
   ```
   The frontend application will be available at `http://localhost:3000` by default.

---

## API Endpoints

The backend exposes the following API endpoints:

- **GET /api/users/allusers**: Fetches a list of all users.
- **POST /api/users/adduser**: Adds a new user to the system.

**Sample Request for Adding User**:
```json
{
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```

---

## Folder Structure

### Backend:
```text
backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── pranay/
│   │   │           └── backend/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               └── service/
│   │   └── resources/
│   │       └── application.properties
|   |       └── application-dev.properties
|   |       └── application-prod.properties
└── pom.xml
```


## Contact

For any questions or issues, feel free to reach out to me via:

- **Email**: pranay.dalvi@domain.com
- **LinkedIn**: [Pranay Dalvi](https://www.linkedin.com/in/pranay-dalvi-404a5325a)
- **GitHub**: [Pranaydalvi](https://github.com/Pranaydalvi)

---
