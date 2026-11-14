# COMP 311 Java: Code Structure Guide

## How to use this guide

Every COMP 311 program plugs into one frame: imports, one class named after the file, and a `main` method. Placeholders in `<angle brackets>` are yours to fill; everything else follows the lecture slides.

```java
import java.util.Scanner;              // 1. imports (only what you use)

public class <FileName> {              // 2. class name = file name (<FileName>.java), PascalCase

    // 3. fields and constants
    // 4. constructors (if the class makes objects)
    // 5. other methods

    public static void main(String[] args) {   // 6. entry point
        // create objects -> read input -> process -> output
    }
}
```

Build order for any task: write the class frame, add the fields, add the methods, then wire them together in `main`. Compile with `javac <FileName>.java`, run with `java <FileName>`.

## Lecture 1: Getting started and syntax fundamentals

Every Java file is a class containing `main`, and every value is either a primitive or a reference type. Everything later builds on these rules.

### Verify your setup

```bash
java -version      # JDK installed
javac -version     # compiler available
git --version      # git installed
```

Checklist from the slides: VS Code, the Java extension pack, the JDK, a GitHub account, git, and VS Code linked to GitHub. Then run Hello World to test.

### Compile and run

```bash
javac HelloWorld.java   # JDK compiler -> HelloWorld.class (bytecode)
java HelloWorld         # JVM executes it (no .class extension)
```

JDK = compiler and tools. JRE = class libraries. JVM = class loader and execution engine.

### Primitive types: `type name = value;`

```java
byte    b     = 100;
short   s     = 20000;
int     age   = 21;
long    pop   = 8000000000L;   // L suffix
float   pi    = 3.14f;         // f suffix
double  gpa   = 3.89;
char    grade = 'A';           // single quotes, one character
boolean pass  = true;          // true or false only
```

### Reference types: start with an uppercase letter

```java
String  name  = "Amantle";
int[]   marks = {90, 85, 77};
Student st    = new Student();   // any class you write
String  none  = null;            // only references can be null
```

A primitive holds the value in the stack. A reference sits in the stack and points to an object in the heap.

### Variable names: rules and conventions

- Start with a letter, `_` or `$`; after that use letters, digits, `_` or `$`.
- Never use a reserved keyword (`class`, `public`, `static`, `void`, `int`, ...). Names are case-sensitive.

| What | Convention | Example |
| --- | --- | --- |
| Variables, methods | camelCase | `studentName`, `myAge` |
| Classes | PascalCase | `HelloWorld`, `StudentProgram` |
| Constants | SCREAMING_SNAKE_CASE | `final int MAX_SCORE = 100;` |

### The five syntax rules in one snippet

```java
public class HelloWorld {                      // file must be HelloWorld.java
    public static void main(String[] args) {   // Main and main are different
        int x = 5;                             // every statement ends with ;
        System.out.println(x);
    }                                          // { } wrap every block
}
```

Whitespace is ignored by the compiler; use it for readability only.

### Comments

```java
// single line comment

/*
 * multi-line comment
 * spanning several lines
 */
```

### Your first program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

## Lecture 2: Strings, user input and conditionals

The pattern is always the same: create the thing, read the value, test it with a condition.

### Strings

A `String` is a reference type, so it is always declared with an uppercase S.

```java
String s1 = "hello";                   // literal (preferred)
String s2 = new String("Hello");       // using new

int     len  = s1.length();            // 5
char    c    = s1.charAt(0);           // 'h'
int     pos  = s1.indexOf('l');        // 2
String  part = s1.substring(1, 3);     // "el" (end index NOT included)
boolean a    = s1.equals(s2);          // compares content
boolean b    = s1.equalsIgnoreCase("HELLO");
int     cmp  = s1.compareTo(s2);       // 0 when equal
```

Compare strings with `equals()`, not `==`.

### Reading input with Scanner

Four steps: import it, create it, read with it, close it.

```java
import java.util.Scanner;                        // 1. import from java.util

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // 2. create

        String word   = input.next();            // 3. read one word
        int age       = input.nextInt();         //    read an int
        double salary = input.nextDouble();      //    read a double
        input.nextLine();                        //    consume the leftover newline
        String sentence = input.nextLine();      //    read a whole line

        input.close();                           // 4. close
    }
}
```

### if / else if / else

```java
if (condition) {
    // runs when condition is true
} else if (otherCondition) {
    // runs when the first was false and this is true
} else {
    // last resort
}
```

Read, test, act:

```java
System.out.print("Enter your mark: ");
int mark = input.nextInt();
if (mark >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### switch

Use `switch` when you compare one value against constants. It does not work for ranges.

```java
switch (value) {
    case "case1":
        // code
        break;
    case "case2":
        // code
        break;
    default:
        // runs when nothing matched
}
```

The slide writes `Default:`; in real code it is lowercase `default:`.

## Lecture 3: Iteration

Pick the loop by what you know: unknown repeats use `while`, at-least-once uses `do-while`, a known count uses `for`, and every element of an array uses the enhanced `for`.

| Loop | Condition checked | Best used when |
| --- | --- | --- |
| `while` | Before each iteration | Number of repeats is unknown |
| `do-while` | After each iteration | Body must run at least once (menus) |
| `for` | Before each iteration | Number of repeats is known |
| enhanced `for` | Handled internally | Visiting every element of an array or collection |

### The loop control variable: three steps

Initialise it before the loop, test it in the condition, update it inside the body. If you forget the update, the loop never ends.

### while

```java
int count = 1;                          // 1. initialise
while (count <= 5) {                    // 2. test
    System.out.println("Count: " + count);
    count++;                            // 3. update (forget it = infinite loop)
}
```

### do-while

```java
int count = 1;
do {
    System.out.println("Count: " + count);
    count++;
} while (count <= 5);                   // note the semicolon
```

### for

```java
for (int i = 1; i <= 5; i++) {          // initialise; condition; update
    System.out.println("Count: " + i);
}
```

### Enhanced for (for-each)

```java
int[] numbers = {10, 20, 30, 40, 50};
for (int num : numbers) {               // dataType item : collection
    System.out.println(num);
}
```

You get no index, and you should not modify the array while looping over it.

## Lecture 4: Arrays

An array is declared, created with `new` (or a literal), then accessed by index from 0 to `length - 1`. Its size is fixed once created.

### Declare (creates only the reference)

```java
int[]     ages;
double[]  prices;
char[]    grades;
boolean[] flags;
String[]  names;
```

### Initialise: three ways

```java
int[] ages   = new int[5];                      // 5 elements, all default to 0
int[] scores = new int[] {90, 85, 77, 60, 45};  // new + explicit values
int[] marks  = {90, 85, 77, 60, 45};            // shorthand literal
String[] names = {"Alice", "Bo", "Chidi"};
```

Defaults when you give no values: `0`, `false` or `null`.

### Access, change and length

```java
int first = marks[0];                 // index starts at 0
marks[2]  = 80;                       // change an element
int size  = marks.length;             // field, no brackets
int last  = marks[marks.length - 1];
```

### The Arrays class

```java
import java.util.Arrays;

Arrays.sort(marks);                                  // sorts in place
System.out.println(Arrays.toString(marks));          // prints [45, 60, 77, 85, 90]
int[] copy = Arrays.copyOf(marks, marks.length);
boolean same = Arrays.equals(marks, copy);
Arrays.fill(ages, 7);                                // every element = 7
```

### Loop through a 1D array

```java
// standard for: gives index and value
for (int i = 0; i < marks.length; i++) {
    System.out.println("Index " + i + ": " + marks[i]);
}

// enhanced for: value only
for (int mark : marks) {
    System.out.println(mark);
}
```

### 2D arrays: an array of arrays, `type[][] name;`

```java
int[][] grid = new int[3][4];          // 3 rows, 4 columns, all 0

int[][] scores = {
    {90, 85, 77},
    {60, 45, 88},
    {70, 95, 82}
};
System.out.println(scores[1][2]);      // row 1, column 2 -> 88
```

Rows can have different lengths (a jagged array):

```java
int[][] jagged = new int[3][];         // rows not created yet
jagged[0] = new int[2];
jagged[1] = new int[4];
jagged[2] = new int[1];
```

### Iterate a 2D array with nested loops

Outer loop runs over rows (`array.length`), inner loop over the columns of that row (`array[row].length`).

```java
for (int row = 0; row < scores.length; row++) {
    for (int col = 0; col < scores[row].length; col++) {
        System.out.print(scores[row][col] + " ");
    }
    System.out.println();                // new line after each row
}

// enhanced version
for (int[] row : scores) {
    for (int value : row) {
        System.out.print(value + " ");
    }
    System.out.println();
}
```

## Lecture 5: Classes and objects

A class is the blueprint, written once; objects are the real instances you create from it with `new`. Write the class in this order: private fields, constructors, getters and setters, then behaviour methods.

### Class template

```java
public class Student {

    // 1. fields (private = encapsulation)
    private String name;
    private int age;
    private double gpa;

    // 2. constructors: same name as the class, no return type
    public Student() {                          // default constructor
        this.name = "";
        this.age = 0;
        this.gpa = 0.0;
    }

    public Student(String name, int age, double gpa) {
        this.name = name;                       // this.name = field, name = parameter
        this.age = age;
        this.gpa = gpa;
    }

    // 3. getters and setters (setters validate)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    // 4. behaviour
    public String getSummary() {
        return name + " has a GPA of " + gpa;
    }
}
```

If you write no constructor, Java supplies an empty default one. Once you write any constructor, it no longer does.

### The `this` keyword

`this` is the current object. Use `this.field = parameter;` when the names match, and `this(...)` to call another constructor in the same class.

```java
public Student() {
    this("", 0, 0.0);      // calls Student(String, int, double)
}
```

### Create and use objects

Syntax: `ClassName variableName = new ClassName(arguments);`

```java
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Amantle", 20, 3.8);
        Student s2 = new Student("Kabo", 22, 3.4);   // each object has its own fields

        System.out.println(s1.getName() + " - " + s1.getSummary());

        s2.setGpa(3.9);                              // dot notation: object.method()

        Student s3 = new Student();                  // default constructor
        s3.setName("Neo");
    }
}
```

The slide example prints `s1.name` directly; that only compiles when the field is not `private`. With private fields, go through the getter as above.

### Access modifiers

- `private`: usable only inside its own class.
- `public`: usable from anywhere.
- Encapsulation means private fields plus public methods that control access.

## Lecture 6: Java methods

A method is a named, reusable block that only runs when it is called. Every method follows the same shape: `modifier returnType methodName(parameters) { body }`.

### Method anatomy

```java
public static int add(int a, int b) {   // modifier + return type + name + parameters
    return a + b;                       // body
}
```

Names are camelCase verbs (`calculateTotal`, `printReceipt`).

### void versus value-returning

```java
public static void showMessage() {           // void: returns nothing
    System.out.println("Welcome!");
}

public static double square(double n) {      // returns a double; must use return
    return n * n;
}

public static void greet(String name, int age) {   // name, age = parameters
    System.out.println("Hello " + name + ", age " + age);
}
```

### Calling methods

```java
public class Main {
    public static void main(String[] args) {
        showMessage();                    // void: call on its own line
        double result = square(4.0);      // value-returning: store or use the result
        int sum = add(5, 3);              // 5 and 3 = arguments
        greet("Amantle", 20);
        double p = Math.pow(2, 3);        // static method of another class: ClassName.method()
    }
}
```

### Overloading: same class, same name, different parameters

```java
public static int add(int a, int b) {
    return a + b;
}
public static double add(double a, double b) {
    return a + b;
}
public static int add(int a, int b, int c) {
    return a + b + c;
}
```

The return type alone cannot tell overloads apart. The compiler picks the version from the arguments (compile time).

### Overriding: subclass replaces a parent method

```java
class Animal {
    public String makeSound() {
        return "Some generic sound";
    }
}

class Dog extends Animal {
    @Override                              // compiler checks the signature matches
    public String makeSound() {            // same name, parameters and return type
        return "Woof!";
    }
}
```

Animal a = new Dog(); `a.makeSound()` returns "Woof!" (decided at run time).

### Static versus instance

```java
public class MathHelper {
    public static int square(int n) {      // belongs to the class
        return n * n;
    }
}
// call: MathHelper.square(4)

public class Student {
    private double gpa;
    public double getGpa() {               // belongs to an object
        return gpa;
    }
}
// call: s1.getGpa()  (needs an object first)
```

A static method cannot use instance fields directly.

### Pass by value

Java always passes a copy. Changing a primitive inside the method does not change the caller's variable.

```java
public static void increment(int number) {
    number = number + 1;
    System.out.println("Inside method: " + number);   // 6
}

public static void main(String[] args) {
    int value = 5;
    increment(value);
    System.out.println("Back in main: " + value);     // still 5
}
```

For objects and arrays the reference is copied: the method can change the object's data, but cannot make your variable point somewhere else.

### The main method, part by part

```java
public static void main(String[] args)
// public: the JVM can reach it | static: runs without an object
// void: returns nothing        | String[] args: command-line arguments
```

## Lecture 7: File input and output

Reading wraps a `FileReader` in a `Scanner` and loops until the file ends; writing uses a `PrintWriter` that you must close. Both can fail, so both need exception handling.

### Imports

```java
import java.io.*;            // FileReader, PrintWriter, IOException, FileNotFoundException
import java.util.Scanner;
```

### Open a file for reading

```java
FileReader reader = new FileReader("data.txt");   // step 1: open
Scanner sc = new Scanner(reader);                 // step 2: wrap so you can use Scanner methods

// both steps in one line
Scanner sc2 = new Scanner(new FileReader("data.txt"));
```

### Read the whole file with try/catch

The `try/catch` form lets you decide what happens when the file is missing or locked.

```java
public class ReadFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileReader("data.txt"));
            while (sc.hasNextLine()) {            // loop until no lines are left
                String line = sc.nextLine();      // line by line
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```

### Read word by word or typed values

```java
while (sc.hasNext()) {            // word by word
    String word = sc.next();
}

while (sc.hasNextInt()) {         // integers only
    int n = sc.nextInt();         // use nextDouble() for doubles
}
```

### The `throws` alternative

`throws` passes the exception up instead of handling it yourself.

```java
public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(new FileReader("data.txt"));
    // ... read as above ...
    sc.close();
}
```

### Write to a file with PrintWriter

```java
try {
    PrintWriter out = new PrintWriter("output.txt");   // opens (or creates) the file
    out.println("Hello file");                         // same methods as System.out
    out.print("no newline here");
    out.close();                                       // always close when done
} catch (FileNotFoundException e) {
    System.out.println("Cannot write: " + e.getMessage());   // read-only file, bad path
}
```

Every `PrintWriter` constructor in the slides (File, String, OutputStream, Writer, with or without autoFlush or a charset) is used the same way afterwards: `print`, `println`, `close`.

## Lecture 8: StringTokenizer, Math and method signatures

`StringTokenizer` splits a String into tokens, `Math` gives static calculation methods, and the method topics repeat Lecture 6 with one new idea: the signature.

### StringTokenizer

Splits on whitespace by default; pass a second argument for custom delimiters.

```java
import java.util.StringTokenizer;

StringTokenizer st = new StringTokenizer("Java is fun to learn");
System.out.println(st.countTokens());            // 5 (tokens not yet consumed)

StringTokenizer csv = new StringTokenizer("apple,banana,orange", ",");
while (csv.hasMoreTokens()) {                    // loop pattern
    System.out.println(csv.nextToken());         // apple, banana, orange
}
```

Combined with file reading (one comma-separated record per line):

```java
while (sc.hasNextLine()) {
    StringTokenizer line = new StringTokenizer(sc.nextLine(), ",");
    String name = line.nextToken();
    int age = Integer.parseInt(line.nextToken());   // tokens are Strings: convert
}
```

### The Math class

All methods are static, called as `Math.method()`. No import is needed because it lives in `java.lang`.

```java
System.out.println(Math.pow(2, 3));     // 8.0
System.out.println(Math.sqrt(49));      // 7.0
System.out.println(Math.abs(-15));      // 15
System.out.println(Math.max(10, 25));   // 25
System.out.println(Math.min(10, 25));   // 10
System.out.println(Math.round(4.6));    // 5
System.out.println(Math.random());      // 0.0 (inclusive) up to 1.0 (exclusive)
System.out.println(Math.PI);            // 3.141592653589793
System.out.println(Math.E);             // constant e
```

### Creating methods

Same structure as Lecture 6:

```java
public static int square(int n) {
    return n * n;
}
```

### Method signature = name + parameter types, order and count

Return type, access modifier and parameter names are not part of it. Two methods in one class cannot share a signature.

```java
public static int add(int a, int b) { ... }             // signature: add(int, int)
public static double add(double a, double b) { ... }    // signature: add(double, double)
// different signatures, so both are allowed in the same class
```

Overloading (same class, signatures differ) and overriding (subclass, signature and return type identical) use the code in Lecture 6.

## Lecture 9: Inheritance and polymorphism

Write the shared code once in a superclass, then each subclass uses `extends`, calls `super(...)` first in its constructor, and overrides what differs. Inheritance is an "is-a" relationship: a Dog is an Animal.

### Superclass and subclass template

```java
class Animal {
    protected String name;                        // protected: subclasses can use it directly

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public String makeSound() {
        return "...";
    }
}

class Dog extends Animal {                        // one superclass only
    public Dog(String name) {
        super(name);                              // must be the first line if used
    }

    public void bark() {                          // new method, only Dog has it
        System.out.println(name + " says Woof!");
    }

    @Override
    public String makeSound() {                   // same signature and return type
        return "Woof!";
    }

    @Override
    public void eat() {
        super.eat();                              // run the parent's version first
        System.out.println(name + " finishes the bowl quickly");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }
}
```

### Rules to keep in mind

- Constructors are not inherited; every class writes its own.
- If you do not call `super(...)`, Java inserts `super()` (no arguments) for you. If the parent has no no-argument constructor, you must call `super(...)` with matching arguments.
- `private` members exist in the subclass but cannot be accessed by name there.

| Modifier | Accessible from |
| --- | --- |
| `private` | Same class only |
| `protected` | Same class, same package, and subclasses |
| `public` | Everywhere |

### The Object class and toString()

Every class implicitly extends `Object`, which supplies `toString()`, `equals()` and `hashCode()`. Override `toString()` to control what prints.

```java
@Override
public String toString() {
    return "Animal: " + name;
}
```

### Polymorphism: a superclass reference holds any subclass object

```java
Animal a1 = new Dog("Rex");
Animal a2 = new Cat("Tom");
System.out.println(a1.makeSound());     // Woof!  (the real object decides)
System.out.println(a2.makeSound());     // Meow!
```

Compile-time polymorphism is overloading. Run-time polymorphism is overriding.

### instanceof before a cast

```java
Animal a = new Dog("Rex");
if (a instanceof Dog) {
    Dog d = (Dog) a;                    // safe cast
    d.bark();
}
if (a instanceof Animal) {
    System.out.println("a is also an Animal");   // true
}
```

## Lecture 10: Exception handling

Put risky code in `try`, handle each failure type in its own `catch`, and put clean-up in `finally`. Checked exceptions (for example `IOException`) must be caught or declared with `throws`; unchecked ones (`RuntimeException` and its subclasses) do not have to be.

### try / catch / finally

```java
try {
    int result = 10 / 0;                       // risky code
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
} finally {
    System.out.println("This always runs");    // clean-up, optional
}
```

A `try` needs at least one `catch` or a `finally`. If nothing is thrown, the `catch` is skipped.

### Multiple catch blocks: specific first, general last

```java
try {
    int[] numbers = {1, 2, 3};
    System.out.println(numbers[5]);
} catch (ArithmeticException e) {
    System.out.println("Arithmetic problem: " + e.getMessage());
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Invalid array index: " + e.getMessage());
} catch (Exception e) {                        // catches everything else
    System.out.println("Something else went wrong: " + e.getMessage());
}

// one block for several types (Java 7+)
catch (IOException | SQLException e) { ... }
```

### Built-in exceptions you will meet

| Exception | Typical cause |
| --- | --- |
| `ArithmeticException` | Integer division by zero |
| `NullPointerException` | Using a reference that is `null` |
| `ArrayIndexOutOfBoundsException` | Index that does not exist |
| `NumberFormatException` | `Integer.parseInt("abc")` |
| `ClassCastException` | Casting to an incompatible type |
| `FileNotFoundException` | Opening a missing file |

### throw: trigger an exception yourself

```java
public static void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
    System.out.println("Age set to " + age);   // skipped when thrown
}
```

### throws: declare a checked exception in the signature

```java
public static void readFile(String path) throws IOException {
    FileReader reader = new FileReader(path);
    // ...
}

// the caller must handle it
try {
    readFile("data.txt");
} catch (IOException e) {
    System.out.println("Could not read the file: " + e.getMessage());
}
```

Separate several declared types with commas: `throws IOException, SQLException`.

### Custom exception: extend Exception (checked) or RuntimeException (unchecked)

```java
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);                        // pass the message to the parent
    }
}

public static void withdraw(double balance, double amount)
        throws InsufficientFundsException {
    if (amount > balance) {
        throw new InsufficientFundsException("Not enough funds");
    }
}
```

### try-with-resources: automatic closing

The resource goes in parentheses after `try` and must implement `AutoCloseable`. Separate several resources with semicolons.

```java
try (FileReader reader = new FileReader("data.txt");
     Scanner sc = new Scanner(reader)) {
    while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
    }
} catch (IOException e) {
    System.out.println("Error reading file: " + e.getMessage());
}
// reader and sc are closed here automatically
```

### Best practices

- Catch specific types before a general `Exception`.
- Never leave a `catch` empty; print or log something.
- Catch only what you can handle; let the rest propagate.
- Use `finally` or try-with-resources so resources always close.

## Lecture 11: JDBC with MySQL

Every database method follows the same six-step workflow: open a connection, create a statement, run the SQL, read the `ResultSet` if there is one, then close everything. Wrap each step in `try`/`catch (SQLException e)`.

### Setup: driver, database, URL

```xml
<!-- Maven: pom.xml (or add the Connector/J .jar to your classpath) -->
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.3.0</version>
</dependency>
```

```sql
CREATE DATABASE school;
```

URL format: `jdbc:mysql://host:port/databaseName`, for example `jdbc:mysql://localhost:3306/school`. The driver registers itself, so `Class.forName()` is not needed.

### Which call for which job

| Operation | SQL | JDBC call | Returns |
| --- | --- | --- | --- |
| Create table, Insert, Update, Delete | `CREATE TABLE` / `INSERT` / `UPDATE` / `DELETE` | `executeUpdate()` | Rows affected |
| Read | `SELECT` | `executeQuery()` | A `ResultSet` |

Use `PreparedStatement` with `?` placeholders for anything involving variable or user input; it stops SQL injection and is faster when reused. Plain `Statement` is only for fixed SQL.

### Class frame with connect()

```java
import java.sql.*;
import java.util.ArrayList;

public class StudentDB {
    private String url = "jdbc:mysql://localhost:3306/school";
    private String username = "root";
    private String password = "yourPassword";
    private Connection conn;

    public boolean connect(String url, String username, String password) {
        try {
            conn = DriverManager.getConnection(url, username, password);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean connect() {                        // overload using the fields
        return connect(this.url, this.username, this.password);
    }

    // methods below go inside this class
}
```

### Create a table

```java
public boolean createTable() {
    if (!connect()) {
        return false;
    }
    String sql = "CREATE TABLE students (" +
                 "id INT PRIMARY KEY, " +
                 "name VARCHAR(50), " +
                 "age INT, " +
                 "gpa DOUBLE)";
    try (Statement stmt = conn.createStatement()) {
        stmt.executeUpdate(sql);
        return true;
    } catch (SQLException e) {
        return false;
    }
}
```

### Insert (Create)

```java
public boolean insert(int id, String name, int age, double gpa) {
    if (!connect()) {
        return false;
    }
    String sql = "INSERT INTO students (id, name, age, gpa) VALUES (?, ?, ?, ?)";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);              // placeholders are numbered from 1
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.setDouble(4, gpa);
        ps.executeUpdate();
        return true;
    } catch (SQLException e) {
        return false;
    }
}
```

### Read all rows (Retrieve)

Assumes a `Student` class with the constructor `Student(int id, String name, int age, double gpa)`.

```java
public ArrayList<Student> getRecords() {
    ArrayList<Student> students = new ArrayList<>();
    if (!connect()) {
        return students;
    }
    String sql = "SELECT * FROM students";
    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {                                   // false when no rows are left
            Student s = new Student(rs.getInt("id"), rs.getString("name"),
                                    rs.getInt("age"), rs.getDouble("gpa"));
            students.add(s);
        }
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
    return students;
}
```

### Read one row

```java
public void getDetails(int id) {
    if (!connect()) {
        System.out.println("Could not connect to the database");
        return;
    }
    String sql = "SELECT * FROM students WHERE id = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {                                  // if, not while: one row
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("GPA: " + rs.getDouble("gpa"));
            } else {
                System.out.println("No student found with id " + id);
            }
        }
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
```

### Update (Edit): always include WHERE

The slides show the SQL and placeholders; wrapped in the same method pattern as `insert`:

```java
public boolean update(int id, double gpa) {
    if (!connect()) {
        return false;
    }
    String sql = "UPDATE students SET gpa = ? WHERE id = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setDouble(1, gpa);
        ps.setInt(2, id);
        int rows = ps.executeUpdate();                        // rows changed
        return rows > 0;
    } catch (SQLException e) {
        return false;
    }
}
```

Without `WHERE`, every row is updated.

### Delete: always include WHERE

```java
public boolean delete(int id) {
    if (!connect()) {
        return false;
    }
    String sql = "DELETE FROM students WHERE id = ?";
    try (PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setInt(1, id);
        ps.executeUpdate();
        return true;
    } catch (SQLException e) {
        return false;
    }
}
```

Without `WHERE`, every row is deleted, and there is no undo.

### Close resources with try-with-resources

`Connection`, `Statement`, `PreparedStatement` and `ResultSet` all hold real resources. Declare them in the `try (...)` header and they close in reverse order, even after an exception.

```java
try (Connection conn = DriverManager.getConnection(url, user, pass);
     PreparedStatement ps = conn.prepareStatement(sql);
     ResultSet rs = ps.executeQuery()) {
    // use conn, ps and rs here
} catch (SQLException e) {
    System.out.println("Database error: " + e.getMessage());
}
```

### Common errors

| Situation | Message you will see |
| --- | --- |
| Wrong username or password | `Access denied` |
| Database does not exist | `Unknown database` |
| Table does not exist | `Table doesn't exist` |
| Duplicate primary key on INSERT | `Duplicate entry` |
| SQL typo | `error in your SQL syntax` |

## Lecture 12: Java Swing

A Swing app is built in five moves: create the `JFrame`, create a `JPanel`, create components and add them to the panel, add the panel to the frame, then call `setVisible(true)` last. Nothing happens on screen until you attach listeners, because Swing is event-driven.

### Imports and window skeleton

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");    // 1. window
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);                  // centre on screen

        JPanel panel = new JPanel();                        // 2. container
        panel.add(new JLabel("Hello, Swing!"));             // 3. components
        frame.add(panel);                                   // 4. panel into frame

        frame.setVisible(true);                             // 5. show it, last
    }
}
// containment: JFrame > JPanel > JLabel / JButton / JTextField
```

### Components: create, add, read

```java
JLabel nameLabel = new JLabel("Name:");                 // uneditable text

JTextField nameField = new JTextField(15);              // width in columns
String typed = nameField.getText();                     // read
nameField.setText("Amantle");                           // write

JPasswordField pwField = new JPasswordField(15);        // masks input
char[] password = pwField.getPassword();                // char[], not String

JButton loginButton = new JButton("Login");            // does nothing without a listener

JRadioButton maleBtn = new JRadioButton("Male");        // one choice from a group
JRadioButton femaleBtn = new JRadioButton("Female");
ButtonGroup genderGroup = new ButtonGroup();            // makes them mutually exclusive
genderGroup.add(maleBtn);
genderGroup.add(femaleBtn);
boolean isMale = maleBtn.isSelected();

JCheckBox termsBox = new JCheckBox("I agree to the terms");   // independent on/off
boolean agreed = termsBox.isSelected();

panel.add(nameLabel);                                   // remember to add each one
panel.add(nameField);
panel.add(loginButton);
```

### Layout managers

A `JPanel` defaults to `FlowLayout`; a `JFrame`'s content pane defaults to `BorderLayout`.

```java
// FlowLayout: left to right, wraps when full
panel.setLayout(new FlowLayout());
panel.add(new JButton("One"));
panel.add(new JButton("Two"));

// BorderLayout: NORTH, SOUTH, EAST, WEST, CENTER (one component each)
frame.setLayout(new BorderLayout());
frame.add(northPanel, BorderLayout.NORTH);
frame.add(centerPanel, BorderLayout.CENTER);        // fills the leftover space
frame.add(southPanel, BorderLayout.SOUTH);

// GridLayout: equal cells, filled left to right, top to bottom
panel.setLayout(new GridLayout(2, 2));              // rows, columns
panel.add(new JButton("1"));
panel.add(new JButton("2"));
panel.add(new JButton("3"));
panel.add(new JButton("4"));

// CardLayout: stacked panels, one visible at a time
CardLayout cards = new CardLayout();
JPanel container = new JPanel(cards);
container.add(loginPanel, "login");                 // each card has a String name
container.add(dashboardPanel, "dashboard");
cards.show(container, "dashboard");                 // bring a card to the front
```

### Absolute positioning (discouraged)

```java
panel.setLayout(null);                              // turn the layout manager off
JButton button = new JButton("Click Me");
button.setBounds(50, 50, 100, 30);                  // x, y, width, height
panel.add(button);
```

### Action listeners: lambda form

The `ActionListener` interface has one method, `actionPerformed(ActionEvent e)`, so a lambda works.

```java
// button
JButton button = new JButton("Click Me");
button.addActionListener(e -> {
    System.out.println("Button was clicked!");
});

// text field: fires when Enter is pressed
JTextField searchField = new JTextField(15);
searchField.addActionListener(e -> {
    String query = searchField.getText();
    System.out.println("Searching for: " + query);
});

// radio buttons: one listener each
maleBtn.addActionListener(e -> System.out.println("Selected: Male"));
femaleBtn.addActionListener(e -> System.out.println("Selected: Female"));

// checkbox: test isSelected()
termsBox.addActionListener(e -> {
    if (termsBox.isSelected()) {
        System.out.println("Terms accepted");
    } else {
        System.out.println("Terms not accepted");
    }
});
```

### One listener for several components: getSource()

```java
ActionListener sharedListener = e -> {
    if (e.getSource() == button1) {
        System.out.println("Button 1 clicked");
    } else if (e.getSource() == button2) {
        System.out.println("Button 2 clicked");
    }
};
button1.addActionListener(sharedListener);
button2.addActionListener(sharedListener);
```

### Case study: five BorderLayout buttons with a switch

Each button sits in its own panel; one shared listener decides the message with `getActionCommand()`.

```java
JFrame frame = new JFrame("BorderLayout Buttons Case Study");
frame.setLayout(new BorderLayout());

JButton northBtn = new JButton("North");
JButton southBtn = new JButton("South");
JButton eastBtn = new JButton("East");
JButton westBtn = new JButton("West");
JButton centerBtn = new JButton("Center");

JPanel northPanel = new JPanel();  northPanel.add(northBtn);
JPanel southPanel = new JPanel();  southPanel.add(southBtn);
JPanel eastPanel = new JPanel();   eastPanel.add(eastBtn);
JPanel westPanel = new JPanel();   westPanel.add(westBtn);
JPanel centerPanel = new JPanel(); centerPanel.add(centerBtn);

frame.add(northPanel, BorderLayout.NORTH);
frame.add(southPanel, BorderLayout.SOUTH);
frame.add(eastPanel, BorderLayout.EAST);
frame.add(westPanel, BorderLayout.WEST);
frame.add(centerPanel, BorderLayout.CENTER);

ActionListener buttonListener = e -> handleButtonClick(e);
northBtn.addActionListener(buttonListener);
southBtn.addActionListener(buttonListener);
eastBtn.addActionListener(buttonListener);
westBtn.addActionListener(buttonListener);
centerBtn.addActionListener(buttonListener);

frame.setSize(400, 300);
frame.setVisible(true);
```

```java
public void handleButtonClick(ActionEvent e) {       // make it static if called from main
    String location;
    switch (e.getActionCommand()) {                  // defaults to the button's text
        case "North":  location = "You clicked the NORTH button!";  break;
        case "South":  location = "You clicked the SOUTH button!";  break;
        case "East":   location = "You clicked the EAST button!";   break;
        case "West":   location = "You clicked the WEST button!";   break;
        case "Center": location = "You clicked the CENTER button!"; break;
        default:       location = "Unknown button";
    }
    JOptionPane.showMessageDialog(null, location);   // pop-up message
}
```

### Mouse listeners

`MouseListener` covers `mousePressed`, `mouseReleased`, `mouseClicked`, `mouseEntered`, `mouseExited`. `MouseMotionListener` covers `mouseDragged` and `mouseMoved`. The adapter classes let you override only what you need.

```java
panel.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked at " + e.getX() + ", " + e.getY());
    }
});
```

### Drawing with the mouse

Store the points on drag, call `repaint()`, and draw them in `paintComponent`.

```java
import java.util.ArrayList;

class DrawingPanel extends JPanel {
    private ArrayList<Point> points = new ArrayList<>();

    public DrawingPanel() {
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                repaint();                               // asks Swing to call paintComponent again
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);                         // always call super first
        for (Point p : points) {
            g.fillOval(p.x, p.y, 4, 4);
        }
    }
}

// in main:
JFrame frame = new JFrame("Draw with the Mouse");
frame.add(new DrawingPanel());
frame.setSize(400, 400);
frame.setVisible(true);
```

## Lecture 13: Case study, Hotel Booking System

The hotel app is Lecture 11 (JDBC) wired into Lecture 12 (Swing): the GUI collects input, one method talks to MySQL, and the room list reloads from the database after every booking. The architecture is layered: Swing GUI, then event handlers and methods, then JDBC, then MySQL.

### Build order

1. Create the database and tables (SQL).
2. Write the class frame: JDBC fields, GUI fields, `connect()`.
3. Build the window: `BorderLayout` with title (NORTH), room list (CENTER), booking form (SOUTH).
4. Write `loadRooms()` to fill the list from the `rooms` table.
5. Write `bookRoom(...)` to insert into `bookings`.
6. Wire the Book button: read fields, call `bookRoom`, show a message, reload the rooms.
7. Write `main`: create the app, load rooms, show the frame.

### 1. Database

```sql
CREATE DATABASE hotel;

CREATE TABLE rooms (
    room_number INT PRIMARY KEY,
    room_type VARCHAR(30),
    price_per_night DOUBLE,
    is_available BOOLEAN
);

CREATE TABLE bookings (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    guest_name VARCHAR(50),
    room_number INT,
    check_in DATE,
    check_out DATE,
    FOREIGN KEY (room_number) REFERENCES rooms(room_number)
);
```

### 2 to 7. The whole class in one frame

```java
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class HotelBookingSystem {

    // JDBC settings (Lecture 11)
    private String url = "jdbc:mysql://localhost:3306/hotel";
    private String username = "root";
    private String password = "yourPassword";
    private Connection conn;

    // GUI parts that several methods need (Lecture 12)
    JFrame frame = new JFrame("Hotel Booking System");
    JTextArea roomListArea = new JTextArea();
    JTextField guestNameField = new JTextField();
    JTextField roomNumberField = new JTextField();
    JTextField checkInField = new JTextField();
    JTextField checkOutField = new JTextField();

    // 3. build the window
    public HotelBookingSystem() {
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Available Rooms", SwingConstants.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);                  // NORTH: title

        roomListArea.setEditable(false);                            // list is display only
        frame.add(roomListArea, BorderLayout.CENTER);               // CENTER: room list

        JPanel formPanel = new JPanel(new GridLayout(5, 2));        // SOUTH: booking form
        JButton bookButton = new JButton("Book Room");
        formPanel.add(new JLabel("Guest Name:"));             formPanel.add(guestNameField);
        formPanel.add(new JLabel("Room Number:"));            formPanel.add(roomNumberField);
        formPanel.add(new JLabel("Check-in (YYYY-MM-DD):"));  formPanel.add(checkInField);
        formPanel.add(new JLabel("Check-out (YYYY-MM-DD):")); formPanel.add(checkOutField);
        formPanel.add(new JLabel(""));                        formPanel.add(bookButton);
        frame.add(formPanel, BorderLayout.SOUTH);

        // 6. wire the button: read fields -> insert -> confirm -> refresh
        bookButton.addActionListener(e -> {
            try {
                String guestName = guestNameField.getText();
                int roomNumber = Integer.parseInt(roomNumberField.getText());
                String checkIn = checkInField.getText();
                String checkOut = checkOutField.getText();

                boolean success = bookRoom(guestName, roomNumber, checkIn, checkOut);
                if (success) {
                    JOptionPane.showMessageDialog(frame, "Room booked successfully!");
                    loadRooms();                                    // refresh from the database
                } else {
                    JOptionPane.showMessageDialog(frame, "Booking failed. Please try again.");
                }
            } catch (NumberFormatException ex) {                    // Lecture 10
                JOptionPane.showMessageDialog(frame, "Room number must be a whole number.");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // 2. connect (same pattern as the JDBC lecture)
    public boolean connect() {
        try {
            conn = DriverManager.getConnection(url, username, password);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    // 4. fetch rooms and show them
    public void loadRooms() {
        if (!connect()) {
            roomListArea.setText("Could not connect to the database");
            return;
        }
        StringBuilder sb = new StringBuilder();
        String sql = "SELECT * FROM rooms";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                sb.append("Room ").append(rs.getInt("room_number"))
                  .append(" - ").append(rs.getString("room_type"))
                  .append(" - $").append(rs.getDouble("price_per_night"))
                  .append("/night\n");
            }
        } catch (SQLException e) {
            sb.append("Error loading rooms: ").append(e.getMessage());
        }
        roomListArea.setText(sb.toString());                        // replace the whole text at once
    }

    // 5. insert a booking
    public boolean bookRoom(String guestName, int roomNumber,
                            String checkIn, String checkOut) {
        if (!connect()) {
            return false;
        }
        String sql = "INSERT INTO bookings (guest_name, room_number, " +
                     "check_in, check_out) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, guestName);
            ps.setInt(2, roomNumber);
            ps.setString(3, checkIn);
            ps.setString(4, checkOut);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    // 7. entry point
    public static void main(String[] args) {
        HotelBookingSystem app = new HotelBookingSystem();
        app.loadRooms();
        app.frame.setSize(500, 500);
        app.frame.setVisible(true);
    }
}
```

The JDBC driver (MySQL Connector/J) must be on the classpath, as in Lecture 11.

### Extending the system (from the final slide)

- Cancel Booking: a `cancelBooking(int bookingId)` method using the same pattern as `delete()` with `DELETE FROM bookings WHERE booking_id = ?`.
- Only show free rooms, and flip the flag when a room is booked:

```sql
SELECT * FROM rooms WHERE is_available = true;
UPDATE rooms SET is_available = false WHERE room_number = ?;
```

- Validate the form fields and replace the date text fields with a date picker.
- Replace the `JTextArea` with a `JTable` so the rooms show as a grid.
