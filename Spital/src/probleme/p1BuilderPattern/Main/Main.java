package probleme.p1BuilderPattern.Main;

import probleme.p1BuilderPattern.classes.Pacient;


public class Main {
    public static void main(String[] args) {


                Pacient pacient = new Pacient.PacientBuilder("Ion Popescu")
                        .withPatRabatabil(true)
                        .withMicDejunInclus(false)
                        .withPapuciCamera(true)
                        .withHalatInterior(true)
                        .build();

                // Utilizare obiect pacient
            }


        }


