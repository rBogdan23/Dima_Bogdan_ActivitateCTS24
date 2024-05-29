package p1Factory.classes.p2abstractfactory.classes;

public class MedicamentImp1 implements Medicament {
    private String denumire;
    private double pret;

    public MedicamentImp1(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void descriere() {
        System.out.println("Medicament: " + denumire + ", Pret: " + pret);
    }
}
