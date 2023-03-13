package Tests;

import Entities.Consommateur;

import static org.junit.jupiter.api.Assertions.*;

class ConsommateurTest {

    private Consommateur monConso;
    private Consommateur monConso1;
    private Consommateur monConso2;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        monConso = new Consommateur("Azerty", 0);
        monConso1 = new Consommateur("Qwerty", 0);
        monConso2 = new Consommateur("Oderty", 0);
    }

    @org.junit.jupiter.api.Test
    void calculerPointsFidelite() {
        // Programme 1 : achat de 54 €
        monConso.calculerPointsFidelite(1, 54);
        assertEquals(1, monConso.getPointsFidelite());
        // Programme 1 : nouvel achat de 100 €
        monConso.calculerPointsFidelite(1, 100);
        assertEquals(2, monConso.getPointsFidelite());

        // Programme 2 : achat de 54 €
        monConso1.calculerPointsFidelite(2, 54);
        assertEquals(54, monConso1.getPointsFidelite());
        // Programme 2 : nouvel achat de 100 €
        monConso1.calculerPointsFidelite(2, 100);
        assertEquals(154, monConso1.getPointsFidelite());

        // Programme 3 : achat de 50 €
        monConso2.calculerPointsFidelite(3, 50);
        assertEquals(0, monConso2.getPointsFidelite());
        // Programme 2 : nouvel achat de 150 €
        monConso2.calculerPointsFidelite(3, 150);
        assertEquals(10, monConso2.getPointsFidelite());
        // Programme 3 : achat de 250 €
        monConso2.calculerPointsFidelite(3, 250);
        assertEquals(30, monConso2.getPointsFidelite());
        // Programme 2 : nouvel achat de 550 €
        monConso2.calculerPointsFidelite(3, 550);
        assertEquals(80, monConso2.getPointsFidelite());
    }
}