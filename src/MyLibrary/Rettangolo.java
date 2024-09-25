package MyLibrary;

public class Rettangolo {
    // Attributi privati per incapsulamento
    private double altezza;
    private double larghezza;

    // Costruttore per inizializzare altezza e larghezza
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Getter e setter per altezza
    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    // Getter e setter per larghezza
    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    // Metodo per calcolare l'area del rettangolo
    public double calcolaArea() {
        return altezza * larghezza;
    }

    // Metodo per calcolare il perimetro del rettangolo
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    // Metodo statico per stampare area e perimetro di un rettangolo
    public static void stampaRettangolo(Rettangolo rettangolo) {
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
    }

    // Metodo statico per stampare area e perimetro di due rettangoli, con la somma
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        stampaRettangolo(r1);
        System.out.println("Rettangolo 2:");
        stampaRettangolo(r2);

        // Calcolo e stampa della somma di aree e perimetri
        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();
        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}
