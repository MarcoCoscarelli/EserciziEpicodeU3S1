package MyLibrary;

// Classe per rappresentare una singola chiamata
public class Chiamata {
    // Attributi privati
    private String numeroChiamato;
    private int durataMinuti;

    // Costruttore per inizializzare una chiamata
    public Chiamata(String numeroChiamato, int durataMinuti) {
        this.numeroChiamato = numeroChiamato;
        this.durataMinuti = durataMinuti;
    }

    // Getter per ottenere il numero chiamato
    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    // Getter per ottenere la durata della chiamata
    public int getDurataMinuti() {
        return durataMinuti;
    }
}
