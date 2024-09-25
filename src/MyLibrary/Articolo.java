package MyLibrary;

public class Articolo {
    private String codiceArticolo;
    private double prezzo;
    private int pezziDisponibili;

    // Costruttore
    public Articolo(String codiceArticolo, double prezzo, int pezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    // Getter e Setter
    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    public void setPezziDisponibili(int pezziDisponibili) {
        this.pezziDisponibili = pezziDisponibili;
    }
}
