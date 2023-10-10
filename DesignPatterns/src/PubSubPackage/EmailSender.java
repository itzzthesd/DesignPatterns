package PubSubPackage;

public class EmailSender implements OrderPlaceSubscriber{
    EmailSender(Flipkart flipkart){
        flipkart.register(this);
    }
    @Override
    public void announceOrderPlaced() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("email sent.");
    }
}
