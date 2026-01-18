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

---

## 📌 Learning Outcomes

✔ Strong understanding of Java Generics
✔ Effective use of bounds and wildcards
✔ Improved API design and reusability
✔ Built scalable, maintainable systems

---

## 🔗 Code Link – Java Generics

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/generics](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/generics)

---
