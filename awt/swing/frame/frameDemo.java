package awt.swing.frame;
import javax.swing.*;
import java.awt.*;

public class frameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button = new JButton("Click Me!");
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
