package Entities;

public class Consommateur {
    private String name;
    private double pointsFidelite;

    public Consommateur(String name, double pointsFidelite) {
        this.name = name;
        this.pointsFidelite = pointsFidelite;
    }

    public double getPointsFidelite() {
        return pointsFidelite;
    }

    public void calculerPointsFidelite(int typ, double montant){
        switch(typ) {
            case 1:
                pointsFidelite++;
                break;
            case 2:
                pointsFidelite = pointsFidelite + montant;
                break;
            case 3:
                if (montant >= 100 && montant <= 200){
                    pointsFidelite = pointsFidelite + 10;
                } else if (montant > 200 && montant <= 500) {
                    pointsFidelite = pointsFidelite + 20;
                } else if (montant > 500) {
                    pointsFidelite = pointsFidelite + 50;
                }
                break;
            default:
                pointsFidelite = pointsFidelite;
        }
    }
}
