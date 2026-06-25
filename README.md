# 🎓 College Placement Portal

A Java Swing and MySQL based desktop application that streamlines the college placement process by connecting students, companies, and administrators through a centralized platform.

---

## 📌 Features

### 👨‍🎓 Student Module
- Student Registration
- Secure Student Login
- View Available Companies
- Apply for Jobs
- Track Application Status
- View Student Dashboard
- Logout Functionality

### 👨‍💼 Admin Module
- Admin Login
- Add New Companies
- Add Job Opportunities
- View Student Applications
- Update Application Status
- Manage Placement Activities

---

## 🛠️ Technologies Used

- Java
- Java Swing (GUI)
- MySQL
- JDBC
- Object-Oriented Programming (OOP)

---

## 📂 Project Structure

```text
src
├── database
├── dao
├── model
├── ui
└── Main
```

---

## 🗄️ Database

The project uses MySQL as the backend database.

Main tables:

- students
- companies
- jobs
- applications

Database export file:

```text
placement_portal.sql
```

Import this file into MySQL before running the application.

---

## 🚀 How to Run

### 1. Clone Repository

```bash
git clone https://github.com/bhumisaini07/College-Placement-Portal.git
```

### 2. Import Database

- Open MySQL Workbench
- Create a database
- Import `placement_portal.sql`

### 3. Configure Database Connection

Update database credentials in:

```text
DBConnection.java
```

Example:

```java
String url = "jdbc:mysql://localhost:3306/placement_portal";
String username = "root";
String password = "your_password";
```

### 4. Run Application

Run:

```text
Main.java
```

---
## 🎯 Learning Outcomes

Through this project I gained hands-on experience in:

- Java Swing GUI Development
- JDBC Connectivity
- MySQL Database Design
- CRUD Operations
- Event Handling
- Object-Oriented Programming
- Software Project Structure
- Git & GitHub Version Control

---

## 🔮 Future Improvements

- Student Profile Management
- Resume Upload Feature
- Company-wise Job Filtering
- Search and Sort Functionality
- Password Encryption
- Email Notifications
- Modern UI Design

---

## 👩‍💻 Author

**Bhumi Saini**

GitHub: https://github.com/bhumisaini07

---

⭐ If you found this project useful, consider giving it a star.
