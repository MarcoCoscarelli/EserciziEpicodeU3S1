public class PariDispari {
    // Metodo che accetta un numero intero e restituisce 0 se è pari, 1 se è dispari
    public static int verificaPariDispari(int numero) {
        return (numero % 2 == 0) ? 0 : 1; // Restituisce 0 per pari, 1 per dispari
    }
}