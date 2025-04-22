public class Challenge {

    int id;
    String naam;
    String startDatum;
    String eindDatum;

    public Challenge(int id, String naam, String startDatum, String eindDatum) {
        this.id = id;
        this.naam = naam;
        this.startDatum = startDatum;
        this.eindDatum = eindDatum;
    }

    public void voegDeelnemerToe(Gebruiker gebruiker) {
        System.out.println(gebruiker.naam + " is toegevoegd aan challenge: " + this.naam);
    }

    public void toonRanking() {
        System.out.println("Toon ranking voor challenge: " + naam);
    }
}
