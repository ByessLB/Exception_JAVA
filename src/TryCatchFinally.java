

import java.util.Scanner;

public class TryCatchFinally {

    // Comprendre le "try...catch...finally"
    /*
     * Nous allons comprendre comment gérer les exceptions. Les exceptions
     * sont les comportemments inattendu de notre programme, cela peut être
     * dû à une division part 0, ou alors une convertion qui 'a pas 
     * fonctionné, de ce fait notre programme va cracher.
     */

    public static void main(String[] args) {
        // int a = 2/0;
        // System.out.println("mon nombre est : " + a);
        // Nous obtenons le message d'erreur :
        // Exception in thread "main" java.lang.ArithmeticException: / by zero


        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");

        try {
            int num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Erreur d'entrée. Cela doit être un entier.");
        } finally {
            System.out.println("Exécute quoi qu'il arrive.");
        }

        scanner.close();
    }
}