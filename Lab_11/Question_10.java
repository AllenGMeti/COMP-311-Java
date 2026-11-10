/*Allen G Meti
*24019726
*Lab 11 Question 10
*/

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Products products = new Products();

        int choice = 0;

        //Showing the menu again and again until the user chooses 5 (Exit)
        while (choice != 5) {

            System.out.println();
            System.out.println("1. Insert");
            System.out.println("2. View All");
            System.out.println("3. Update Price");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            //Calling the matching method for the chosen option
            switch (choice) {
                case 1:
                    System.out.print("Enter id: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter price: ");
                    double price = input.nextDouble();

                    if (products.insertProduct(id, name, price)) {
                        System.out.println("Product inserted");
                    } else {
                        System.out.println("Insert failed");
                    }
                    break;
                case 2:
                    products.listProducts();
                    break;
                case 3:
                    System.out.print("Enter id of the product: ");
                    int updateId = input.nextInt();

                    System.out.print("Enter the new price: ");
                    double newPrice = input.nextDouble();

                    if (products.updatePrice(updateId, newPrice)) {
                        System.out.println("Price updated");
                    } else {
                        System.out.println("Update failed");
                    }
                    break;
                case 4:
                    System.out.print("Enter id of the product to delete: ");
                    int deleteId = input.nextInt();

                    if (products.deleteProduct(deleteId)) {
                        System.out.println("Product deleted");
                    } else {
                        System.out.println("Delete failed");
                    }
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        input.close();
    }
}
