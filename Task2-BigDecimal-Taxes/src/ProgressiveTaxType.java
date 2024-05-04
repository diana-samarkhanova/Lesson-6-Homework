import java.math.BigDecimal;
public class ProgressiveTaxType extends TaxType{
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if(amount.compareTo(new BigDecimal(10000)) <= 0 ){
            return amount.multiply(BigDecimal.valueOf(0.1));
        } else {
            return amount.multiply(BigDecimal.valueOf(0.15));
        }
    }

}
