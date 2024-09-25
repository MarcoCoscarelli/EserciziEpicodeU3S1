import java.util.Scanner;
import MyLibrary.Rettangolo;
import MyLibrary.SIM;
import MyLibrary.Chiamata;
import MyLibrary.Articolo;
import MyLibrary.Cliente;
import MyLibrary.Carrello;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvenuto nel programma!");

        while (true) {
            // Menù principale
            System.out.println("Scegli un'opzione:");
            System.out.println("1: Crea e stampa un rettangolo");
            System.out.println("2: Crea e stampa due rettangoli con somma di area e perimetro");
            System.out.println("3: Simula una carta SIM");
            System.out.println("4: Avvia applicazione e-commerce");  // Nuova opzione
            System.out.println("0: Esci");
            String scelta = sc.nextLine();

            switch (scelta) {
                case "1":
                    // Creazione di un rettangolo e stampa di area e perimetro
                    System.out.println("Inserisci l'altezza del rettangolo:");
                    double altezza1 = sc.nextDouble();
                    System.out.println("Inserisci la larghezza del rettangolo:");
                    double larghezza1 = sc.nextDouble();
                    sc.nextLine(); // Consuma il newline

                    Rettangolo rettangolo = new Rettangolo(altezza1, larghezza1);
                    Rettangolo.stampaRettangolo(rettangolo);
                    break;

                case "2":
                    // Creazione di due rettangoli e stampa di area, perimetro e somma
                    System.out.println("Inserisci l'altezza del primo rettangolo:");
                    double altezzaR1 = sc.nextDouble();
                    System.out.println("Inserisci la larghezza del primo rettangolo:");
                    double larghezzaR1 = sc.nextDouble();
                    sc.nextLine(); // Consuma il newline

                    Rettangolo r1 = new Rettangolo(altezzaR1, larghezzaR1);

                    System.out.println("Inserisci l'altezza del secondo rettangolo:");
                    double altezzaR2 = sc.nextDouble();
                    System.out.println("Inserisci la larghezza del secondo rettangolo:");
                    double larghezzaR2 = sc.nextDouble();
                    sc.nextLine(); // Consuma il newline

                    Rettangolo r2 = new Rettangolo(altezzaR2, larghezzaR2);

                    Rettangolo.stampaDueRettangoli(r1, r2);
                    break;

                case "3":
                    // Simulazione di una carta SIM
                    System.out.println("Inserisci il numero di telefono della SIM:");
                    String numeroTelefono = sc.nextLine();

                    SIM miaSIM = new SIM(numeroTelefono);

                    // Aggiunta di credito
                    System.out.println("Inserisci il credito da aggiungere (in euro):");
                    double credito = sc.nextDouble();
                    miaSIM.aggiungiCredito(credito);
                    sc.nextLine(); // Consuma il newline

                    // Aggiunta di chiamate
                    System.out.println("Quante chiamate vuoi aggiungere?");
                    int numeroChiamate = sc.nextInt();
                    sc.nextLine(); // Consuma il newline

                    for (int i = 0; i < numeroChiamate; i++) {
                        System.out.println("Inserisci il numero chiamato per la chiamata " + (i+1) + ":");
                        String numeroChiamato = sc.nextLine();
                        System.out.println("Inserisci la durata della chiamata in minuti:");
                        int durata = sc.nextInt();
                        sc.nextLine(); // Consuma il newline

                        Chiamata chiamata = new Chiamata(numeroChiamato, durata);
                        miaSIM.aggiungiChiamata(chiamata);
                    }

                    // Stampa dei dati della SIM
                    miaSIM.stampaDatiSIM();
                    break;

                case "4":
                    // Avvio dell'applicazione e-commerce
                    avviaEcommerce(sc);
                    break;

                case "0":
                    // Uscita dal programma
                    System.out.println("Uscita dal programma. Arrivederci!");
                    sc.close();
                    return;

                default:
                    System.out.println("Scelta non valida, riprova.");
                    break;
            }

            // Richiede se l'utente vuole eseguire un'altra operazione
            System.out.println("Vuoi eseguire un'altra operazione? (s/n)");
            String risposta = sc.nextLine();
            if (!risposta.equalsIgnoreCase("s")) {
                break;
            }
        }
    }

    private static void avviaEcommerce(Scanner sc) {
        System.out.println("Benvenuto nell'applicazione e-commerce!");
        System.out.println("Inserisci i dati del cliente:");

        System.out.print("Codice cliente: ");
        String codiceCliente = sc.nextLine();
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Cognome: ");
        String cognome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data di iscrizione (formato: dd/mm/yyyy): ");
        String dataIscrizione = sc.nextLine();

        Cliente cliente = new Cliente(codiceCliente, nome, cognome, email, dataIscrizione);
        Carrello carrello = new Carrello(cliente);

        while (true) {
            System.out.println("Aggiungi un articolo al carrello:");
            System.out.print("Codice articolo: ");
            String codiceArticolo = sc.nextLine();
            System.out.print("Prezzo: ");
            double prezzo = sc.nextDouble();
            System.out.print("Pezzi disponibili: ");
            int pezziDisponibili = sc.nextInt();
            sc.nextLine(); // Consuma il newline

            Articolo articolo = new Articolo(codiceArticolo, prezzo, pezziDisponibili);
            carrello.aggiungiArticolo(articolo);

            System.out.println("Articolo aggiunto al carrello!");

            System.out.print("Vuoi aggiungere un altro articolo? (s/n): ");
            String risposta = sc.nextLine();
            if (!risposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Totale costo degli articoli nel carrello: " + carrello.getTotaleCosto() + " euro.");
    }
}

