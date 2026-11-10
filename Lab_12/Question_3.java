/*Allen G Meti
*24019726
*Lab 12 Question 3
*/

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Question_3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Form");

        //Creating the panel with a 2 by 2 grid
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        //One label and text field for the first name, one pair for the surname
        JLabel firstNameLabel = new JLabel("First name:");
        JTextField firstNameField = new JTextField(15);
        JLabel surnameLabel = new JLabel("Surname:");
        JTextField surnameField = new JTextField(15);

        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(surnameLabel);
        panel.add(surnameField);

        //Adding the panel to the frame
        frame.add(panel);

        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
