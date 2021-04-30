package um.tds.app.graphics;

import um.tds.app.core.App;

import javax.swing.*;

public class MainWindow extends JFrame {
    //Obtenemos la instancia unica del nucleo de la aplicacion
    App appInstance = App.getInstance();

    public static void main(String[] args) {
        MainWindow v = new MainWindow();
        v.setVisible(true);
    }

    private MainWindow() {
        setSize(500, 200);
        setTitle("TDS app");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JLabel("API cargada: " + appInstance.getApiName("um.tds.app.apiImpl1.ApiImpl1")));
    }
}
