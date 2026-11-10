/*Allen G Meti
*24019726
*Lab 11 Question 4
*/

public class Question_4 {
    public static void main(String[] args) {

        Products products = new Products();

        //The five products to insert
        int[] ids = {2, 3, 4, 5, 6};
        String[] names = {"Milk", "Eggs", "Rice", "Sugar", "Tea"};
        double[] prices = {22.00, 30.50, 45.00, 28.75, 35.00};

        //Calling insertProduct() in a loop for each product
        for (int i = 0; i < ids.length; i++) {
            if (products.insertProduct(ids[i], names[i], prices[i])) {
                System.out.println(names[i] + " inserted");
            } else {
                System.out.println(names[i] + " failed to insert");
            }
        }
    }
}
