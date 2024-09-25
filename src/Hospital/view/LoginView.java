package Hospital.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel tasksPanel;

    public LoginView() {
        setTitle("Login selp");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Panel principal con GridLayout de 1 fila y 2 columnas
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        // Panel izquierdo para el menú de tareas
        tasksPanel = new JPanel(new GridLayout(5, 1));
        tasksPanel.setBackground(Color.LIGHT_GRAY);

        // Crear botones de tareas
        for (int i = 1; i <= 5; i++) {
            JButton taskButton = new JButton("Tarea " + i);
            tasksPanel.add(taskButton);
        }

        // Agregar el panel de tareas al panel izquierdo
        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(Color.BLUE);
        leftPanel.add(tasksPanel, BorderLayout.CENTER);

        // Panel derecho para el formulario de inicio de sesión
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setLayout(null); // Layout para posicionar manualmente los componentes

        JLabel userLabel = new JLabel("Usuario:");
        JLabel passwordLabel = new JLabel("Contraseña:");

        userTextField = new JTextField(15);
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Iniciar sesión");

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

        // Agregar paneles al panel principal
        mainPanel.add(leftPanel);
        mainPanel.add(rightPanel);

        add(mainPanel);
        setVisible(true);
    }

    public String getName() {
        return userTextField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }
}



