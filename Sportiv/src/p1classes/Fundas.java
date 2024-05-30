package p1classes;

public class Fundas implements Jucator {
    private String nume;

    public Fundas(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Fundas: " + nume);
    }
}
