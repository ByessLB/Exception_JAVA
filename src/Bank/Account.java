package Bank;

public class Account {
    private String proprietaire;
    private double solde;

    // Getters & Setters
    public String getProprietaire() {
        return proprietaire;
    }
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Méthode pour déposer de l'argent dans le compte
    public void deposer(double montant) {
        solde += montant;
    }

    // Méthode pour retirer de l'argent du compte
    public void retirer( double montant) {
        if (solde > montant)
            solde -= montant;
        else throw new SoldeInsuffisantException("Transaction annulé, solde insuffisant.");
    }

    // Méthode pour afficher les détails du compte
    public void displayDetails() {
        System.out.println("Propriétaire du compte : " + proprietaire);
        System.out.println("Solde : " + solde);
    }
}
