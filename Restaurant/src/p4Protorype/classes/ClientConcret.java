package p4Protorype.classes;

public class ClientConcret implements Client {
    private String nume;
    private String email;
    private String telefon;

    public ClientConcret(String nume, String email, String telefon) {
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
    }

    @Override
    public Client clone() throws CloneNotSupportedException {
        return (Client) super.clone();
    }

    @Override
    public void descriere() {
        System.out.println("Client: " + nume + ", Email: " + email + ", Telefon: " + telefon);
    }


}