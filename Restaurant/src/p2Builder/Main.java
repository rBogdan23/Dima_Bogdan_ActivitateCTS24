package p2Builder;

import p2Builder.classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare.RezervareBuilder()
                .withAsezareLaGeam(true)
                .withScauneErgonomice(true)
                .withDecorareMasa(false)
                .withMuzicaAmbientala(true)
                .withGenMuzica("Jazz")
                .build();

        Rezervare rezervare2 = new Rezervare.RezervareBuilder()
                .withAsezareLaGeam(false)
                .withScauneErgonomice(false)
                .withDecorareMasa(true)
                .withMuzicaAmbientala(false)
                .withGenMuzica("Rock")
                .build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
