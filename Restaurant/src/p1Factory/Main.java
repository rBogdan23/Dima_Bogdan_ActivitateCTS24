package p1Factory;

import p1Factory.classes.Supa;
import p1Factory.classes.SupaFactory;
import p1Factory.classes.SupaFactoryRegistry;

public class Main {
    public static void main(String[] args) {
        Supa supaLegume = SupaFactoryRegistry.createSupa("legume");
        Supa supaCiuperci = SupaFactoryRegistry.createSupa("ciuperci");
        Supa supaVita = SupaFactoryRegistry.createSupa("vita");

        supaLegume.descriere();
        supaCiuperci.descriere();
        supaVita.descriere();

        // Adăugarea unui nou tip de supă
        SupaFactory supaDePuiFactory = new SupaFactory() {
            @Override
            public Supa createSupa() {
                return new Supa() {
                    @Override
                    public void descriere() {
                        System.out.println("Aceasta este o supă de pui.");
                    }
                };
            }
        };

        SupaFactoryRegistry.registerSupaFactory("pui", supaDePuiFactory);
        Supa supaPui = SupaFactoryRegistry.createSupa("pui");
        supaPui.descriere();
    }
    }
