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

        // Etiqueta para el nombre del hospital con margen
        JLabel selpHospital = new JLabel("Hospital Santa Catalina", SwingConstants.LEFT);
        selpHospital.setForeground(Color.WHITE);
        selpHospital.setFont(new Font("SansSerif", Font.BOLD, 20));
        selpHospital.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0)); // Márgenes: arriba, izquierda, abajo, derecha
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

        // Configuración de ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Doctorview::new);
    }
}




