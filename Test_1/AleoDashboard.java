import javax.swing.*;
import java.awt.*;

public class AleoDashboard extends JFrame {

    public AleoDashboard() {
        // 1. Window configuration
        setTitle("ALEO Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center on screen
        setLayout(null); // using absolute positioning for simplicity

        // 2. Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // File menu with New, Open, Save
        JMenu fileMenu = new JMenu("FILE");
        JMenuItem newItem = new JMenuItem("NEW");
        JMenuItem openItem = new JMenuItem("OPEN");
        JMenuItem saveItem = new JMenuItem("SAVE");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        // Edit and Tools menus (no items specified, but they should exist)
        JMenu editMenu = new JMenu("EDIT");
        JMenu toolsMenu = new JMenu("TOOLS");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(toolsMenu);
        setJMenuBar(menuBar);

        // 3. Heading label
        JLabel heading = new JLabel("ALEO DASHBOARD");
        heading.setFont(new Font("Arial", Font.PLAIN, 24));
        heading.setBounds(200, 80, 300, 40);
        add(heading);

        // 4. Name label and text field
        JLabel nameLabel = new JLabel("NAME");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        nameLabel.setBounds(150, 180, 80, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(240, 180, 250, 30);
        add(nameField);

        // 5. Login button
        JButton loginButton = new JButton("LOGIN");
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Arial", Font.PLAIN, 16));
        loginButton.setBounds(240, 240, 250, 40);
        // Optional: remove focus border for a cleaner look
        loginButton.setFocusPainted(false);
        add(loginButton);

        // 6. Make frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI creation on the Event Dispatch Thread (best practice)
        SwingUtilities.invokeLater(() -> new AleoDashboard());
    }
}