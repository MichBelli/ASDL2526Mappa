package it.unicam.cs.asdl2526.tutorato.mappe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutobusTest {

    @Test
    void testCostruttoreValido() {
        Fermata partenza = new Fermata(1, "Centro");
        Fermata arrivo = new Fermata(2, "Stazione");
        Autobus autobus = new Autobus(partenza, arrivo);
        assertEquals(partenza, autobus.partenza);
        assertEquals(arrivo, autobus.arrivo);
    }

    @Test
    void testCostruttoreFermateUguali() {
        Fermata fermata = new Fermata(1, "Centro");
        assertThrows(IllegalArgumentException.class, () -> new Autobus(fermata, fermata));
    }

    @Test
    void testPossibile() {
        Fermata partenza = new Fermata(1, "Centro");
        Fermata arrivo = new Fermata(2, "Stazione");
        Autobus autobus = new Autobus(partenza, arrivo);
        assertTrue(autobus.possibile(partenza, arrivo));
        assertFalse(autobus.possibile(arrivo, partenza));
    }

    @Test
    void testTempoImpiegato() {
        Fermata partenza = new Fermata(1, "Centro");
        Fermata arrivo = new Fermata(3, "Stazione");
        Autobus autobus = new Autobus(partenza, arrivo);
        assertEquals(2, autobus.tempoImpiegato(partenza, arrivo));
    }
}