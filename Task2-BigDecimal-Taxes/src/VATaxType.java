import java.math.BigDecimal;
public class VATaxType extends TaxType{
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.18));
    }
}
