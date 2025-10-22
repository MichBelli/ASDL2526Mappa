package it.unicam.cs.asdl2526.tutorato.mappe;

/**
 * Classe di tipo Piedi che rappresenta lo spostamento a piedi.
 * A piedi è possibile sempre spostarsi tra due fermate.
 * @author Federico Di Petta
 */
public class Piedi implements Mezzo {

    /**
     * Velocità media a piedi in posizioni per minuto.
     */
    public static final double POSIZIONI_AL_MINUTO = 2;

    /**
     * A piedi è sempre possibile spostarsi tra due fermate.
     * @param partenza Partenza
     * @param arrivo Arrivo
     * @return Ritorna sempre true.
     * @throws NullPointerException Se una delle due fermate è null.
     */
    @Override
    public boolean possibile(Fermata partenza, Fermata arrivo) {
        // TODO: IMPLEMENTARE
        return false;
    }

    /**
     * Calcola il tempo impiegato tra due fermate a piedi in minuti.
     * @param partenza partenza
     * @param arrivo arrivo
     * @return Ritorna il tempo impiegato in minuti.
     * @throws NullPointerException Se una delle due fermate è null oppure il tragitto non è possibile.
     */
    @Override
    public int tempoImpiegato(Fermata partenza, Fermata arrivo) {
        // TODO: IMPLEMENTARE
        return 0;
    }

}
