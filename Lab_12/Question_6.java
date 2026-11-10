/*Allen G Meti
*24019726
*Lab 12 Question 6
*/

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Question_6 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hobbies");
        JPanel panel = new JPanel();

        //Two independent checkboxes
        JCheckBox musicBox = new JCheckBox("Music");
        JCheckBox sportsBox = new JCheckBox("Sports");

        JButton checkButton = new JButton("Show Checked");

        //Printing to the console which of the two are currently checked
        checkButton.addActionListener(e -> {
            if (musicBox.isSelected()) {
                System.out.println("Music is checked");
            }
            if (sportsBox.isSelected()) {
                System.out.println("Sports is checked");
            }
            if (!musicBox.isSelected() && !sportsBox.isSelected()) {
                System.out.println("Nothing is checked");
            }
        });

        panel.add(musicBox);
        panel.add(sportsBox);
        panel.add(checkButton);
        frame.add(panel);

        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
