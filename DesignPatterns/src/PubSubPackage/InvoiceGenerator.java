package PubSubPackage;

public class InvoiceGenerator implements OrderPlaceSubscriber{
    InvoiceGenerator(Flipkart flipkart){
        flipkart.register(this);
    }
    @Override
    public void announceOrderPlaced() {
        invoiceGenerator();
    }

    private void invoiceGenerator() {
        System.out.println("generate invoice");
    }
}
