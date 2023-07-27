package bank_managment; // Corrected package name

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class RegisterForm extends JFrame implements ActionListener {
  public JButton signIn, clear, register;
  public JTextField CardtextField;
  public JPasswordField PintextField;

  RegisterForm() {
    Random ran = new Random();
    long random = Math(ran.nextLong() % 9000L + 1000L);
    JLabel titleLabel = new JLabel(
      "<html><h3>User Registration Form</h3></html>"
    );

    add(titleLabel);
    setTitle("user registration form");
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(800, 500);
    setLocation(150, 120);
    setVisible(true);
  }

  private long Math(long l) {
    return 0;
  }

  public void actionPerformed(ActionEvent e) {}

  public static void main(String[] args) {
    new RegisterForm();
  }
}
