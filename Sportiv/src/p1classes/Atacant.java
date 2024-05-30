package p1classes;

public class Atacant implements Jucator {
    private String nume;

    public Atacant(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Atacant: " + nume);
    }
}