import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class ListScript {

  public static void main(String[] args) {
    JFrame t = new JFrame("menubar");
    t.getContentPane().setBackground(Color.ORANGE);

    t.setLayout(new BorderLayout()); // Use BorderLayout for the frame

    t.setSize(380, 600);
    t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    DefaultListModel<String> l1 = new DefaultListModel<String>();
    DefaultListModel<String> l2 = new DefaultListModel<String>();

    l1.addElement("rohini");
    l1.addElement("radhika");
    l1.addElement("reena");
    l1.addElement("reshma");

    l2.addElement("ahirvar");
    l2.addElement("parmar");
    l2.addElement("chidar");
    l2.addElement("gour");

    JList<String> name = new JList<>(l1);
    JList<String> surname = new JList<>(l2);
    JLabel jlable = new JLabel("user selected name and user name", null, 0);
    JButton jButton = new JButton("click list");

    jButton.addActionListener(
      new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          String option =
            "Selected name: " +
            name.getSelectedValue() +
            ", Selected surname: " +
            surname.getSelectedValue();
          jlable.setText(option);
        }
      }
    );

    t.add(name, BorderLayout.WEST); // Add name list to the left
    t.add(surname, BorderLayout.EAST); // Add surname list to the right
    t.add(jButton, BorderLayout.NORTH); // Add button to the top
    t.add(jlable, BorderLayout.SOUTH); // Add label to the bottom
    // t.add(name);
    // t.add(surname);
    // t.add(jButton);
    // t.add(jButton);

    t.setVisible(true);
  }
}
