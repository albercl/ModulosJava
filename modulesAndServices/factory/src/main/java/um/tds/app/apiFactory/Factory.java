package um.tds.app.apiFactory;

import um.tds.app.api.Api;

import java.util.ServiceLoader;

public class Factory {
    private static Factory instance;

    public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }

        return instance;
    }

    private Factory() {}

    public Api getApi(String apiName) {
        Iterable<Api> services = ServiceLoader.load(Api.class);
        Api api = null;

        for(Api service : services) {
            System.out.println("Encontrada implementación de la API: " + service.getClass().getName());
            if(service.getClass().getName().equals(apiName)) {
                api = service;
            }
        }

        if(api == null) System.err.println("No se ha encontrado ninguna implementación para la API");
        return api;
    }
}
