import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.DateTimeException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.NullPointerException;
import java.text.DecimalFormat;

public class exojalon100625 {

    public static void main(String[] args) {

        Scanner vol = new Scanner(System.in);

        // Variables
        String departure = null; // Ville de départ
        String arrival = null;   // Ville d'arrivée
        long durationMinutes;    // Durée du vol en minutes
        int seat = 0; // Nombre de places
        double flightprice = 0; // Prix initial du vol
        String continuer = null;   // Pour répéter la boucle
        String identifiant = "admin";
        String password = "Mulhouse68";
        boolean authentifie = false; //variable qui permet de savoir si on s'est bien identifié ou pas
        String departuretime = null; //date et heure de départ
        String arrivaltime; //
        String durationtime = null;
        


        // listes pour stocker les données
        ArrayList<String> departures = new ArrayList<>();
        ArrayList<String> arrivals = new ArrayList<>();
        ArrayList<String> exits = new ArrayList<>();
        ArrayList<Long> durations = new ArrayList<>(); // stocker la durée en minutes
        ArrayList<Integer> seats = new ArrayList<>();
        ArrayList<Double> flightprices = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        DecimalFormat f = new DecimalFormat();
        f.setMaximumFractionDigits(2); //j'ai crée un format qui me permet d'avoir deux chiffres après la virgule pour le prix du vol à la fin

        System.out.println("Bonjour et bienvenue dans l'outil AIRMESS.");
        System.out.println("Afin d'enregistrer un vol, veuillez saisir vos identifiants.");

    do {
            System.out.print("Identifiant : ");
            String id = vol.nextLine();

            System.out.print("Mot de passe : ");
            String mp = vol.nextLine();

            if (id.equals(identifiant) && mp.equals(password)) {
                authentifie = true;
                System.out.println("Authentification réussie.\n");
            } else {
                System.out.println("Erreur identifiant ou mot de passe, veuillez réessayer.\n");
            }
    } while (!authentifie);

       

    do {
            System.out.print("Veuillez saisir la destination de départ : (Ville/PAYS) ");
            try {
                departure = vol.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrée invalide, veuillez saisir la ville et le pays de départ.");
                vol.next();
            }

            System.out.print("Veuillez saisir la destination d'arrivée : (Ville/PAYS) ");
            try {
                arrival = vol.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Entrée invalide, veuillez saisir la destination d'arrivée.");
            }

            System.out.print("Veuillez saisir la date et l'heure de départ : (dd-MM-yyyy HH:mm) ");
            try{
            departuretime = vol.nextLine();}
            catch (DateTimeException e) {
                System.out.println("Entrée invalide, veuillez saisir la date et l'heure de départ : (dd-MM-yyyy HH:mm)");
            }


            //LE BORDEL COMMENCE ICI!!!!!!!!
            // Parsing de la date de départ pour la transformer en chaîne de caractéres qui permet ensuite de rajouter des heures/minutes et calculer la date et l'heure d'arivée
            LocalDateTime departureDateTime = null;
            try {
                departureDateTime = LocalDateTime.parse(departuretime, formatter); //on applique le format créé tout en haut, DepartureDateTIme devient la date et l'heure indiquées au dessus formattées en dd-MM-yyyy HH:mm
            } catch (DateTimeParseException e) {
                System.out.println("Format de date/heure invalide, veuillez recommencer.");
                vol.next();
            }

            // Saisie de la durée du vol 
            System.out.print("Veuillez saisir la durée du vol : (HH:mm)");
            try{durationtime = vol.nextLine();}
            catch (NullPointerException e) {
                System.out.println("Entrée invalide, veuillez saisir la durée du vol : (HH:mm)");
                vol.next();
            }
            catch (NumberFormatException e) {
                System.out.println("Entrée invalide, veuillez saisir la durée du vol : (HH:mm)");
                vol.next();
            }
            
            

            // Parsing de la durée en heures et minutes
            String[] parts = durationtime.split(":"); //sépare les heures et les minutes afin qu'on puisse les transformer uniquement en minutes par la suite
            int hours = Integer.parseInt(parts[0]); 
            int minutes = Integer.parseInt(parts[1]);
            
            durationMinutes = hours * 60 + minutes;   // on multiplie le nombre d'heures + le sminutes et on obtient la durée du vol en minutes

            
            LocalDateTime arrivalDateTime = departureDateTime.plusMinutes(durationMinutes); // pour calcucler la date d'arrivée on créé une nouvelle variable et on rajoute le nombre de minutes de la variable DurationMinutes
            arrivaltime = arrivalDateTime.format(formatter); //on formatte la variable de la date d'arrivée
            System.out.println("Date et heure d'arrivée : " + arrivaltime);


            // Saisie du nombre de places
            System.out.print("Veuillez saisir le nombre de places : ");
            try {
                seat = vol.nextInt();
                vol.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Entrée invalide, veuillez saisir un nombre entier pour le nombre de places.");
                vol.nextLine(); 
             
            }

            System.out.print("Veuillez saisir le prix du vol : ");
            try {
                flightprice = vol.nextDouble();
                vol.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Entrée invalide, veuillez saisir un nombre pour le prix.");
                vol.nextLine();
            
            }

            //  du prix en fonction du nombre de places
            if (seat >= 150) {
                flightprice = flightprice - flightprice * 10 / 100; // 10% de réduction
            } else if (seat <= 100) {
                flightprice = flightprice + flightprice * 10 / 100; // 10% de surcharge
            }

            // Augmentation/réduction du prix en fonction du délai d'achat (nombre de mois)
            long monthsBetween = Math.abs(Duration.between(LocalDateTime.now(), departureDateTime).toDays() / 30); //on calcule 
            if (monthsBetween > 6) {
                // Plus de 6 mois  : 40% moins cher
                flightprice = flightprice - flightprice * 40 / 100;
            } else if (monthsBetween >= 0 && monthsBetween <= 6) {
                // Moins de 6 mois : 40% plus cher
                flightprice = flightprice + flightprice * 40 / 100;
            }

            //LE BORDEL S'ARRETE ICI!!!!!!!!!!!!!!

            // On rajoute chaque nouvel élement à la liste correspondante 
            departures.add(departure);
            arrivals.add(arrival);
            exits.add(departuretime);
            durations.add(durationMinutes);
            seats.add(seat);
            flightprices.add(flightprice);

            System.out.print("\nSouhaitez-vous enregistrer un autre vol ? (oui/non) : ");
            continuer = vol.nextLine();

    } while (continuer.equals("oui"));


        // Affichage des vols enregistrés en les listant un par un avec GET
        System.out.println("\n--- Liste des vols enregistrés ---");
        for (int i = 0; i < departures.size(); i++) {
            System.out.println("\nVol #" + (i + 1));
            System.out.println("Départ : " + departures.get(i));
            System.out.println("Arrivée : " + arrivals.get(i));
            System.out.println("Date et heure de départ : " + exits.get(i));
            System.out.println("Durée : " + durations.get(i) + " minutes");
            System.out.println("Nombre de places : " + seats.get(i));
            System.out.println("Prix : " + f.format(flightprices.get(i)) + " euros");
        }

        vol.close();
    }
}