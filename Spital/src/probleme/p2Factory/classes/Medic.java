package probleme.p2Factory.classes;

import probleme.p2Factory.classes.PersonalSpital;

public class Medic implements PersonalSpital {
    @Override
    public void descriere() {
        System.out.println("Sunt un medic.");
    }
}
