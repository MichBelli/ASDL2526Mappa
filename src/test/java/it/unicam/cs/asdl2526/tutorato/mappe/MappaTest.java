package it.unicam.cs.asdl2526.tutorato.mappe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MappaTest {

    @Test
    void testTragittoPossibile() {
        Fermata f1 = new Fermata(1, "Centro");
        Fermata f2 = new Fermata(2, "Stazione");
        Fermata f3 = new Fermata(3, "Piazza");
        Mezzo autobus = new Autobus(f1, f2);
        Fermata fNonEsistente = new Fermata(4, "NonEsistente");
        Mappa mappa = new Mappa(new Fermata[] {f1, f2, f3}, new Mezzo[] {autobus});

        assertThrows(NullPointerException.class, () -> mappa.tragittoPossibile(null, null));
        assertThrows(IllegalArgumentException.class, () -> mappa.tragittoPossibile(fNonEsistente, f1));
        assertThrows(IllegalArgumentException.class, () -> mappa.tragittoPossibile(f1, f1));

        assertTrue(mappa.tragittoPossibile(f1, f2));
        assertFalse(mappa.tragittoPossibile(f1, f3));
        assertFalse(mappa.tragittoPossibile(f2, f3));
    }

    @Test
    void testMezzoPiuVeloce() {
        Fermata f1 = new Fermata(1, "Centro");
        Fermata f2 = new Fermata(2, "Stazione");
        Fermata f3 = new Fermata(3, "Piazza");
        Mezzo piedi = new Piedi();
        Mezzo autobus = new Autobus(f1, f2);

        Mappa mappa = new Mappa(new Fermata[] {f1, f2, f3}, new Mezzo[] {piedi, autobus});

        assertEquals(autobus, mappa.mezzoPiuVeloce(f1, f2));
        assertEquals(piedi, mappa.mezzoPiuVeloce(f1, f3));
        assertEquals(piedi, mappa.mezzoPiuVeloce(f2, f3));
    }
}