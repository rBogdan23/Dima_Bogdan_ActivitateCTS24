package p1Factory.classes.Main;

import p1Factory.classes.classes.Categorie;
import p1Factory.classes.classes.Medicament;
import p1Factory.classes.classes.MedicamentFactory;

public class Main {
    public static void main(String[] args) {
        Medicament medicamentRaceala = MedicamentFactory.createMedicament(Categorie.RACEALA, "Paracetamol", 10.5);
        Medicament medicamentDurere = MedicamentFactory.createMedicament(Categorie.DURERE, "Ibuprofen", 15.0);
        Medicament medicamentBody = MedicamentFactory.createMedicament(Categorie.BODY, "Vitamin D", 20.0);

        medicamentRaceala.descriere();
        medicamentDurere.descriere();
        medicamentBody.descriere();
    }
}