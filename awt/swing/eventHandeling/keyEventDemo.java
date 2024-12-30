package awt.swing.eventHandeling;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class keyEventDemo {
    public static void main(String[] args){
          // Create a JFrame
        JFrame frame = new JFrame("Button Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using null layout for manual positioning

        JTextField textField = new JTextField();
          textField.setBounds(100, 100, 200, 30);
        frame.add(textField);
        frame.setVisible(true);
       textField.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e){
            System.out.println("key pressed");
        }
       });
    }
}
 