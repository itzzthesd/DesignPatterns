package DecoratorPackage;

public class MangoScoop implements IcecreamConeConstituents{

    private IcecreamConeConstituents icecreamConeConstituents;
    public MangoScoop(IcecreamConeConstituents icecreamConeConstituents){
        if(icecreamConeConstituents == null){
            throw new IllegalArgumentException("Can tot be created without base.");
        }

        this.icecreamConeConstituents = icecreamConeConstituents;
    }
    @Override
    public int getCost() {
        return icecreamConeConstituents.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return icecreamConeConstituents.getDescription() + "+ Mango Scoop";
    }
}
