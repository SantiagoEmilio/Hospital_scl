import javax.swing.*;
import java.awt.*;

public class Loginview {

    public Loginview() {
        // Crear el marco de la ventana
        JFrame frame = new JFrame("Login selp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // Centrar la ventana

        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // Para alineación controlada
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5); // Espaciado entre componentes
        constraints.fill = GridBagConstraints.HORIZONTAL;

        // Crear las etiquetas y campos de texto
        JLabel labelCorreo = new JLabel("Correo:");
        JTextField textCorreo = new JTextField(15);
        JLabel labelContrasena = new JLabel("Contraseña:");
        JPasswordField textContrasena = new JPasswordField(15);
        JButton buttonLogin = new JButton("Iniciar sesión");

        // Agregar componentes al panel con restricciones
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(labelCorreo, constraints);

        constraints.gridx = 1;
        panel.add(textCorreo, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(labelContrasena, constraints);

        constraints.gridx = 1;
        panel.add(textContrasena, constraints);

        // Para centrar el botón en el diseño
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(buttonLogin, constraints);

        // Añadir el panel a la ventana
        frame.add(panel);
        frame.setVisible(true);
    }
}
