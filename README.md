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

Here’s a **clean, concise, GitHub-ready Day README.md** for your **Java Collections (Streams & I/O) branch**, written in the **same professional style** as your previous collections days.

You can **directly add this as a new day file**.

---

## 📘 Week 4 – Day 3: Java I/O Streams & File Handling | Practical Data Processing

On **Day 3 of Week 4**, I worked on **Java I/O Streams and File Handling**, focusing on **efficient data transfer, serialization, inter-thread communication**, and **large-file processing**.
The emphasis was on **performance, correctness, and real-world usage of Java stream APIs**.

---

## 🧠 Core Java I/O Concepts Applied

* Byte Streams vs Character Streams
* Buffered vs Unbuffered I/O performance
* Object Serialization & Deserialization
* Stream-based inter-thread communication
* Efficient large-file processing
* Resource handling and exception management

---

## 🛠️ Problems Implemented

### 📄 File & Buffered Streams

* Read from one file and write to another using `FileInputStream` / `FileOutputStream`
* High-performance file copy using `BufferedInputStream` & `BufferedOutputStream`
* Chunk-based I/O (4 KB) with execution time comparison

---

### ⌨️ Console Input & File Output

* Read user input using `BufferedReader`
* Persist user data using `FileWriter`

---

### 📦 Object Serialization

* Serialize & deserialize a list of `Employee` objects
* Used `ObjectOutputStream` and `ObjectInputStream`
* Handled `IOException` and `ClassNotFoundException`

---

### 🖼 ByteArray Streams

* Converted image files to byte arrays
* Reconstructed image using `ByteArrayInputStream` & `ByteArrayOutputStream`
* Verified file integrity

---

### 🔤 Filter & Data Streams

* Converted file content from uppercase to lowercase
* Stored & retrieved primitive data using `DataOutputStream` / `DataInputStream`

---

### 🔄 Piped Streams (Multithreading)

* Implemented inter-thread communication
* Used `PipedOutputStream` and `PipedInputStream`
* Synchronized producer–consumer threads

---

### 📑 Large File Processing

* Read very large files line-by-line (500MB+)
* Filtered and displayed lines containing `"error"` (case-insensitive)

---

### 📊 Word Frequency Analysis

* Counted word occurrences using `HashMap`
* Displayed top 5 most frequent words
* Sorted results by frequency

---

## 🛠 Tools & Workflow

* **Java (I/O Streams & Collections)**
* **Eclipse IDE**
* **Git & GitHub**
* Performance-aware, memory-efficient implementations

---

## 🔗 Code Link – Java Streams & File Handling

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/javastreams](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/javastreams)

---

## 📘 Week 4 – Day 4: Exception Handling in Java | Robust & Fault-Tolerant Programs

On **Day 4 of Week 4**, I practiced **Java Exception Handling** to build **robust, user-friendly, and fault-tolerant applications**.
The focus was on handling **checked, unchecked, and custom exceptions**, along with **proper propagation, resource management, and clean error handling**.

---

## 🧠 Exception Handling Concepts Applied

* Checked vs Unchecked Exceptions
* Custom (User-Defined) Exceptions
* Multiple catch blocks
* `throw` vs `throws`
* Exception propagation across methods
* `finally` block execution
* try-with-resources for auto-closing resources
* Nested try-catch blocks

---

## 🛠️ Practice Problems Implemented

### 📄 Checked Exception – File Reading

* Read `data.txt`
* Handled `IOException`
* Displayed user-friendly message when file not found

---

### ➗ Unchecked Exceptions – Division Program

* Handled:

  * `ArithmeticException` (division by zero)
  * `InputMismatchException` (invalid input)
* Safe user input validation

---

### 🚫 Custom Exception – Age Validation

* Created `InvalidAgeException`
* Threw exception if age < 18
* Displayed meaningful validation message

---

### 📦 Multiple Catch Blocks

* Array element access by index
* Handled:

  * `ArrayIndexOutOfBoundsException`
  * `NullPointerException`

---

### 🔒 try-with-resources

* Read first line from `info.txt`
* Automatically closed `BufferedReader`
* Handled `IOException` cleanly

---

### 🔁 throw vs throws

* Interest calculation method
* Threw `IllegalArgumentException` for invalid inputs
* Exception propagated and handled in `main()`

---

### ✅ finally Block Execution

* Demonstrated guaranteed execution of `finally`
* Printed completion message regardless of exception

---

### 🔗 Exception Propagation

* Exception thrown in one method
* Propagated through method calls
* Handled centrally in `main()`

---

### 🧩 Nested try-catch

* Handled array index errors and division by zero
* Clear, specific error messages

---

### 🏦 Bank Transaction System

* Custom `InsufficientBalanceException`
* Validated withdrawal amount
* Handled business-logic exceptions cleanly

---

## 🔗 Code Link – Exception Handling Practice

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/exceptions](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/exceptions)

---
