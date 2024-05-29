package p1Factory.classes.p2abstractfactory.classes;

import java.util.HashMap;
import java.util.Map;

public class MedicamentRegistry {
    private Map<String, CategorieMedicamentFactory> registry = new HashMap<>();

    public void registerFactory(String categorie, CategorieMedicamentFactory factory) {
        registry.put(categorie, factory);
    }

    public Medicament createMedicament(String categorie, String denumire, double pret) {
        CategorieMedicamentFactory factory = registry.get(categorie);
        if (factory != null) {
            return factory.createMedicament(denumire, pret);
        }
        throw new IllegalArgumentException("Categorie necunoscută: " + categorie);
    }
}