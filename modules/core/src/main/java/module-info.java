module tds.app.core {
    //requires java.base;

    //Exporta el nucleo de la aplicacion al modulo de gui unicamente
    exports um.tds.app.core to tds.app.gui;
}