package DecoratorPackage;

public class Chococone implements IcecreamConeConstituents {
    private IcecreamConeConstituents icecreamConeConstituents;
    public Chococone(){

    }

    public Chococone(IcecreamConeConstituents icecreamConeConstituents){
        this.icecreamConeConstituents = icecreamConeConstituents;
    }

    @Override
    public int getCost() {
        if(icecreamConeConstituents != null){
            return icecreamConeConstituents.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if(icecreamConeConstituents != null){
            return icecreamConeConstituents.getDescription() + " chocolate cone";
        }
        return "Chocolate Cone";
    }
}
