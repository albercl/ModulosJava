module tds.app.api.impl1 {
    requires tds.app.api;

    provides um.tds.app.api.Api
            with um.tds.app.apiImpl1.ApiImpl1;
}