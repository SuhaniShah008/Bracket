Bracket Validator
A Java program that validates whether brackets in a given text are properly balanced and correctly nested.
Description
This program checks if opening and closing brackets are properly matched in any given text input. It supports four types of brackets:

Parentheses: ( )
Curly braces: { }
Square brackets: [ ]
Angle brackets: < >

The program uses a stack-based algorithm to ensure that:

Every opening bracket has a corresponding closing bracket
Brackets are closed in the correct order
There are no unmatched closing brackets

How It Works

The program prompts the user to enter text
It extracts all brackets from the input text
Using a stack data structure, it validates the bracket sequence:

Opening brackets are pushed onto the stack
When a closing bracket is encountered, it checks if it matches the most recent opening bracket
If all brackets match properly and the stack is empty at the end, the input is valid



Usage
Compilation
bashjavac bracket.java
Running the Program
bashjava bracket
Example Input/Output
Valid Examples:
enter text: (hello [world])
Valid

enter text: {[()]}
Valid

enter text: <div>(content)</div>
Valid
Invalid Examples:
enter text: (hello [world)]
Invalid

enter text: {[(])
Invalid

enter text: ))((
Invalid
Code Structure

main(String[] args): Entry point that handles user input and extracts brackets
seeValid(ArrayList<String> brackets): Validates the bracket sequence using a stack algorithm
Static ArrayLists: Define the supported opening and closing bracket types

Requirements

Java Development Kit (JDK) 8 or higher
No external dependencies required

Algorithm Complexity

Time Complexity: O(n) where n is the length of the input text
Space Complexity: O(m) where m is the number of brackets in the input

License
This project is open source and available for educational purposes.
