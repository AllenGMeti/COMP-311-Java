/*Allen G Meti
*24019726
*Lab 12 Question 10
*/

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Question_10 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Number Pad");
        frame.setLayout(new BorderLayout());

        //The display label at the top
        JLabel display = new JLabel("", SwingConstants.CENTER);
        display.setPreferredSize(new Dimension(300, 40));
        frame.add(display, BorderLayout.NORTH);

        //Panel for the number buttons using a 4 by 3 grid
        JPanel padPanel = new JPanel();
        padPanel.setLayout(new GridLayout(4, 3));

        //One listener shared by every button, it adds the button's digit to the display
        ActionListener digitListener = e -> {
            display.setText(display.getText() + e.getActionCommand());
        };

        //Buttons 1 to 9
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("" + i);
            button.addActionListener(digitListener);
            padPanel.add(button);
        }

        //Last row: empty space, button 0, empty space
        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(digitListener);
        padPanel.add(new JLabel(""));
        padPanel.add(zeroButton);
        padPanel.add(new JLabel(""));

        frame.add(padPanel, BorderLayout.CENTER);

        frame.setSize(300, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
