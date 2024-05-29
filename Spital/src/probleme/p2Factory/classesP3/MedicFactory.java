package probleme.p2Factory.classesP3;

import probleme.p2Factory.classes.Medic;
import probleme.p2Factory.classes.PersonalSpital;

public class MedicFactory implements PersonalSpitalFactory{
    @Override
    public PersonalSpital createPersonal() {
        return new Medic();
    }
}
