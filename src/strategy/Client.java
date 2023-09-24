package strategy;

public class Client {
    public static void main(String[] args){
        GoogleMaps gm=new GoogleMaps();
        gm.searchPath("Delhi", "Agra", SupportedMode.BIKE);
    }
}
