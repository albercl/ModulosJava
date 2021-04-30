package um.tds.app.core;

//Patron singleton para el nucleo de la aplicacion
public class Core {
    private String appName = "TDS_APP";
    private static Core instance = null;

    public static Core getInstance() {
        if(instance == null) {
            instance = new Core();
        }

        return instance;
    }

    private Core() {

    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String newName) {
        appName = newName;
    }
}
