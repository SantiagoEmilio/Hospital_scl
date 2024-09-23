package Hospital.controller;

import Hospital.view.LoginView;
import backEnd.BackEnd;

import java.util.HashMap;

public class LoginController {
    private LoginView loginView;
    private BackEnd backEnd;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.backEnd = new BackEnd(); // Inicializamos correctamente BackEnd
        this.loginView.addLoginListener(e -> iniciarSesion()); // Se añade el listener de inicio de sesión
    }

    public void iniciarSesion() {
        // Cambié los métodos getName() y getPassword() por getUsuario() y getContrasenna()
        String usuario = loginView.getUsuario();
        String contrasena = loginView.getContrasenna();

        // Validar datos con el servicio BackEnd
        HashMap<String, String> datosDoc = backEnd.validarDatos(usuario, contrasena);

        // Imprimir la información o el error en consola
        if (datosDoc.containsKey("Error")) {
            System.out.println(datosDoc.get("Error"));
        } else {
            System.out.println("Información del doctor:");
            System.out.println("Nombre: " + datosDoc.get("Nombre"));
            System.out.println("Número de Doctor: " + datosDoc.get("Usuario"));
            System.out.println("Especialidad: " + datosDoc.get("Especialidad"));
        }
    }
}




