package Tests;

import Entities.Adherent;
import Entities.PrestationVisite;
import Entities.TypePrestation;
import Entities.Visite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VisiteTest {
    private Visite maVisite;

    @BeforeEach
    void setUp() {
        Adherent ad1 = new Adherent("Jean", "Jacques", "02561258", "147", "852");
        TypePrestation typePrestation = new TypePrestation(25, "Planter");
        PrestationVisite presta = new PrestationVisite(typePrestation, 4);

        Adherent ad2 = new Adherent("Joe", "Joe", "02561258", "147", "852");
        TypePrestation typePrestation2 = new TypePrestation(20, "Creuser");
        PrestationVisite presta2 = new PrestationVisite(typePrestation2, 2);

        maVisite = new Visite(ad1, "14:00");
        maVisite.ajouterPrestationVisite(presta);
        maVisite.ajouterPrestationVisite(presta2);
    }

    @Test
    void montantAFacturer() {
        // Test
        assertEquals(140, maVisite.montantAFacturer());
    }
}