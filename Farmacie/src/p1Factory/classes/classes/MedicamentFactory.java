package p1Factory.classes.classes;

public class MedicamentFactory {
    public static Medicament createMedicament(Categorie categorie, String denumire, double pret) {
        switch (categorie) {
            case RACEALA:
                return new MedicamentRaceala(denumire, pret);
            case DURERE:
                return new MedicamentDurere(denumire, pret);
            case BODY:
                return new MedicamentBody(denumire, pret);
            default:
                throw new IllegalArgumentException("Categorie necunoscută: " + categorie);
        }
    }
}
