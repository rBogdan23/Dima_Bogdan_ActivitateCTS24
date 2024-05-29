package probleme.p2Factory.classesP3;

import probleme.p2Factory.classes.PersonalSpital;
import probleme.p2Factory.classes.TipPersonal;

import java.util.HashMap;
import java.util.Map;

public class PersonalSpitalRegistry {
    private static Map<TipPersonal, PersonalSpitalFactory> registry = new HashMap<>();

    static {
        registry.put(TipPersonal.BRANCARDIER, new BrancardierFactory());
        registry.put(TipPersonal.ASISTENT, new AsistentFactory());
        registry.put(TipPersonal.MEDIC, new MedicFactory());
    }

    public static void registerPersonalFactory(TipPersonal tip, PersonalSpitalFactory factory) {
        registry.put(tip, factory);
    }

    public static PersonalSpital createPersonal(TipPersonal tipPersonal) {
        PersonalSpitalFactory factory = registry.get(tipPersonal);
        if (factory != null) {
            return factory.createPersonal();
        }
        throw new IllegalArgumentException("Tip personal necunoscut.");
    }
}