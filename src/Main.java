import java.util.Scanner;
import MyLibrary.NumeroInLettere;
import MyLibrary.SeparatoreStringa;
import MyLibrary.ContoAllaRovescia;
import MyLibrary.StringaUtility;
import MyLibrary.AnnoUtility;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner per leggere l'input da console
        System.out.println("Benvenuto nel mio programma di esercizi interattivi!");
        System.out.println("Scegli un numero tra 1 e 5 per eseguire il rispettivo esercizio, oppure 0 per uscire.");

        while (true) { // Ciclo infinito visto a lezione usato per far scegliere diversi esercizi
            System.out.println("Seleziona un programma da eseguire:");
            System.out.println("1: Verifica Stringa Pari/Dispari");
            System.out.println("2: Controllo Anno Bisestile");
            System.out.println("3: Numero in Lettere");
            System.out.println("4: Separatore di Caratteri");
            System.out.println("5: Conto alla Rovescia");
            System.out.println("0: Esci:");

            String input = sc.nextLine(); // Legge l'input dell'utente

            try {
                int scelta = Integer.parseInt(input); // Converte l'input in un numero intero
                switch (scelta) { // Switch per eseguire l'esercizio scelto
                    case 1:

                        System.out.println("Inserisci una stringa:");
                        String inputString = sc.nextLine();
                        boolean isPari = StringaUtility.stringaPariDispari(inputString);
                        System.out.println("La stringa ha un numero di caratteri " + (isPari ? "pari" : "dispari") + ".");
                        break;

                    case 2:

                        System.out.println("Inserisci un anno:");
                        int anno = sc.nextInt();
                        sc.nextLine(); // Consuma la newline per evitare che il programma scambi per input la riga precedente
                        boolean isBisestile = AnnoUtility.annoBisestile(anno);
                        System.out.println("L'anno " + anno + " è " + (isBisestile ? "bisestile" : "non bisestile") + ".");
                        break;

                    case 3:
                        // AGGIUNTA DI UN CICLO CHE RIPETE LA RICHIESTA DI INSERIRE IL NUMERO FINCHE NON è UN NUMERO VALIDO
                        int numero;
                        while (true) {
                            System.out.println("Inserisci un numero intero compreso tra (1-3):");
                            numero = sc.nextInt();
                            sc.nextLine(); // Consuma la newline per evitare che il programma scambi per input la riga precedente

                            if (numero >= 1 && numero <= 3) {
                                break; // Esce dal ciclo se il numero è valido (compreso tra 1 e 3)
                            } else {
                                System.out.println("Numero non valido. Per favore, inserisci un numero compreso tra 1 e 3.");
                            }
                        }

                        // Converte il numero in lettere
                        String risultato = NumeroInLettere.numeroInLettere(numero);
                        System.out.println(risultato);
                        break;



                    case 4:
                        // Separa i caratteri di una stringa con virgole, esce quando l'utente digita ":q"
                        System.out.println("Inserisci una stringa da separare oppure digita ':q' per uscire:");
                        String inputStr;
                        // Ciclo per consentire all'utente di inserire più stringhe fino a che non digita ':q
                        while (true) {
                            inputStr = sc.nextLine();

                            if (inputStr.equals(":q")) { // Uscita dal ciclo se viene inserito ":q"
                                break;
                            }
                            String separata = SeparatoreStringa.separaCaratteri(inputStr);
                            System.out.println(separata);

                            System.out.println("Vuoi inserire un'altra stringa da separare? (s/n) (oppure digita ':q' per uscire)");
                            String risposta = sc.nextLine();


                            if (risposta.equalsIgnoreCase("s")) {
                                // Mostro di nuovo il messaggio di richiesta
                                System.out.println("Inserisci una nuova stringa da separare (digita ':q' per uscire):");
                            } else {

                                break;
                            }
                        }
                        break;

                    case 5:
                        // Esegue il conto alla rovescia con un ritardo di 1 secondo tra ogni numero
                        System.out.println("Inserisci un numero intero per il conto alla rovescia:");
                        int contoNumero = sc.nextInt();
                        sc.nextLine(); // Consuma la newline per evitare che il programma scambi per input la riga precedente
                        ContoAllaRovescia.contoRovescia(contoNumero);
                        break;

                    case 0:
                        // Uscita dal programma
                        System.out.println("Grazie per aver usato il programma! Arrivederci!");
                        sc.close();
                        return; // Termina il programma

                    default:
                        // Messaggio di errore se l'utente ha inserito un numero non valido
                        System.out.println("Scelta non valida. Riprova.");
                        break;
                }
                /* VERSIONE BASE
                // Chiede se l'utente vuole eseguire un altro esercizio
                System.out.println("Vuoi eseguire un altro esercizio? (s/n)");
                String risposta = sc.nextLine();
                if (!risposta.equalsIgnoreCase("s")) { // Esce dal ciclo se l'utente risponde 'n'
                    break;
                }
                */

                // VERSIONE CON GESTIONE DEL MANCATO INSERIMENTO DI UN CORRETTO INPUT "S" O "N"


                while (true) {
                    System.out.println("Vuoi eseguire un altro esercizio? (s/n)");
                    String risposta = sc.nextLine();

                    // Se l'utente risponde "s", il programma continua
                    if (risposta.equalsIgnoreCase("s")) {
                        break; // Esce dal ciclo interno e ripete il ciclo principale
                    }

                    // Se l'utente risponde "n", esce dal programma
                    else if (risposta.equalsIgnoreCase("n")) {
                        System.out.println("Grazie per aver usato il programma! Arrivederci!");
                        sc.close();
                        return; // Termina il programma
                    }

                    // Se l'input non è valido, mostra un messaggio di errore e richiede nuovamente
                    else {
                        System.out.println("Input non valido. Per favore, inserisci 's' per continuare o 'n' per uscire.");
                    }
                }



            } catch (NumberFormatException e) {
                // Valuta l'errore nel caso in cui l'utente non abbia inserito un numero
                System.out.println("Per favore, inserisci un numero valido.");
            } catch (Exception e) {
                // Valuta eventuali errori imprevisti
                System.out.println("Si è verificato un errore: " + e.getMessage());
            }
        }
    }
}




