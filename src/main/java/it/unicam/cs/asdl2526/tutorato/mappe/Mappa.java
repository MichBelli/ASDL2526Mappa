package it.unicam.cs.asdl2526.tutorato.mappe;

/**
 * Classe di tipo Mappa che rappresenta la mappa di LineaCity.
 * @author Federico Di Petta
 */
public class Mappa {

    //TODO: DEFINIRE I CAMPI NECESSARI

    public Mappa(Fermata[] fermate, Mezzo[] mezzi) {
        //TODO: IMPLEMENTARE
    }

    /**
     * Verifica se esiste un tragitto possibile tra due fermate.
     * @param partenza fermata di partenza
     * @param arrivo fermata di arrivo
     * @return Ritorna true se esiste un tragitto possibile, false altrimenti.
     * @throws NullPointerException Se una delle due fermate è null.
     * @throws IllegalArgumentException Se le due fermate sono uguali oppure non fanno parte della mappa.
     */
    public boolean tragittoPossibile(Fermata partenza, Fermata arrivo) {
        //TODO: IMPLEMENTARE
        return true;
    }

    /**
     * Calcola il mezzo più veloce per effettuare il tragitto tra due fermate.
     * @param partenza fermata di partenza
     * @param arrivo fermata di arrivo
     * @return Ritorna il mezzo più veloce per effettuare il tragitto.
     * @throws NullPointerException Se una delle due fermate è null.
     * @throws IllegalArgumentException Se le due fermate sono uguali, non fanno parte della mappa oppure non esiste un tragitto possibile tra le due fermate.
     */
    public Mezzo mezzoPiuVeloce(Fermata partenza, Fermata arrivo) {
        //TODO: IMPLEMENTARE
        return null;
    }


}
