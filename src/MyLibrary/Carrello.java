package MyLibrary;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private double totaleCosto;

    // Costruttore
    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new Articolo[10];  // Lista articoli limitata a 10 per ora
        this.totaleCosto = 0;
    }

    // Metodo per aggiungere un articolo
    public void aggiungiArticolo(Articolo articolo) {
        for (int i = 0; i < articoli.length; i++) {
            if (articoli[i] == null) {
                articoli[i] = articolo;
                totaleCosto += articolo.getPrezzo();
                break;
            }
        }
    }

    // Metodo per calcolare il totale costo articoli
    public double getTotaleCosto() {
        return totaleCosto;
    }
}
