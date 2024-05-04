import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("2300"), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal("89000"), new VATaxType(), taxService),
                new Bill(new BigDecimal("99000"), new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal("123000"), new ProgressiveTaxType(), taxService)
        };
        for(int i = 0; i < payments.length; i++){
            Bill bill = payments[i];
            bill.payTaxes();
        }

    }
}