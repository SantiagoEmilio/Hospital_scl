package Hospital.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame{

    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView() {

        setTitle("Login");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));


        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setLayout(null); // Layout para posicionar manualmente los componentes

        JLabel userLabel = new JLabel("Usuario:");
        JLabel passwordLabel = new JLabel("Contraseña:");
        JTextField userTextField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JButton loginButton = new JButton("Iniciar sesión");

        userLabel.setBounds(100, 200, 80, 25);
        userTextField.setBounds(180, 200, 200, 25);
        passwordLabel.setBounds(100, 240, 80, 25);
        passwordField.setBounds(180, 240, 200, 25);
        loginButton.setBounds(180, 300, 200, 30);

        rightPanel.add(userLabel);
        rightPanel.add(userTextField);
        rightPanel.add(passwordLabel);
        rightPanel.add(passwordField);
        rightPanel.add(loginButton);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.ORANGE);

        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        add(mainPanel);
    }

    public String getEmail(){
        return userTextField.getText();
    }
    public String getPassword() {
        return new String(passwordField.getPassword());
    }
    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }
}


