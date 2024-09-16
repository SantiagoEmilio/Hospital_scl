package Hospital.controller;

import Hospital.view.LoginView;

public class LoginController{

    private LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> controlDelLogin());
    }

    public void controlDelLogin(){
        System.out.println("Hola Login");
    }

}
