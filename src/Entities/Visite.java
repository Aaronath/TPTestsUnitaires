package Entities;

import java.util.ArrayList;

public class Visite {
    private Adherent leAdherent;
    private ArrayList<PrestationVisite> lesPrestationsVisite;
    private String heure;

    public Visite(Adherent leAdherent, String heure) {
        this.leAdherent = leAdherent;
        this.lesPrestationsVisite = new ArrayList<>();
        this.heure = heure;
    }

    public float montantAFacturer(){
        float montant = 0;
        for (PrestationVisite presta:
                lesPrestationsVisite
             ) {
            montant += presta.getNombreActes()*presta.getLeTypePrestation().getPrixForfaitaire();
        }
        return montant;
    }

    public Adherent getLeAdherent() {
        return leAdherent;
    }

    public ArrayList<PrestationVisite> getLesPrestationsVisite() {
        return lesPrestationsVisite;
    }

    public String getHeure() {
        return heure;
    }

    public void ajouterPrestationVisite(PrestationVisite presta){
        lesPrestationsVisite.add(presta);
    }
}
