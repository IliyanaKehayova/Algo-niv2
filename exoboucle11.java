/*do{System.out.println("Les chauves souris sont-elles chauves ? (Oui/Non)");
response1 = quiz.nextLine();
guesses1++;

        if(!response1.equalsIgnoreCase("NON"))
            System.out.println("Mauvaise réponse ! Vous ne recevez aucun point !");
           
        }
    while(!response1.equalsIgnoreCase("NON") && guesses1<=tries1);

    if(response1.equalsIgnoreCase("NON"))System.out.println("Bonne réponse ! Vous recevez 1 point !");  
    if(response1.equalsIgnoreCase("NON"))i++;
    
       
do{System.out.println("Qui a dit « Ma femme est un homme politique » ?");
            
            response2 = quiz.nextLine();
            guesses2++;

        if(!response2.equalsIgnoreCase("JACQUES CHIRAC"))
            System.out.println("Mauvaise réponse ! Vous ne recevez aucun point !");
         
        }
    while(!response2.equalsIgnoreCase("JACQUES CHIRAC") && guesses2<=tries2);

    if(response2.equalsIgnoreCase("JACQUES CHIRAC"))System.out.println("Bonne réponse ! Vous recevez 1 point !");
    if(response2.equalsIgnoreCase("JACQUES CHIRAC"))i++;
                                                                   
do{ System.out.println("Quel film « polémique » de Stanley Kubrick n’a été diffusé en France que dix-huit ans après sa sortie ?");
            
            response3 = quiz.nextLine();
            guesses3++;

        if(!response3.equalsIgnoreCase("LES SENTIERS DE LA GLOIRE"))
            System.out.println("Mauvaise réponse ! Vous ne recevez aucun point !");
        
        }
    while(!response3.equalsIgnoreCase("LES SENTIERS DE LA GLOIRE") && guesses3<=tries3);

    if(response3.equalsIgnoreCase("LES SENTIERS DE LA GLOIRE"))System.out.println("Bonne réponse ! Vous recevez 1 point !");
    if(response3.equalsIgnoreCase("LES SENTIERS DE LA GLOIRE"))i++;

do{System.out.println("La plus longue présidence de la Ve République a été celle de…");
            
            response4 = quiz.nextLine();
            guesses4++;

        if(!response4.equalsIgnoreCase("FRANCOIS MITTERRAND"))
            System.out.println("Mauvaise réponse ! Vous ne recevez aucun point !");
         
        }
    while(!response4.equalsIgnoreCase("FRANCOIS MITTERRAND") && guesses4<=tries4);

    if(response4.equalsIgnoreCase("FRANCOIS MITTERRAND")) System.out.println("Bonne réponse ! Vous recevez 1 point !");
     if(response4.equalsIgnoreCase("FRANCOIS MITTERRAND"))i++;


do{System.out.println("Quelles sont les trois couleurs qui constituent le drapeau de la France ?");
            
            response5 = quiz.nextLine();
            guesses5++;

        if(!response5.equalsIgnoreCase("BLEU BLANC ROUGE"))
            System.out.println("Mauvaise réponse ! Vous ne recevez aucun point !");
         
        }
    while(!response5.equalsIgnoreCase("BLEU BLANC ROUGE") && guesses5<=tries5);

    
    if(response5.equalsIgnoreCase("BLEU BLANC ROUGE")) System.out.println("Bonne réponse ! Vous recevez 1 point !");
    if(response5.equalsIgnoreCase("BLEU BLANC ROUGE"))i++;


    System.out.println("Vous avez "+i+" bonnes réponses.");

quiz.close();

 */

import java.util.Scanner;

public class exoboucle11 {
    public static void main(String [] args){

Scanner quiz = new Scanner(System.in); 

int i=1; 
String goodresponse;
String response;
String question;
int score = 0;

while (i<=5){
   
switch(i){

case 1 : question = "Les chauves souris sont-elles chauves ? (Oui/Non)"; goodresponse= "NON"; break;
case 2 : question = "Qui a dit « Ma femme est un homme politique » ?"; goodresponse= "jacques chirac"; break;
case 3 : question = "Quel film « polémique » de Stanley Kubrick n’a été diffusé en France que dix-huit ans après sa sortie ?"; goodresponse= "les sentiers de la gloire"; break;
case 4 : question = "La plus longue présidence de la Ve République a été celle de…"; goodresponse = "francois mitterrand"; break;
case 5 : question = "Quelles sont les trois couleurs qui constituent le drapeau de la France ?"; goodresponse = "bleu blanc rouge"; break;

default : question = "aucune question"; goodresponse = "j'avoue"; break; 
}

System.out.println("Question n° "+i+" : "+question);
response = quiz.nextLine();
 i++;

if(response.equalsIgnoreCase(goodresponse)){
    score++;
    System.out.println("Bonne réponse : + 1 point ! ");
     
}
else {System.out.println("Mauvaise réponse : 0 points");}

}
System.out.println("Votre score final est : "+score+"/"+(i-1));


quiz.close();

}
}