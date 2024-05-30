package p1classes;

public class JucatorFactory {
    public static Jucator createJucator(CategorieJucator categorie, String nume) {
        switch (categorie) {
            case PORTAR:
                return new Portar(nume);
            case FUNDAS:
                return new Fundas(nume);
            case ATACANT:
                return new Atacant(nume);
            default:
                throw new IllegalArgumentException("Categorie de jucător necunoscută: " + categorie);
        }
    }
}