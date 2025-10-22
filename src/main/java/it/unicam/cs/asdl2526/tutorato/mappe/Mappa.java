package it.unicam.cs.asdl2526.tutorato.mappe;

/**
 * Classe di tipo Mappa che rappresenta la mappa di LineaCity.
 * @author Federico Di Petta
 */
public class Mappa {


    private final Fermata[] fermate;
    private final Mezzo[] mezzi;

    public Mappa(Fermata[] fermate, Mezzo[] mezzi) {
        this.fermate = fermate;
        this.mezzi = mezzi;
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
        if (partenza == null || arrivo == null)
            throw new NullPointerException("Nessuna delle due fermate può essere null");
        if(partenza.equals(arrivo))
            throw new IllegalArgumentException("Le due fermate non possono essere uguali");
        boolean partenzaIsPresent = false;
        boolean arrivoIsPresent = false;
        for (int i = 0; i < fermate.length && (!partenzaIsPresent || !arrivoIsPresent); i++) {
            if (!partenzaIsPresent && fermate[i].equals(partenza))
                partenzaIsPresent = true;
            if (!arrivoIsPresent && fermate[i].equals(arrivo))
                arrivoIsPresent = true;
        }
        if(!partenzaIsPresent || !arrivoIsPresent)
            throw new IllegalArgumentException("Non sono entrambe presenti nulla mappa");
        for (Mezzo mezzo : mezzi) {
            if (mezzo.possibile(partenza, arrivo))
                return true;
        }
        return false;
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
        if(!tragittoPossibile(partenza, arrivo))
            throw new IllegalArgumentException("Non esiste un tragitto possibile");
        Mezzo fastestMezzo = null;
        int fastestTempo = Integer.MAX_VALUE;
        for (Mezzo mezzo : mezzi) {
            if(mezzo.possibile(partenza, arrivo)){
                int tempoImpiegato = mezzo.tempoImpiegato(partenza, arrivo);
                if(tempoImpiegato < fastestTempo){
                    fastestMezzo = mezzo;
                    fastestTempo = tempoImpiegato;
                }
            }
        }
        return fastestMezzo;
    }


}
