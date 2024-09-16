import javax.swing.*;
import view.LoginView;
import controller.LoginController;

public class Main {

    public static void main(String[] args) {
        // Crear la vista del login
        LoginView loginView = new LoginView();
        // Crear el controlador y pasarle la vista
        LoginController loginController = new LoginController(loginView);

        // Mostrar la ventana de login
        loginView.setVisible(true);
    }
}
