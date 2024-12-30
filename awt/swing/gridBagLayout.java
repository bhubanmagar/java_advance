import javax.swing.*;
import java.awt.*;
public class gridbaglayotdemo extends JPanel {
JButton b1, b2, b3, b4, b5;
GridBagConstraints gbc = new GridBagConstraints();
public gridbaglayotdemo() {
b1 = new JButton("First Button");
setLayout(new GridBagLayout());
gbc.insets = new Insets(5, 5, 5, 5);// top.left,bottom,right spacing among buttons
// 0,0 positioning in JPanel
// remember gridx iscolumn and gridy is a row
gbc.gridx = 0;
gbc.gridy = 0;
gbc.gridheight = 5;// 5 wide spaces for button 1
gbc.fill = GridBagConstraints.VERTICAL;// fills all spaces specified by gridheight vertically
add(b1, gbc);// added to jpanel
b2 = new JButton("Second Button");
// 1,1 positioning in JPanel
gbc.gridx = 1;
gbc.gridy = 1;
gbc.gridheight = 1;//fixed height of Second Button
add(b2, gbc);// added to jpanel
b3 = new JButton("Third Button");
// 2,2 positioning in JPanel
gbc.gridx = 2;
gbc.gridy = 2;
gbc.gridheight = 1;
add(b3, gbc);// added to jpanel

b4 = new JButton("Fourth Button");
// 3,3 positioning in JPanel
gbc.gridx = 3;
gbc.gridy = 3;
gbc.gridheight = 1;
add(b4, gbc);// added to jpanel
b5 = new JButton("Fifth Button");
// 4,4 positioning in JPanel
gbc.gridx = 1;
gbc.gridy = 4;
gbc.gridheight = 1;
gbc.gridwidth = 3;// 3 wide spaces for button 5
gbc.fill = GridBagConstraints.HORIZONTAL;// fills all spaces specified by gridwidth horizontally
add(b5, gbc);// added to jpanel
}
public static void main(String[] args) {
gridbaglayotdemo panel = new gridbaglayotdemo();
JFrame frame = new JFrame();
frame.setVisible(true);
frame.setSize(600, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);//jpanel addedto JFrame
}
}