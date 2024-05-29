package p4Protorype.classes;

import java.util.HashMap;
import java.util.Map;

public class ClientRegistry {
    private Map<String, Client> clienti = new HashMap<>();

    public void inregistreazaClient(String id, Client client) {
        clienti.put(id, client);
    }

    public Client obtineClient(String id) throws CloneNotSupportedException {
        Client client = clienti.get(id);
        if (client != null) {
            return client.clone();
        }
        throw new IllegalArgumentException("Client necunoscut.");
    }
}