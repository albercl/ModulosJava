module tds.app.core {
    requires java.base;
    requires java.desktop;
    requires tds.app.api.factory;
    requires tds.app.api;

    //Exporta el nucleo de la aplicacion al modulo de gui unicamente
    exports um.tds.app.core to tds.app.gui;
}