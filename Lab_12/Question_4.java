/*Allen G Meti
*24019726
*Lab 12 Question 4
*/

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Question_4 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Greeting Form");
        frame.setLayout(new BorderLayout());

        //The form from Question 3
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        JLabel firstNameLabel = new JLabel("First name:");
        JTextField firstNameField = new JTextField(15);
        JLabel surnameLabel = new JLabel("Surname:");
        JTextField surnameField = new JTextField(15);

        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(surnameLabel);
        panel.add(surnameField);

        //The Greet Me button
        JButton greetButton = new JButton("Greet Me");

        //When clicked, read the first name field and greet the person in a JOptionPane
        greetButton.addActionListener(e -> {
            String firstName = firstNameField.getText();
            JOptionPane.showMessageDialog(frame, "Hello, " + firstName + "!");
        });

        //Form in the centre, button at the bottom
        frame.add(panel, BorderLayout.CENTER);
        frame.add(greetButton, BorderLayout.SOUTH);

        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
