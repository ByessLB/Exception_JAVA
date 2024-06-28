## LES EXCEPTIONS

Nous allons comprendre comment gérer les exceptions. Les exceptions sont les comportemments inattendu de notre programme, cela peut être dû à une division part 0, ou alors une convertion qui n'a pas fonctionné, de ce fait notre programme va cracher.

## Structure des dossiers

Le projet contient 2 dossiers par defaut et un sous dossier : 

    - `lib` : Contient les dépendances
    - `src` : Contient le projet ainsi que le sous dossier `Bank`

Pendant ce temps, les fichiers de sortie compilés seront générés dans le dossier `bin` par défaut.

## Try...Catch...Finally

En tentant d'opérer une division par 0, nous obtiendrons une certaine exception.

```java

public class main{
    public static void main(String[] args) {

        int a = 2/0;
        System.out.println(a);
    }
}
```
Nous obtiendrons l'erreur :
"Exception in thread "main" java.lang.ArithmeticException: / by zero"

Pour pallier à cette erreur, nous allons passer par des blocs de code "try", "catch" et "finally.

Voici une explication simple de chaque bloc :

    - try : Ce bloc contient le code qui pourrait potentiellement générer une exception. C'est le code que vous "essayez" d'exécuter.
    - catch : Ce bloc est utilisé pour gérer l'exception si elle se produit dans le bloc `try`. Vous pouvez spécifier le type d'exception à "attraper" (catch). Si cette exception est levée dans le bloc `try`, le code dans le bloc `catch` correspondant est exécuté.
    - finally : Ce bloc contient le code qui sera exécuté indépendamment du fait qu'une exception ait été levée ou non dans le bloc `try`. C'est généralement là où vous mettez le code de nettoyage, comme fermeture d'une connexion à une base de données.

Exemple :

```java
try {
    // Code qui pourrait lever une exception
} catch (Exception e) {
    // Code pour gérer l'exception
} finally {
    // Code qui s'exécute indépendamment de la survenue d'une exception
}
```

Pour démontrer notre explication, nous allons créer un programme qui réceptionnera la valeur entrée par un client. Nous souhaitons aque cette valeur ne soit qu'en entier.

```java
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");

        try {
            int num = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Vous n'avez pas entré un nombre entier");
            // Nous pouvons afficher l'exception
            System.out.println(e);
        } finally {
            System.out.println("Fin du programme");
        }

        scanner.close();
    }
}
```

## Lever les exceptions : Throw

`throw` est utilisée pour lever une exception de manière explicite. Voici comment cela fonctionne :

    - Lorsque vous avez un code qui détecte une situation exceptionnelle (exemple : une division par zéro ou un accès à un index de tableau invalide), vous pouvez utiliser `throw` pour signaler cette exception.
    - Vous spécifiez le type d'exception que vous souhaitez levez (exemple : `IllegalArgumentException`, `ArithmeticException`, etc...).
    - Le code qui appelle la méthode contenant `throw` doit être prêt à gérer cette exception à l'aide d'un bloc `try` et `catch`.

Exemple :

```java
public class main {

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
```

## Customizer vos Exceptions

Personnaliser vos exceptions est une pratique courante pour plusieurs raisons :

    - Clarté et expressivité : Les exceptions personnalisées permettent de donner un nom significatif à l'erreur spécifique que vous souhaitez signaler. Par exemple, au lieur d'utiliser une exception générique comme `IllegalArgumentException`, vous pouvez créer une exception `InvalidInputException` qui indique clairement que l'entrée fournie est invalide.
    - Hiérachie d'exception : En personnalisant vos exception, vous pouvez créer une hiérarchie d'exceptions plus précise. Par exemple, vou pouvez avoir une exception de base (exemple : `MaAppException`) à partir de laquelle dérivent des exceptions plus spécifiques (exemple : `DatabaseException`, `NetworkException`, etc...). Cela permet aux parties appelantes de gérer les erreurs de manière plus granulaire.
    - Ajout d'informations supplémentaires : Vous pouvez ajouter des champs ou des méthodes à vos exceptions personnalisées pour fournir des informations supplémentaires surl'erreur. Par exemple vous pouvez inclure des détails sur l'objet concrené, l'heure de l'erreur, etc...
    - Gestion spécifique : En personnalisant vos exceptions, vous pouvez gérer des situations spécifiques de manière plus appropriée. Par exemple, si votre application se connecte à une base de données, vous pouvez créer une exception `DatabaseConnectionexception` pour gérer les problèmes de connexion spécifiques.

Exemple : Se référer au dossier `Bank`.


"# Exception_JAVA" 
