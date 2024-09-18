package backEnd;

import servicios.BaseDeDatosDoc;
import servicios.Doctor;

import java.util.HashMap;

public class BackEnd {

    private BaseDeDatosDoc baseDeDatosDoc;

    public BackEnd() {
        baseDeDatosDoc = new BaseDeDatosDoc();
    }

    public HashMap<String, String> validarDatos(String usuario, String contrasena){

        HashMap<String, String> respuesta = new HashMap<>();
        Doctor.doctor = baseDeDatosDoc.obtenerDoctor(usuario);

        if (doctor != null && doctor.getContrasena().equals(contrasena)) {
            respuesta.put("Nombre", doctor.getNombre());
            respuesta.put("Usuario", doctor.getNoDeDoctor());
            respuesta.put("Especialidad", doctor.getEspecialidad());
        } else {
            respuesta.put("Error", "Credenciales inválidas");
        }
        return respuesta;
    }
}
