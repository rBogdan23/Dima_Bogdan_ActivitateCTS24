package probleme.p2Factory.classesP3;

import probleme.p2Factory.classes.NouTip;
import probleme.p2Factory.classes.PersonalSpital;

public class NouTipFactory implements PersonalSpitalFactory {
    @Override
    public PersonalSpital createPersonal() {
        return new NouTip();
    }
}
