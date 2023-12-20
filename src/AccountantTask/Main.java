package AccountantTask;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(3000003, new IncomeTaxType(), taxService),
                new Bill(50005, new ProgressiveTaxType(), taxService),
                new Bill(1000001, new VATaxType(), taxService)
        };
        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
