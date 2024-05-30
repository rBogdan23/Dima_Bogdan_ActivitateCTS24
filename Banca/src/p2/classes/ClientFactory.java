package p2.classes;

import p2.classes.Client;

public interface ClientFactory {
    Client createClient(String nume, String identificator);
}
