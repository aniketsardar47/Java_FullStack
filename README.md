# Java FullStack Development Repository

Welcome to the comprehensive repository for Java Full-Stack development. This repository tracks daily learning logs, structural implementations, core algorithmic concepts, and end-to-end assignments.

---

## ⚡ Quick Navigation

Use the quick links below to jump directly to specific daily tracks or practical assignment modules.

### 📅 Daily Learning Track
| | | |
| :---: | :---: | :---: |
| [📂 Day 1 Module](src/com.Day1) | [📂 Day 3 Core](src/com.Day3) | [📂 Day 3 Library](src/com.Day3.Library) |
| [📂 Day 4 Bank](src/com.Day4.Bank) | [📂 Day 4 DataStructures](src/com.Day4.datastructures) | [📂 Day 4 Stock](src/com.Day4.stock) |
| [📂 Day 5 Collection](src/com.Day5.collection) | [📂 Day 5 DAO](src/com.Day5.dao) | [📂 Day 5 POJO](src/com.Day5.pojo) |
| [📂 Day 5 Resources](src/com.Day5.ResourceBundler) | [📂 Day 5 Service](src/com.Day5.service) | [📂 Day 5 Testing](src/com.Day5.test) |
| [📂 Day 6 Core](src/com.Day6) | [📂 Day 6 Comparators](src/com.Day6.Comparators) | [📂 Day 6 File IO](src/com.Day6.Files) |
| [📂 Day 6 Streams](src/com.Day6.StreamsAPI) | [📂 Day 6 Streams Pro](src/com.Day6.StreamsAPI.program) | [📂 Shopping App](src/com.shoppingApp) |

### 🏆 Practical Assignments
| | |
| :---: | :---: |
| [🏏 IPL Dashboard Core](src/Assignment.IPL) | [🏢 IPL DAO Layer](src/Assignment.IPL.dao) |
| [📦 IPL POJO Models](src/Assignment.IPL.pojo) | [⚙️ IPL Service Layer](src/Assignment.IPL.service) |

---

## 🛠️ Tech Stack & Environment
* **Language:** Java (SE-20)
* **IDE:** Eclipse IDE
* **Database Driver:** MySQL Connector/J (`mysql-connector-j-9.5.0.jar`)
* **Architecture:** Layered Architecture (POJO, DAO, Service, Presentation Client)

---

## 📂 Structural Overview

### 1. `src/com.DayX`
Contains daily lecture examples, experimentative snippets, and foundational drills including:
* Core structural programs and standard arrays.
* Object-Oriented paradigms, custom Exception Handling, and File input/output streams.
* Extensive implementations of the Java Collections Framework and the functional Streams API.

### 2. `src/Assignment.IPL`
An industry-grade, menu-driven command-line dashboard simulation managing an Indian Premier League (IPL) roster database setup:
* **`pojo`**: Plain Old Java Objects mapped directly to schema configurations (`Player`, `Team`).
* **`dao`**: Data Access Object structural contracts utilizing database drivers (`DBUtil`/`JDBCFactory`) to decouple storage logic from operational rules.
* **`service`**: Robust validation layers evaluating relational limits before hitting database transactions.
* **`TestIPL`**: Clean terminal console prompt taking streaming interface controls for automated adjustments.
