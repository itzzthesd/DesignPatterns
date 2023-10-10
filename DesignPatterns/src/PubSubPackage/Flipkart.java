package PubSubPackage;

import java.util.LinkedList;
import java.util.List;

public class Flipkart {
    private List<OrderPlaceSubscriber> subList =
            new LinkedList<>();

    public void register(OrderPlaceSubscriber orderPlaceSubscriber){
        subList.add(orderPlaceSubscriber);
    }

    public void unRegister(OrderPlaceSubscriber orderPlaceSubscriber){
        subList.remove(orderPlaceSubscriber);
    }
    public void onOrderPlaced(){
        for(OrderPlaceSubscriber sub: subList){
            sub.announceOrderPlaced();
        }
    }

}
