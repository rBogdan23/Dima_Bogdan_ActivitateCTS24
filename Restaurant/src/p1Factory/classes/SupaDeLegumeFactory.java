package p1Factory.classes;

public class SupaDeLegumeFactory implements SupaFactory {
    @Override
    public Supa createSupa() {
        return new SupaDeLegume();
    }
}