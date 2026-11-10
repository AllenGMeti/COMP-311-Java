/*Allen G Meti
*24019726
*Lab 12 Question 7
*/

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Question_7 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("BorderLayout Practice");
        frame.setLayout(new BorderLayout());

        //A panel with a label naming its region for each of the five regions
        JPanel northPanel = new JPanel();
        northPanel.add(new JLabel("NORTH"));

        JPanel southPanel = new JPanel();
        southPanel.add(new JLabel("SOUTH"));

        JPanel eastPanel = new JPanel();
        eastPanel.add(new JLabel("EAST"));

        JPanel westPanel = new JPanel();
        westPanel.add(new JLabel("WEST"));

        JPanel centerPanel = new JPanel();
        centerPanel.add(new JLabel("CENTER"));

        //Adding each panel to its region
        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(westPanel, BorderLayout.WEST);
        frame.add(centerPanel, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
