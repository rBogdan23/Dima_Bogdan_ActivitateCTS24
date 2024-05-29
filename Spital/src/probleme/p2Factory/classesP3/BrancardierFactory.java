package probleme.p2Factory.classesP3;

import probleme.p2Factory.classes.Brancardier;
import probleme.p2Factory.classes.PersonalSpital;

public class BrancardierFactory implements PersonalSpitalFactory{
    @Override
    public PersonalSpital createPersonal() {
        return new Brancardier();
    }
}
