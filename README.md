# 📘 BridgeLabz Training – Java Collections

---

## 📘 Week 4 – Day 1: Java Generics | Type-Safe & Reusable System Design

On **Day 1 of Week 4**, I focused on **Java Generics** to build **type-safe, reusable, and scalable systems**.
The emphasis was on **best practices, bounded type parameters, wildcards, and generic methods**, applied through **real-world scenario-based problems**.

---

## 🧠 Java Generics Best Practices Applied

* Ensured **compile-time type safety**
* Preferred **generic methods** over overloading
* Used **`? extends T`** for read-only access
* Used **`? super T`** for write operations
* Avoided **raw types**
* Applied **bounded type parameters**
* Designed **generic interfaces** for reuse
* Minimized wildcard usage in public APIs
* Avoided **type-erasure pitfalls**
* Favored **composition over inheritance**
* Used meaningful type parameters (`T`, `E`, `K`, `V`)

---

## 🛠️ Scenario-Based Implementations

### 📦 Smart Warehouse Management System

* `WarehouseItem` base class with typed storage
* Generic class: `Storage<T extends WarehouseItem>`
* Wildcard-based item display (`List<? extends WarehouseItem>`)

---

### 🛍️ Dynamic Online Marketplace

* Generic `Product<T>` with bounded categories
* Generic discount method for flexible pricing
* Type-safe mixed product catalog

---

### 🎓 University Course Management System

* `CourseType` abstraction (Exam, Assignment, Research)
* Generic `Course<T extends CourseType>` manager
* Wildcards for dynamic course handling

---

### 🥗 Personalized Meal Plan Generator

* `MealPlan` interface with multiple implementations
* Generic meal handler with validation logic
* Ensured valid meal plan generation

---

### 🤖 AI-Driven Resume Screening System

* `JobRole` base class with multiple roles
* Generic `Resume<T extends JobRole>` processor
* Wildcard-based screening pipeline

---

## 🛠 Tools & Workflow

* **Java (Generics & Collections)**
* **Eclipse IDE**
* **Git & GitHub**
* Clean, modular, reusable design


## 📌 Learning Outcomes

✔ Strong understanding of Java Generics
✔ Effective use of bounds and wildcards
✔ Improved API design and reusability
✔ Built scalable, maintainable systems


## 🔗 Code Link – Java Generics

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/generics](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/generics)

---

## 📘 Week 4 – Day 2: Java Collections Framework | List, Set, Queue & Map in Action

On **Day 2 of Week 4**, I worked extensively with the **Java Collections Framework**, focusing on **List, Set, Queue, and Map interfaces**.
The emphasis was on **problem-solving, data manipulation, performance considerations**, and **real-world system modeling**.


## 🧠 Core Collection Concepts Applied

* Choosing the **right collection** based on use case
* Preserving **order, uniqueness, and sorting**
* Efficient **search, insert, delete, and traversal**
* Combining collections for **real-world systems**
* Performance-aware use of **Hash**, **Linked**, and **Tree** variants

---

## 🛠️ List Interface – Practical Problems

* Reverse a List (ArrayList & LinkedList) without built-in methods
* Find frequency of elements using Map
* Rotate list elements by N positions
* Remove duplicates while preserving order
* Find Nth element from the end (LinkedList, two-pointer technique)

---

## 🛠️ Set Interface – Set Operations & Use Cases

* Check equality of two sets
* Union, intersection, and symmetric difference
* Convert HashSet to sorted List
* Subset validation
* Understanding HashSet vs LinkedHashSet vs TreeSet

---

## 🏥 Insurance Policy Management System (Set-Based)

**Highlights:**

* Stored unique policies using:

  * `HashSet` → fast lookup
  * `LinkedHashSet` → insertion order
  * `TreeSet` → sorted by expiry date
* Retrieved:

  * All unique policies
  * Policies expiring within 30 days
  * Policies by coverage type
  * Duplicate policies by policy number
* Compared performance of different Set implementations

---

## 🛠️ Queue Interface – Scheduling & Processing

* Reverse a queue using only queue operations
* Generate binary numbers using Queue
* Hospital triage system using PriorityQueue
* Implement Stack using two Queues
* Circular buffer simulation using array-based queue

---

## 🛠️ Map Interface – Data Mapping & Aggregation

* Word frequency counter using HashMap
* Invert a map while handling duplicate values
* Find key with highest value
* Merge two maps with value summation
* Group objects by property using Map<K, List<V>>

---

## 🏦 Real-World Map-Based Systems

### 📄 Insurance Policy Management (Map-Based)

* HashMap → policy number mapping
* LinkedHashMap → insertion order
* TreeMap → sorted by expiry date
* Retrieve, filter, and remove expired policies

---

### 🗳 Voting System

* HashMap → vote counting
* TreeMap → sorted result display
* LinkedHashMap → vote order tracking

---

### 🛒 Shopping Cart System

* HashMap → product pricing
* LinkedHashMap → item insertion order
* TreeMap → sorted price display

---

### 🏦 Banking System

* HashMap → account storage
* TreeMap → balance-based sorting
* Queue → withdrawal request processing

---

## 🛠 Tools & Workflow

* **Java (Collections Framework)**
* **Eclipse IDE**
* **Git & GitHub**
* Clean, modular, problem-driven implementations

## 🔗 Code Link – Java collections

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com)

---
