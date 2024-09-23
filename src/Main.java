import java.util.Scanner; // Importiamo la classe Scanner per ottenere l'input utente

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creiamo uno scanner per leggere l'input utente

        // ------------------- Metodo moltiplica -------------------
        System.out.println("Inserisci il primo numero da moltiplicare:");
        int num1 = scanner.nextInt(); // Legge il primo numero
        System.out.println("Inserisci il secondo numero da moltiplicare:");
        int num2 = scanner.nextInt(); // Legge il secondo numero
        int risultatoMoltiplica = Moltiplica.moltiplica(num1, num2); // Chiama il metodo moltiplica
        System.out.println("Risultato della moltiplicazione: " + risultatoMoltiplica);

        // ------------------- Metodo concatena -------------------
        scanner.nextLine(); // Per andare a capo
        System.out.println("Inserisci una stringa:");
        String stringa = scanner.nextLine(); // Legge una stringa
        System.out.println("Inserisci un numero intero:");
        int numero = scanner.nextInt(); // Legge un intero
        String risultatoConcatena = Concatena.concatena(stringa, numero); // Chiama il metodo concatena
        System.out.println("Risultato della concatenazione: " + risultatoConcatena);

        // ------------------- Metodo inserisciInArray -------------------
        scanner.nextLine(); // Per andare a capo
        String[] arrayDiStringhe = new String[5];
        System.out.println("Inserisci 5 stringhe per l'array:");
        for (int i = 0; i < 5; i++) {
            arrayDiStringhe[i] = scanner.nextLine(); // Legge ciascuna stringa dall'utente
        }
        System.out.println("Inserisci una nuova stringa da inserire al terzo posto:");
        String nuovaStringa = scanner.nextLine(); // Legge la nuova stringa
        String[] nuovoArray = InserisciInArray.inserisciInArray(arrayDiStringhe, nuovaStringa); // Chiama il metodo

        System.out.println("Array modificato:");
        for (String s : nuovoArray) {
            System.out.println(s); // Stampa il nuovo array
        }
        // ------------------- Metodo concatenaStringhe -------------------
        StringheConcatenate.concatenaStringhe(); // Chiama il metodo per concatenare le stringhe

        // ------------------- Metodo perimetroRettangolo -------------------
        System.out.println("Inserisci la lunghezza del rettangolo:");
        double lunghezza = scanner.nextDouble(); // Legge la lunghezza
        System.out.println("Inserisci l'altezza del rettangolo:");
        double larghezza = scanner.nextDouble(); // Legge la larghezza
        double perimetroRettangolo = PerimetroRettangolo.calcolaPerimetro(lunghezza, larghezza); // Chiama il metodo
        System.out.println("Perimetro del rettangolo: " + perimetroRettangolo);

        // ------------------- Metodo pariDispari -------------------
        System.out.println("Inserisci un numero intero per verificare se è pari o dispari:");
        int numeroVerifica = scanner.nextInt(); // Legge il numero
        int risultatoPariDispari = PariDispari.verificaPariDispari(numeroVerifica); // Chiama il metodo
        System.out.println("Il numero è " + (risultatoPariDispari == 0 ? "pari" : "dispari"));

        // ------------------- Metodo perimetroTriangolo -------------------
        System.out.println("Inserisci la lunghezza del primo lato del triangolo:");
        double latoA = scanner.nextDouble(); // Legge il primo lato
        System.out.println("Inserisci la lunghezza del secondo lato del triangolo:");
        double latoB = scanner.nextDouble(); // Legge il secondo lato
        System.out.println("Inserisci la lunghezza del terzo lato del triangolo:");
        double latoC = scanner.nextDouble(); // Legge il terzo lato
        double areaTriangolo = PerimetroTriangolo.calcolaArea(latoA, latoB, latoC); // Chiama il metodo
        System.out.println("Area del triangolo: " + areaTriangolo);

        // Chiudo lo scanner
        scanner.close();
    }
}
