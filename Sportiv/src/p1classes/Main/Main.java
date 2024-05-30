package p1classes.Main;

import p1classes.CategorieJucator;
import p1classes.Jucator;
import p1classes.JucatorFactory;

public class Main {
    public static void main(String[] args) {
        Jucator portar = JucatorFactory.createJucator(CategorieJucator.PORTAR, "Ion Popescu");
        Jucator fundas = JucatorFactory.createJucator(CategorieJucator.FUNDAS, "Gheorghe Ionescu");
        Jucator atacant = JucatorFactory.createJucator(CategorieJucator.ATACANT, "Vasile Georgescu");

        portar.descriere();
        fundas.descriere();
        atacant.descriere();
    }
}