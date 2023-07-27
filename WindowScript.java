import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class WindowScript extends JFrame {

  public WindowScript() {
    setSize(400, 300);
    setTitle("JFrame Example - JavaTpoint");
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

    addWindowListener(
      new WindowAdapter() {

        @Override
        public void windowDeiconified(WindowEvent e) {
          //   System.out.println("jhbjugbv");
          int option = JOptionPane.showConfirmDialog(
            null,
            "Do you want to continue?",
            "Confirmation",
            JOptionPane.YES_NO_OPTION
          );
          if (option == JOptionPane.YES_OPTION) {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
          } else {
            System.out.println("You chose No!");
          }
        }
      }
    );
  }

  public static void main(String[] args) {
    WindowScript window = new WindowScript();
    window.setVisible(true);
  }
}
