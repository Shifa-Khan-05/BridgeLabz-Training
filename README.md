# 📘 BridgeLabz Training – MySQL JDBC Practice

## 📘 Week 8 - Day 1 : Database Programming with Java (JDBC)

During this week, I worked on **hands-on Java JDBC practice**, focusing on **database connectivity, CRUD operations, transaction management**, and **real-world database-driven applications** using **MySQL**.

---

## 🧠 Core Concepts Covered

* JDBC architecture and workflow
* MySQL database connectivity
* CRUD operations using `PreparedStatement`
* Transaction management (`commit`, `rollback`)
* Exception handling in database operations
* Search and filtering using SQL queries
* Mapping database records to Java objects

---

## 🛠️ Practice Exercises Implemented

### 👨‍💼 Exercise 1: Employee Management System (CRUD)

A console-based application supporting:

* Add new employees
* View all employee records
* Update employee salary
* Delete employee details
* Search employee by name

**Focus:**
CRUD operations, prepared statements, result set processing

---

### 🏦 Exercise 2: Banking System – Transaction Management

Implemented a banking system with:

* Money transfer between accounts using transactions
* Balance checking
* Transaction history tracking
* Proper rollback on failure

**Focus:**
ACID properties, transaction safety, error handling

---

### 📚 Exercise 3: Library Management System (Advanced)

A database-driven library system supporting:

* Book inventory management
* Student borrowing records
* Fine calculation for late returns
* Search functionality with multiple filters

**Focus:**
Relational data handling, joins, real-world query design

---

## 📌 Learning Outcomes

✔ Strong understanding of JDBC fundamentals
✔ Hands-on experience with MySQL integration
✔ Implemented safe transaction handling
✔ Designed real-world database-backed systems
✔ Improved SQL + Java integration skills

---

## 🔗 Code Link – MySQL JDBC Practice

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/mysql-jdbc-practice](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/mysql-jdbc-practice)

---

## 📘 Week 8 – Day 2: Scenario-Based JDBC | Hospital Management System

On this day, I implemented a **real-world Hospital Management System** using **Java + MySQL (JDBC)**.
The focus was on **end-to-end database design**, **transaction handling**, **multi-table queries**, and **secure data operations** using JDBC.

---

## 🏥 Project: Hospital Management System

A complete **scenario-based application** covering **patients, doctors, appointments, visits, billing, and administration**.

---

## 🧠 Key Modules Implemented

### 👤 Patient Management

* Register new patients with uniqueness validation (phone/email)
* Update patient details using `UPDATE` with `WHERE`
* Search patients using `LIKE` and exact match
* View patient visit history using multi-table `JOIN`

---

### 👨‍⚕️ Doctor Management

* Add doctor profiles with specialization
* Assign / update doctor specialties with transactions
* View doctors by specialty using `JOIN`
* Soft delete doctor profiles after appointment validation

---

### 📅 Appointment Scheduling

* Book appointments with availability checks
* Prevent SQL injection using `PreparedStatement`
* Cancel and reschedule appointments with audit logging
* View daily schedules using `ORDER BY` and joins

---

### 🩺 Visit & Medical Records

* Record visits and update appointment status atomically
* View complete medical history (visits + prescriptions)
* Batch insert prescriptions for performance

---

### 💳 Billing & Payments

* Generate bills using aggregate functions (`SUM`)
* Record payments with transactional consistency
* View outstanding bills grouped by patient
* Generate revenue reports by date, doctor, and specialty

---

### ⚙️ System Administration

* Manage specialty lookup tables
* Trigger database backups using JDBC metadata
* View audit logs generated via database triggers

---

## 🧩 JDBC & Database Concepts Applied

✔ Primary & Foreign Keys
✔ Auto-increment IDs
✔ INNER / LEFT JOINs
✔ Transactions (COMMIT / ROLLBACK)
✔ PreparedStatements
✔ Batch operations
✔ Aggregate functions (COUNT, SUM, AVG)
✔ Subqueries & correlated queries
✔ Indexing for performance
✔ ResultSet navigation & metadata
✔ Audit logging via triggers

---

## 🔗 Code Link – Hospital Management System (JDBC)

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/mysql-jdbc-practice/mysql-jdbc-practice/scenarioBasedQuestion/src/com/hospitalmanagementsystem](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/mysql-jdbc-practice/mysql-jdbc-practice/scenarioBasedQuestion/src/com/hospitalmanagementsystem)

---
