package Hospital.data;

import Hospital.modell.paciente; // Asegúrate de importar la clase Paciente
import java.util.ArrayList;

public class DataPaciente {
    public static ArrayList<paciente> obtenerPacientes() {
        ArrayList<paciente> pacientes = new ArrayList<>(); // Cambiar "paciente" a "pacientes" para coherencia

        pacientes.add(new paciente("Juan Perez", "juan.perez@gmail.com", "555-1234", "Calle Falsa 123", "1980-02-15", "10:00", "Revisión General", 2, "Dr. Morales"));
        pacientes.add(new paciente("Ana Gomez", "ana.gomez@gmail.com", "555-5678", "Avenida Siempre Viva 456", "1992-06-20", "11:30", "Problemas Respiratorios", 3, "Dr. Huyn"));
        pacientes.add(new paciente("Juan Perez", "juan.perez@gmail.com", "555-1234", "Calle Falsa 123", "1980-02-15", "10:00", "Revisión General", 2, "Dr. Morales"));
        pacientes.add(new paciente("Ana Gomez", "ana.gomez@gmail.com", "555-5678", "Avenida Siempre Viva 456", "1992-06-20", "11:30", "Problemas Respiratorios", 3, "Dr. Huyn"));
        pacientes.add(new paciente("Juan Perez", "juan.perez@gmail.com", "555-1234", "Calle Falsa 123", "1980-02-15", "10:00", "Revisión General", 2, "Dr. Morales"));
        pacientes.add(new paciente("Ana Gomez", "ana.gomez@gmail.com", "555-5678", "Avenida Siempre Viva 456", "1992-06-20", "11:30", "Problemas Respiratorios", 3, "Dr. Huyn"));
        pacientes.add(new paciente("Juan Perez", "juan.perez@gmail.com", "555-1234", "Calle Falsa 123", "1980-02-15", "10:00", "Revisión General", 2, "Dr. Morales"));
        pacientes.add(new paciente("Ana Gomez", "ana.gomez@gmail.com", "555-5678", "Avenida Siempre Viva 456", "1992-06-20", "11:30", "Problemas Respiratorios", 3, "Dr. Huyn"));
        pacientes.add(new paciente("Juan Perez", "juan.perez@gmail.com", "555-1234", "Calle Falsa 123", "1980-02-15", "10:00", "Revisión General", 2, "Dr. Morales"));
        pacientes.add(new paciente("Ana Gomez", "ana.gomez@gmail.com", "555-5678", "Avenida Siempre Viva 456", "1992-06-20", "11:30", "Problemas Respiratorios", 3, "Dr. Huyn"));

        return pacientes;
    }
}

