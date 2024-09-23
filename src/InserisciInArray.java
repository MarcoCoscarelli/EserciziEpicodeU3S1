// Questa classe contiene il metodo inserisciInArray
public class InserisciInArray {
    // Metodo che accetta un array di 5 stringhe e una stringa,
    // inserisce la stringa al terzo posto in un nuovo array di 6 elementi
    public static String[] inserisciInArray(String[] arr, String str) {
        String[] nuovoArray = new String[6]; // Creiamo un array di 6 elementi

        // Copiamo i primi due elementi
        nuovoArray[0] = arr[0];
        nuovoArray[1] = arr[1];

        // Inseriamo la nuova stringa
        nuovoArray[2] = str;

        // Spostiamo gli elementi dal vecchio array al nuovo
        nuovoArray[3] = arr[2];
        nuovoArray[4] = arr[3];
        nuovoArray[5] = arr[4];

        return nuovoArray; // Restituisce il nuovo array
    }
}

