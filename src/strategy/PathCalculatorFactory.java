package strategy;

public class PathCalculatorFactory {
    static CarPathCalculator cpc=new CarPathCalculator();//static
    static BikePathCalculator bpc=new BikePathCalculator();
    static WalkPathCalculator wpc=new WalkPathCalculator();
    public static PathCalculator getPathCalculatorForMode(SupportedMode mode) {
        if (mode.equals(SupportedMode.CAR)) {
            return cpc;
        }
        else if (mode.equals(SupportedMode.BIKE)) {
            return bpc;
        }
        else {
            return wpc;
        }
    }
}
