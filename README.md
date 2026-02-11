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

## 📘 Week 4 – Day 5: Regex & JUnit | Validation & Test Automation in Java

On **Day 5 of Week 4**, I practiced **Java Regular Expressions (Regex)** and **JUnit testing** to strengthen **string validation, data extraction**, and **automated unit testing**.
The focus was on **real-world input handling** and **reliable test-driven development**.

---

## 🧠 Key Concepts Covered

### 🔹 Java Regex

* Input validation (username, license plate, hex color, IP, SSN)
* Data extraction (emails, dates, URLs, capitalized words)
* Text replacement (spaces cleanup, bad-word censoring)

### 🔹 JUnit Testing

* Unit testing using **JUnit 4 & 5**
* Assertions and exception testing
* Lifecycle annotations (`@BeforeEach`, `@AfterEach`)
* Parameterized and performance tests

---

## 🛠️ Implementations

### ✅ Regex Tasks

* Username, credit card, IP & SSN validation
* Email, URL, date & currency extraction
* Repeating word detection
* Text cleanup and censoring

### 🧪 JUnit Tasks

* Calculator and String utility tests
* List operations testing
* Exception handling validation
* File handling tests
* Banking, password, date & conversion testing

---

## 🔗 Code Links

🔹 **Regex**
👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/regex](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/regex)

🔹 **JUnit Testing**
👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/junittesting](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/junittesting)


---


## 📘 Week 4 – Day 6: Scenario-Based Systems | Collections, Generics, I/O & Regex in Java

On **Day 6 of Week 4**, I worked on **real-world, scenario-based applications** combining **Java Collections, Generics, I/O Streams, Regex, and Exception Handling**.
The focus was on **data processing pipelines**, **file-based systems**, and **scalable collection-driven design**.

---

## 🧠 Core Concepts Applied

* **Collections Framework** – List, Set, Map, PriorityQueue
* **Generics** – Type-safe, reusable system design
* **I/O Streams** – File reading, writing, serialization
* **Regular Expressions** – Validation, extraction, pattern detection
* **Exception Handling** – Graceful handling of invalid or corrupt data
* **Sorting & Grouping** – Using Maps, Sets, and Queues effectively

---

## 🛠️ Scenario-Based Applications Implemented

### 📄 ResumeAnalyzer – Smart Resume Filtering System

* Read `.txt` and `.pdf` resumes from folders using I/O streams
* Extract email, phone, and keywords (Java, Python, Spring) using Regex
* Indexed resumes using `Map<String, ResumeData>` (email as key)
* Sorted candidates by keyword match count
* Skipped invalid resumes using exception handling

---

### ✈️ TravelLog – Trip Organizer for Backpackers

* Serialized trip objects using `ObjectOutputStream`
* Extracted visited cities using Regex
* Identified trips longer than 5 days
* Stored unique countries using `Set`
* Found top 3 most visited cities using `Map<City, Integer>` with sorting
* Supported file-based persistence and summary generation

---

### 📝 FeedbackGuru – Smart Survey Analyzer

* Read multiple `.txt` feedback files using I/O
* Extracted ratings (e.g., `8/10`, `9/10`) using Regex
* Grouped feedback into **Positive / Neutral / Negative**
* Used `Map<String, List<String>>` for categorization
* Applied Generics for flexible feedback types
* Handled malformed data safely

---

### 🧹 CodeRepoCleaner – Java File Scanner & Organizer

* Scanned nested folders for `.java` files
* Used Regex to detect:

  * Invalid method naming conventions
  * Unused imports
* Categorized files into **Valid / Warnings / Errors**
* Used `List`, `Map`, and `Set` for file classification
* Enabled filtering by file size and modification date

---

### 🧪 ExamScanner – Digital Answer Sheet Validator

* Read `.csv` answer sheets using `BufferedReader`
* Parsed and validated answers with Regex
* Compared responses with answer keys
* Used Generics for multiple subject types
* Stored scores using `Map<Student, Score>`
* Ranked results using `PriorityQueue`
* Detected formatting issues (missing/extra commas)

---

## 📌 Learning Outcomes

✔ Integrated Collections with I/O and Regex
✔ Designed scalable, file-driven systems
✔ Used Generics for flexibility and type safety
✔ Applied Maps, Sets, and Queues effectively
✔ Built real-world data processing pipelines

---

## 🔗 Code Link – Scenario-Based Java Collections

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/scenarioBasedQuestions/src/com](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/scenarioBasedQuestions/src/com)

---

# 📘 BridgeLabz Training – Java Collections

## 📘 Week 4 – Day 7: Scenario-Based Systems | Collections, IO, Regex & Generics

On **Day 7 of Week 4**, I built **real-world, scenario-based Java applications** by integrating **Java Collections, I/O Streams, Regex, Generics, and Custom Exceptions**.
The focus was on **file-driven data processing**, **categorization**, **validation**, and **scalable system design**.

---

## 🧠 Core Concepts Applied

* **Java Collections** – List, Set, Map, TreeMap, PriorityQueue
* **I/O Streams** – FileReader, BufferedReader, FileInputStream
* **Regex** – Date validation, field extraction, format checks
* **Generics** – Extensible, type-safe system design
* **Custom Exceptions** – Domain-specific error handling
* **Sorting & Filtering** – Comparator, TreeMap, Streams

---

## 🛠️ Scenario-Based Applications Implemented

### 🏥 MedInventory – Smart Hospital Inventory Tracker

* Read inventory CSV files using BufferedReader
* Detected expired items using Regex (dd-MM-yyyy)
* Categorized items using `Map<String, List<Item>>`
* Removed duplicates using `Set<Item>` (ItemID-based)
* Generic design for medicines, tools, supplies
* Raised custom exceptions for critically low stock

---

### 💬 ChatLogParser – Messaging Pattern Analyzer

* Parsed chat logs using BufferedReader
* Extracted timestamp, user, message via Regex
* Stored messages in `TreeMap<User, List<Message>>`
* Filtered idle chat using keyword rules
* Used generic `MessageFilter<T>` for flexible filtering

---

### 🎵 SongVault – Personal Music Library Manager

* Read song metadata files using IO streams
* Extracted fields using Regex
* Stored songs in `List<Song>`
* Grouped by genre using `Map<String, List<Song>>`
* Listed unique artists using `Set<String>`
* Enabled filtering & sorting via Java Streams
* Generic support for audio, video, podcasts

---

### 📝 ExamResultUploader – Bulk Marks Processing

* Read CSV marksheets using FileReader & BufferedReader
* Validated format using Regex
* Stored subject-wise marks using `Map<String, List<Integer>>`
* Calculated top scorers using PriorityQueue
* Generic support for different exam types
* Threw custom exceptions for invalid data

---

### 🛒 DealTracker – E-Commerce Discount Validator

* Parsed deal files using FileInputStream
* Extracted dates & percentages via Regex
* Filtered expired deals using `LocalDate`
* Stored valid deals in `Map<String, Deal>`
* Prevented duplicates using `Set<String>`
* Sorted deals by discount using Comparator
* Generic support for cashback & referral offers

---


## 🔗 Code Link – Scenario-Based Java Collections

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/scenarioBasedQuestions/src/com](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/scenarioBasedQuestions/src/com)

---

## 📘 Week 4 – Day 8: Lexical Twist | Advanced String Processing in Java

On this day, I implemented **Lexical Twist**, a **scenario-based string manipulation problem** focusing on **reversal logic, transformations, character analysis, and validations**.
The task emphasized **clean conditional handling**, **string operations**, and **robust input validation**.

---

## 🧠 Concepts Applied

* String reversal & case-insensitive comparison
* Character replacement & transformation
* Vowel vs consonant counting
* Duplicate removal while preserving order
* Input validation (single-word constraint)
* Graceful program termination (no `System.exit(0)`)

---

## 🛠️ Problem Flow

### ✅ If second word is the reverse of the first

* Reverse first word
* Convert to lowercase
* Replace vowels (`a, e, i, o, u`) with `@`
* Print transformed result

---

### ✅ If second word is NOT the reverse

* Combine both words and convert to uppercase
* Count vowels and consonants
* Output based on counts:

  * More vowels → first 2 unique vowels
  * More consonants → first 2 unique consonants
  * Equal →

    ```
    Vowels and consonants are equal
    ```
---

## 🔗 Code Link – Lexical Twist

👉 [https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/advancedquestion/lexicaltwist](https://github.com/Shifa-Khan-05/BridgeLabz-Training/tree/java-collections/java-collections/gcr-codebase/javaCollections/src/com/advancedquestion/lexicaltwist)

---


## 📘 Week 8 – Day 3: Unit Testing with NUnit | Bank Account Test Cases

On this day, I implemented **NUnit test cases** for a `Program` class representing a **Bank Account system**.

The focus was on validating **Deposit and Withdraw operations**, proper **exception handling**, and ensuring **accurate balance updates** using structured unit testing.

---

## 🧠 Concepts Applied

* Unit Testing using **NUnit**
* Test class & method annotations
* Assertion-based validation
* Exception testing
* Balance verification logic
* Single-assert rule per test method

---

## 🛠️ Scenario Overview

The `Program` class contains:

### 🔹 1. Deposit(decimal amount)

* Adds amount to balance
* Throws exception if amount is negative
  → `"Deposit amount cannot be negative"`

### 🔹 2. Withdraw(decimal amount)

* Deducts amount from balance
* Throws exception if amount > balance
  → `"Insufficient funds."`

---

## 🧪 Test Cases Implemented

### ✅ Test_Deposit_ValidAmount()

* Verifies balance increases correctly after deposit
* Uses one `Assert.AreEqual`

### ✅ Test_Deposit_NegativeAmount()

* Ensures exception is thrown for negative deposit
* Validates expected exception

### ✅ Test_Withdraw_ValidAmount()

* Verifies balance decreases correctly after withdrawal
* Uses one `Assert.AreEqual`

### ✅ Test_Withdraw_InsufficientFunds()

* Ensures exception is thrown when withdrawing more than balance
* Validates expected exception

---

## 🧾 Testing Rules Followed

* Added `[TestFixture]` attribute to `UnitTest` class
* Added `[Test]` attribute to each test method
* Used **only one Assert per test method**
* Compared **expected vs actual values properly**

---
