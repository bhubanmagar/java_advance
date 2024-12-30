import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ListDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dynamic JList Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // // DefaultListModel for dynamic updates
        // DefaultListModel<String> model = new DefaultListModel<>();
        // JList<String> list = new JList<>(model);
        // JScrollPane scrollPane = new JScrollPane(list);

        // // Text field and button to add items
        // JTextField textField = new JTextField(15);
        // JButton addButton = new JButton("Add Item");
        // addButton.addActionListener((ActionEvent e) -> {
        //     String newItem = textField.getText();
        //     if (!newItem.isEmpty()) {
        //         model.addElement(newItem);
        //         textField.setText("");
        //     }
        // });


        String data[]={"cat","dog","cow"};
        JList list = new JList<>(data);
        frame.add(list);
        // // Layout components
        // JPanel inputPanel = new JPanel();
        // inputPanel.add(textField);
        // inputPanel.add(addButton);

        // // frame.add(scrollPane, BorderLayout.CENTER);
        // frame.add(inputPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
