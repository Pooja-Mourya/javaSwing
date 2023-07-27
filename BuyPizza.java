import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BuyPizza {

  public class SwingClass implements ActionListener {
    JCheckBox jbox1, jbox2, jbox3;
    JRadioButton radioB1, radioB2;
    JComboBox<String> comboDrop;

    SwingClass() {
      JFrame f = new JFrame("Buy Pizza");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(300, 300);

      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      f.add(mainPanel);

      jbox1 = new JCheckBox("Price 100");
      jbox2 = new JCheckBox("Price 200");
      jbox3 = new JCheckBox("Price 300");

      radioB1 = new JRadioButton("Male");
      radioB2 = new JRadioButton("Female");

      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(radioB1);
      buttonGroup.add(radioB2);

      comboDrop =
        new JComboBox<>(
          new String[] {
            "Option 1",
            "Option 2",
            "Option 3",
            "Option 4",
            "Option 5",
          }
        );

      JButton bts = new JButton("Submit");
      bts.addActionListener(this);

      mainPanel.add(jbox1);
      mainPanel.add(jbox2);
      mainPanel.add(jbox3);
      mainPanel.add(radioB1);
      mainPanel.add(radioB2);
      mainPanel.add(comboDrop);
      mainPanel.add(bts);

      f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      float price = 0;
      String msg = "";

      if (jbox1.isSelected()) {
        price += 100;
        msg += "Price is " + price + " for pizza with size small. \n";
      }
      if (jbox2.isSelected()) {
        price += 200;
        msg += "Price is " + price + " for pizza with size medium. \n";
      }
      if (jbox3.isSelected()) {
        price += 300;
        msg += "Price is " + price + " for pizza with size big. \n";
      }

      String gender = radioB1.isSelected() ? "Male" : "Female";
      msg += "Gender: " + gender + "\n";
      msg += "Selected option: " + comboDrop.getSelectedItem() + "\n";
      msg += "----------";

      JOptionPane.showMessageDialog(
        null,
        "Your order details are: \n" + msg + "\nTotal Price: " + price
      );
    }
  }

  public static void main(String arg[]) {
    BuyPizza buyPizza = new BuyPizza();
    SwingClass sc = buyPizza.new SwingClass();
  }
}
