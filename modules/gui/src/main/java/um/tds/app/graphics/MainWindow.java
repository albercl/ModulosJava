package um.tds.app.graphics;

import um.tds.app.core.Core;

import javax.swing.*;

public class MainWindow extends JFrame {
    //Obtenemos la instancia unica del nucleo de la aplicacion
    Core appInstance = Core.getInstance();

    public static void main(String[] args) {
        MainWindow v = new MainWindow();
        v.setVisible(true);
    }

    private MainWindow() {
        setSize(300, 300);
        setTitle("TDS app");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JLabel("Nombre de la aplicación: " + appInstance.getAppName()));
    }
}
