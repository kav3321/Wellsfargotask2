# Task 2 Starter Repo
Contains Everything you need to get started on task 2 of Forage's Wells Fargo software engineering program

⬇️  
Updates implemented in [task_2_branch](https://github.com/pchatman/wells-fargo-task-2/tree/task_2_branch)

# Spring Data Model Implementation – Task 2

## Overview
This project focuses on implementing a data model using **Spring Boot** and **JPA**. The goal of Task 2 is to translate a previously designed data model into working entity classes within a provided Spring application.

The implementation follows standard Spring and JPA best practices, including proper entity annotations, relationships, constructors, and accessors.

---

## Prerequisites
Before starting this task, make sure you have the following installed:

- **Java JDK**
- **IntelliJ IDEA**
- **Git**
- A **GitHub account**

If you are new to Git, it is recommended to review the first two chapters of the official Git Book.

---

## Setup Instructions

1. **Fork and Clone the Starter Repository**
    - Fork the provided starter repository on GitHub.
    - Clone the forked repository to your local machine.

2. **Open the Project**
    - Open IntelliJ IDEA.
    - Select **Open** and choose the cloned project directory.
    - Allow IntelliJ to load dependencies and index the project.

3. **Explore the Codebase**
    - Review the existing project structure.
    - Examine the provided entity for guidance on annotations, constructors, and relationships.

---

## Task 2 Implementation

A new branch was created to complete this task:

### Entity Requirements
Each entity class was implemented according to the following rules:

- Annotated with `@Entity` from `javax.persistence`
- Contains an auto-generated ID
- All instance variables include either:
   - `@Column`, or
   - A relationship annotation (e.g. `@OneToMany`, `@ManyToOne`)
- Includes a constructor that initializes all instance variables
- Provides getters and setters for all fields
   - Setters for ID fields are not required
- Entity classes are placed in the `entities` directory

Existing entities in the project were used as references to ensure consistency and correctness.
> *Note: Modifications were made to Advisor class in new branch to match my ERD diagram.*