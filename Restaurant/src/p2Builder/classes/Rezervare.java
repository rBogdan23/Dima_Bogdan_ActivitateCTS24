package p2Builder.classes;

public class Rezervare {
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    private Rezervare(RezervareBuilder builder) {
        this.asezareLaGeam = builder.asezareLaGeam;
        this.scauneErgonomice = builder.scauneErgonomice;
        this.decorareMasa = builder.decorareMasa;
        this.muzicaAmbientala = builder.muzicaAmbientala;
        this.genMuzica = builder.genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "asezareLaGeam=" + asezareLaGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareMasa=" + decorareMasa +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }

    // Getteri pentru fiecare atribut (opțional)

    public static class RezervareBuilder {
        private boolean asezareLaGeam = false;
        private boolean scauneErgonomice = false;
        private boolean decorareMasa = false;
        private boolean muzicaAmbientala = false;
        private String genMuzica = "None";

        public RezervareBuilder withAsezareLaGeam(boolean asezareLaGeam) {
            this.asezareLaGeam = asezareLaGeam;
            return this;
        }

        public RezervareBuilder withScauneErgonomice(boolean scauneErgonomice) {
            this.scauneErgonomice = scauneErgonomice;
            return this;
        }

        public RezervareBuilder withDecorareMasa(boolean decorareMasa) {
            this.decorareMasa = decorareMasa;
            return this;
        }

        public RezervareBuilder withMuzicaAmbientala(boolean muzicaAmbientala) {
            this.muzicaAmbientala = muzicaAmbientala;
            return this;
        }

        public RezervareBuilder withGenMuzica(String genMuzica) {
            this.genMuzica = genMuzica;
            return this;
        }

        public Rezervare build() {
            return new Rezervare(this);
        }
    }
}