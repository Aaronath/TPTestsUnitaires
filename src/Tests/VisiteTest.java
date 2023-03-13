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
        ArrayList<PrestationVisite> lesPrestas = new ArrayList<>();
        lesPrestas.add(presta);

        maVisite = new Visite(ad1, lesPrestas, "14:00");
    }

    @Test
    void montantAFacturer() {
        // Test
        assertEquals(100, maVisite.montantAFacturer());
    }
}