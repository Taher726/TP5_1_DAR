package rmiService;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConversion extends Remote {
    // Définition d'une méthode distante "convertirMontant" qui prend un montant en paramètre
    // et renvoie un résultat de type double. Cette méthode peut générer une RemoteException.
    double convertirMontant(double mt) throws RemoteException;
}
