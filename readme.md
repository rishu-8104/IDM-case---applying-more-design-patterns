# Identity Management System

This project demonstrates a flexible identity management system using design patterns like Strategy and Factory. It models various types of identities (Staff, Student, Visitor) and their corresponding strategies for handling behavior dynamically at runtime.

## Introduction

The Identity Management System is designed to handle different types of users (Staff, Student, Visitor) by applying the Strategy design pattern for specific behaviors (e.g., different processing strategies for each identity type). The Factory design pattern is used to instantiate the correct Identity based on the provided type.

### Key Features:
- **Identity Types**: Staff, Student, and Visitor classes are used to represent different identity types.
- **Strategy Pattern**: Different strategies are applied for each identity type, such as how they are processed or handled in the system.
- **Factory Pattern**: A factory class to create instances of different identities based on input criteria.

**Build the project**:
    ```bash
    mvn clean install
    ```

**Run the project**:
    After building the project, you can run the application using:
    ```bash
    mvn exec:java -Dexec.mainClass="Main"
    ```


## Features

- **Identity Types**:
  - `Staff`: Represents a staff member with a specific processing strategy.
  - `Student`: Represents a student with a distinct processing behavior.
  - `Visitor`: Represents a visitor with a unique processing strategy.

- **Factory Pattern**: The `IdentityFactory` class determines the appropriate identity type based on input and returns an instance of the correct class.

- **Strategy Pattern**: The `IdentityStrategy` interface defines a `processIdentity()` method that is implemented by different strategies for each identity type:
  - `StaffStrategy`
  - `StudentStrategy`
  - `VisitorStrategy`

