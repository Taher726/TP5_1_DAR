package rmiService;
import rmiService.IConversion;
import java.rmi.Naming;

public class ConversionClient {
    public static void main(String[] args) {
        IConversion stub;

        {
            try {
                // Récupère la référence distante de l'objet
                stub = (IConversion) Naming.lookup("rmi://localhost:1095/ConversionObject");

                // Appelle la méthode distante convertirMontant(12.7) sur l'objet distant "stub"
                double montantConv = stub.convertirMontant(12.7);

                // Affiche le résultat de la conversion dans la console
                System.out.println(montantConv);
            } catch (Exception e) {
                // Gère les exceptions en affichant les détails de l'erreur
                e.printStackTrace();
            }
        }
    }
}
