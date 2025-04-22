public class Voedingsplan {

    int id;
    int gebruikerId;
    int calorieen;
    float eiwitten;
    float koolhydraten;
    float vetten;

    public Voedingsplan(int id, int gebruikerId, int calorieen, float eiwitten, float koolhydraten, float vetten) {
        this.id = id;
        this.gebruikerId = gebruikerId;
        this.calorieen = calorieen;
        this.eiwitten = eiwitten;
        this.koolhydraten = koolhydraten;
        this.vetten = vetten;
    }

    public void berekenMacros() {
        System.out.println("Macro's - Eiwitten: " + eiwitten + ", Koolhydraten: " + koolhydraten + ", Vetten: " + vetten);
    }

    public void koppelAanDoel(String doel) {
        System.out.println("Voedingsschema gekoppeld aan doel: " + doel);
    }
}
