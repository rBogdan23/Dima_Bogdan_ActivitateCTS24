package P1.Main;

import P1.Main.classes.Credit;
import P1.Main.classes.CreditFactory;

public class Main {

        public static void main(String[] args) {
            Credit creditNevoiPersonale = CreditFactory.createCredit("nevoi personale", 50000, 5.5);
            Credit creditIpotecar = CreditFactory.createCredit("ipotecar", 200000, 3.5);

            creditNevoiPersonale.descriere();
            creditIpotecar.descriere();
        }
    }
