/*Allen G Meti
*24019726
*Lab 11 Question 7
*/

public class Question_7 {
    public static void main(String[] args) {

        Products products = new Products();

        //Updating the price of the product with id 1
        if (products.updatePrice(1, 18.00)) {
            System.out.println("Price updated");
        } else {
            System.out.println("Update failed");
        }
    }
}
