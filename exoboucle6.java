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

public class exoboucle6 {
    
public static void main(String [] args){

Scanner banque = new Scanner(System.in); 


String question;
int response;
double solde = 2000;

System.out.println("Bienvenu sur votre compte bancaire\n");

while (response!=0){

    System.out.println("(0)Quitter\n(1)Retirer de l'argent\n(2)Consulter votre solde\n(3)Déposer de l'argent;");
    response = banque.nextInt();

    if (response=1){System.out.println("Combien voulez-vous retirer ?");};
    double montant = banque.nextDouble();
    double reste=solde-montant;

            if ((montant<=solde+500) && montant%10=0){System.out.println("Opération acceptée : "+montant+"  euros ont été retirés de votre compte. Voulez-vous autre chose ?\n(0)Quitter\n(1)Retirer de l'argent\n(2)Consulter votre solde\n(3)Déposer de l'argent;");
                if(response!=0){System.out.println("Vous avez actuellement"+reste+" euros sur votre solde. Voulez-vous autre chose ?\n(0)Quitter\n(1)Retirer de l'argent\n(2)Consulter votre solde\n(3)Déposer de l'argent;");
                        if((montant<=solde+500) && montant%10=0){System.out.println("Opération acceptée : "+montant+"  euros ont été retirés de votre compte. Voulez-vous autre chose ?\n(0)Quitter\n(1)Retirer de l'argent\n(2)Consulter votre solde\n(3)Déposer de l'argent;");
                        
                else{System.out.println("Merci de votre visite, au revoir :) !");}
            else if (montant<=solde+500 && montant%10>0){System.out.println("Opération acceptée : "+montant+"  euros ont été retirés de votre compte. Voulez-vous autre chose ?\n(0)Quitter\n(1)Retirer de l'argent\n(2)Consulter votre solde\n(3)Déposer de l'argent;");};
            else {System.out.println("Opération annulée : votre solde est insuffisant.\n(0)Quitter\n(1)Retirer de l'argent\n(2)Consulter votre solde\n(3)Déposer de l'argent;");};

    else if (response=2)



    }}}











banque.close();
}
}