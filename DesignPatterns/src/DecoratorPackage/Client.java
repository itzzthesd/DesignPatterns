package DecoratorPackage;

public class Client {
    public static void main(String[] args) {
        IcecreamConeConstituents icecreamConeConstituents =
                new Chocochips( new Chococone(new OrangeCone()));
        System.out.printf("price:" + icecreamConeConstituents.getCost());
        System.out.printf(icecreamConeConstituents.getDescription());
    }
}
