import java.util.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class client{
    private client(){}
    public static void main(String[] args){
        try{
            // Getting the registry
            Registry registry = LocateRegistry.getRegistry(null);

            //Looking up the registry for the remote object
            FactoInterface stub = (FactoInterface)
            registry.lookup("FactoInterface");

            //Calling the remote method using the obtained object
            while(true){
                Scanner sc = new Scanner(System.in); //System.in is a standard input steram.
                System.out.println("Enter a number whose factorial you want to calculate:");
                int a= sc.nextInt();
                System.out.println(stub.facto(a));

            }
        }
        catch(Exception e){
            System.err.println("Clinet exception;" + e.toString());
            e.printStackTrace();
        }
    }
}