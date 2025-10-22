package it.unicam.cs.asdl2526.tutorato.mappe;

/**
 * Una interfacci di un tipo di Mezzo di trasporto.
 * @author Federico Di Petta
 */
public interface Mezzo {
    /**
     * Definisce se il mezzo puà effettuare il tragitto tra le due fermate
     * @param partenza Partenza
     * @param arrivo Arrivo
     * @return Ritorna true se il tragitto è possibile, false altrimenti.
     */
    boolean possibile(Fermata partenza, Fermata arrivo);

    /**
     * Calcola il tempo impiegato tra due fermate in minuti.
     * @param partenza partenza
     * @param arrivo arrivo
     * @return Ritorna il tempo impiegato in minuti.
     * @throws IllegalArgumentException Se il tragitto non è possibile.
     */
    int tempoImpiegato(Fermata partenza, Fermata arrivo);
}
