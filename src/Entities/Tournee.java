package Entities;

import java.util.ArrayList;
import java.util.Date;

public class Tournee {
    private Date date;
    private ArrayList<Visite> lesVisites;
    private int kmRealises;
    private Inseminateur leInseminateur;

    public Tournee(Date date, ArrayList<Visite> lesVisites, int kmRealises, Inseminateur leInseminateur) {
        this.date = date;
        this.lesVisites = lesVisites;
        this.kmRealises = kmRealises;
        this.leInseminateur = leInseminateur;
    }

    public void ajouterVisite(Visite uneVisite){
        lesVisites.add(uneVisite);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Visite> getLesVisites() {
        return lesVisites;
    }

    public int getKmRealises() {
        return kmRealises;
    }

    public void setKmRealises(int kmRealises) {
        this.kmRealises = kmRealises;
    }

    public Inseminateur getLeInseminateur() {
        return leInseminateur;
    }
}
