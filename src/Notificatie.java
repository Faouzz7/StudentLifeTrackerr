public class Notificatie {

    int id;
    int gebruikerId;
    String bericht;
    String verzendDatum;
    boolean gelezen;

    public Notificatie(int id, int gebruikerId, String bericht, String verzendDatum) {
        this.id = id;
        this.gebruikerId = gebruikerId;
        this.bericht = bericht;
        this.verzendDatum = verzendDatum;
        this.gelezen = false;
    }

    public void markeerAlsGelezen() {
        this.gelezen = true;
        System.out.println("Notificatie gelezen.");
    }
}
