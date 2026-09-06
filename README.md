# ICE Task 3 – Exception Handling

##  Project Overview
This project simulates an interactive ordering system for **Serendipity Gifts**.  
Customers enter an **item number** and **quantity**, and the program validates the input.  
If invalid, a custom exception is thrown with a clear error message.  
If valid, the program calculates the total cost.

---

##  Files in the Project
- **OrderMessages.java**  
  Stores all possible error messages in a static array.

- **OrderException.java**  
  Custom exception class that accepts an error message from `OrderMessages`.

- **PlaceAnOrder.java**  
  Main application:
  - Prompts user for item number and quantity.
  - Validates input (numeric, range, existence in inventory).
  - Throws `OrderException` if invalid.
  - Calculates and displays total if valid.

---

##  Inventory
| Item Number | Price ($) |
|-------------|-----------|
| 111         | 0.89      |
| 222         | 1.47      |
| 333         | 2.43      |
| 444         | 5.99      |

---

##  Error Conditions
- **Item Number**
  - Not numeric
  - Less than 0
  - Greater than 9999
  - Not found in inventory

- **Quantity**
  - Not numeric
  - Less than 1
  - Greater than 12

---

## Sample Run

### Valid Input
