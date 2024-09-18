package servicios;

import java.util.HashMap;

public class Doctor {
    private String usuario;
    private String noDeDoctor;
    private String contrasenna;
    private String especialidad;

    public Doctor(String usuario, String noDeDoctor, String contrasenna, String especialidad) {
        this.usuario = usuario;
        this.noDeDoctor = noDeDoctor;
        this.contrasenna = contrasenna;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return usuario;
    }

    public String getNoDeDoctor() {
        return noDeDoctor;
    }

    public String getContraseña() {
        return contrasenna;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}