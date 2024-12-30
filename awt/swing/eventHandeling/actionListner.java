import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class actionListner extends JFrame implements WindowListener, ActionListener, MouseListener, KeyListener, ItemListener {

    private JButton button;
    private JLabel mouseLabel, keyLabel, itemLabel;
    private JCheckBox checkBox;
    private JColorChooser colorChooser ;

    public actionListner() {
        // Frame settings
        setTitle("Event Demo");
        setSize(500, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding window listener
        addWindowListener(this);

        // Button for ActionEvent
        button = new JButton("Click Me");
        button.addActionListener(this);
        add(button);

        // Label for MouseEvent
        mouseLabel = new JLabel("Hover or Click here!");
        mouseLabel.addMouseListener(this);
        add(mouseLabel);

        // Label for KeyEvent
        keyLabel = new JLabel("Type something!");
        keyLabel.setPreferredSize(new Dimension(200, 30));
        keyLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addKeyListener(this); // Adding key listener to the JFrame
        add(keyLabel);

        // Checkbox for ItemEvent
        checkBox = new JCheckBox("Check me!");
        checkBox.addItemListener(this);
        add(checkBox);

        // Label for ItemEvent display
        itemLabel = new JLabel("Checkbox is unchecked");
        add(itemLabel);

        //color chooser 
       

//file chooser
JFileChooser fileChooser = new JFileChooser();
add(fileChooser);

        // Setting focusable for key events
        setFocusable(true);
    }

    // ActionEvent: Button click
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(this, "Button clicked!");
        }
    }

    // MouseEvent: Hover or click on the label
    @Override
    public void mouseClicked(MouseEvent e) {
        mouseLabel.setText("Mouse clicked!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseLabel.setText("Mouse entered!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseLabel.setText("Mouse exited!");
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    // KeyEvent: Type something on the frame
    @Override
    public void keyTyped(KeyEvent e) {
        keyLabel.setText("Key typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    // ItemEvent: Checkbox state change
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkBox) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                itemLabel.setText("Checkbox is checked");
            } else {
                itemLabel.setText("Checkbox is unchecked");
            }
        }
    }

    // WindowEvent: Handle window state changes
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window minimized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window restored");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated");
    }

    // Main method
    public static void main(String[] args) {
        actionListner demo = new actionListner();
        demo.setVisible(true);
    }
}
