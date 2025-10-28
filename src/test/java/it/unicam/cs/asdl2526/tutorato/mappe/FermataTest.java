package it.unicam.cs.asdl2526.tutorato.mappe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FermataTest {

    @Test
    void testCostruttoreValido() {
        Fermata fermata = new Fermata(1, "Centro");
        assertEquals(1, fermata.getPosizione());
        assertEquals("Centro", fermata.getNome());
    }

    @Test
    void testCostruttoreNomeNull() {
        assertThrows(NullPointerException.class, () -> new Fermata(1, null));
    }

    @Test
    void testEquals() {
        Fermata f1 = new Fermata(1, "Centro");
        Fermata f2 = new Fermata(1, "Centro");
        Fermata f3 = new Fermata(2, "Stazione");
        assertTrue(f1.equals(f2));
        assertFalse(f1.equals(f3));
    }

    @Test
    void testHashCode() {
        Fermata f1 = new Fermata(1, "Centro");
        Fermata f2 = new Fermata(1, "Centro");
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    void testCompareTo() {
        Fermata f1 = new Fermata(1, "Centro");
        Fermata f2 = new Fermata(2, "Stazione");
        Fermata f3 = new Fermata(1, "Piazza");
        assertTrue(f1.compareTo(f2) < 0);
        assertTrue(f2.compareTo(f1) > 0);
        assertEquals(0, f1.compareTo(f3));
    }
}