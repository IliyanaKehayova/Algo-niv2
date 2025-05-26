/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : Les chauves souris sont-elles chauves ? (Oui/Non) non
 * Question 2 : Qui a dit « Ma femme est un homme politique » ? Jacques Chirac
 * Question 3 : Quel film « polémique » de Stanley Kubrick n’a été diffusé en France que dix-huit ans après sa sortie ? - Les Sentiers de la gloire
 * Question 4 : La plus longue présidence de la Ve République a été celle de… - François Mitterrand
 * Question 5 : Quelles sont les trois couleurs qui constituent le drapeau de la France ? - bleu blanc rouge
 * 
 * Résultat du QUIZZ, vous avez 5 point(s) / 5
 * 
*/
import java.util.Scanner;

public class exoboucle10 {
    
public static void main(String [] args){

Scanner quiz = new Scanner(System.in); 

int i=0; 

String response1 = "NON";
int tries1=2;
int guesses1=0;
String response2 = "JACQUES CHIRAC";
int tries2=2;
int guesses2=0;
String response3 = "LES SENTIERS DE LA GLOIRE";
int tries3=2;
int guesses3=0;
String response4 = "FRANCOIS MITTERRAND";
int tries4=2;
int guesses4=0;
String response5 = "BLEU BLANC ROUGE";
int tries5=2;
int guesses5=0;


do{System.out.println("Les chauves souris sont-elles chauves ? (Oui/Non)");
response1 = quiz.nextLine();

        if(!response1.equalsIgnoreCase("NON"))
            System.out.println("Mauvaise réponse ! Vous ne recevez aucun point !");
            guesses1++;
        }
    while(!response1.equalsIgnoreCase("NON") && guesses1<=tries1);

    if(response1.equalsIgnoreCase("NON"))System.out.println("Bonne réponse ! Vous recevez 1 point !");  
    if(response1.equalsIgnoreCase("NON"))i++;
    
       
do{System.out.println("Qui a dit « Ma femme est un homme politique » ?");
            
            response2 = quiz.nextLine();

        if(!response2.equalsIgnoreCase("JACQUES CHIRAC"))
            System.out.println("Mauvaise réponse ! Vous ne recevez aucun point !");
         guesses2++;
        }
    while(!response2.equalsIgnoreCase("JACQUES CHIRAC") && guesses2<=tries2);

    if(response2.equalsIgnoreCase("JACQUES CHIRAC"))System.out.println("Bonne réponse ! Vous recevez 1 point !");
    if(response2.equalsIgnoreCase("JACQUES CHIRAC"))i++;
                                                                   
do{ System.out.println("Quel film « polémique » de Stanley Kubrick n’a été diffusé en France que dix-huit ans après sa sortie ?");
            
            response3 = quiz.nextLine();

        if(!response3.equalsIgnoreCase("LES SENTIERS DE LA GLOIRE"))
            System.out.println("Mauvaise réponse ! Vous ne recevez aucun point !");
        guesses3++;
        }
    while(!response3.equalsIgnoreCase("LES SENTIERS DE LA GLOIRE") && guesses3<=tries3);

    if(response3.equalsIgnoreCase("LES SENTIERS DE LA GLOIRE"))System.out.println("Bonne réponse ! Vous recevez 1 point !");
    if(response3.equalsIgnoreCase("LES SENTIERS DE LA GLOIRE"))i++;

do{System.out.println("La plus longue présidence de la Ve République a été celle de…");
            
            response4 = quiz.nextLine();

        if(!response4.equalsIgnoreCase("FRANCOIS MITTERRAND"))
            System.out.println("Mauvaise réponse ! Vous ne recevez aucun point !");
         guesses4++;
        }
    while(!response4.equalsIgnoreCase("FRANCOIS MITTERRAND") && guesses4<=tries4);

    if(response4.equalsIgnoreCase("FRANCOIS MITTERRAND")) System.out.println("Bonne réponse ! Vous recevez 1 point !");
     if(response4.equalsIgnoreCase("FRANCOIS MITTERRAND"))i++;


do{System.out.println("Quelles sont les trois couleurs qui constituent le drapeau de la France ?");
            
            response5 = quiz.nextLine();

        if(!response5.equalsIgnoreCase("BLEU BLANC ROUGE"))
            System.out.println("Mauvaise réponse ! Vous ne recevez aucun point !");
         guesses5++;
        }
    while(!response5.equalsIgnoreCase("BLEU BLANC ROUGE") && guesses5<=tries5);

    if(response5.equalsIgnoreCase("BLEU BLANC ROUGE")) System.out.println("Bonne réponse ! Vous recevez 1 point !");
    if(response5.equalsIgnoreCase("BLEU BLANC ROUGE"))i++;


    System.out.println("Vous avez "+i+" bonnes réponses.");

quiz.close();
}

}
