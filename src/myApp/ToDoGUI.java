package myApp;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ToDoGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ToDoGUI::new);
    }

    private ToDoGUI() {
//        classes created, box is set
        TaskManager taskManager = new TaskManager();
        JFrame jFrame = new JFrame("To-Do list");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(400, 400);
        jFrame.setLayout(new BorderLayout());

//        View model
        DefaultListModel<Task> dlm = new DefaultListModel<>(); //might move to bottom
        JList<Task> jList = new JList<>(dlm);

//      A)  creating panel at top for add tasks
        JPanel topPanel = new JPanel();

//        creating input field for inserting
        JTextField jtf = new JTextField(15);
        JButton addTask = new JButton("Add a task");

//        adding both text field and button to A panel on top
        topPanel.add(jtf, BorderLayout.CENTER);
        topPanel.add(addTask, BorderLayout.EAST);


//        giving add button an action
        addTask.addActionListener(e -> {
            String input = jtf.getText();
            if(!input.isEmpty()) {
                dlm.addElement(taskManager.addTask(input));
                jtf.setText("");
            }
        });

//        adding panels to jFrame
        jFrame.add(topPanel, BorderLayout.NORTH);
        jFrame.add(new JScrollPane(jList), BorderLayout.CENTER);

        jFrame.setVisible(true);
    }
}
