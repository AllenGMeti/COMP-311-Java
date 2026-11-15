# COMP 311 – Lab-Based Revision Questions 

This document contains 24 practice questions derived from the 12 lab sessions. Use these to test your ability to write the code from scratch without looking at the answers.

---

## Lab 1: Variables, User Input, Arithmetic, and Strings
**Question 1.1: Interactive Calculator**
Write a Java program that uses the `Scanner` class to read two `double` values from the user. The program should calculate and print their sum, product, and quotient. Ensure you handle the case where the user enters 0 for the second number (to avoid division by zero).

**Question 1.2: String Manipulation**
Write a program that asks the user to input their full name (first name and surname separated by a space). Using `String` methods (`indexOf`, `substring`, `charAt`), extract and print:
1. The first name.
2. The surname.
3. The initials in the format "J.D." (assuming the name is John Doe).

---

## Lab 3: Iteration (Loops)
**Question 3.1: Loop Control**
Write a Java program using a `while` loop that asks the user to enter positive integers continuously. The loop should stop only when the user enters a negative number. Calculate and print the sum of all the positive numbers entered.

**Question 3.2: For Loop Analysis**
Write a program that uses a `for` loop to count how many vowels (a, e, i, o, u) are in a specific `String` variable (e.g., `String text = "Programming in Java";`). Print the total count. 

---

## Lab 4 (Part 1): File I/O Basics & Arrays
**Question 4.1.1: File to Array**
Write a program that reads words from a file named `names.txt` and stores them into a `String` array of size 20. Use a `Scanner` to read the file. *(Assume the file contains fewer than 20 words).*

**Question 4.1.2: Palindrome Check**
A palindrome is a word that reads the same forwards and backwards (e.g., "madam"). Write a program that asks the user for a word, uses a `for` loop to check the characters from the beginning and the end simultaneously, and prints whether the word is a palindrome.

---

## Lab 4 (Part 2): Arrays
**Question 4.2.1: 2D Array Row Totals**
Declare a 3x3 2D array of integers containing the scores of 3 students across 3 tests. Write a program that uses nested `for` loops to calculate and print the total score for *each* student (the sum of each row).

**Question 4.2.2: Array Resizing**
Explain why the following code does not compile: `int[] nums = {1, 2, 3}; nums[3] = 4;`. 
Write a corrected version of the code using `java.util.Arrays.copyOf()` to add the number 4 to the array.

---

## Lab 5: Classes and Objects
**Question 5.1: Encapsulation and Validation**
Create a class called `Student` with private fields `name` (String) and `gpa` (double). Provide public getter and setter methods. In the `setGpa` method, ensure that the GPA cannot be set to a value less than 0.0 or greater than 4.0. If an invalid value is passed, set it to 0.0.

**Question 5.2: Array of Objects**
Using the `Student` class from Question 5.1, write a `main` method that creates an array of 3 `Student` objects. Use a loop to print the details of all students whose GPA is greater than 3.0.

---

## Lab 6: Java Methods
**Question 6.1: Method Overloading**
Write three overloaded methods called `calculateArea`. 
1. One takes an `int` (side of a square) and returns the area.
2. One takes two `double`s (length and width of a rectangle) and returns the area.
3. One takes a single `double` (radius of a circle) and returns the area (using `Math.PI`).

**Question 6.2: Pass by Value**
Write a method called `modifyString(String s)` that attempts to change the string to "Changed!" inside the method. In the `main` method, create a string `str = "Original"`, pass it to the method, and print `str` afterward. Explain the output based on Java's pass-by-value mechanism.

---

## Lab 7: File IO
**Question 7.1: Handling Missing Files**
Write a program that attempts to read a file called `data.txt`. If the file does not exist, catch the `FileNotFoundException` and print a friendly message to the user saying "Error: The file data.txt was not found. Please check the path."

**Question 7.2: Copying a File**
Write a Java program that reads every line from `story.txt` and writes those exact same lines into a new file called `story_copy.txt`. Use a `Scanner`/`FileReader` for reading and a `PrintWriter` for writing. Ensure the writer is closed properly.

---

## Lab 8: StringTokenizer & Math
**Question 8.1: Tokenizing and Averaging**
Write a program that asks the user to enter a space-separated list of numbers (e.g., "10 20 30 40"). Use a `StringTokenizer` to split the string, convert each token to a `double` using `Double.parseDouble()`, and print the average of the numbers.

**Question 8.2: Math Operations**
Write a program that reads two numbers from the user. Using the `Math` class, print:
1. The maximum of the two numbers.
2. The first number raised to the power of the second number (`Math.pow`).
3. The absolute value of the first number minus the second number.

---

## Lab 9: Inheritance and Polymorphism
**Question 9.1: Inheritance and `super`**
Create a superclass `Shape` with a `protected` String `name` and a constructor that sets the name. Create a subclass `Circle` that adds a `double radius`. The `Circle` constructor must accept a name and a radius, and call `super(name)`. 

**Question 9.2: Polymorphism**
Write a program that creates an array of type `Shape` (from Q9.1) containing three `Circle` objects. Loop through the array and use the `instanceof` operator to check if each element is a `Circle`, then cast it and print its radius.

---

## Lab 10: Exception Handling
**Question 10.1: Custom Exceptions**
Create a custom exception called `InvalidMarkException` that extends `Exception`. Write a method `assignGrade(int mark)` that throws this exception if the mark is less than 0 or greater than 100. Otherwise, print "Valid mark".

**Question 10.2: Try-with-Resources**
Write a program that uses a **try-with-resources** block to read and print all lines from a file called `input.txt`. Explain briefly why this approach is better than a standard `try-catch-finally` block.

---

## Lab 11: JDBC with MySQL
**Question 11.1: Database Insertion**
Write a method called `addBook(int id, String title, double price)` that connects to a MySQL database (`jdbc:mysql://localhost:3306/library`, `root`, `password`) and inserts the book into a table called `books`. Use a `PreparedStatement` and return `true` if successful, `false` otherwise.

**Question 11.2: Database Retrieval**
Write a method called `displayAllBooks()` that connects to the same database. Execute a `SELECT * FROM books` query, use a `ResultSet` to iterate through the results, and print the `title` and `price` of each book to the console. 

---

## Lab 12: Java Swing
**Question 12.1: GUI Components and Layout**
Write a Java Swing program that creates a `JFrame` sized 400x200. Add two `JTextField`s and a `JButton` labelled "Add". Use a `FlowLayout` to arrange the components. 

**Question 12.2: Action Listener and JOptionPane**
Add an `ActionListener` to the "Add" button from Question 12.1. When clicked, the program should take the numerical values from both text fields, add them together, and display the result in a `JOptionPane.showMessageDialog`. *(Hint: Use `Integer.parseInt()` and handle potential `NumberFormatException`).*