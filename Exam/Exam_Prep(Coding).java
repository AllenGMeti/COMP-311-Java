Learning how to code 

Lecture 1: Syntax fundamentals

-Primitive types -> type name = value; eg int age = 20;
 1. int 
 2. double
 3. char
 4. boolean
-Referece types (Starts with capital letter) -> type name =value; eg String name = "Allen";
 1. String 
 2. Arrays
* A primitive type holds the actual value whereas the reference type holds the memory address
-Syntax rules in a code snippet:
public class HelloWorld {                   //filename must be HelloWorld.java, class names use PascalCase
  public static void main(String[] args){   // Main and main are different 
    int x = 5;                              // Every statement ends with;, variable names use camelCase
    System.out.println(x);                  // {} wrap every block
  } 
}

Lecture 2: Strings, user input and conditionals 

*The pattern is the same:
 1. Create the String
 2. Read the value
 3. Test it with a conditional
-Strings -> type name = value; eg String name = "Allen";A string is a reference type hence always being declared by upper case letter. 
-String Methods:
 1. int len = name.legth();
 2. char a = name.charAt(0);
 3. int pos = name.indexOf('l');
 4. String part = name.substring(1,3);
 5. boolean a = name.equals(s2);
 6. boolean b = name.equalsIgnoreCase("HELLO");
 7. int cmp = name.compareTo(s2);
* Compare stirngs with equals(), not =
-Reading input with Scanner -> 1.Import it, 2.Create it, 3.Read with it , 4.Close it 
-Code snippet:
import java.util.Scanner;                     //1. Import from java.util
public class InputDemo{    
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);   //2. Create the scanner
    String word = input.next();               //3. Read one word
    int age = input.nextInt();                //   Read int
    double salary - input.nextDouble();       //   Read double
    input nextLine();                         //   Consume the leftover newline
    String sentence = input.nextLine();       //   Read whole line
    input.close();                            //5. Close scanner
  }
}
-Conditionals -> 1.Read, 2.Test 3.Act, If/ else if/ else, switch
-Code snippet(if,else if,if): 
if (condition) {
 // runs when condition is true 
} else if (otherCondition){
// runs when first was false and this is true
} else {
// last resort
}
-code snippet(switch):
swith(value){
 case "case1":
  //code
  break;
case "case2":
  //code
  break;
default:
  //runs when nothing matched
}

Lecture 3: Iteration 

*Use while for unknown repeats
*Use do-while to run atleast once 
*Use for for known counts 

-While loop -> Condition checked before each iteration. Number of repeats is unknown.
Code snippet:
int count = 1;                           //1. Initialise
while (count <= 5){                      //2. Test
  System.out.println("Count: " + count);
  count++;                               //3. Update 
}

-Do-while -> Condition checked after each iteration. Body must run at least once.
-Code snipper:
int count = 1;                          //1. Initialise
do{
System.out.println("Count: " + count);
count++;                                //2. Update
}while (count <= 5);                    //3. Test

-For -> Condition checked before iteration. Used for visiting every element of an array or collection.
-Code snippet:
for (int i =1; i <= 5; i++){            //1. Initialise; Condition; Update;
  System.out.println("Count: " + i);
}

-Enhanced for(for each) -> Condition check is held internally. Used when visiting every member of an array or collection.
-Code snippet:
int [] numbers = {10, 20, 30, 40, 50};
for (int num : numbers){
  System.out.println(num);             //1. DataType item : collection
}

Lecture 4: Arrays 

*An array is declared, created with new (or a literal), then accessed by index from 0 to length -1. Its size is fixed once created.
-Declaring an array -> Creates only the references.
-Code snippet:
int [] ages;
double [] prices;
-Initialising an array -> There are 3 ways it can be done.
-Code snippet:
int [] ages = new int [5];
int [] scores = new int [] {90,85,77,60, 45};
int [] marks = {90, 85,77,60, 45};
String [] names = {"Allen","Goabaone","Meti"};
-Access, change and length
-Code snippet:
int first = marks [0];
marks [2] = 80:
int size = marks.length;
int last = marks[marks.length -1];
-The Arrays class
-Code snippet:
import java.util.Arrays;
Arrays.sort(marks);                                  // 1. sorts in place
System.out.println(Arrays.toString(marks));          //2. prints [45, 60, 77, 85, 90]
int[] copy = Arrays.copyOf(marks, marks.length);
boolean same = Arrays.equals(marks, copy);
Arrays.fill(ages, 7);                                //3. every element = 7
 -Loop through 1D array
Code snippe:
for (int i = 0; i < marks.length; i++){
  System.out.println("Index" + ":" + marks[i]); // 1. Standard for loop
}
for (int mark: marks){
  System.out.println(mark);
}
-2D Arrays -> Array of an arrays. type [][] name;
-Code snippet:
int [][] grid = new int[3][4];  //1. Initialises an array with 3 rows and 4 columns, all default to 0.
System.out.println(scores[1][2]); //2. Prints row 1 column 2 
-Iteration on 2D Arrays with nested loop -> Outer runs over rows (array.legth), inner loop over the columns of that row(array[row].length)
-Code snippet:
for (int row = 0; row < scores.length; row++) {
    for (int col = 0; col < scores[row].length; col++) {
        System.out.print(scores[row][col] + " ");
    }
    System.out.println();
}
// enhanced version
for (int[] row : scores) {
    for (int value : row) {
        System.out.print(value + " ");
    }
    System.out.println();
}

Lecture 5: Classes and Objects

-A class is the bluesprint, written once, objects are the real instances you create from it with new.
-Order of writing class:
 1. Private public 
 2. Constructors 
 3. Getters and Getters
 4. Behaviour methods 
-Code snippet:
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
-The this keyword -> this is the current object. Use this.field = parameter; when names match and this(...) to call another constructor in the same class.
-Code snippet:
public Student(){
this("", 0,0.0);      //1. Calls Student(String, int, double)
}
-Create and use objects -> ClassName variableName = new ClassName(arguments);
-Code snippet:
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
-Access Modifiers:
 1. Private
 2. Public 
*Encapsulation means private fields plus public methods that control access.

Lecture 6: Java methods

-A method is a named, reusable block that only runs when it is called.
- modifier returnType methodName(parameters){body}.
-Code snippet:
public static int add(int a, int b) {   // modifier + return type + name + parameters
    return a + b;                       // body
}
-Calling methods:
public class Main {
    public static void main(String[] args) {
        showMessage();                    // void: call on its own line
        double result = square(4.0);      // value-returning: store or use the result
        int sum = add(5, 3);              // 5 and 3 = arguments
        greet("Amantle", 20);
        double p = Math.pow(2, 3);        // static method of another class: ClassName.method()
    }
}
-Overloading -> Same class, same name, different parameters
-Code snippet:
public static int add(int a, int b) {
    return a + b;
}
public static double add(double a, double b) {
    return a + b;
}
public static int add(int a, int b, int c) {
    return a + b + c;
}
-Overriding -> Subclass replaces a parent method
-Code snippet:
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
-Static/instance
-Code snippet
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
-Pass by value -> Java always passes a copy. Changes inside the method do not affect the actual variable
-Code snippet:
public static void increment(int number) {
    number = number + 1;
    System.out.println("Inside method: " + number);   // 6
}

public static void main(String[] args) {
    int value = 5;
    increment(value);
    System.out.println("Back in main: " + value);     // still 5
}

