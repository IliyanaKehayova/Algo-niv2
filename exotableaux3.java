/* A l'aide de boucle, tableau, exception et fonction. Me faire un tableau contenant 5 noms de ville (Vous pouvez choisir vos propres villes), 
créer une méthode pour afficher les villes du tableau numéroté par ligne et autre une méthode pour choisir une ville selon 
la position de sa cellule du tableau et puis affichera un message de bienvenue dans la langue de la ville choisie.:

Bonjour, quelle ville voulez-vous visiter ?

0 - Paris 
1 - Londres
2 - Madrid
3 - Lisbonne
4 - Berlin
0
Bienvenue à Paris !

Voulez-vous visiter une autre ville ? (O/N)
O

1
Welcome to London !

Voulez-vous visiter une autre ville ? (O/N)
O

2
Bienvenido a Madrid !
Voulez-vous visiter une autre ville ? (O/N)
O


3
Bem-vindo a Lisboa !
Voulez-vous visiter une autre ville ? (O/N)
O

4
Willkommen in Berlin !
Voulez-vous visiter une autre ville ? (O/N)
O


5
Désolé, cette ville n'est pas sur la liste !
Voulez-vous visiter une autre ville ? (O/N)
O

Votre voyage est terminé :) !

*/

import java.util.Scanner;

public class exotableaux3 {

    public static int ville(int[] tableauville) {
    return tableauville[0]; // Retourne la première valeur du tableau
    }

    public static int message(int[] tableaumessage) {
    return tableaumessage[0]; // Retourne la première valeur du tableau
    }



    public static void main(String[] args) {

        int i;
        boolean continuer;
        Scanner tableau = new Scanner(System.in);
    
        String[] tableaumessage = {"Bienvenue à Paris !", "Welcome to London!", "Bienvenido a Madrid !", "Bem-vindo a Lisboa !", "Willkommen in Berlin !"};


System.out.println("Bonjour, quelle ville voulez-vous visiter ?\n0 - Paris \n1 - Londres\n2 - Madrid\n3 - Lisbonne\n4 - Berlin");

i = tableau.nextInt();
System.out.println(tableaumessage[i]);
System.out.println("Voulez-vous visiter une autre ville ? TRUE/FALSE");
continuer = tableau.nextBoolean();

while(continuer==true)
{   
    
    System.out.println("Quelle ville voulez-vous visiter ?\n0 - Paris\n1 - Londres\n2 - Madrid\n3 - Lisbonne\n4 - Berlin");
   
try{i = tableau.nextInt();
    System.out.println(tableaumessage[i]);}
catch(IndexOutOfBoundsException e){System.out.println("Désolé, cette ville n'est pas sur la liste !");  
continue;

}        

tableau.close();

}
    }
























}
