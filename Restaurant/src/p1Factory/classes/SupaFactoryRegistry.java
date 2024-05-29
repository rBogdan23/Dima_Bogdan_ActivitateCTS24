package p1Factory.classes;

import java.util.HashMap;
import java.util.Map;

public class SupaFactoryRegistry {
    private static Map<String, SupaFactory> registry = new HashMap<>();

    static {
        registry.put("legume", new SupaDeLegumeFactory());
        registry.put("ciuperci", new SupaDeCiuperciFactory());
        registry.put("vita", new SupaDeVitaFactory());
    }

    public static void registerSupaFactory(String tip, SupaFactory factory) {
        registry.put(tip, factory);
    }

    public static Supa createSupa(String tip) {
        SupaFactory factory = registry.get(tip);
        if (factory != null) {
            return factory.createSupa();
        }
        throw new IllegalArgumentException("Tip de supă necunoscut.");
    }
}