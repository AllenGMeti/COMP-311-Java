/*Allen G Meti
*24019726
*Lab 10 Question 6
*/

public class Question_6 {

    //Method that declares it might throw an Exception
    public static void riskyMethod() throws Exception {
        throw new Exception("Something went wrong inside riskyMethod()");
    }

    public static void main(String[] args) {

        //The caller has to handle the exception
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
