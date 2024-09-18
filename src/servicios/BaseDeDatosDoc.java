package servicios;

import java.util.ArrayList;

public class BaseDeDatosDoc {
    private ArrayList<Doctor> doctores;

    public BaseDeDatosDoc() {
        doctores = new ArrayList<>();
        // Agregar algunos doctores por defecto con número de doctor en lugar de usuario
        doctores.add(new Doctor("Juan", "101", "1234", "Cardiología"));
        doctores.add(new Doctor("María", "102", "5678", "Neurología"));
        doctores.add(new Doctor("Carlos", "103", "9012", "Pediatría"));
    }

    public obtenerDoctor(String usuario) {
        for (Doctor doctor : doctores) {
            if (doctor.getNombre().equals(usuario)) {
                return doctor;
            }
        }
        return null; // Si no se encuentra el número de doctor
    }
}

