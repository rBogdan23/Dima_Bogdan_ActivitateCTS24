package p1Factory.classes.classes;

public class MedicamentBody implements Medicament {
    private double pret;
    private String denumire;

    public MedicamentBody(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void descriere() {
        System.out.println("Medicament: " + denumire + ", Pret: " + pret + ", Categorie: Body");
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public Categorie getCategorie() {
        return Categorie.BODY;
    }
}