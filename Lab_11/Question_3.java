/*Allen G Meti
*24019726
*Lab 11 Question 3
*/

public class Question_3 {
    public static void main(String[] args) {

        Products products = new Products();

        //Inserting one product using insertProduct() from the Products class
        if (products.insertProduct(1, "Bread", 15.50)) {
            System.out.println("Product inserted");
        } else {
            System.out.println("Insert failed");
        }
    }
}
