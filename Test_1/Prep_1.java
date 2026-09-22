public class Prep_1{
  public static void main(String[]args){

    //Declaring a string
     //1st way: String string-name = new String ("stringinput");
      String s = new String ("Hello");
      //2nd way: String string-name = "Stringinput";
      String st = "hello";

    //String Methods
      //length(), charAt(index), indexof(char), compare, equalsIgnoreCase(String)
      //Printing string methods results
      //System.out.println(stringname.stringmethod());
      System.out.println(s.length());

    //Printing
      //0st  way: System.out.print("Output");
      //1nd way: System.out.println("Output");
      System.out.println(s);

    //Input from the user
      // Step 1: import te scanner from the util package 
      import java.util.Scanner; 
      // Step 2: create the scanner
      Scanner scannername = new Scanner (System.in); 
      // Step 3: use the scanner to read any type of date from the user
      String sentence = input.nextline();

    //Conditionals
      // if, if else, if else if, switch case
      int test_mark = 100
       if (test_mark < 100){
         System.out.println("Not Terry Davis");
       }

    //File IO
      //Reading from files
      //Step 1: create file reader object
      FileReader reader = new FileReader (String filename);
      //Step 2: Scannerize the file
      Scanner Sc = new Scanner (reader);
      //Step 1 and 2 in one line
      Scanner sc = new Scanner (new FileReader(String filename));
      //Exception handler
      //Option 1: using throws keyword
      try {
      // risky code
      } catch (Exception e) {
      // what to do if error happens
      }
      //Option 2:
      public static void main(String[] args) throws Exception

      //Writing to files
      PrintWriter identifier = new PrintWriter (String filename);
      writer.write("Hello World");
      writer.close();

    //Iteration
      //While loop
      while(condition){//code}
      //Do-while loop
      do {code } while(condition)
      //For loop
      for(intitialise; condition; update){//code}
      //Enhanced for loop
      for(dataType item : collection){//code}

    //Classes amd objects
      //Creating a Classes
      public class Student{
        private String name;
      }
      //Creating a constructor
      public Student(){
        this.name = "";
      }
      //Creating objects
      Student s1 = new Student("Amantle");
      //Creating methods
      public void SetName(StringName)(
          this.name = name;
          )
      //Access modifiers
      private , public, protected

    //Methods
      //Creating a methods
      modifier returnType methodName(parameterList){//body}
      public static int add (int a, int b){
        return a+b;
      }
      //Calling a method
      showMethod();
      //Method overriding 
      class Dog extends Animal {
      @Override
      public String makeSound() {
      return "Woof!";
      }
      }
      //Static methods
      public class MathHelper {
      public static int square(int n) { // static
      return n * n;
      }
      //Instance methods
      public class Student {
      private double gpa;
      public double getGpa() { // instance
      return gpa;
      }
      }
      //Pass by value
      public static void main(String[] args) {
      int value = 5;
      increment(value);
      System.out.println("Back in main: " + value); // still 5!

    // StringTokinizer
      //Creating a string tokinizer
      StringTokineizer st = new StringTokinizer("Java is the pits");
      //StringTokenizer Methods
      //hasMoreTokens(), nextToken(), countTokens()
      System.out.println(st.nextToken());

    //Java Swing
      //Creating a JFrame
      JFrame frane = new JFrame ("My first Swing App");
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      //Creating a JPanel
      JPanel panel = new JPanel();
      panel.add(new JLabek("Hello, Swing!"));
      frame.add(panel);
      //Creating a JLabel
      JLabel nameLabel = new JLabel("Name:");
      panel.add(namelabel)
      //Creating a JTextField
      JTextField nameField = new JtextField(15);
      panel.add(nameField);
      String typed = nameField.getText();
      //Creating a JButton 
      JButton loginButton = new JButton("Login");
      panel.add(loginButton);
      //Creating Boarder layout
      frame.setLayout(new BorderLayout());
      JPanel northPanel = new JPanel();
      northPanel.add(new JLabel("Header"));
      frame.add(northPanel, BorderLayout.NORTH);

  }
}
