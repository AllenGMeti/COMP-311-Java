Examination Preparation (All Topics Summarized)

1) Java Basics, Strings & Control Flow (Lecture 1-3)

-Platform Concepts: JDK(Execution), JRE(Runtime), JVM(Executes bytecode)
-Primitives vs References: Primitives (int, double, boolean, char) store actual values on the stack. Objects (String, Arrays, custom classes) store a reference (memory address) pointing to the heap.
-Strings: A string is a reference type. Methods to memorize: length(), charAt(), substring().equals(), (never use == for strings) 
-User Input: Scanner input = new Scanner(System.in);
-Loops: while(unknown iterations), do-while(must run atleast once), for(known iterations)
-Conditionals: if, if-else, switch

2) Arrays, Math & StringTokenizer (Lecture 4&8)

-Arrays: Fixed size, homogeneous. Index starts at 0. array.length is a field (no brackets). Memory is contigious.
-2D Arrays: int[][] grid = new int[3][4]. Iterate with nested loops.
-Arrays Utility Class: Arrays.sort(),Arrays.toString(), Arrays.copyOf().
-Math Class: Math.pow(), Math.sqrt(), Math.abs(), Math.max(). No import needed.
-StringTokenizer: Used to split strings. StringTokenizer st = new StringTokenizer ("apple, banana", ","); while(st.hasMoreTokens()){System.out.println(st.nextToken());}

3) Object Oriented Programming (Lecture 5,6,9)

-Class vs Object: Class is the blueprint. Object is the actual instance created with new.
-Encapsulation: Fields should be private. Access them via public getter/setter methods.
-The this Keyword: Refers to the current object. Essential in constructors when parameter names match the field names (this.name = name;).
-Method Overloading vs Overriding: Overloading (Compile time) same method name, different parameters, in a the same class. Overriding (Runtime) same method name, same parameters, in a subclass that extends a superclass
-Inheritence: class Dog extends Animal. Inherits fields/methods. Use super() to call the parent constructor.
-Polymorphism: Animal a = new Dog();. The Object's actual type (Dog) determines which overidden method runs at runtime
-Instanceof: Checks the actual type at runtime before casting.

4) File I/O & Exception Handling (Lectures 7&10)

-Reading Files: FileReader + Scanner. Use a while(scanner.hasNext()) loop.
-Writing Files: PrintWriter. Rememmber to call .close() 
-Exception Handing Syntax: try{risky code}catch (SpecificException e ){Handle it}finally{Always runs}
- Throw vs Throws: throw new Exception("Error"); (Used inside the method to trigger it). public void method() IOexception {...})(Used in the method signatture to declare it)
-Checked vs Unchecked: Checked(like IOException) must be handed or declared. Unchecked (like NullPointerException,), ArithmeticException) happen at runtime and dont strictly need handling.

5) JDBC with MySQL (Lecture 11)

-The Workflow:
  1. Connect: DriverManage.getConnection(url, user, pass)
  2.Create: Statement or preparedSratement.
  3.Execute: executeQuery() (for SELECT) or executeUpdate() (for INSERT/UPDATE/DELETE)
  4.Process: ResultSet (use while(rs.next())).
  5.Close resources.
-Statement vs PreparedStatement: PreparedStatementis precompiled, uses ? placeholders, is faster, and prevents SQL Injections. Always prefer PreparedStatement for user input.
  String sql = "INSERT INTO student (name) VALUES (?)";
  PreparedStatement ps = conn.prepareStatement(sql);
  ps.setString(1,"John");

6) Java Swing GUI (Lecture 12&13)

-Containers: JFrame (the window), JPanel (grouping container)
-Components: JLabel, JTextField, JButton.
-Layouts: 
  1.BorderLayout (Default for JFrame: NORTH, SOUTH, EAST, WEST, CENTER)
  2.FlowLayout (default for JPanel: left to right).
  3.GridLayout (Grid of equally sized cells).
-Absolute Positioning: setLayout(null); then button.setBounds(x, y, width, height);
-Event Handling: ActionListener. button.addActionListener(e -> {System.out.println("clecked!");});
