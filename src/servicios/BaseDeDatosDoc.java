package servicios;

import java.util.ArrayList;

public class BaseDeDatosDoc {
    private ArrayList<Doctor> doctores;

    public BaseDeDatosDoc() {
        doctores = new ArrayList<>();
        // Agregar algunos doctores por defecto
        doctores.add(new Doctor("Juan", "101", "1234", "Cardiología"));
        doctores.add(new Doctor("María", "102", "5678", "Neurología"));
        doctores.add(new Doctor("Carlos", "103", "9012", "Pediatría"));
    }

    public Doctor obtenerDoctor(String idDoctor) {
        for (Doctor doctor : doctores) {
            if (doctor.getNoDeDoctor().equals(idDoctor)) {
                return doctor;
            }
        }
        return null; // Si no se encuentra el doctor por el ID
    }
}




