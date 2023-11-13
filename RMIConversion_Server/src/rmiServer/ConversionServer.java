package rmiServer;
import rmiService.ConversionImpl;
import rmiService.IConversion;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ConversionServer   {

    public static void main(String[] args) {

        try {
            // Crée un registre sur le port 1095
            LocateRegistry.createRegistry(1095);

            // Crée une instance de la classe ConversionImpl
            ConversionImpl od = new ConversionImpl();

            // Affiche la représentation sous forme de chaîne de caractères de "od"
            System.out.println(od.toString());

            // Lie l'objet distant "od" au registre RMI avec le nom "ConversionObject"
            Naming.rebind("rmi://localhost:1095/ConversionObject", od);
        } catch (RemoteException | MalformedURLException e) {
            // Gère les exceptions en les capturant, en les encapsulant dans une RuntimeException et en les relançant
            throw new RuntimeException(e);
        }
    }
}