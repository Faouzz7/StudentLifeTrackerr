public class Reflectie {

    int id;
    int gebruikerId;
    String inhoud;
    String datum;

    public Reflectie(int id, int gebruikerId, String inhoud, String datum) {
        this.id = id;
        this.gebruikerId = gebruikerId;
        this.inhoud = inhoud;
        this.datum = datum;
    }

    public void verzendReflectie() {
        System.out.println("Reflectie verzonden: " + inhoud);
    }
}
