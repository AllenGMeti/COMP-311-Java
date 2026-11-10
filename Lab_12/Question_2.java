/*Allen G Meti
*24019726
*Lab 12 Question 2
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Question_2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Welcome");

        //A JLabel with the text centred
        JLabel welcomeLabel = new JLabel("Welcome to my first Swing app!", SwingConstants.CENTER);
        frame.add(welcomeLabel);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
