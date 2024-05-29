package p1Factory.classes;

public class SupaDeVitaFactory implements SupaFactory {
    @Override
    public Supa createSupa() {
        return new SupaDeVita();
    }
}