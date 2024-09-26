package Hospital.view;

import Hospital.modell.paciente; // Asegúrate de importar la clase Paciente
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class pacienteVIew {
    private ArrayList<paciente> pacientes;

    // Constructor
    public pacienteVIew(ArrayList<paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public JPanel panelPaciente() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 4)); // Crear una tabla con 4 columnas

        JLabel titleLabel = new JLabel("Listado de pacientes.");
        panel.add(titleLabel);

        // Títulos de las columnas
        String[] campos = {"NOMBRE", "FECHA_NACIMIENTO", "HORARIO_CITA", "VISITA"};
        for (String campo : campos) {
            panel.add(new JLabel(campo));
        }

        // Añadir los pacientes
        for (paciente paciente : pacientes) {
            panel.add(new JLabel(paciente.getNombre()));
            panel.add(new JLabel(paciente.getFechaNacimiento()));
            panel.add(new JLabel(paciente.getHorarioCita()));
            panel.add(new JLabel(paciente.getMotivoVisita()));
        }

        return panel;
    }
}


