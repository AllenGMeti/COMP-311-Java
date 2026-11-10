/*Allen G Meti
*24019726
*Lab 11 Question 2
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question_2 {
    public static void main(String[] args) {

        //Connection details (change the password to your own MySQL password)
        String url = "jdbc:mysql://localhost:3306/store";
        String username = "root";
        String password = "yourPassword";

        //SQL statement that creates the products table
        String sql = "CREATE TABLE products (" +
                     "id INT PRIMARY KEY, " +
                     "name VARCHAR(50), " +
                     "price DOUBLE)";

        //Connecting and running the statement, both are closed automatically
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Table created!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
