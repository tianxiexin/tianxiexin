

public class WebJettyMain {

    public static void main(String[] args) throws Exception {

        Server jetty = new Server();

        SocketConnector conn = new SocketConnector();
        conn.setPort(8080);
        jetty.setConnectors(new Connector[]{conn});


        WebAppContext wah = new WebAppContext();
        wah.setContextPath("/xuemall");
        wah.setWar("src/main/webapp");
        jetty.setHandler(wah);
        jetty.start();
    }
}

