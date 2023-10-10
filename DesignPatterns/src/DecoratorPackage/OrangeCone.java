package DecoratorPackage;

public class OrangeCone implements IcecreamConeConstituents{
    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
