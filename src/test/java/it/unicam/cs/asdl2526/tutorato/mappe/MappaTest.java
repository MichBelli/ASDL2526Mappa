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

    @Test
    void testPercorsoPossibile() {
        Fermata f1 = new Fermata(1, "Centro");
        Fermata f2 = new Fermata(2, "Stazione");
        Fermata f3 = new Fermata(3, "Piazza");
        Fermata f4 = new Fermata(4, "Luna");
        Mezzo autobus = new Autobus(f1, f2);
        Mezzo autobus2 = new Autobus(f2, f3);

        Mappa mappa = new Mappa(new Fermata[] {f1, f2, f3, f4}, new Mezzo[] {autobus, autobus2  });

        assertTrue(mappa.percorsoPossibile(f1, f3));
        assertFalse(mappa.percorsoPossibile(f1, f4));   
    }

    @Test
    void testPercorsoPiuVeloce() {
        Fermata f1 = new Fermata(1, "Centro");
        Fermata f2 = new Fermata(2, "Stazione");
        Fermata f3 = new Fermata(3, "Piazza");
        Fermata f4 = new Fermata(4, "Luna");
        Mezzo autobus = new Autobus(f1, f2);
        Mezzo autobus2 = new Autobus(f2, f3);

        Mappa mappa = new Mappa(new Fermata[] {f1, f2, f3, f4}, new Mezzo[] {autobus, autobus2 });

        assertArrayEquals(new Mezzo[] {autobus, autobus2}, mappa.percorsoPiuVeloce(f1, f3).getMezzi());
            
        assertThrows(IllegalArgumentException.class,
            () -> mappa.percorsoPiuVeloce(f1, f4));
    }
}