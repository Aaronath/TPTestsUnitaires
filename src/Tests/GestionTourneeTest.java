package Tests;

import Entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class GestionTourneeTest {
    public Visite maVisite;
    public Visite maVisite2;
    public GestionTournee gestionTournee;
    public TypePrestation typePrestation;
    TypePrestation typePrestation2;
    @BeforeEach
    void setUp() {
        Adherent ad1 = new Adherent("Jean", "Jacques", "02561258", "147", "852");
        typePrestation = new TypePrestation(25, "Planter");
        PrestationVisite presta = new PrestationVisite(typePrestation, 4);

        Adherent ad2 = new Adherent("joe", "jie", "02561258", "147", "852");
        typePrestation2 = new TypePrestation(20, "Creuser");
        PrestationVisite presta2 = new PrestationVisite(typePrestation2, 2);

        maVisite2 = new Visite(ad2, "18:00");
        maVisite2.ajouterPrestationVisite(presta2);

        maVisite = new Visite(ad1, "14:00");
        maVisite.ajouterPrestationVisite(presta);

        Inseminateur ins1 = new Inseminateur("John", "Doe", "5201478963", "jdoe", "doej");
        Date date = new Date();
        Tournee tournee = new Tournee(date,14, ins1);
        tournee.ajouterVisite(maVisite);
        tournee.ajouterVisite(maVisite2);
        gestionTournee = new GestionTournee(tournee);
    }

    @Test
    void CATournee() {
        assertEquals(140, gestionTournee.CATournee());
    }

    @Test
    void CATourneeTypePrestation() {
        assertEquals(40, gestionTournee.CATourneeTypePrestation(typePrestation2));
    }
}