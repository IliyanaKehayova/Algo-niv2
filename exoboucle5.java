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
 * ------------ajouter pouvoir supprimer un item de la liste
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
        boolean remove=false;
        String toremove="";
        
        System.out.println("Bonjour cher client/chère cliente ! \n");

        while (continuer) 
                            {
            System.out.println("Que voulez vous acheter ?");
            produit = liste.nextLine();
            produits.add(produit);

            System.out.println("Combien, ça côute ?");
            prixProduit = liste.nextDouble();
            liste.nextLine();
            prix.add(prixProduit);

            System.out.println("Voulez-vous acheter autre choses (true/false)?");
            continuer = liste.nextBoolean();
            liste.nextLine();
                            }


            System.out.println("\nRécapitulatif de vos courses :\n");

            double total = 0;

            for (i = 0; i < produits.size(); i++) 
                                            {
            System.out.println("- "+ produits.get(i) + " : " +prix.get(i) + " euros");
            total += prix.get(i);
        
              
                                                 }
            System.out.println("Souhaitez-vous supprimer un article ? true/false");
            remove=liste.nextBoolean();
            liste.nextLine();


                if(!remove)  {
                            System.out.println("Total de vos courses : " +total+ " euros");
                            }
                else if(remove)                    {
                            System.out.println("Quel article souhaitez-vous supprimer ?");
                            toremove = liste.nextLine();
                            int ligne = produits.indexOf(toremove);



                                if (ligne != -1) 
                                {
                                produits.remove(ligne);
                                prix.remove(ligne);
                                System.out.println(toremove + " a été retiré de la liste.");
                                } 
                                else 
                                {
                                System.out.println("Article pas trouvé dans la liste.");
                                }


                                total = 0;
                                int j;
                                System.out.println("\nListe mise à jour :");
                                for (j = 0; j < produits.size(); j++) 
                                {
                                System.out.println("- " + produits.get(j) + " : " + prix.get(j) + " euros");
                                total += prix.get(j);
                                }
                                System.out.println("Total de vos courses : " + total + " euros");
                                                    }                                               
               liste.close();                        
             
                                                }

                                }



