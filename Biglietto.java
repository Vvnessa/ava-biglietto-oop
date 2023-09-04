import   java.util.Scanner
import java.util.bigDecimal;

public class Biglietto{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("inserisci il n di km :");
            int km = scanner.nextInt();
            System.out.println("inserisci la tua eta");
            int eta = scanner.nextInt();
            biglietto biglietto = new biglietto(km, year);
            bigDecimal prezzo = biglietto.calcolaPrezzo();

            System.out.println("prezzo biglietto " :+prezzo + " $");
        }
        catch ( (inputMismatchExecption ){
            System.out.println(("  hai inserito un valore non valido ");
            }
            catch ( IllegalArgumentException e) {
            System.out.println("errore: "+ e.getmessage());}
    }
}
}




