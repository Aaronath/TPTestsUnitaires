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
        Adherent ad1 = new Adherent("Jean", "Jacques", "02561258", "147", "852");
        typePrestation = new TypePrestation(25, "Planter");
        PrestationVisite presta = new PrestationVisite(typePrestation, 4);

        maVisite = new Visite(ad1, "14:00");
        maVisite.ajouterPrestationVisite(presta);

        Inseminateur ins1 = new Inseminateur("John", "Doe", "5201478963", "jdoe", "doej");
        Date date = new Date();
        Tournee tournee = new Tournee(date,14, ins1);
        tournee.ajouterVisite(maVisite);
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