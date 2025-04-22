public class Bericht {

    int id;
    int gebruikerId;
    String inhoud;
    String datum;

    public Bericht(int id, int gebruikerId, String inhoud, String datum) {
        this.id = id;
        this.gebruikerId = gebruikerId;
        this.inhoud = inhoud;
        this.datum = datum;
    }

    public void verstuurBericht() {
        System.out.println("Bericht verstuurd: " + inhoud);
    }
}
