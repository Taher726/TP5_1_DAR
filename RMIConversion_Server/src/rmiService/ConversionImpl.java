package rmiService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements IConversion {
    // Le constructeur de la classe peut générer une RemoteException.
    public ConversionImpl() throws RemoteException {
    }

    @Override
    // Implémentation de la méthode "convertirMontant" définie dans l'interface IConversion.
    // Cette méthode prend un montant en paramètre et renvoie un résultat de type double.
    // Elle peut générer une RemoteException.
    public double convertirMontant(double mt) throws RemoteException {
        // Effectue une opération de conversion sur le montant reçu et renvoie le résultat.
        return mt * 3.3;
    }
}