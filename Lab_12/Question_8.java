/*Allen G Meti
*24019726
*Lab 12 Question 8
*/

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Question_8 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");
        frame.setLayout(new BorderLayout());

        //Panel holding the username and password fields
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(2, 2));

        JTextField usernameField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);

        formPanel.add(new JLabel("Username:"));
        formPanel.add(usernameField);
        formPanel.add(new JLabel("Password:"));
        formPanel.add(passwordField);

        JButton loginButton = new JButton("Login");

        //Printing the username and the password (turned into a String) to the console
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        });

        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(loginButton, BorderLayout.SOUTH);

        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
