package DecoratorPackage;

public class Chocochips implements IcecreamConeConstituents{
    private IcecreamConeConstituents icecreamConeConstituents;
    public Chocochips(IcecreamConeConstituents icecreamConeConstituents){
        if(icecreamConeConstituents == null){
            throw new IllegalArgumentException("Can not be created without base.");
        }

        this.icecreamConeConstituents = icecreamConeConstituents;
    }
    @Override
    public int getCost() {
        return icecreamConeConstituents.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return icecreamConeConstituents.getDescription() + "+ Chocochips";
    }
}
