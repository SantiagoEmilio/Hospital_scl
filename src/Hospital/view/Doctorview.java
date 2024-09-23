package Hospital.view;

import javax.swing.*;
import java.awt.*;

public class Doctorview extends JFrame {
    private int[] pantalla = {1300, 800};

    public Doctorview() {
        // Configuración de la ventana principal
        this.setSize(pantalla[0], pantalla[1]);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Panel de cabecera
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.darkGray);
        headerPanel.setLayout(new BorderLayout());

        // Nombre del hospital en la cabecera
        JLabel nameHospital = new JLabel("Hospital Santa Catalina");
        nameHospital.setForeground(Color.WHITE);
        nameHospital.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0)); // Margen izquierdo
        headerPanel.add(nameHospital, BorderLayout.WEST);

        // Panel de información del usuario (lado derecho de la cabecera)
        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridBagLayout());
        userPanel.setBackground(Color.darkGray);

        // Etiqueta del logo del doctor
        JLabel logoLabel = new JLabel(); // Se puede agregar un icono aquí si se necesita
        logoLabel.setPreferredSize(new Dimension(50, 50));
        logoLabel.setBackground(Color.LIGHT_GRAY);
        logoLabel.setOpaque(true); // Asegura que el color de fondo se muestre
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado alrededor del logo
        userPanel.add(logoLabel, gbc);

        // Nombre del doctor
        JLabel doctorName = new JLabel("Dr. Juan Pérez");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        doctorName.setForeground(Color.WHITE);
        userPanel.add(doctorName, gbc);

        // Especialidad del doctor
        JLabel doctorEspecialidad = new JLabel("Cardiología");
        gbc.gridx = 1;
        gbc.gridy = 1;
        doctorEspecialidad.setForeground(Color.WHITE);
        userPanel.add(doctorEspecialidad, gbc);

        // Añadir el userPanel al lado derecho del header
        headerPanel.add(userPanel, BorderLayout.EAST);

        // Agregar el headerPanel al JFrame principal
        this.add(headerPanel, BorderLayout.NORTH);

        // Finalmente, hacer visible la ventana
        this.setVisible(true);
    }
}
