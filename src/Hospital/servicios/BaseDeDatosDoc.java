package Hospital.servicios;

import java.util.ArrayList;

public class BaseDeDatosDoc {
    private ArrayList<Doctor> doctores;

    public BaseDeDatosDoc() {
        doctores = new ArrayList<>();
        // Agregar algunos doctores por defecto con número de doctor en lugar de usuario
        doctores.add(new Doctor("Juan", "101", "password123", "Cardiología"));
        doctores.add(new Doctor("María", "102", "password456", "Neurología"));
        doctores.add(new Doctor("Carlos", "103", "password789", "Pediatría"));
    }

    public Doctor obtenerDoctor(String usuario) {
        for (Doctor doctor : doctores) {
            if (doctor.getNombre().equals(usuario)) {
                return doctor;
            }
        }
        return null; // Si no se encuentra el número de doctor
    }
}