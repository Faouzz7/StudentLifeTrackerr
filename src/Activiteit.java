public class Activiteit {

    int id;
    String naam;
    String categorie;
    int duurInMinuten;
    int inspanning;

    public Activiteit(int id, String naam, String categorie, int duurInMinuten, int inspanning) {
        this.id = id;
        this.naam = naam;
        this.categorie = categorie;
        this.duurInMinuten = duurInMinuten;
        this.inspanning = inspanning;
    }

    public int berekenEnergieverbruik() {
        return duurInMinuten * inspanning;
    }

    public String getCategorie() {
        return categorie;
    }
}
