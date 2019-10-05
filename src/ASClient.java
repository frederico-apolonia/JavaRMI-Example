import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ASClient {

    private static final int ALBUMSTORE_PORT = 10000;

    public static void main(String[] args) throws Exception {
        String host = "127.0.0.1"; // default host

        try {
            Registry registry = LocateRegistry.getRegistry(host, ALBUMSTORE_PORT);
            Albumstore albumstoreStub = (Albumstore) registry.lookup("AlbumstoreServer");

            Album tyrantsTomb = new Album("Oxnard", "Anderson .Paak", "The Chase (feat. Kadhja Bonet");
            System.out.println("Adding a new album");
            albumstoreStub.addAlbum(tyrantsTomb);
            System.out.println("Getting the album...");
            System.out.println(albumstoreStub.getAlbum("Oxnard"));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
