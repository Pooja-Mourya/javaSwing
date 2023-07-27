package bank_managment; // Corrected package name

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WelcomeScreen extends JFrame implements ActionListener {
  public JButton signIn, clear, register;
  public JTextField CardtextField;
  public JPasswordField PintextField;

  WelcomeScreen() {
    setTitle("Bank Management System");
    setLayout(null);
    ImageIcon img = new ImageIcon("icons/thumbnail.png");

    Image image = img
      .getImage()
      .getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    ImageIcon img2 = new ImageIcon(image);
    JLabel label = new JLabel("", img2, JLabel.CENTER);
    label.setBounds(70, 10, 100, 100);
    getContentPane().setBackground(Color.WHITE);
    JLabel head = new JLabel("Welcome to ATM");
    head.setFont(new Font("Arial", Font.PLAIN | Font.BOLD, 36));
    head.setForeground(Color.decode("#4d9de0"));
    head.setBounds(200, 40, 400, 40);

    JLabel card = new JLabel("Card Number");
    card.setFont(new Font("Raleway", Font.PLAIN | Font.BOLD, 25));
    card.setBounds(200, 150, 400, 20);

    CardtextField = new JTextField("");
    CardtextField.setBounds(400, 150, 225, 30);

    JLabel pin = new JLabel("Pin Number");
    pin.setFont(new Font("Raleway", Font.PLAIN | Font.BOLD, 25));
    pin.setBounds(200, 200, 400, 20);

    PintextField = new JPasswordField();
    PintextField.setBounds(400, 200, 225, 30);

    signIn = new JButton("SignIn");
    signIn.setBackground(Color.decode("#4d9de0"));
    signIn.setBounds(300, 300, 100, 30);
    signIn.addActionListener(this);

    clear = new JButton("Clear");
    clear.setBounds(430, 300, 100, 30);
    clear.setBackground(Color.decode("#4d9de0"));

    register = new JButton("Register");
    register.setBounds(300, 350, 230, 30);
    register.setBackground(Color.decode("#4d9de0"));

    add(label);
    add(head);
    add(card);
    add(pin);
    add(CardtextField);
    add(PintextField);
    add(signIn);
    add(clear);
    add(register);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(800, 500);
    setLocation(150, 120);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == clear) {
      CardtextField.setText("");
      PintextField.setText("");
    } else if (e.getSource() == signIn) {
      System.out.println("signin");
    } else if (e.getSource() == register) {
      System.out.println("register");
    }
  }

  public static void main(String[] args) {
    new WelcomeScreen();
  }
}
