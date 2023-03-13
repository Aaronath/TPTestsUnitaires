package Entities;

public class PrestationVisite {
    private TypePrestation leTypePrestation;
    private int nombreActes;

    public PrestationVisite(TypePrestation leTypePrestation, int nombreActes) {
        this.leTypePrestation = leTypePrestation;
        this.nombreActes = nombreActes;
    }

    public TypePrestation getLeTypePrestation() {
        return leTypePrestation;
    }

    public int getNombreActes() {
        return nombreActes;
    }
}
