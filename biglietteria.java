
import  java.util.Bigdecimal;


public class biglietto {


    private int km ;
    private int eta;

    /*valori fissi*/
    
    private static final BigDecimal costokm = new BigDecimal("0.21");
private static final BigDecimal  over65_sconto= new BigDecimal("0.40");
private static final BigDecimal sconto_minorenni = new BigDecimal("0.20");




public Biglietto(int km, int year) tr+hrows IllegalArgumentException{
        if(km<=0){
        throw new IllegalArgumentException("Il valore di km non e maggiore di zero");
        }
        this.km=km;
        this.year=year;
        }


public BigDecimal calcolaPrezzo() {
        BigDecimal prezzoBase = costokm.multiply(BigDecimal.valueOf(km));
        BigDecimal sconto = calcolaSconto();

        if (flessibile) {
        prezzoBase = prezzoBase.multiply(new BigDecimal("1.10"));
        }

        return prezzoBase.subtract(prezzoBase.multiply(sconto));
        }

private BigDecimal calcolaSconto() {
        if (eta < 18) {
        return Big.Decimal.ONE.subtract(sconto_minorenni);
        } else if (eta >= 65) {
        return BigDecimal.ONE.subtract(over65_sconto);
        }
        return BigDecimal.ONE;
        }
        }
        }
