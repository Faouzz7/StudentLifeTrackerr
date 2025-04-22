public class Gebruiker {

        int id;
        String naam;
        String email;
        String wachtwoord;
        String doel;

        public Gebruiker(int id, String naam, String email, String wachtwoord, String doel) {
            this.id = id;
            this.naam = naam;
            this.email = email;
            this.wachtwoord = wachtwoord;
            this.doel = doel;
        }

        public void login() {
            System.out.println(naam + " is ingelogd.");
        }

        public void logout() {
            System.out.println(naam + " is uitgelogd.");
        }

        public String getNaam() {
            return naam;
        }

        public void setNaam(String naam) {
            this.naam = naam;
        }
    }


