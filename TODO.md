# TODO - Financial Advisor Data Model Implementation

## Entities to Create:

- [x] 1. Client.java - Entity with relationship to Advisor (Many-to-One)
- [x] 2. Portfolio.java - Entity with relationship to Client (One-to-One)
- [x] 3. Security.java - Entity with relationship to Portfolio (Many-to-One)

## Requirements for each entity:

- [x] Annotate with @Entity (jakarta.persistence)
- [x] Auto-generated ID with @Id and @GeneratedValue
- [x] Instance variables with @Column or relationship annotations
- [x] Constructor initializing all instance variables
- [x] Getters and setters for each instance variable (no setter for id)

## Follow-up Steps:

- [ ] Commit changes to GitHub
- [ ] Submit link to the repo
