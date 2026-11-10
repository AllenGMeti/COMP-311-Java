/*Allen G Meti
*24019726
*Lab 12 Question 9
*/

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Custom panel the user can draw on
class DrawingPanel extends JPanel {

    //Every point the mouse has been dragged over
    private ArrayList<Point> points = new ArrayList<>();

    public DrawingPanel() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                //Saving the point and asking Swing to draw the panel again
                points.add(e.getPoint());
                repaint();
            }
        });
    }

    //Drawing a small dot at every saved point
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Point p : points) {
            g.fillOval(p.x, p.y, 4, 4);
        }
    }
}

// Main class
public class Question_9 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Draw with the Mouse");
        frame.add(new DrawingPanel());

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
