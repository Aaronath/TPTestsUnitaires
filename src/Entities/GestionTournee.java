package Entities;

import java.util.ArrayList;

public class GestionTournee {
    private Tournee laTournee;

    public GestionTournee(Tournee laTournee) {
        this.laTournee = laTournee;
    }

    public Tournee getLaTournee() {
        return laTournee;
    }

    public ArrayList<Adherent> getAdherents(){
        ArrayList<Adherent> lesAdherent = new ArrayList<>();
        for (Visite visite : laTournee.getLesVisites()){
            lesAdherent.add(visite.getLeAdherent());
        }
        return lesAdherent;
    }

    public float CATournee(){
        float montant = 0;
        for (Visite visite : laTournee.getLesVisites()){
            montant += visite.montantAFacturer();
        }
        return montant;
    }

    public float CATourneeTypePrestation(TypePrestation typ){
        float montant = 0;
        for (Visite visite : laTournee.getLesVisites()){
            for (PrestationVisite presta : visite.getLesPrestationsVisite()){
                if (presta.getLeTypePrestation() == typ){
                    montant += visite.montantAFacturer();
                }
            }
        }
        return montant;
    }
}
