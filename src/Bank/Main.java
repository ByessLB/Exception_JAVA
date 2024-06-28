package Bank;

public class Main {
    public static void main(String[] args) {

        // Création d'un compte
        Account compte = new Account();
        compte.setProprietaire("John"); // Définition du propriétaire
        compte.setSolde(1000);// Définition du solde initial

        try {
            // Tentative de retrait
            compte.retirer(1500);
        } catch (SoldeInsuffisantException e) {
            // Gestion de l'exception en cas de solde insuffisant
            System.err.println(e.getMessage());
        } finally {
            // Affichage du solde (quelle que soit l'issue)
            compte.displayDetails();
        }
    }
}
