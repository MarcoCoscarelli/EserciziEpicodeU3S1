public class PerimetroTriangolo {
    // Metodo che accetta le lunghezze dei lati di un triangolo e restituisce l'area
    public static double calcolaArea(double a, double b, double c) {
        // Calcoliamo il semiperimetro
        double s = (a + b + c) / 2;
        // Applichiamo la formula di Erone
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Restituisce l'area
    }
}

