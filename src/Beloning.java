public class Beloning {

    int id;
    int gebruikerId;
    String type;
    String datumVerkregen;

    public Beloning(int id, int gebruikerId, String type, String datumVerkregen) {
        this.id = id;
        this.gebruikerId = gebruikerId;
        this.type = type;
        this.datumVerkregen = datumVerkregen;
    }

    public void claimBeloning() {
        System.out.println("Beloning geclaimd: " + type);
    }
}
