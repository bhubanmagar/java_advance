
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Set the layout of the frame to FlowLayout
        frame.setLayout(new FlowLayout());

//         // Add some buttons to the frame
//         for (int i = 1; i <= 5; i++) {
//             frame.add(new JButton("Button " + i));
//         }

//         JCheckBox checkBox = new JCheckBox();
//         JCheckBox checkBox1 = new JCheckBox();
//         checkBox.setBackground(Color.green);
//        checkBox.setText("hello mate");

//         frame.add(checkBox);
//         frame.add(checkBox1);


//         //radio button
//         JRadioButton radioButton = new JRadioButton("check me");
//         JRadioButton radioButton1 = new JRadioButton("check me");
//         JRadioButton radioButton2 = new JRadioButton("check me");
// ButtonGroup group =new ButtonGroup();
// group.add(radioButton);
// group.add(radioButton1);
//     frame.add(radioButton);
//         frame.add(radioButton1);


//         //combo box example
//         String[] animal= {"cat","dog","cow"};
//         JComboBox combobox = new JComboBox<>(animal);
//         frame.add(combobox);
  
// //slider examples
// JSlider slider = new JSlider(0,100,50);
// frame.add(slider);


// //menubar example
// JMenuBar menuBar = new JMenuBar();
// JMenu menu = new JMenu("fruits");
// JMenuItem item1 = new JMenuItem("mango");
// JMenuItem item2 = new JMenuItem("orange");
// JMenuItem item3 = new JMenuItem("guava");
// menuBar.add(menu);
// menu.setSize(200,500);
// menu.add(item1);
// menu.add(item2);
// menu.add(item3);
// frame.add(menuBar);


//action handler example
JButton button = new JButton("Click me!");
button.setSize(200,100);
frame.add(button);
button.addMouseListener(new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("mouse pressed");
    }
    @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
    
});

// Make the frame visible
frame.setVisible(true);
    }
}
