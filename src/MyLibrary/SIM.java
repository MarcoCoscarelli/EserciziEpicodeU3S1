package MyLibrary;

import java.util.ArrayList;
import java.util.List;

// Classe per rappresentare una carta SIM
public class SIM {
    // Attributi privati (incapsulamento)
    private String numeroTelefono;
    private double credito;
    private List<Chiamata> listaChiamate; // Lista di oggetti Chiamata

    // Costruttore per creare una nuova SIM con numero di telefono, credito iniziale e lista chiamate vuota
    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0; // Il credito iniziale è 0
        this.listaChiamate = new ArrayList<>(); // Lista delle chiamate inizialmente vuota
    }

    // Metodo per aggiungere credito alla SIM
    public void aggiungiCredito(double importo) {
        this.credito += importo;
    }

    // Metodo per aggiungere una chiamata alla lista delle chiamate
    public void aggiungiChiamata(Chiamata chiamata) {
        listaChiamate.add(chiamata);
    }

    // Metodo per stampare i dati della SIM
    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " €");
        System.out.println("Lista delle chiamate: ");
        for (Chiamata chiamata : listaChiamate) {
            System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() +
                    ", Durata: " + chiamata.getDurataMinuti() + " minuti");
        }
    }

    // Getter per ottenere il numero di telefono
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    // Getter per ottenere il credito
    public double getCredito() {
        return credito;
    }

    // Getter per ottenere la lista delle chiamate
    public List<Chiamata> getListaChiamate() {
        return listaChiamate;
    }
}

