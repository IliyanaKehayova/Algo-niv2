import java.util.Scanner;

public class exofonction2 {
    
    public static void StarWars()
    {System.out.print("I thought not. It's not a story the Jedi would tell you. It's a Sith legend. Darth Plagueis was a Dark Lord of the Sith, so powerful and so wise he could use the Force to influence the midichlorians to create life... He had such a knowledge of the dark side that he could even keep the ones he cared about from dying. The dark side of the Force is a pathway to many abilities some consider to be unnatural. He became so powerful... the only thing he was afraid of was losing his power, which eventually, of course, he did. Unfortunately, he taught his apprentice everything he knew, then his apprentice killed him in his sleep. It's ironic he could save others from death, but not himself.");
    }

    public static void force()
    {System.out.print("The dark side of the Force is a pathway to many abilities some consider to be unnatural.");
    }

 public static void main(String[] args) {


    Scanner anakin = new Scanner(System.in);


    System.out.println("Did you ever hear the tragedy of Darth Plagueis the Wise?");
    String vader = anakin.nextLine();

    if (vader.equalsIgnoreCase("no")){

    StarWars();}
    else if ((vader.equalsIgnoreCase("yes"))){
    force();
    };





anakin.close();
}
}
