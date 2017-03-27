package com.manywho.services.manywhoboomi;

import com.manywho.sdk.services.servers.EmbeddedServer;
import com.manywho.sdk.services.servers.Servlet3Server;
import com.manywho.sdk.services.servers.undertow.UndertowServer;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class Application extends Servlet3Server  {

    public Application() {
        this.addModule(new ApplicationManyWhoBoomiModule());
        this.setApplication(Application.class);
        this.start();
    }

    public static void main(String[] args) throws Exception {
        EmbeddedServer server = new UndertowServer();

        server.addModule(new ApplicationManyWhoBoomiModule());
        server.setApplication(Application.class);
        server.start("/api/manywho-boomi/1", 8080);
    }
}
