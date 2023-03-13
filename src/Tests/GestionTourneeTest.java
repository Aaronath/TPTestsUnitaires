package Tests;

import Entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class GestionTourneeTest {
    public Visite maVisite;
    public GestionTournee gestionTournee;
    public TypePrestation typePrestation;
    @BeforeEach
    void setUp() {
        ArrayList<Visite> lesVisites = new ArrayList<>();
        Adherent ad1 = new Adherent("Jean", "Jacques", "02561258", "147", "852");
        typePrestation = new TypePrestation(25, "Planter");
        PrestationVisite presta = new PrestationVisite(typePrestation, 4);
        ArrayList<PrestationVisite> lesPrestas = new ArrayList<>();
        lesPrestas.add(presta);

        maVisite = new Visite(ad1, lesPrestas, "14:00");

        lesVisites.add(maVisite);
        Inseminateur ins1 = new Inseminateur("John", "Doe", "5201478963", "jdoe", "doej");
        Date date = new Date();
        Tournee tournee = new Tournee(date, lesVisites, 14, ins1);
        gestionTournee = new GestionTournee(tournee);
    }

    @Test
    void CATournee() {
        assertEquals(100, gestionTournee.CATournee());
    }

    @Test
    void CATourneeTypePrestation() {
        assertEquals(100, gestionTournee.CATourneeTypePrestation(typePrestation));
    }
}