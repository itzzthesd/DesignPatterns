package StrategyPackage;

public class GoogleMaps {
    public void findPath(String from, String to, String mode){
        PathCalculator pathCalculator = PathCalFactory.getPathCalc("car");
        pathCalculator.findPath(from, to);
    }
}
