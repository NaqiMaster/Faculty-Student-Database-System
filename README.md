# Faculty–Student Database System (Java)

An in-memory Java database system that parses structured CSV data and constructs
relationships between faculty, students, and departments using object-oriented design.

## Features
- Parses CSV input into structured records
- Creates Faculty and Student domain objects
- Duplicate-aware ID generation without using Maps
- Department enrollment tracking via static collections
- Student–Faculty supervisor relationships
- Inheritance (`Person → Faculty / Student`)
- Composition (`Student → Faculty`, `Faculty → Department`)

## Technologies
- Java
- java.time API
- File I/O (BufferedReader)
- Collections (ArrayList)

## How to Run
```bash
javac -d out src/*.java
java -cp out Main
