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


import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;




public class exoboucle4 {
    
public static void main(String [] args){

Scanner commande = new Scanner(System.in); 

int i=1; 
boolean response=false;
String question;


LocalDateTime now = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
String formattedDate = now.format(formatter);
LocalDateTime parsedDateVege = now.plusMinutes(20);
LocalDateTime parsedDateViande = now.plusMinutes(40);

while (i<=4){
   
switch(i){

case 1 : question = "Bonjour, votre commande est avec viande (true) ou vegetarien (false)"; break;
case 2 : question = "Votre steak vous le voulez saignant (true) ou à poing (false) ? "; break;
case 3 : question = "Frites (true) ou riz (false)"; break;
case 4 : question = "Soda (true) ou eau gazeuse (false)"; break;

default : question = "aucune question"; break; 
}

System.out.println(question);
try{
response = commande.nextBoolean();

}
catch(InputMismatchException e){System.out.println("Entrée invalide, veuillez écrire 'true' ou 'false'.");
commande.next();
continue;

};

i++;

if(i == 2 && response == false){i++;
}

}
System.out.println("Merci pour votre commande, date et heure de votre commande : "+formattedDate);
if(i>=2 && response==false){System.out.println("Heure de réception prévue : "+parsedDateVege.format(formatter));}
else{System.out.println("Heure de réception prévue : "+parsedDateViande.format(formatter));};

commande.close();

}
}