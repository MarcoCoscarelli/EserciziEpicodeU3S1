import java.util.Scanner; // Importiamo la classe Scanner per ottenere l'input utente

// Questa classe contiene il metodo per gestire le stringhe
public class StringheConcatenate {
    // Metodo che chiede tre stringhe all'utente e stampa la concatenazione
    public static void concatenaStringhe() {
        Scanner scanner = new Scanner(System.in); // Creiamo uno scanner per leggere l'input utente

        // Chiediamo all'utente di inserire tre stringhe
        System.out.println("Inserisci la prima stringa:");
        String primaStringa = scanner.nextLine(); // Legge la prima stringa

        System.out.println("Inserisci la seconda stringa:");
        String secondaStringa = scanner.nextLine(); // Legge la seconda stringa

        System.out.println("Inserisci la terza stringa:");
        String terzaStringa = scanner.nextLine(); // Legge la terza stringa

        // Concatenazione in ordine di inserimento
        String concatenazioneDiretta = primaStringa + " " + secondaStringa + " " + terzaStringa;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneDiretta); // Stampa la concatenazione

        // Concatenazione in ordine inverso
        String concatenazioneInversa = terzaStringa + " " + secondaStringa + " " + primaStringa;
        System.out.println("Concatenazione in ordine inverso: " + concatenazioneInversa); // Stampa la concatenazione inversa
    }
}
