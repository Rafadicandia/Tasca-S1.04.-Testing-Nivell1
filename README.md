
## 📄 Description - Exercise Statement

### Exercise 1
Create a Java class that manages a collection of books in a library. The class must allow adding books, retrieving the list of books, getting a specific book by its position, adding a book at a specific position, and removing a book by title.
Implement the following functionalities:
The class must allow adding books to the collection.
The complete list of books must be retrievable.
The title of a book must be obtainable given a position.
A book must be able to be added at a specific position.
A book must be able to be removed by title.
Verify its correct functionality with JUnit:
Verify that the list of books is not null after creating a new object.
Confirm that the list has an expected size after inserting several books.
Ensure that the list contains a specific book at its correct position.
Verify that there are no duplicate book titles in the list.
Check that the title of a book can be retrieved given a specific position.
Ensure that adding a book correctly modifies the list.
Confirm that removing a book decreases the size of the list.
Verify that the list remains alphabetically sorted after adding or removing a book.

### Exercise 2
Create a class called `CalculoDni` that calculates the DNI letter when receiving the number as a parameter.
Create a JUnit class that verifies its correct functionality, parameterizing it so that the test receives a wide range of data and validates whether the calculation is correct for 10 predefined DNI numbers.

### Exercise 3
Create a class with a method that throws an `ArrayIndexOutOfBoundsException`.
Verify its correct functionality with a JUnit test.

-----

## 💻 Used Technologies

| Technology | Version | Description |
| :--- | :--- | :--- |
| **Java** | 24 (OpenJDK) | Language and environment for development. |
| **JUnit 5** | 5.10.2 (or higher) | Testing framework. |
| **Apache Maven** | 3.9.6 (or higher) | Build automation and project management tool. |

-----

## 📋 Requirements

- Operating System: Windows/macOS/Linux.

- **Java Development Kit (JDK):** Version **24.0.1** (or higher). It is recommended to use an **OpenJDK** distribution.

- **Apache Maven:** Installed and configured in the system PATH.

- Integrated Development Environment (IDE): **IntelliJ IDEA** (recommended) or any other IDE with Maven support.

-----

## 🛠️ Installation

1.  **Clone the Repository:**

    ```bash
    git clone https://github.com/Rafadicandia/Tasca-S1.04.-Testing-Nivell1.git
    
    ```

2.  **IDE Configuration:**

    Open the folder as a **Maven project** in your IDE. The IDE should automatically download the necessary dependencies (JUnit 5) defined in the `pom.xml` file.

3.  **Build the Project:**

    To ensure all dependencies are resolved and the project compiles correctly, you can run the following command in the terminal from the project root:

    ```bash
    mvn clean install
    ```

-----

## ▶️ Execution

### ⚙️ Execute from the IDE

- **Run Tests:** Locate the JUnit test classes (e.g., in the `src/test/java` folder), right-click on the test class or method, and select "Run '...Test'".


-----

## 🤝 Contributions

Contributions are welcome. Please report any bugs by opening an issue or suggest improvements via a clear and concise Pull Request.

```
```