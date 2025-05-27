/*Niveau 1 : A l'aide d'une boucle, PRINT & SCANNER 
*Créer un système de commande de restauration
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Bonjour, votre commande est avec viande (true) ou vegetarien (false)
 * true
 * 
 * (CETTE QUESTION NE S'AFFICHE PAS SI VOUS AVEZ CHOISI FALSE A LA PREMIERE)
 * Votre steak vous le voulez saignant (true) ou à poing (false) ? 
 * false
 * 
 * Frites (true) ou riz (false)
 * true
 * 
 * Soda (true) ou eau gazeuse (false)
 * false
 * 
 * Merci poru votre commande, ça sera près dans 20min,
 * 
 */



import java.util.Scanner;


public class exoboucle4 {
    
public static void main(String [] args){

Scanner commande = new Scanner(System.in); 

int i=1; 
boolean response;
boolean goodresponse;
String question;

while (i<=4){
   
switch(i){

case 1 : question = "Bonjour, votre commande est avec viande (true) ou vegetarien (false)"; goodresponse = false; break;
case 2 : question = "Votre steak vous le voulez saignant (true) ou à poing (false) ? "; goodresponse = false; break;
case 3 : question = "Frites (true) ou riz (false)"; goodresponse = false; break;
case 4 : question = "Soda (true) ou eau gazeuse (false)"; goodresponse = false; break;

default : question = "aucune question"; goodresponse = false; break; 
}

System.out.println(question);
response = commande.nextBoolean();
i++;

if(i==2 && response==false){i++;
}

}
System.out.println("Merci pour votre commande, ça sera prêt dans 20 min.");

commande.close();

}
}