package strategy;

public class GoogleMaps {
    PathCalculator pc;
    public void searchPath(String from, String to, SupportedMode mode){
       pc=PathCalculatorFactory.getPathCalculatorForMode(mode);
       pc.findPath(from, to);
    }
}
