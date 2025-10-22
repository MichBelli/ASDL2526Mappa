package it.unicam.cs.asdl2526.tutorato.mappe;

/**
 * Una classe di tipo fermata identifica la fermata fisica della città.
 * Essendo la LineaCity la città ci basta sapere la posizione senza coordinate.
 * @author Federico Di Petta
 */
public class Fermata implements ComparabileInDistanza<Fermata> {

    public final int posizione;
    public final String nome;

    /**
     * Una Fermata è caratterizzata da una posizione e un nome.
     * @param posizione posizione
     * @param nome nome della fermata
     * @throws NullPointerException Se il nome è null
     */
    Fermata(int posizione, String nome) {
        this.posizione = 0;
        this.nome = "";
        // TODO implementare
    }

    @Override
    public int compareToInDistanza(Fermata other) {
        //TODO: IMPLEMENTARE
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPosizione() {
        return posizione;
    }


    /**
     * Due fermate sono uguali se hanno la stessa posizione
     * @param other l'altra fermata
     * @return ritorna true se le fermate hanno la stessa posizione, false altrimenti.
     */
    @Override
    public boolean equals(Object other) {
        //TODO: IMPLEMETARE
        return true;
    }


    @Override
    public int hashCode() {
        //TODO: IMPLEMENTARE
        return -1;
    }
}
