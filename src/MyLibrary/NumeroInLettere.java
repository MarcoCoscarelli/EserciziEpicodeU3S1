package MyLibrary;

public class NumeroInLettere {
    // Metodo
    public static String numeroInLettere(int numero) {
        switch (numero) {
            case 1:
                return "Uno";
            case 2:
                return "Due";
            case 3:
                return "Tre";
            default:
                return "Errore: numero non valido.";
        }
    }
}
