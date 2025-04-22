import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Gebruiker aanmaken
        System.out.print("Wat is je naam? ");
        String naam = scanner.nextLine();

        System.out.print("Wat is je e-mailadres? ");
        String email = scanner.nextLine();

        System.out.print("Wat is je doel? ");
        String doel = scanner.nextLine();

        Gebruiker gebruiker = new Gebruiker(1, naam, email, "wachtwoord123", doel);
        gebruiker.login();

        // Trainingsplan maken
        System.out.println("\nWil je een trainingsplan maken? (ja/nee)");
        String antwoord = scanner.nextLine();

        if (antwoord.equalsIgnoreCase("ja")) {
            RoutinePlan plan = new RoutinePlan(1, "Weekplan", "2025-04-15", "2025-04-21", gebruiker.id);

            System.out.print("Hoe heet je activiteit? ");
            String activiteitNaam = scanner.nextLine();

            System.out.print("Categorie van de activiteit (bv. Sport/Ontspanning): ");
            String categorie = scanner.nextLine();

            System.out.print("Hoe lang duurt de activiteit in minuten? ");
            int duur = Integer.parseInt(scanner.nextLine());

            System.out.print("Hoe zwaar is de activiteit (1-10)? ");
            int inspanning = Integer.parseInt(scanner.nextLine());

            Activiteit activiteit = new Activiteit(1, activiteitNaam, categorie, duur, inspanning);
            plan.voegActiviteitToe(activiteit);

            System.out.print("Hoeveel vrije tijd heb je (in minuten)? ");
            int vrijeTijd = Integer.parseInt(scanner.nextLine());

            if (plan.pastInVrijeTijd(vrijeTijd)) {
                System.out.println("✅ Dit plan past in jouw vrije tijd!");
            } else {
                System.out.println("⚠️ Plan is te druk voor jouw beschikbare tijd.");
            }
        }

        // Voedingsplan
        System.out.println("\nWil je een voedingsplan aanmaken? (ja/nee)");
        if (scanner.nextLine().equalsIgnoreCase("ja")) {
            System.out.print("Hoeveel calorieën wil je eten? ");
            int calorieen = Integer.parseInt(scanner.nextLine());

            System.out.print("Eiwitten (g): ");
            float eiwitten = Float.parseFloat(scanner.nextLine());

            System.out.print("Koolhydraten (g): ");
            float koolhydraten = Float.parseFloat(scanner.nextLine());

            System.out.print("Vetten (g): ");
            float vetten = Float.parseFloat(scanner.nextLine());

            Voedingsplan voeding = new Voedingsplan(1, gebruiker.id, calorieen, eiwitten, koolhydraten, vetten);
            voeding.berekenMacros();
            voeding.koppelAanDoel(gebruiker.doel);
        }

        // Challenge
        System.out.println("\nWil je deelnemen aan een challenge? (ja/nee)");
        if (scanner.nextLine().equalsIgnoreCase("ja")) {
            Challenge challenge = new Challenge(1, "3x per week trainen", "2025-04-01", "2025-04-30");
            challenge.voegDeelnemerToe(gebruiker);
            challenge.toonRanking();
        }

        // Reflectie
        System.out.println("\nWil je een reflectie schrijven? (ja/nee)");
        if (scanner.nextLine().equalsIgnoreCase("ja")) {
            System.out.print("Wat wil je reflecteren? ");
            String reflectieTekst = scanner.nextLine();

            Reflectie reflectie = new Reflectie(1, gebruiker.id, reflectieTekst, "2025-04-10");
            reflectie.verzendReflectie();
        }

        // Bericht
        System.out.println("\nWil je een bericht sturen? (ja/nee)");
        if (scanner.nextLine().equalsIgnoreCase("ja")) {
            System.out.print("Wat wil je versturen als bericht? ");
            String inhoud = scanner.nextLine();

            Bericht bericht = new Bericht(1, gebruiker.id, inhoud, "2025-04-11");
            bericht.verstuurBericht();
        }

        // Notificatie
        Notificatie notificatie = new Notificatie(1, gebruiker.id, "Tijd voor je training!", "2025-04-12");
        notificatie.markeerAlsGelezen();

        // Beloning
        Beloning beloning = new Beloning(1, gebruiker.id, "Week 1 Badge", "2025-04-12");
        beloning.claimBeloning();

        gebruiker.logout();
        scanner.close();
    }
}

