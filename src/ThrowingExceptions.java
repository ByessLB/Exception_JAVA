

public class ThrowingExceptions {
    
    public static void main(String[] args) {

        try {
            registeurUser("John", 14);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    // Gestion de l'Exception par 'throw'
    static void registeurUser(String username, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("L'utilisateur doit avoir plus de 18 ans.");
        } else System.out.println("Utilisateur enregistré !");
    }
}
