import Hospital.controller.LoginController;
import Hospital.view.LoginView;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        LoginController controllerLogin = new LoginController(loginView);


    }
}


