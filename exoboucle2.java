import java.util.Scanner;

public class exoboucle2 {
    
public static void main(String[] args){




boolean response=false;

Scanner questionnaire = new Scanner(System.in);


while(response==false){
    System.out.println("Tokyo est la capitale du Japon");
    response = questionnaire.nextBoolean(); 
  
   if(response==false){System.out.println("Raté ! Essaye encore une fois !");};
   
}

System.out.println("C'est ça, Tokyo est la capitale du Japon.");


questionnaire.close();

}

}
