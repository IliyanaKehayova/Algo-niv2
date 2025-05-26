import java.util.Scanner;

public class exoboucle3 {
    
public static void main(String[] args){




String response="Tokyo";

Scanner questionnaire = new Scanner(System.in);

    do{System.out.println("Quelle est la capitale du Japon ?");
        response = questionnaire.nextLine();


        if(!response.equalsIgnoreCase("Tokyo"))
            System.out.println("Raté ! Essayez encore une fois !\nQuelle est la capitale du Japon ?");


         
        }

    while(!response.equalsIgnoreCase("Tokyo"));


    System.out.println("Bonne réponse ! Tokyo est la capitale du Japon !");


questionnaire.close();

    }

    }