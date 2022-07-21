import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactoInterface extends Remote{
    int facto(int n) throws RemoteException;
}
