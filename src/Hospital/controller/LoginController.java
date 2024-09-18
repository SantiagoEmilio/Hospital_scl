package Hospital.controller;

import Hospital.view.LoginView;
import backEnd.BackEnd;

import java.util.HashMap;

public class LoginController {

    private LoginView loginView;
    private BackEnd backEnd; // Cambiar a 'backEnd'

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.backEnd = new BackEnd(); // Inicializamos el servicio BackEnd correctamente
        this.loginView.addLoginListener(e -> iniciarSesion()); // Corregir el nombre del método
    }

    public void iniciarSesion(){ // Cambiar a 'iniciarSesion'
        String usuario = loginView.getName();
        String contrasenna = loginView.getPassword();

        // Validar datos con el servicio BackEnd
        HashMap<String, String> datosDoc = backEnd.validarDatos(usuario, contrasenna); // Usar 'backEnd'

        // Imprimir la información o el error en consola
        if (datosDoc.containsKey("Error")) {
            System.out.println(datosDoc.get("Error"));
        } else {
            System.out.println("Información del doctor:");
            System.out.println("Nombre: " + datosDoc.get("Nombre"));
            System.out.println("Número de Doctor: " + datosDoc.get("Usuario")); // Cambiado a "Usuario" según la implementación de BackEnd
            System.out.println("Especialidad: " + datosDoc.get("Especialidad"));
        }
    }
}

