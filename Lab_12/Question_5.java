/*Allen G Meti
*24019726
*Lab 12 Question 5
*/

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Question_5 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Favourite Food");
        JPanel panel = new JPanel();

        //Three radio buttons
        JRadioButton pizzaBtn = new JRadioButton("Pizza");
        JRadioButton burgerBtn = new JRadioButton("Burger");
        JRadioButton pastaBtn = new JRadioButton("Pasta");

        //Adding them to the same ButtonGroup so only one can be selected at a time
        ButtonGroup foodGroup = new ButtonGroup();
        foodGroup.add(pizzaBtn);
        foodGroup.add(burgerBtn);
        foodGroup.add(pastaBtn);

        JButton showButton = new JButton("Show Choice");

        //Checking which radio button is selected and showing it in a JOptionPane
        showButton.addActionListener(e -> {
            String choice;
            if (pizzaBtn.isSelected()) {
                choice = "Pizza";
            } else if (burgerBtn.isSelected()) {
                choice = "Burger";
            } else if (pastaBtn.isSelected()) {
                choice = "Pasta";
            } else {
                choice = "Nothing selected";
            }
            JOptionPane.showMessageDialog(frame, "You selected: " + choice);
        });

        panel.add(pizzaBtn);
        panel.add(burgerBtn);
        panel.add(pastaBtn);
        panel.add(showButton);
        frame.add(panel);

        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
