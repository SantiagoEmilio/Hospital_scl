package Hospital.view;

import javax.swing.*;
import java.awt.*;

public class Doctorview extends JFrame {
    private int [] pantalla = {1300, 800};

    public Doctorview(){
        this.setSize(pantalla[0], pantalla[1]);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel();
        headerPanel.setSize(1300,60);
        headerPanel.setBackground(Color.darkGray);
        headerPanel.setLayout(new BorderLayout());

        JLabel nameHospital = new JLabel("Hospital Santa catalina");
        nameHospital.setForeground(Color.WHITE);
        //Le decimos a nameHospital que se ubique al este de headerPanel
        headerPanel.add(nameHospital, BorderLayout.WEST);

        //Le decimos a headerPanel que se ubique al norte o hasta arriba de la ventana
        this.add(headerPanel, BorderLayout.NORTH);

        JPanel userPanel = new JPanel();
        userPanel.setLayout(new GridBagLayout());
        userPanel.setBackground(Color.darkGray);

        JPanel logoPanel = new JPanel();
        logoPanel.setPreferredSize(new Dimension(50, 50));
        logoPanel.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        userPanel.add(logoPanel, gbc);

        JLabel doctorName = new JLabel("Dr. Juan Pérez");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        doctorName.setForeground(Color.white);
        userPanel.add(doctorName, gbc);

        JLabel doctorEspecialidad = new JLabel("Cardiología");
        gbc.gridx = 1;
        gbc.gridy = 1;
        doctorEspecialidad.setForeground(Color.white);
        userPanel.add(doctorEspecialidad, gbc);

        //Le decimos a userPAnel que se ubique al centro de la ventana
        headerPanel.add(userPanel, BorderLayout.EAST);
    }
}