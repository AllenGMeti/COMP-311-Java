/*Allen G Meti
*24019726
*Lab 11 Question 6
*/

public class Question_6 {
    public static void main(String[] args) {

        Products products = new Products();

        //Retrieving one product that exists and one that doesn't
        products.getProductById(1);
        products.getProductById(99);
    }
}
