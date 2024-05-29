package p1Factory.classes.p2abstractfactory.Main;

import p1Factory.classes.p2abstractfactory.classes.*;

public class Main {
    public static void main(String[] args) {
        MedicamentRegistry registry = new MedicamentRegistry();

        registry.registerFactory("Raceala", new RacealaMedicamentFactory());
        registry.registerFactory("Durere", new DurereMedicamentFactory());
        registry.registerFactory("Body", new BodyMedicamentFactory());

        Medicament medicamentRaceala = registry.createMedicament("Raceala", "Paracetamol", 10.5);
        Medicament medicamentDurere = registry.createMedicament("Durere", "Ibuprofen", 15.0);
        Medicament medicamentBody = registry.createMedicament("Body", "Vitamin D", 20.0);

        medicamentRaceala.descriere();
        medicamentDurere.descriere();
        medicamentBody.descriere();

        // Adăugarea unei noi categorii la runtime
        registry.registerFactory("Antibiotic", new CategorieMedicamentFactory() {
            @Override
            public Medicament createMedicament(String denumire, double pret) {
                return new MedicamentImp1(denumire, pret);
            }
        });

        Medicament medicamentAntibiotic = registry.createMedicament("Antibiotic", "Amoxicilina", 25.0);
        medicamentAntibiotic.descriere();
    }
}