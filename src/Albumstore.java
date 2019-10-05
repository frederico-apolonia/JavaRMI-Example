import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Albumstore extends Remote {
    public Album getAlbum(String name) throws RemoteException;
    public List<Album> catalog() throws RemoteException;
    public void addAlbum(Album album) throws RemoteException;

}
