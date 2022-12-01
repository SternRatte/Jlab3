package com.task;

import javax.swing.*;
import java.awt.*;

public class Table {
    /**
     * @param elapsedArrayListAdd - time of the Add operation in ArrayList
     * @param elapsedArrayListGet - time of the Get operation in ArrayList
     * @param elapsedArrayListDelete - time of the Delete operation in ArrayList
     * @param elapsedLinkedListAdd - time of the Add operation in LinkedList
     * @param elapsedLinkedListGet - time of the Get operation in LinkedList
     * @param elapsedLinkedListDelete - time of the Delete operation in LinkedList
     */
    public static void createGUI(long elapsedArrayListAdd, long elapsedArrayListGet, long elapsedArrayListDelete, long elapsedLinkedListAdd,
                                 long elapsedLinkedListGet, long elapsedLinkedListDelete) {
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                "Array name",
                "Add (нс)",
                "Get (нс)",
                "Delete (нс)"
        };

        String[][] data = {
                {"ArrayList", String.valueOf(elapsedArrayListAdd), String.valueOf(elapsedArrayListGet), String.valueOf(elapsedArrayListDelete)},
                {"LinkedList", String.valueOf(elapsedLinkedListAdd), String.valueOf(elapsedLinkedListGet), String.valueOf(elapsedLinkedListDelete)}
        };

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
