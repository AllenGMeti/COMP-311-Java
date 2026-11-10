/*Allen G Meti
*24019726
*Lab 11 Question 8
*/

public class Question_8 {
    public static void main(String[] args) {

        Products products = new Products();

        //Deleting the product with id 6
        if (products.deleteProduct(6)) {
            System.out.println("Product deleted");
        } else {
            System.out.println("Delete failed");
        }
    }
}
