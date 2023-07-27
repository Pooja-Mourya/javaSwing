import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingScript {

  public class SwingClass implements ActionListener {
    JLabel l1;
    JLabel l2;

    SwingClass() {
      JFrame f = new JFrame(null, null);
      f.setVisible(true);
      f.setSize(380, 600);
      f.setLayout(new FlowLayout());

      l1 = new JLabel("Username : ");
      f.add(l1);
      JTextField lt = new JTextField(20);
      f.add(lt);
      lt.setBackground(Color.ORANGE);
      lt.setForeground(Color.BLUE);

      l2 = new JLabel("Password : ");
      f.add(l2);
      JTextField lp = new JTextField(20);
      f.add(lp);
      lp.setBackground(Color.ORANGE);
      lp.setForeground(Color.BLUE);

      JButton bts = new JButton("Submit");
      bts.setBounds(100, 20, 120, 80);
      f.add(bts);

      //   bts.addActionListener(
      //     new ActionListener() {
      //       @Override
      //       public void actionPerformed(ActionEvent e) {
      //       l1.setText("this is an eventListener username");
      //       l2.setText("this is an eventListener password");
      //       }
      //     }
      //   );

      bts.addActionListener(this);
    }

    // other methods and fields can be added here

    @Override
    public void actionPerformed(ActionEvent e) {
      l1.setText("this is an eventListener username");
      l2.setText("this is an eventListener password");
    }
  }

  public static void main(String arg[]) {
    SwingScript swingScript = new SwingScript();
    SwingClass sc = swingScript.new SwingClass();
  }
}
