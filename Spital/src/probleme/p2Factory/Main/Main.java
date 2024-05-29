package probleme.p2Factory.Main;

import probleme.p2Factory.classes.PersonalSpital;
import probleme.p2Factory.classes.PersonalSpitalFactory;
import probleme.p2Factory.classes.TipPersonal;
import probleme.p2Factory.classesP3.NouTipFactory;
import probleme.p2Factory.classesP3.PersonalSpitalRegistry;

public class Main
{
    public static void main(String[] args)
    {
        PersonalSpital brancardier = PersonalSpitalFactory.createPersonal(TipPersonal.BRANCARDIER);
        PersonalSpital asistent = PersonalSpitalFactory.createPersonal(TipPersonal.ASISTENT);
        PersonalSpital medic = PersonalSpitalFactory.createPersonal(TipPersonal.MEDIC);

        brancardier.descriere();
        asistent.descriere();
        medic.descriere();


        // Adăugare nou tip de personal
        PersonalSpitalFactory nouTipFactory = new PersonalSpitalFactory() {

            public PersonalSpital createPersonal() {
                return new PersonalSpital() {
                    @Override
                    public void descriere() {
                        System.out.println("Sunt un nou tip de personal.");
                    }
                };
            }
        };


    }

    }



