# 📚 Student Management REST API

A Spring Boot REST API for managing student records using PostgreSQL and Spring Data JPA.

---

## 🚀 Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Postman (API Testing)

---

## 🏗️ Architecture

Controller → Service → Repository → Database

This project follows a layered architecture:

- **Controller Layer** → Handles HTTP requests
- **Service Layer** → Business logic
- **Repository Layer** → Database interaction using JPA
- **Model Layer** → Entity classes mapped to database tables

---

## 📌 Features

- ✅ Add Student
- ✅ Get All Students
- ✅ Get Student by ID
- ✅ Update Student
- ✅ Delete Student
- ✅ Exception Handling (404 Not Found)

---

## 🗄️ Database Configuration

PostgreSQL is used as the database.

Make sure you create a database:

```sql
CREATE DATABASE studentdb;
