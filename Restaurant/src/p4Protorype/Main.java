package p4Protorype;

import p4Protorype.classes.Client;
import p4Protorype.classes.ClientConcret;
import p4Protorype.classes.ClientRegistry;

public class Main {
    public static void main(String[] args) {
        ClientRegistry clientRegistry = new ClientRegistry();

        Client clientOriginal = new ClientConcret("Ion Popescu", "ion.popescu@example.com", "0722333444");
        clientRegistry.inregistreazaClient("1", clientOriginal);

        try {
            Client clientClonat = clientRegistry.obtineClient("1");
            clientClonat.descriere();

            // Schimbăm câteva detalii ale clientului clonat
            Client clientClonat2 = clientRegistry.obtineClient("1");
            clientClonat2.descriere();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
