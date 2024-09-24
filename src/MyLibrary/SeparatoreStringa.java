package MyLibrary;

public class SeparatoreStringa {
    // Metodo
    public static String separaCaratteri(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
            if (i < input.length() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
