package it.unicam.cs.asdl2526.tutorato.mappe;

/**
 * Classe di tipo Percorso che rappresenta un percorso tra fermate utilizzando mezzi.
 * @author Federico Di Petta
 */
public class Percorso {
    private final Fermata[] fermate;
    private final Mezzo[] mezzi;

    //TODO: Aggiungere campi se necessari

    /**
     * Costruisce un percorso dato un array di fermate e un array di mezzi.
     * @param fermate array di fermate
     * @param mezzi array di mezzi
     * @throws NullPointerException Se uno dei due array è null
     * @throws IllegalArgumentException Se la lunghezza degli array non è compatibile
     *                               (numero mezzi = numero fermate - 1)
     *                             oppure se non è possibile effettuare il tragitto
     */
    public Percorso(Fermata[] fermate, Mezzo[] mezzi) {
        //TODO: implementare il costruttore
        this.fermate = null;
        this.mezzi = null;
    }

    public Fermata[] getFermate() {
        return fermate;
    }

    public Mezzo[] getMezzi() {
        return mezzi;
    }

    /**
     * Restituisce la durata totale del percorso in minuti.
     * L'operazione deve essere eseguita in O(1).
     * @return durata totale in minuti
     */
    public int getDurataTotale() {
        return 0; //TODO: implementare il calcolo della durata totale
    }

    /**
     * Due percorsi sono uguali se hanno le stesse fermate e gli stessi mezzi nello stesso ordine.
     * @param other l'altro percorso
     */
    @Override
    public boolean equals(Object other) {
        return false; //TODO: implementare correttamente l'equals
    }

    @Override
    public int hashCode() {
        return 0; //TODO: implementare correttamente l'hashCode
    }
    
}
