package controller;

import view.LoginView;

public class LoginController {

    private LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> controlDelLogin());
    }

    public void controlDelLogin() {
        // Aquí puedes agregar la lógica de autenticación
        // Por ahora, solo imprimimos los datos en la consola
        String email = loginView.getEmail();
        String password = loginView.getPassword();
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}

