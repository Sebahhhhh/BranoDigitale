import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner
        Scanner in = new Scanner(System.in);

        
        System.out.print("Inserisci il titolo del brano: ");
        String titolo = in.nextLine();

        System.out.print("Inserisci l'autore del brano: ");
        String autore = in.nextLine();

        System.out.print("Inserisci il formato del brano");
        String formato = in.nextLine();

        // Creazione di un brano
        BranoDigitale br = new BranoDigitale(formato, titolo, autore);
        // br = brano
        
        // Stampa delle informazioni del brano
        System.out.println("\nInformazioni del brano:");
        System.out.println("Titolo: " + br.getTitolo());
        System.out.println("Autore: " + br.getAutore());
        System.out.println("Formato: " + br.getFormato());
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