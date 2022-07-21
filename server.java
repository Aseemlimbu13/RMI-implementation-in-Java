import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class server extends Facto{
    public server(){}
    public static void main(String args[]){
        try{
            // Instantiating the implementation class
            Facto obj = new Facto();

            //Exporting the object of implementation class
            //(Here we are exporting the remote object to the stub)
            FactoInterface stub = (FactoInterface) UnicastRemoteObject.exportObject(obj, 0);

            //Binding the remote object (stub) in the registery
            Registry registry = LocateRegistry.getRegistry();

            registry.bind("FactoInterface", stub);
            System.err.println("Sever ready");
        }
        catch(Exception e){
            System.err.println("Server exception:" + e.toString());
            e.printStackTrace();
        }
    }
}
