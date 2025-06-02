/* Niveau 2 : A l'aide d'une boucle, PRINT & SCANNER 
*Me faire un système de listing pour de vos courses alimentaires
Les afficher à la fin avec le coût total de vos courses
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, que voulez vous acheter ? :
 * Farine
 * 
 * Combien, ça côute ?:
 * 1.45
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Oeufs
 * 
 * Combien, ça côute ?:
 * 2.54
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Lait
 * 
 * Combien, ça côute ?:
 * 1.30
 * 
* Voulez-vous acheter autre choses (true/false)?
 * false
 * 
 * Récapitulatif de vos courses :
 * 
 * -Oeufs , 1.45 euros
 * -Farine , 2.54 euros
 * -Lait , 1.30 euros
 * 
 * Total de vos courses : 5,29€
 * 
 */

import java.util.Scanner;

public class exoboucle5 {
    
public static void main(String[] args){

Scanner courses = new Scanner (System.in);


int i=1; 
String response;
String question;
String choix1, choix2, choix3;

String [][] selection = new String [][];

while (i<=3){
   



                switch(i){

                case 1 : question = "Bonjour, que voulez vous acheter ?"; choix1; break;
                case 2 : question = "Combien, ça côute ?"; choix2 ; break;
                case 3 : question = "Voulez-vous acheter autre choses (OUI/NON)?"; choix3; break;


                default : question = "aucune question";  break; 
}

                System.out.println(question);
                response = courses.nextLine();
                i++;

                if(response.equalsIgnoreCase("OUI")){i=i-3;}

            }
System.out.println("Récapitulatif de vos courses : \n");


courses.close();


}

}
