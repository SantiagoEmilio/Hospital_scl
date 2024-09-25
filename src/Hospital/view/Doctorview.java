package Hospital.view;

import javax.swing.*;
import java.awt.*;

public class Doctorview extends JFrame {

    public Doctorview() {
        setSize(1300, 800);
        setLayout(new BorderLayout());

        // Panel superior (headerPanel)
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.GRAY);

        // Etiqueta para el nombre del hospital
        JLabel selpHospital = new JLabel("Hospital Santa Catalina", SwingConstants.LEFT);
        selpHospital.setForeground(Color.WHITE);
        selpHospital.setFont(new Font("SansSerif", Font.BOLD, 20));
        selpHospital.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0)); // Márgenes
        headerPanel.add(selpHospital, BorderLayout.WEST);

        // Panel derecho para la información del doctor
        JPanel panelUsuario = new JPanel(new GridLayout(2, 1, 5, 5));
        panelUsuario.setBackground(Color.GRAY);
        panelUsuario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20)); // Márgenes a la derecha

        // Nombre del doctor
        JLabel selpNombreDoctor = new JLabel("Emilio López", SwingConstants.CENTER);
        selpNombreDoctor.setForeground(Color.WHITE);
        selpNombreDoctor.setFont(new Font("SansSerif", Font.BOLD, 14));

        // Especialidad del doctor
        JLabel selpEspecialidad = new JLabel("Medicina General", SwingConstants.CENTER);
        selpEspecialidad.setForeground(Color.WHITE);
        selpEspecialidad.setFont(new Font("SansSerif", Font.PLAIN, 12));

        panelUsuario.add(selpNombreDoctor);
        panelUsuario.add(selpEspecialidad);

        headerPanel.add(panelUsuario, BorderLayout.EAST);
        add(headerPanel, BorderLayout.NORTH);

        // Panel izquierdo para el menú lateral
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBackground(Color.DARK_GRAY); // Fondo más atractivo
        menuPanel.setPreferredSize(new Dimension(200, 800)); // Ajusta el ancho del menú lateral

        // Crear botones del menú lateral
        for (int i = 1; i <= 5; i++) {
            JButton taskButton = new JButton("Opción " + i);
            taskButton.setBackground(Color.GRAY); // Color de fondo para los botones
            taskButton.setForeground(Color.WHITE); // Color del texto
            taskButton.setFont(new Font("SansSerif", Font.PLAIN, 16)); // Fuente del texto
            taskButton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Espaciado interno
            taskButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinear al centro

            // Efecto al pasar el mouse
            taskButton.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    taskButton.setBackground(Color.LIGHT_GRAY); // Color al pasar el mouse
                }

                public void mouseExited(java.awt.event.MouseEvent evt) {
                    taskButton.setBackground(Color.GRAY); // Color original
                }
            });

            menuPanel.add(taskButton);
            menuPanel.add(Box.createRigidArea(new Dimension(0, 10))); // Espacio entre botones
        }

        add(menuPanel, BorderLayout.WEST); // Agregar el menú lateral al lado izquierdo

        // Configuración de ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Doctorview::new);
    }
}





