package StrategyPackage;

public class PathCalFactory {
    public static PathCalculator getPathCalc(String mode){
        if(mode.equals("car")){
            return new CarPathCalculator();
        }else if(mode.equals("bike")){
            return new BikePathCalculator();
        }else{
            throw new IllegalArgumentException("mode not supported");
        }
    }
}
