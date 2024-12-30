import java.awt.BorderLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

public class BorderLayoutExample{

BorderLayoutExample(){
JFrame f = new JFrame();

JButton b1 = new JButton("NORTH");

JButton b2 = new JButton("SOUTH");

JButton b3 = new JButton("EAST");

JButton b4 = new JButton("WEST");

JButton b5 = new JButton("CENTER");

f.add(b1,BordeLayout.NORTH);

f.add(b2,BordeLayout.SOUTH);

f.add(b3,BordeLayout.EAST);

f.add(b4,BordeLayout.WEST);

f.add(b5,BordeLayout.CENTER);

f.setSize(300,300);

f.setVisible(true);

}

public static void main(string[] args){

new BorderLayoutExample();

}

}