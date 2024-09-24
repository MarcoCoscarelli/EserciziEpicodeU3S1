package MyLibrary;

public class ContoAllaRovescia {
    public static void contoRovescia(int numero) {
        for (int i = numero; i >= 0; i--) {
            System.out.println(i); // Stampa il numero corrente del conto alla rovescia
            try {
                Thread.sleep(1000); // Metoto per gestire il ritardo tra un ciclo e l'altro.
            } catch (InterruptedException e) {
                System.err.println("Errore durante il ritardo: " + e.getMessage()); // Gestisce l'interruzione in caso di errori
            }
        }
        System.out.println("Conto alla rovescia completato!");
    }
}