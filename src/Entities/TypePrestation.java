package Entities;

public class TypePrestation {
    private float prixForfaitaire;
    private String libelle;

    public TypePrestation(float prixForfaitaire, String libelle) {
        this.prixForfaitaire = prixForfaitaire;
        this.libelle = libelle;
    }

    public float getPrixForfaitaire() {
        return prixForfaitaire;
    }

    public String getLibelle() {
        return libelle;
    }
}
