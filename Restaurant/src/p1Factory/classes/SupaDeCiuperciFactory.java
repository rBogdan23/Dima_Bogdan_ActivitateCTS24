package p1Factory.classes;

public class SupaDeCiuperciFactory implements SupaFactory {
    @Override
    public Supa createSupa() {
        return new SupaDeCiuperci();
    }
}