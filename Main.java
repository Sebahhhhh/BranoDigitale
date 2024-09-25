import java.util.Scanner;

public class Main {

    //non permette di visionare una lista dei brani salvati

    public static void main(String[] args) {

        // Scanner
        Scanner in = new Scanner(System.in);

        // Input informazioni sul brano
        System.out.print("Inserisci il titolo del brano: ");
        String titolo = in.nextLine();

        System.out.print("Inserisci l'autore del brano: ");
        String autore = in.nextLine();

        System.out.print("Inserisci il formato del brano | Es: .mp3, .wav: ");
        String formato = in.nextLine();

        // Creazione di un brano
        BranoDigitale br = new BranoDigitale(formato, titolo, autore);
        // br = brano

        // Stampa delle informazioni del brano
        System.out.println("\nInformazioni del brano:");
        System.out.println("Titolo: " + br.getTitolo());
        System.out.println("Autore: " + br.getAutore());
        System.out.println("Formato: " + br.getFormato());

        // Cambio formato
        System.out.print("\nVuoi cambiare il formato del brano? (Y/N): ");
        String risposta = in.nextLine();

        if (risposta.equalsIgnoreCase("Y")) {
            System.out.print("Inserisci il nuovo formato: ");
            String n_Formato = in.nextLine();
            br.setFormato(n_Formato);
            System.out.println("Il formato è stato aggiornato a: " + br.getFormato());
        } else {
            System.out.println("Il formato non è stato cambiato.");
        }

    }
}

// Classi
class BranoDigitale {

    private String formato;
    private String titolo;
    private String autore;

    // Variabili
    public BranoDigitale(String f, String t, String a) {
        formato = f;
        titolo = t;
        autore = a;
    }

    // Metodo autore
    public String getAutore() {
        return autore;
    }

    // Metodo titolo
    public String getTitolo() {
        return titolo;
    }

    // Metodo formato
    public String getFormato() {
        return formato;
    }

    // Metodo cambio
    public void setFormato(String nuovoFormato) {
        formato = nuovoFormato;
    }
}

