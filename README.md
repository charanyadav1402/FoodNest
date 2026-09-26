# 🍴 FoodNest – Food E-Commerce Web Application

FoodNest is a **food-focused e-commerce web application** developed using **Java and Spring Boot**. The application allows users to browse food products and provides an admin interface for managing food categories and products.

## 📌 Project Overview

FoodNest provides a simple web-based platform for managing and displaying food products online. It includes an administrative section where categories and products can be added, updated, and deleted.

The project is designed to demonstrate the development of a complete web application using **Spring Boot, Spring Data JPA, MySQL, and Thymeleaf**.

## ✨ Features

* 🏠 User-friendly web interface
* 🍔 Food product management
* 📂 Category management
* ➕ Add food products
* ✏️ Update product information
* 🗑️ Delete products and categories
* 🖼️ Upload and manage product images
* 💰 Product price management
* ⚖️ Product weight management
* 📝 Product description management
* 🔐 Admin login interface
* 🗄️ MySQL database integration

## 🛠️ Technologies Used

| Technology      | Purpose                      |
| --------------- | ---------------------------- |
| Java            | Backend programming          |
| Spring Boot     | Application framework        |
| Spring MVC      | Web application architecture |
| Spring Data JPA | Database operations          |
| Hibernate       | ORM                          |
| MySQL           | Database                     |
| Thymeleaf       | Server-side HTML rendering   |
| HTML            | Web page structure           |
| CSS             | Styling                      |
| Bootstrap       | UI design                    |
| Maven           | Dependency management        |
| Eclipse         | Development environment      |

## 🏗️ Project Structure

```text
FoodNest
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.project
│   │   │       ├── controller
│   │   │       ├── entity
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── dto
│   │   │
│   │   └── resources
│   │       ├── static
│   │       │   ├── css
│   │       │   ├── js
│   │       │   └── productImages
│   │       │
│   │       ├── templates
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## 🗄️ Database

FoodNest uses **MySQL** as its relational database.

The application stores information such as:

* Food categories
* Food products
* Product prices
* Product descriptions
* Product weights
* Product images

Example database configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/eproject
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

> ⚠️ Never commit real database passwords, API keys, or other sensitive credentials to a public GitHub repository.

## 🚀 Getting Started

### Prerequisites

Make sure you have the following installed:

* Java JDK
* Maven
* MySQL
* Eclipse or another Java IDE
* Git

### 1. Clone the repository

```bash
git clone https://github.com/charanyadav1402/FoodNest.git
```

### 2. Open the project

Open the cloned project in Eclipse or your preferred Java IDE.

### 3. Configure MySQL

Create the database:

```sql
CREATE DATABASE eproject;
```

Update your database configuration in:

```text
src/main/resources/application.properties
```

### 4. Build the project

Using Maven:

```bash
mvn clean install
```

### 5. Run the application

You can run the Spring Boot application from Eclipse or using:

```bash
mvn spring-boot:run
```

The application will be available at:

```text
http://localhost:8086
```

## 📸 Application

FoodNest provides interfaces for:

* Admin login
* Category management
* Product management
* Food product creation
* Product image uploading
* Product information management

## 🔮 Future Enhancements

The project can be extended with:

* 👤 User registration and authentication
* 🛒 Shopping cart
* 📦 Order management
* 💳 Online payment integration
* 🔍 Product search
* 🔎 Product filtering
* ⭐ Product reviews and ratings
* ❤️ Wishlist
* 📱 Responsive mobile interface
* 📧 Order notifications
* ☁️ Cloud deployment
* 🔐 Enhanced application security

## 🎯 Project Objective

The main objective of FoodNest is to build a practical food e-commerce web application while gaining hands-on experience with **Java, Spring Boot, MVC architecture, database management, REST/web development, and frontend integration**.

## 👨‍💻 Developer

**Golla Charan Yadav**

B.Tech – Computer Science and Engineering (AI & ML)

## 📄 License

This project is created for educational and portfolio purposes.
