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
}
}
// Classi
class BranoDigitale {

    private String formato;
    private String titolo;
    private String autore;

    
    public BranoDigitale(String f, String t, String a) {
        formato = f;
        titolo = t;
        autore = a;
    }

    
    public String getAutore() {
        return autore;
    }

    
    public String getTitolo() {
        return titolo;
    }

    
    public String getFormato() {
        return formato;
    }
}