package it.unicam.cs.asdl2526.tutorato.mappe;

/**
 * Classe di tipo Autobus che rappresenta lo spostamento in autobus.
 * L'autobus a LineaCity può spostarsi solo tra due fermate, non può effettuare fermate intermedie.
 * @author Federico Di Petta
 */
public class Autobus implements Mezzo {

    public static final int MINUTI_PER_POSIZIONE = 1;
    public final Fermata arrivo;
    public final Fermata partenza;

    /**
     * Costruttore di un autobus tra due fermate.
     * @param partenza Fermata di partenza
     * @param arrivo Fermata di arrivo
     * @throws NullPointerException Se una delle due fermate è null.
     * @throws IllegalArgumentException Se le due fermate sono uguali oppure non asfaltate.
     */
    public Autobus(Fermata partenza, Fermata arrivo) {
        if (partenza == null || arrivo == null)
            throw new NullPointerException("Nessuna delle due fermate può essere null");
        if(partenza.equals(arrivo))
            throw new IllegalArgumentException("Le due fermate non possono essere uguali");
        this.arrivo = arrivo;
        this.partenza = partenza;
    }

    @Override
    public boolean possibile(Fermata partenza, Fermata arrivo) {
        return this.partenza.equals(partenza) && this.arrivo.equals(arrivo);
    }

    @Override
    public int tempoImpiegato(Fermata partenza, Fermata arrivo) {
        return MINUTI_PER_POSIZIONE * partenza.compareToInDistanza(arrivo);
    }
}
