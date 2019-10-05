import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ASServer {

    private static final int ALBUMSTORE_PORT = 10000;

    public static void main(String[] args) throws Exception {
        Albumstore albumstore = new AlbumstoreImpl();

        /* Create registry and rebind it to port ALBUMSTORE_PORT */
        Registry registry = null;
        try {
            registry = LocateRegistry.createRegistry(ALBUMSTORE_PORT);
            registry.rebind("AlbumstoreServer", albumstore);
        } catch (Exception e) {
            System.out.println("Albumstore: ERROR trying to start server!");
            System.exit(0);
        }

        /* Get server address */
        String address = null;
        try {
            address = System.getProperty("java.rmi.server.hostname");
            // is address null? if so then it is 127.0.0.1 (localhost), else it still is address
            address = address == null ? "127.0.0.1" : address;
        } catch (Exception e) {
            System.out.println("Can't get inet address.");
            System.exit(0);
        }

        String myID = new String(address + ":" + "Albumstore");
        System.out.println(myID);
    }
}
