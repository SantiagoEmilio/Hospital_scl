
import Hospital.controller.LoginController;
import Hospital.view.LoginView;

import javax.swing.*;
        import java.awt.*;

public class Main extends JFrame {
    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        // Crear la ventana de login
        LoginView loginView = new LoginView();
        LoginController controllerLogin = new LoginController(loginView);

        System.out.println("HOla mundo");

    }
}
