import javax.swing.*;
import java.awt.event.*;

public class eventDemo {
    public static void main(String[] args)  {
        // Create a JFrame
        JFrame frame = new JFrame("Button Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using null layout for manual positioning

        // Create a JButton
        JButton button = new JButton("Click me!");
        button.setBounds(100, 100, 200, 100); // Use setBounds for position and size
        frame.add(button);

        // Add MouseAdapter to the button
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Button clicked!");
            }
        });
button.addMouseListener(this);


        // Make the frame visible
        frame.setVisible(true);
    }
}
