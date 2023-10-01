
# Employee Management Application Using Aop

Manage employee data with this Spring Boot application. You can perform CRUD (Create, Read, Update, Delete) operations on employee records and use AspectJ for logging method executions.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven build tool
- MySQL database server (configured in `application.properties`)
- Web browser for accessing the frontend (if applicable)

### Installation

1. Clone the repository:
   
   git clone https://github.com/yourusername/springAopConsole.git

   

2. Navigate to the project directory:
   cd spring-boot-employee-management

3. Build the application:
   mvn clean install
   
5. Run the application:
   click the run button in main class.

6. Access the application in your Console.

## Endpoints

- Get All Employees: `GET /api/emp`
- Get Employee by ID: `GET /api/emp/{id}`
- Create Employee: `POST /api/create`
- Update Employee: `PUT /api/emp/{id}`
- Delete Employee: `DELETE /api/emp/{id}`

## AspectJ Logging

The application uses AspectJ for logging method executions in the `com.kgisl.SpringAopConsole.aspect.LoggingAspect` class. It captures method entry, exit, and exceptions, helping with debugging and monitoring.
