# Low-Level Design — Practice Roadmap

A practical collection of **20 Low-Level Design (LLD) case studies** to build strong skills in Object-Oriented Design, SOLID principles, class relationships, responsibilities, extensibility, and maintainable Java code.

> **Goal:** Learn to design systems from requirements, not memorize a single "correct" solution.
> There can be multiple valid LLD designs as long as they are reasonable, maintainable, extensible, and satisfy the requirements.

---

## LLD Case Studies

| #  | Case Study                    | Main Learning                                        | Difficulty  |
| -- | ----------------------------- | ---------------------------------------------------- | ----------- |
| 1  | **Parking Lot**               | OOP, SOLID, composition, responsibilities            | Easy        |
| 2  | **Vending Machine**           | State-based behavior, transactions                   | Easy        |
| 3  | **Library Management System** | Entity relationships, services, responsibilities     | Easy        |
| 4  | **Tic-Tac-Toe**               | Abstraction, game logic, extensibility               | Easy        |
| 5  | **ATM**                       | State transitions, transactions, responsibility      | Easy–Medium |
| 6  | **Car Rental System**         | Relationships, availability, business rules          | Medium      |
| 7  | **Hotel Booking System**      | Booking lifecycle, availability, business rules      | Medium      |
| 8  | **Movie Ticket Booking**      | Booking lifecycle, seats, concurrency considerations | Medium      |
| 9  | **Splitwise**                 | Business logic, expense management, extensibility    | Medium      |
| 10 | **Elevator System**           | Scheduling, state, object interaction                | Medium      |
| 11 | **Food Delivery System**      | Multiple entities, order lifecycle, interactions     | Medium      |
| 12 | **Chess**                     | Complex relationships, game rules, extensibility     | Medium–Hard |
| 13 | **Payment System**            | Payment processing, integrations, extensibility      | Medium–Hard |
| 14 | **Notification System**       | Multiple notification channels, extensibility        | Medium–Hard |
| 15 | **Logging Framework**         | Logging architecture, handlers, extensibility        | Medium–Hard |
| 16 | **Cache**                     | Data structures, eviction policies, interfaces       | Hard        |
| 17 | **Rate Limiter**              | Algorithms, request control, state                   | Hard        |
| 18 | **File System**               | Hierarchical/recursive object structures             | Hard        |
| 19 | **Ride Sharing System**       | Matching, trip lifecycle, multiple interactions      | Hard        |
| 20 | **Meeting Room Booking**      | Scheduling, conflicts, availability                  | Hard        |

---

# How Each Case Study Will Be Practiced

For every system, follow the same process:

```text
Requirements
     ↓
Actors
     ↓
Use Cases
     ↓
Entities
     ↓
Responsibilities
     ↓
Relationships
     ↓
Interfaces / Abstractions
     ↓
SOLID Review
     ↓
Design Patterns — ONLY IF NEEDED
     ↓
Class Design
     ↓
Java Implementation
     ↓
Test Cases
     ↓
Design Review
     ↓
Requirement Changes
```

The important part is that **patterns are not forced into the design**.

If the requirement doesn't need a pattern, don't use one.

---

# Phase 1 — Core LLD

Focus on getting comfortable with the fundamentals of LLD.

### 1. Parking Lot

Learn:

* Classes and objects
* Composition
* Vehicle hierarchy
* Parking spot management
* Pricing
* SOLID
* Service-layer responsibility

**Status:** Done

---

### 2. Vending Machine

Learn:

* State-based behavior
* Transactions
* Product inventory
* Validation
* State transitions
* Refund/change handling

**Status:** Done

---

### 3. Library Management System

Learn:

* Entity relationships
* Book/member management
* Borrowing and returning
* Service responsibilities
* Basic business rules

**Status:** Next

---

### 4. Tic-Tac-Toe

Learn:

* Game state
* Board representation
* Player abstraction
* Winning conditions
* Extensible game logic

---

### 5. ATM

Learn:

* State transitions
* Account operations
* Cash withdrawal
* Transaction handling
* Responsibility separation

---

### 6. Car Rental System

Learn:

* Vehicle management
* Rental lifecycle
* Availability
* Pricing
* Customer/rental relationships

---

### 7. Hotel Booking System

Learn:

* Room management
* Availability
* Reservations
* Booking lifecycle
* Cancellation

---

### 8. Movie Ticket Booking

Learn:

* Movie/show/seat relationships
* Seat availability
* Booking lifecycle
* Payment
* Concurrency considerations

---

# Phase 2 — Intermediate LLD

These systems have more entities and interactions.

### 9. Splitwise

Learn:

* Expense management
* User relationships
* Balance calculation
* Business rules
* Extensible expense logic

---

### 10. Elevator System

Learn:

* Elevator state
* Floor requests
* Scheduling
* Multiple elevators
* Request handling

---

### 11. Food Delivery System

Learn:

* Order lifecycle
* Restaurant/customer/delivery relationships
* Order status
* Multiple interacting services
* Extensibility

---

### 12. Chess

Learn:

* Complex object relationships
* Board and pieces
* Movement rules
* Game state
* Extensible rule design

---

# Phase 3 — Advanced LLD

These systems require stronger architectural thinking.

### 13. Payment System

Learn:

* Payment lifecycle
* Payment providers
* External integrations
* Failure handling
* Extensible design

---

### 14. Notification System

Learn:

* Multiple notification channels
* Email/SMS/push
* Notification lifecycle
* Extensibility
* Separation of concerns

---

### 15. Logging Framework

Learn:

* Logging levels
* Multiple handlers
* Log formatting
* Extensibility
* Request processing flow

---

### 16. Cache

Learn:

* Cache abstraction
* Storage
* Eviction policies
* Interfaces
* Performance considerations

---

### 17. Rate Limiter

Learn:

* Request limiting
* Time windows
* Algorithms
* State management
* Extensibility

---

### 18. File System

Learn:

* Hierarchical structures
* Parent-child relationships
* Recursive design
* Files and directories
* Tree traversal

---

### 19. Ride Sharing System

Learn:

* Driver/rider relationships
* Driver matching
* Trip lifecycle
* Location
* Dynamic business rules

---

### 20. Meeting Room Booking

Learn:

* Room availability
* Scheduling
* Conflict detection
* Booking lifecycle
* Time-based business rules

---

# Pattern Implementation — Final Phase

Design patterns should **not be forced into the above 20 systems**.

After completing the case studies, revisit the patterns separately and implement the ones that need coding practice.

## Creational Patterns

| Pattern              | Core Idea                                  |
| -------------------- | ------------------------------------------ |
| **Factory**          | Centralize/abstract object creation        |
| **Abstract Factory** | Create related families of objects         |
| **Builder**          | Construct complex objects step-by-step     |
| **Singleton**        | Ensure a single instance                   |
| **Prototype**        | Create objects by cloning existing objects |

## Structural Patterns

| Pattern       | Core Idea                                          |
| ------------- | -------------------------------------------------- |
| **Adapter**   | Make incompatible interfaces work together         |
| **Decorator** | Add behavior without modifying the original object |
| **Facade**    | Provide a simple interface to a complex subsystem  |
| **Composite** | Treat individual and groups uniformly              |
| **Proxy**     | Control access to another object                   |
| **Bridge**    | Separate abstraction from implementation           |

## Behavioral Patterns

| Pattern                     | Core Idea                                            |
| --------------------------- | ---------------------------------------------------- |
| **Strategy**                | Switch between interchangeable algorithms            |
| **Observer**                | Notify dependent objects about changes               |
| **State**                   | Change behavior based on current state               |
| **Command**                 | Encapsulate an operation as an object                |
| **Chain of Responsibility** | Pass a request through a chain of handlers           |
| **Template Method**         | Define an algorithm skeleton with customizable steps |
| **Iterator**                | Traverse a collection without exposing its internals |

---

# Final Learning Strategy

The objective isn't:

```text
20 Problems → Memorize 20 Solutions
```

Instead:

```text
Requirements
     ↓
Understand the problem
     ↓
Model the domain
     ↓
Assign responsibilities
     ↓
Create relationships
     ↓
Apply SOLID
     ↓
Identify design problems
     ↓
Use patterns only when justified
     ↓
Implement
     ↓
Refactor
```

## What You Should Be Able To Do After These 20

You should be comfortable answering:

* What are the entities?
* Which class owns this responsibility?
* Should this be an interface or concrete class?
* Is inheritance actually needed?
* Where should this behavior live?
* What should be composed rather than inherited?
* Is the design violating SOLID?
* Where is the coupling?
* How can this requirement change without rewriting everything?
* Does a design pattern actually solve a problem here?
* How would I implement this cleanly in Java?

---

# Progress Tracker

```text
LLD CASE STUDIES
────────────────────────────────

✓ 01 — Parking Lot
✓ 02 — Vending Machine
→ 03 — Library Management System
□ 04 — Tic-Tac-Toe
□ 05 — ATM
□ 06 — Car Rental System
□ 07 — Hotel Booking System
□ 08 — Movie Ticket Booking
□ 09 — Splitwise
□ 10 — Elevator System
□ 11 — Food Delivery System
□ 12 — Chess
□ 13 — Payment System
□ 14 — Notification System
□ 15 — Logging Framework
□ 16 — Cache
□ 17 — Rate Limiter
□ 18 — File System
□ 19 — Ride Sharing System
□ 20 — Meeting Room Booking


DESIGN PATTERNS
────────────────────────────────

✓ Creational — Theory
✓ Structural — Theory
✓ Behavioral — Theory

→ Final implementation/revision
  after LLD case studies
```

> **Principle:** There is no single perfect LLD. A good design is one that is **simple, understandable, feasible, maintainable, extensible, and appropriately abstracted**.
