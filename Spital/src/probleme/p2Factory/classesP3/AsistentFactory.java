package probleme.p2Factory.classesP3;

import probleme.p2Factory.classes.Asistent;
import probleme.p2Factory.classes.PersonalSpital;

public class AsistentFactory implements PersonalSpitalFactory{
    @Override
    public PersonalSpital createPersonal() {
        return new Asistent();
    }
}
