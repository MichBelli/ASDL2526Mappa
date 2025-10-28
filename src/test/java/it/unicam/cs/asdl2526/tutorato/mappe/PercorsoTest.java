package it.unicam.cs.asdl2526.tutorato.mappe;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PercorsoTest {
    
    @Test
    void testGetDurataTotale() {
        Fermata f1 = new Fermata(1, "Centro");
        Fermata f2 = new Fermata(4, "Stazione");
        Fermata f3 = new Fermata(7, "Piazza");

        Mezzo piedi = new Piedi();
        Mezzo autobus = new Autobus(f1, f2);

        Percorso percorso = new Percorso(
                new Fermata[] {f1, f2, f3},
                new Mezzo[] {autobus, piedi}
        );

        int durataAttesaAutobus = autobus.tempoImpiegato(f1, f2);
        int durataPiedi = piedi.tempoImpiegato(f2, f3);
        int durataTotaleAttesa = durataAttesaAutobus + durataPiedi;

        assert(durataTotaleAttesa == percorso.getDurataTotale());
    }

    @Test
    void testCostruttoreInvalidi() {
        Fermata f1 = new Fermata(1, "Centro");
        Fermata f2 = new Fermata(4, "Stazione");
        Fermata f3 = new Fermata(7, "Piazza");
        Mezzo piedi = new Piedi();

        Mezzo autobus = new Autobus(f1, f2);

        assertThrows(NullPointerException.class, () -> {
            new Percorso(null, new Mezzo[] {piedi});
        });
        assertThrows(NullPointerException.class, () -> {
            new Percorso(new Fermata[] {f1, f2}, null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Percorso(new Fermata[] {f1, f2}, new Mezzo[] {});
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Percorso(new Fermata[] {f1, f3}, new Mezzo[] {autobus});
        });
    }

    @Test
    void testEquals() {
        Fermata f1 = new Fermata(1, "Centro");
        Fermata f2 = new Fermata(4, "Stazione");
        Fermata f3 = new Fermata(7, "Piazza");

        Mezzo piedi = new Piedi();
        Mezzo autobus = new Autobus(f1, f2);

        Percorso percorso1 = new Percorso(
                new Fermata[] {f1, f2, f3},
                new Mezzo[] {autobus, piedi}
        );

        Percorso percorso2 = new Percorso(
                new Fermata[] {f1, f2, f3},
                new Mezzo[] {autobus, piedi}
        );

        Percorso percorso3 = new Percorso(
                new Fermata[] {f1, f3},
                new Mezzo[] {piedi}
        );

        assert(percorso1.equals(percorso2));
        assert(!percorso1.equals(percorso3));
    }

}
