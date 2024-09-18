package Hospital.controller;

import Hospital.view.LoginView;
import backEnd.BackEnde;

import java.util.HashMap;

public class LoginController {

    private LoginView loginView;
    private BackEnd backEnde;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.backEnde = new BackEnd(); // Inicializamos el servicio BackEnde
        this.loginView.addLoginListener(e -> controlDelLogin());
    }

    public void controlDelLogin(){
        String usuario = loginView.getName();
        String contrasenna = loginView.getPassword();

        // Validar datos con el servicio BackEnde
        HashMap<String, String> datosDoc = backEnd.validarDatos(usuario, contrasenna);

        // Imprimir la información o el error en consola
        if (datosDoc.containsKey("Error")) {
            System.out.println(datosDoc.get("Error"));
        } else {
            System.out.println("Información del doctor:");
            System.out.println("Nombre: " + datosDoc.get("Nombre"));
            System.out.println("Número de Doctor: " + datosDoc.get("Usuario")); // Cambiado a "Usuario" según la implementación de BackEnde
            System.out.println("Especialidad: " + datosDoc.get("Especialidad"));
        }
    }
}

