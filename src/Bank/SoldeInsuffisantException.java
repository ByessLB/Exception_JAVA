package Bank;

public class SoldeInsuffisantException extends RuntimeException {
    /*
    * Notre classe hérite de la classe RuntimeException
    * Elle permet de signaler une situation où le solde du compte est
    * insuffisant pour effectuer une opération.
    */ 

    public SoldeInsuffisantException(String message) {
        super(message);
    }
}
