module tds.app.api.impl2 {
    requires tds.app.api;

    provides um.tds.app.api.Api
            with um.tds.app.apiImpl2.ApiImpl2;
}