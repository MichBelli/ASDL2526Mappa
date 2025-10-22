package it.unicam.cs.asdl2526.tutorato.mappe;

/**
 * Interfaccia che definisce il confronto tra oggetti in base alla distanza.
 *
 * @param <T> Il tipo di oggetto con cui confrontarsi.
 * @author Federico Di Petta
 */
public interface ComparabileInDistanza<T> {

    /**
     * Confronta this con un altro oggetto della stessa tipologia in base alla
     * distanza.
     * La proprietà di distanza deve essere riflessiva, simmetrica e transitiva.
     * @param other L'altro oggetto da confrontare con this.
     * @return La distanza tra this e other come valore intero positivo.
     * @throws NullPointerException Se other è null.
     */
    int compareToInDistanza(T other);
}
