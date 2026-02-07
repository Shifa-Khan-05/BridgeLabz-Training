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

## 📘 Week 6 – Day 3: Lambda Expressions & Stream API | Real-Time Scenarios

On **Day 3 of Week 6**, I practiced **Java 8 functional programming** by solving **real-time, scenario-based problems** using **Lambda Expressions** and the **Stream API**.
The focus was on **clean functional logic, data filtering, sorting, grouping, and aggregation**.

---

## 🧠 Core Java 8 Concepts Applied

* **Lambda Expressions**
* **Stream API**
* **Functional Interfaces**
* **Filtering, Mapping & Sorting**
* **Grouping & Aggregation**
* **Min / Max & Ranking operations**
* **FlatMap & Collection processing**
* **Matching & Conditional checks**

---

## 🛠️ Scenario-Based Implementations

### 🎓 Student / School System

* Pass/fail checks, sorting by rank & name
* Age-based filtering
* Department, city, and gender analysis
* Ranking (top, bottom, even/odd ranks)
* Grouping, averaging, partitioning
* Contact handling using `flatMap`

---

### 🧑‍💼 Employee / Office System

* Bonus calculation & promotion eligibility
* Salary-based filtering and ranking
* Gender & department-wise analytics
* Experience, joining year, and pay analysis
* Highest / lowest / top-N salary queries

---

### 🛒 Shopping / E-Commerce

* Discount application
* Price-based sorting
* Free delivery eligibility
* Final bill calculation
* Product display using lambdas

---

### 🏦 Banking / Finance

* Minimum balance validation
* Interest calculation
* Withdrawal validation
* Balance comparison
* Account data processing

---

### ⚙️ System & Utility Tasks

* Runnable tasks using lambdas
* Even/odd checks
* Mathematical operations
* List processing using `forEach`

---

## 🔗 Code Link – Java 8 Scenario-Based Practice

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenarioBasedQuestions/src/com](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenarioBasedQuestions/src/com)

---

## 📌 Learning Outcomes

✔ Strong command over Lambda Expressions
✔ Real-world Stream API problem solving
✔ Advanced filtering, grouping & ranking
✔ Clean functional-style Java coding
✔ Interview-ready Java 8 practice

---

## 📘 Week 6 – Day 4: Java 8 Features | Smart City Transport & Service Management System

On **Day 4 of Week 6**, I designed a **Smart City Transport & Service Management System** using **modern Java 8 features**.
The focus was on **functional programming, interface enhancements, stream-based data processing**, and **extensible system design**.

---

## 🧠 Java 8 Features Applied

* **Lambda Expressions** – filtering & sorting transport schedules
* **Method References** – logging, printing services, utility calls
* **Stream API** – grouping passengers, revenue aggregation, top routes
* **forEach()** – real-time dashboard updates
* **Collectors**:

  * `groupingBy()` – passengers by route
  * `partitioningBy()` – peak vs non-peak trips
  * `summarizingDouble()` – fare statistics
* **Functional Interfaces** – `FareCalculator` implemented via lambdas
* **Default Methods** – shared service behavior in interfaces
* **Static Interface Methods** – distance calculation utilities
* **Marker Interfaces** – emergency service prioritization

---

## 🛠️ Scenario-Based System Implemented

### 🚍 Smart City Transport & Service Management System

**Services Supported:**

* Bus
* Metro
* Taxi
* EV Charging (extensible to Ferry, Bike Rental)

**Design Highlights:**

* `TransportService` interface with default methods
* Implementations: `BusService`, `MetroService`, `TaxiService`
* `GeoUtils` static methods for distance calculation
* Emergency services detected using marker interface
* Clean extension without modifying existing code

---

## 🔁 Real-Time Flow

1. Passenger books a trip → Lambdas filter & sort services
2. Live dashboard updates → `forEach()` displays schedules
3. Revenue reports generated → Collectors summarize data
4. New service added → Implement interfaces only
5. Emergency detected → Marker interface prioritizes service

---

## 🔗 Code Link – Smart City Transport System

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenarioBasedQuestions/src/com/workshop/smartcitytransport](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java8-programming-practice/java8-programming-practice/scenarioBasedQuestions/src/com/workshop/smartcitytransport)

---
