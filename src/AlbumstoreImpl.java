import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlbumstoreImpl extends UnicastRemoteObject implements Albumstore {

    private HashMap<String, Album> albums = new HashMap<>();

    public AlbumstoreImpl() throws RemoteException {
    }

    @Override
    public Album getAlbum(String name) throws RemoteException {
        return albums.get(name);
    }

    @Override
    public List<Album> catalog() throws RemoteException {
        return new ArrayList<>(albums.values());
    }

    @Override
    public void addAlbum(Album album) throws RemoteException {
        albums.put(album.getName(), album);
    }
}
