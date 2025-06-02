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


import java.util.ArrayList;
import java.util.Scanner;

public class exoboucle5 {

    public static void main(String[] args) {

        Scanner liste = new Scanner(System.in);


        ArrayList<String> produits = new ArrayList<>();
        ArrayList<Double> prix = new ArrayList<>();

        int i=0;
        String produit; 
        double prixProduit;
        boolean continuer=true;

        while (continuer) {
            System.out.println("Bonjour, que voulez vous acheter ?");
            produit = liste.nextLine();
            produits.add(produit);

            System.out.println("Combien, ça côute ?");
            prixProduit = Double.parseDouble(liste.nextLine());
            prix.add(prixProduit);

            System.out.println("Voulez-vous acheter autre choses (true/false)?");
            continuer = Boolean.parseBoolean(liste.nextLine());
        }
            System.out.println("\nRécapitulatif de vos courses :\n");

            double total = 0;

            for (i = 0; i < produits.size(); i++) {
            System.out.println("- " + produits.get(i) + " , " + String.format("%.2f", prix.get(i)) + " euros");
            total += prix.get(i);
        
              
        }
           
            System.out.println("\nTotal de vos courses : " + String.format("%.2f", total) + " euros");

        liste.close();
       
    } 
    
}






