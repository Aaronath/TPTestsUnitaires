package Entities;

public class Personne {
    private String nom;
    private String prenom;
    private String telPortable;

    public Personne(String nom, String prenom, String telPortable) {
        this.nom = nom;
        this.prenom = prenom;
        this.telPortable = telPortable;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelPortable() {
        return telPortable;
    }
}
