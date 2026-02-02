# 📘 BridgeLabz Training – Java 8 Programming Practice

## 📘 Week 6 – Day 1: Java 8 Features | Streams, Lambdas & Interfaces in Action

On **Day 1 of Week 6**, I practiced **core Java 8 features** by solving **real-world, scenario-based problems**.
The focus was on **Stream API**, **lambda expressions**, **functional interfaces**, **interface enhancements**, and **method references** to build **clean, expressive, and functional-style Java code**.

---

## 🧠 Java 8 Concepts Applied

* **Stream API** – filtering, mapping, sorting, grouping, aggregation
* **forEach()** – iteration with lambdas
* **Functional Interfaces** – Predicate, Function, Runnable
* **Lambda Expressions** – behavior-driven logic
* **Interfaces** – abstraction, default & static methods
* **Marker Interfaces** – tagging behavior
* **Method References** – cleaner functional syntax

---

## 🛠️ Stream API – Scenario-Based Problems

* Top 5 trending movies using `filter()`, `sorted()`, `limit()`
* Doctor availability filtering and specialty-based sorting
* Insurance claim analysis using `groupingBy()` & `averagingDouble()`
* Filtering gym memberships expiring in next 30 days
* Transforming and alphabetically displaying customer names

---

## 🔁 forEach() – Real-Time Operations

* Stock price logging
* Event attendee welcome messages
* IoT sensor readings above threshold
* Email notification broadcasting
* Transaction logging with timestamp

---

## 🧩 Interfaces & Functional Interfaces

### 🔹 Interface Design

* Smart device control (`turnOn()`, `turnOff()`)
* Vehicle rental system
* Digital payment abstraction

### 🔹 Functional Interfaces

* Temperature alert system (`Predicate`)
* String length checker (`Function`)
* Background task execution (`Runnable`)

---

## ⚙️ Interface Enhancements

### 🔹 Static Methods

* Password strength validation
* Unit conversion utilities
* Date formatting helpers

### 🔹 Default Methods

* Refund support in payment gateways
* JSON export in reporting modules
* Smart vehicle dashboard extensions

---

## 🏷️ Marker Interfaces

* Data serialization for backup
* Object cloning using `Cloneable`
* Sensitive data tagging for encryption

---

## 🔗 Code Links

### 🔹 Stream API Practice

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/streamapi](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/streamapi)

### 🔹 Lambda Expressions & Java 8 Features

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/lambdaexpression](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/lambdaexpression)

---

## 📌 Learning Outcomes

✔ Strong hands-on with Java 8 functional programming
✔ Effective use of Streams and lambdas
✔ Designed flexible interface-based systems
✔ Improved code readability and maintainability
✔ Built real-world, behavior-driven solutions

---

## 📘 Week 6 – Day 2: Stream Collectors | Grouping, Aggregation & Statistics in Java

On **Day 2 of Week 6**, I focused on **Java Stream Collectors** to perform **grouping, aggregation, summarization, and statistical analysis** on collections.
The emphasis was on **data transformation**, **insight generation**, and **clean functional-style aggregation logic** using Java 8.

---

## 🧠 Java Collectors Concepts Applied

* `Collectors.groupingBy()` – grouping elements by keys
* `Collectors.toMap()` – building maps from streams
* `Collectors.summingDouble()` – numerical aggregation
* `Collectors.averagingDouble()` – average calculations
* `Collectors.summarizingInt()` – min, max, sum, count, average
* Functional pipelines using **Stream + Collectors**

---

## 🛠️ Scenario-Based Implementations

### 🎓 Student Result Grouping

**Scenario:**
Group students by grade level and collect student names.

**Implementation:**

* Grouped students using `Collectors.groupingBy()`
* Generated `Map<Grade, List<StudentName>>`

---

### 📊 Word Frequency Counter

**Scenario:**
Analyze a paragraph to count word occurrences.

**Implementation:**

* Used `Collectors.toMap()` to build frequency map
* Handled duplicate words with merge logic
* Produced `Map<String, Integer>`

---

### 💰 Order Revenue Summary

**Scenario:**
Calculate total revenue generated per customer.

**Implementation:**

* Aggregated order totals using `Collectors.summingDouble()`
* Generated customer-wise revenue report

---

### 🏢 Employee Salary Categorization

**Scenario:**
Group employees by department and calculate **average salary**.

---

### 📚 Library Book Statistics

**Scenario:**
Analyze books by genre to get reading statistics.

**Implementation:**

* Used `Collectors.summarizingInt()` to compute:

  * Total pages
  * Average pages
  * Maximum pages
* Generated genre-wise statistics summary

---

## 🔗 Code Link – Stream Collectors Practice

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/collectors](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/gcr-codebase/java8ProgrammingPractice/src/com/collectors)

---
