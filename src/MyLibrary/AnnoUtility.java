package MyLibrary;

public class AnnoUtility {
    // Metodo
    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0; // Se divisibile per 100, deve essere anche divisibile per 400
            }
            return true; // È bisestile se divisibile per 4 ma non per 100
        }
        return false; // Non è bisestile se non è divisibile per 4
    }
}
