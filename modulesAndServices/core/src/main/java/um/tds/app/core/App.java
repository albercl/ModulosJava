package um.tds.app.core;

import um.tds.app.api.Api;
import um.tds.app.apiFactory.Factory;

//Patron singleton para el nucleo de la aplicacion
public class App {
    private static App instance = null;

    public static App getInstance() {
        if(instance == null) {
            instance = new App();
        }

        return instance;
    }

    private App() {

    }

    private Factory factory = Factory.getInstance();

    public String getApiName(String persistenceService) {
        Api api = factory.getApi(persistenceService);
        if(api == null)
            return "No API loaded";
        else
            return api.getName();
    }
}
