
# Progetto LineaCity Map IT

Questo progetto è un'implementazione in Java di un sistema di mappa per una città chiamata LineaCity. Modella il sistema di trasporto della città, includendo fermate (`Fermata`), metodi di trasporto (`Mezzo`) e la mappa stessa (`Mappa`).

## Funzionalità

- **Fermata**: Rappresenta una fermata fisica nella città.
- **Mezzo**: Rappresenta un mezzo di trasporto (es. autobus, camminata).
- **Mappa**: Rappresenta la mappa della città, consentendo il calcolo dei percorsi e la determinazione del mezzo di trasporto più veloce.

## Struttura del Progetto

Il progetto segue una struttura modulare:

- **Codice Principale**: Si trova in `src/main/java/it/unicam/cs/asdl2526/tutorato/mappe/`
    - `Fermata.java`: (Implementare) Rappresenta una fermata nella città.
    - `Mezzo.java`: Classe astratta per i metodi di trasporto.
    - `Autobus.java`: (Implementare) Rappresenta un autobus come mezzo di trasporto.
    - `Piedi.java`: (Implementare) Rappresenta il camminare come mezzo di trasporto.
    - `Mappa.java`: (Implementare) Rappresenta la mappa della città e le sue funzionalità.

# LineaCity Map Project ENG

This project is a Java-based implementation of a map system for a city called LineaCity. It models the city's transportation system, including stops (`Fermata`), transportation methods (`Mezzo`), and the map itself (`Mappa`).

## Features

- **Fermata**: Represents a physical stop in the city.
- **Mezzo**: Represents a mode of transportation (e.g., bus, walking).
- **Mappa**: Represents the city map, allowing for route calculations and determining the fastest transportation method.

