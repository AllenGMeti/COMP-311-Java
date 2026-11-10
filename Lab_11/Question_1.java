/*Allen G Meti
*24019726
*Lab 11 Question 1
*/

public class Question_1 {
    public static void main(String[] args) {

        Products products = new Products();

        //Calling connect() from the Products class
        if (products.connect()) {
            System.out.println("Connected successfully!");
        } else {
            System.out.println("Connection failed");
        }
    }
}
