module tds.app.cli {
    requires java.base;
    requires java.desktop;

    //Exporta el nucleo de la aplicacion al modulo de gui unicamente
    exports um.tds.app.cli.core to tds.app.gui;
}