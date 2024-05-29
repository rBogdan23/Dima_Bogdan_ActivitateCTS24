package p4Protorype.classes;

public interface Client extends Cloneable {
    Client clone() throws CloneNotSupportedException;

    void descriere();
}