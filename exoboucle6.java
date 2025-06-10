/* Niveau 3 : A l'aide d'une boucle, PRINT & SCANNER 
*Imiter un distributeur de banque qui s'arrête uniquement 
quand vous appuyez, terminer(0). Voici les commandes suivantes

0 - Terminer
1 - Retirer
2 - Afficher compte
3 - Déposer

vous avez droit à un découvert de maximum 500€
Vous ne pouvez déposer minimum 5€ et une somme divisible par 5 (vu que c'est des billets)
Vous pouvez retirer qu'en multiple de 10


 * Vous avez 2000€ sur votre compte
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bienvenu sur votre compte bancaire, que puis-je faire pour vous :
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 1
 * 
 * Combien voulez-vous retirer ?:
 * 500€
 * 
 * Opération acceptée : 500€ ont été retiré,
 *  voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 2
 * 
 * Vous avez actuellement 1500€ sur votre solde
 *  voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 3
 * 
 * Combien voulez-vous retirer ?:
 * 577€
 * 
 * Désolé vous ne pouvez déposer que des billets
 * Voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 0
 * 
 * Merci de votre visite, au revoir :) !
 * 
 * 
 * 
 * 
*/

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exoboucle6 {

    public static void main(String[] args) {

        Scanner banque = new Scanner(System.in);

        double solde = 2000;
        int i = 0;

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String formattedDate=now.format(formatter);

        System.out.println("Bienvenue sur votre compte bancaire\n");

        while (i != 4) {
            System.out.println("\nQue puis-je faire pour vous ?\n(1) Retirer de l'argent\n(2) Consulter votre solde\n(3) Déposer de l'argent\n(4) Quitter");

            i = banque.nextInt();

            if (i == 1) {
                System.out.println("Combien voulez-vous retirer ?");
                double montant = banque.nextDouble();

                if (montant <= solde + 500 && montant % 10 == 0) {
                    solde -= montant;
                    System.out.println("Opération acceptée : " + montant + " euros ont été retirés.");
                    System.out.println("Votre solde actuel : " + solde);
                    System.out.println("Date et heure de votre action : "+formattedDate);
                                                                 } 
                else 
                        {
                    System.out.println("Opération annulée. Vérifiez que le montant est correct (max découvert : 500€, divisible par 10).");
                        }

                        } 
            else if (i == 2) {
                System.out.println("Votre solde actuel est de : " + solde);

                            } 
            else if (i == 3) 
                            {
                System.out.println("Combien voulez-vous déposer ?");
                double depot = banque.nextDouble();

                if (depot >= 5 && depot % 5 == 0) {
                    solde += depot;
                    System.out.println("Opération acceptée : " + depot + " euros ont été déposés.");
                    System.out.println("Votre solde actuel : " + solde);
                    System.out.println("Date et heure de votre action : "+formattedDate);
                } else {
                    System.out.println("Opération annulée. Le dépôt doit être au minimum de 5€ et divisible par 5.");
                }

                             } 
            else if (i == 4) {
                System.out.println("Merci de votre visite ! Au revoir !");
                break;

                             } 
            else {
                System.out.println("Choix invalide. Veuillez entrer 1, 2, 3 ou 4.");
                 }

            
            System.out.println("Voulez-vous faire autre chose ? (true/false)");
            boolean continuer = banque.nextBoolean();
            if (!continuer) 
                            {
                System.out.println("Merci de votre visite ! Au revoir !");
                break;
                            }
        }

        banque.close();
    }
}