package lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import static jdk.javadoc.internal.doclets.toolkit.util.DocletConstants.NL;

public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JPanel controlPanel2;


    public SwingControlDemo(){
        prepareGUI();
    }
    public static void main(String[] args){
        SwingControlDemo  swingControlDemo = new SwingControlDemo();
        swingControlDemo.showTextFieldDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Java Swing Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        controlPanel2 = new JPanel();
        controlPanel2.setLayout(new FlowLayout());


        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);

        //mainFrame.add(statusLabel);
        mainFrame.add(controlPanel2);
        mainFrame.setVisible(true);
    }
    private void showTextFieldDemo(){
        headerLabel.setText("Control in action: JTextField");

        JLabel  namelabel= new JLabel("User ID: ", JLabel.RIGHT);
        JLabel  passwordLabel = new JLabel("Password: ", JLabel.CENTER);
        final JTextField userText = new JTextField(6);
        final JPasswordField passwordText = new JPasswordField(6);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Username " + userText.getText();
                data += ", Password: " + new String(passwordText.getPassword());
                statusLabel.setText(data);
            }
        });

        JRadioButton radio1 = new JRadioButton("1");
        JRadioButton radio2 = new JRadioButton("2");
        JRadioButton radio3 = new JRadioButton("3");
        JLabel radiolabel = new JLabel("Radio:");

        controlPanel.add(namelabel);
        controlPanel.add(userText);
        controlPanel.add(passwordLabel);
        controlPanel.add(passwordText);
        controlPanel.add(loginButton);

        controlPanel2.add(radiolabel);
        controlPanel2.add(radio1);
        controlPanel2.add(radio2);
        controlPanel2.add(radio3);
        mainFrame.setVisible(true);
    }
}
