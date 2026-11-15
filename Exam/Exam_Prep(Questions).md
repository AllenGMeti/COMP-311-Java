# COMP 311 – Past Exam Programming Questions (Practice Only)

All the programming and code-tracing questions extracted from the past exam papers. Use these to practice writing code by hand or in your IDE.

---

## From: COMP 311 Theory Test 2026

### Section B

1. Write a Java program that reads from a file called `aleo.txt`. The file contains only text. Your program should then print all the words in the file. **[5 marks]**

2. Write a small Java program that asks the user for their name, lastname and ID Number. The program should write this information to a file called `pb.txt`. **[5 marks]**

3. Write a program which asks the user for a sentence. The program should then output the number of words in the sentence. **[6 marks]**

### Section C

1. You are to write Java code that will produce the following `JFrame`. **[20 marks]**

   - Create the section that contains the **File**, **Edit** and **Tools** menus.
   - When the user clicks **File**, three options should appear: **New**, **Open**, **Save**.
   - Create the **ALEO Dashboard** heading.
   - Create the **Name** label and the part where a user can input their name.
   - Create the **Login** button.
   - The size of the frame should be **600 by 400**.
   - The rest of the marks are for the window configurations.

---

## From: COMP 311 2017/18 Final Exam

### Section B

1. Write two different Java statements that each add 1 to integer variable `x`. **[2 marks]**

2. Declare and create an `ArrayList` of Strings. **[2 marks]**

3. Fill in the blanks in each of the following statements: **[4 marks]**

   - a) A one-dimensional array `p` contains six elements. The last index is `____`.
   - b) A one-dimensional array `k` has three elements. The statement `____` sets the value of the first element to 2.
   - c) A one-dimensional array `k` has 10 elements. The statement `____` displays the value of the fifth element of the array.
   - d) A statement to declare a two-dimensional `int` array `r` that has 3 rows and 4 columns is `____`.

4. For each of the following, write a single statement that performs the indicated task: **[2 marks]**

   - a) Compare the string in `s1` to the string in `s2` for equality of contents.
   - b) Determine the length of the string in `s1`.

5. What is the output of the following code? **[3 marks]**

   ```java
   int[] array1 = new int[3];
   array1[0] = 2;
   array1[1] = 5;
   array1[2] = 3;
   int[] array2 = array1;
   array2[1] = 7;
   System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);
   ```

6. What is the output of the following program? **[3 marks]**

   ```java
   int i = 1, j = 10;
   do {
       if (i++ > --j) {
           System.out.println("i = " + i + "and j = " + j);
       }
   } while (i < 5);
   System.out.println("i = " + i + "and j = " + j);
   ```

7. Show the exact output that would be produced by the following `main()` method: **[3 marks]**

   ```java
   public static void main(String[] args) {
       int N;
       N = 1;
       while (N <= 32) {
           N = 2 * N;
           System.out.println(N);
       }
   }
   ```

### Section C (Choose ONE)

1. Write a Java program called `Min`. The program should contain an overloaded method called `minimum` that returns the smallest of two integer numbers or the smallest of three integer values, depending on the number of parameters passed. Use the `Math.min` method to implement `minimum`. The numbers should be passed as command line arguments; hence, if two arguments are passed, the program will find the minimum of the two numbers, otherwise it will find the minimum of the three numbers passed. **[20 marks]**

2. Given a list of values, e.g., `{1, 4, 32, 6, 12, 8, 9, 21, 7}`, write a program to store these values in an array and print the array. Then reverse the array elements so that the first element becomes the last element, the second element becomes the second to last element, and so on, with the old last element now first. Do not just reverse the order in which they are printed; actually change the way they are stored in the array. Do not create a second array; just rearrange the elements within the array you have. *(Hint: swap elements that need to change places.)* When the elements have been reversed, print the array again. **[20 marks]**

3. Create a class called `Employee` that includes three pieces of information as instance variables: a first name (type `String`), a last name (type `String`) and a monthly salary (`double`). Your class should have a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to `0.0`. **[20 marks]**

---

## From: COMP 311 2020/21 Final Exam

### Section B

1. Write a method called `compare` that takes two `Car` objects as parameters. The method should return `true` if the objects have the same make and model and return `false` otherwise. **[5 marks]**

2. Write a Java method called `factorial` which takes an integer `n` as a parameter. The method should calculate and return the factorial of `n` (`n!`). For example, if `n = 5`, the program should calculate and return `5 * 4 * 3 * 2 * 1`. **[5 marks]**

3. Write a `for` loop that adds up all the numbers in a 3 x 4 matrix and prints out the total sum of the numbers. Assume the matrix is called `matrix`. **[5 marks]**

4. Write a method called `calculateArea` which takes two parameters, `radius` and `height`. The method should calculate and return the surface area of a cylinder given by the formula: `A = 2 * pi * r * h + 2 * pi * r^2`. **[5 marks]**

### Section C (Choose 2 out of 3)

#### Question 1

A `Circle` has `colour` and `radius` as properties. Use this information to answer the following questions:

1. Create a `Circle` class with the default constructor and a constructor that takes all instance variables. **[2]**
2. Write a method to calculate the perimeter of a `Circle`. **[2]**
3. Write a method to compare two `Circle` objects. The method should return `true` if a circle is bigger than the object it is compared to, otherwise it should return `false`. **[5]**
4. Override the `toString` method to print all information about a `Circle` object. **[3]**
5. Write a Java statement that creates two `Circle` objects and compares them using the method stated in part 3. **[3]**

#### Question 2 (JDBC)

1. Write a method called `connect` which takes three parameters: the `url`, `username` and `password`. The method should connect to the specified URL of a database with the username and password provided. The method should return `true` if the connection is successful and `false` otherwise. **[5]**
2. Write a method called `addRecord` which takes two parameters, `name` and `age`. The method should add these records to an already existing table called `people`. **[5]**
3. Write a `void` method called `display` which displays all records in the `people` table. **[5]**

#### Question 3

1. Use the following UML diagram to write a Java class. **[5]**

   | **BankAccount** |
   |---|
   | `-name: String` |
   | `-address: String` |
   | `-currentBalance: double` |
   | `+BankAccount(name: String, address: String)` |
   | `+BankAccount(name: String, address: String, currentBalance: double)` |
   | `+getName(): String` |
   | `+setName(String): void` |
   | `+getAddress(): Address` |
   | `+toString(): String` |

2. Write a Java program which writes to a file the multiples of 3 less than 100. **[5]**

3. Write a Java program that opens a file called `hello.txt` and prints to the screen all the contents of that file. **[5]**

---

## From: COMP 311 Supplementary Exam 2022/23

### Section B

1. You have a file called `numbers.txt` which contains integer numbers separated by a space. Write a program that reads from the file and calculates the average of all the numbers in the file. **[5 marks]**

2. Write a method that takes two integer variables `x` and `y`, and returns the value of `x^y`. **[3 marks]**

3. Write a Java program that opens a file for writing. The program should write to the file all even numbers between 0 and 500. **[4 marks]**