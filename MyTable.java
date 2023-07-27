import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyTable {

  public static void main(String args[]) {
    JFrame t = new JFrame("Table");
    String data[][] = {
      { "John", "Doe", "22" },
      { "Jane", "Smith", "35" },
      { "Bob", "null", "25" },
      { "Alice", "Malik", "null" }, // empty string and missing value are both represented as 'null'
    };

    String column[] = { "Name", "Surname", "Age" };
    JTable jTable = new JTable(data, column);

    // Use a scroll pane for the table
    JScrollPane scrollPane = new JScrollPane(jTable);

    jTable.setCellSelectionEnabled(true);

    ListSelectionModel listSelectionModel = jTable.getSelectionModel();
    listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Fix: Use ListSelectionModel instead of listSelectionModel
    listSelectionModel.addListSelectionListener(
      new ListSelectionListener() {

        public void valueChanged(ListSelectionEvent e) {
          if (!e.getValueIsAdjusting()) { // Avoid processing the event twice
            int selectedRow = jTable.getSelectedRow();
            int selectedCol = jTable.getSelectedColumn();
            String data = (String) jTable.getValueAt(selectedRow, selectedCol);

            System.out.println(
              "Selected row: " +
              selectedRow +
              " - Selected Column: " +
              selectedCol +
              " - Data: " +
              data
            );
            // t.add(selectedRow);
            // t.add(selectedCol);
            // t.add(data.selectedCol);
          }
        }
      }
    );

    // Set the background color of the JFrame
    t.getContentPane().setBackground(Color.YELLOW);

    // Use BorderLayout and add the scroll pane to the center position
    t.setLayout(new BorderLayout());
    t.add(scrollPane, BorderLayout.CENTER);

    t.setSize(380, 600);
    t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    t.setVisible(true);
  }
}
