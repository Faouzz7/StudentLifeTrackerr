import java.util.ArrayList;
import java.util.List;


    public class RoutinePlan {
        int id;
        String naam;
        String startDatum;
        String eindDatum;
        int gebruikerId;
        List<Activiteit> activiteiten = new ArrayList<>();

        public RoutinePlan(int id, String naam, String startDatum, String eindDatum, int gebruikerId) {
            this.id = id;
            this.naam = naam;
            this.startDatum = startDatum;
            this.eindDatum = eindDatum;
            this.gebruikerId = gebruikerId;
        }

        public void voegActiviteitToe(Activiteit activiteit) {
            activiteiten.add(activiteit);
            System.out.println("Activiteit toegevoegd: " + activiteit.naam);
        }

        public void verwijderActiviteit(Activiteit activiteit) {
            activiteiten.remove(activiteit);
            System.out.println("Activiteit verwijderd: " + activiteit.naam);
        }

        public boolean pastInVrijeTijd(int beschikbareMinuten) {
            int totaalDuur = 0;
            for (Activiteit a : activiteiten) {
                totaalDuur += a.duurInMinuten;
            }
            return totaalDuur <= beschikbareMinuten;
        }
    }


