package backEnd;

import servicios.BaseDeDatosDoc;
import servicios.Doctor;

import java.util.HashMap;

public class BackEnd {
    private BaseDeDatosDoc baseDeDatosDoc;

    public BackEnd() {
        baseDeDatosDoc = new BaseDeDatosDoc(); // Inicializamos base de datos
    }

    public HashMap<String, String> validarDatos(String usuario, String contrasena) {
        HashMap<String, String> respuesta = new HashMap<>();
        Doctor doctor = baseDeDatosDoc.obtenerDoctor(usuario); // Se declara una instancia local de Doctor

        if (doctor != null && doctor.getContraseña().equals(contrasena)) {
            respuesta.put("Nombre", doctor.getNombre());
            respuesta.put("Usuario", doctor.getNoDeDoctor());
            respuesta.put("Especialidad", doctor.getEspecialidad());
        } else {
            respuesta.put("Error", "Credenciales inválidas");
        }

        return respuesta;
    }
}



