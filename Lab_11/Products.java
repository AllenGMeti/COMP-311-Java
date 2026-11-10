/*Allen G Meti
*24019726
*Lab 11 Question 1,3,5,6,7,8,9
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Products {

    //Connection details (change the password to your own MySQL password)
    private String url = "jdbc:mysql://localhost:3306/store";
    private String username = "root";
    private String password = "yourPassword";
    private Connection conn;

    //Question 1: opens a connection, returns true if it works and false if it fails
    public boolean connect(String url, String username, String password) {
        try {
            //Closing the old connection (if there is one) before opening a new one
            if (conn != null) {
                conn.close();
            }
            conn = DriverManager.getConnection(url, username, password);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public boolean connect() {
        return connect(this.url, this.username, this.password);
    }

    //Question 3: inserts one row into the products table
    public boolean insertProduct(int id, String name, double price) {
        if (!connect()) {
            return false;
        }
        String sql = "INSERT INTO products (id, name, price) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, price);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    //Question 5: prints every row in the products table
    public void listProducts() {
        if (!connect()) {
            System.out.println("Could not connect to the database");
            return;
        }
        String sql = "SELECT * FROM products";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                System.out.println(id + ": " + name + " - " + price);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Question 6: prints only the product that matches the given id
    public void getProductById(int id) {
        if (!connect()) {
            System.out.println("Could not connect to the database");
            return;
        }
        String sql = "SELECT * FROM products WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Price: " + rs.getDouble("price"));
                } else {
                    System.out.println("No product found with id " + id);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Question 7: updates the price, returns true if a row was changed
    public boolean updatePrice(int id, double newPrice) {
        if (!connect()) {
            return false;
        }
        String sql = "UPDATE products SET price = ? WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, newPrice);
            ps.setInt(2, id);
            //executeUpdate() returns how many rows were changed
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    //Question 8: deletes the product, returns true if a row was deleted
    public boolean deleteProduct(int id) {
        if (!connect()) {
            return false;
        }
        String sql = "DELETE FROM products WHERE id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            //executeUpdate() returns how many rows were deleted
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    //Question 9: returns how many products are in the table
    public int countProducts() {
        int count = 0;
        if (!connect()) {
            System.out.println("Could not connect to the database");
            return count;
        }
        String sql = "SELECT COUNT(*) AS total FROM products";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                count = rs.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }
}
