package p1Factory.classes.p2abstractfactory.classes;

public class DurereMedicamentFactory implements CategorieMedicamentFactory {
    @Override
    public Medicament createMedicament(String denumire, double pret) {
        return new MedicamentImp1(denumire, pret);
    }
}

