# Bracket Validator

A **Java program** that validates whether brackets in a given text are properly balanced and correctly nested.

---

## Description

This program checks if opening and closing brackets are properly matched in any given text input.  
It supports **four types of brackets**:

- **Parentheses:** `( )`  
- **Curly braces:** `{ }`  
- **Square brackets:** `[ ]`  
- **Angle brackets:** `< >`

The program uses a **stack-based algorithm** to ensure that:

- Every opening bracket has a corresponding closing bracket  
- Brackets are closed in the correct order  
- There are no unmatched closing brackets  

---

## How It Works

1. The program prompts the user to enter text  
2. It extracts all brackets from the input text  
3. Using a **stack data structure**, it validates the bracket sequence:

   - Opening brackets are pushed onto the stack  
   - When a closing bracket is encountered, it checks if it matches the most recent opening bracket  
   - If all brackets match properly and the stack is empty at the end, the input is valid  

---
