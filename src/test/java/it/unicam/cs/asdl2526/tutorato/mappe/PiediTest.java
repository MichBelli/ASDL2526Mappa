package it.unicam.cs.asdl2526.tutorato.mappe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PiediTest {

    @Test
    void testPossibileSempreTrue() {
        Fermata partenza = new Fermata(1, "Centro");
        Fermata arrivo = new Fermata(2, "Stazione");
        Piedi piedi = new Piedi();
        assertTrue(piedi.possibile(partenza, arrivo));
    }

    @Test
    void testTempoImpiegato() {
        Fermata partenza = new Fermata(1, "Centro");
        Fermata arrivo = new Fermata(3, "Stazione");
        Piedi piedi = new Piedi();
        assertEquals(1, piedi.tempoImpiegato(partenza, arrivo));
    }
}