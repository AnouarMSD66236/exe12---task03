  //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or


enum TraficLight{
    red,yellow,green
}
class TrafficLightSimulator{
    TraficLight currentColor;


    public TrafficLightSimulator(TraficLight initialColor){
        this.currentColor = initialColor;

    }

    public  void changeColor(TraficLight currentColor){
        switch (currentColor){
            case red:
                this.currentColor = TraficLight.green; break;
            case yellow:
                this.currentColor = TraficLight.red;break;
            case green:
                this.currentColor = TraficLight.yellow;break;
            default:
                System.out.println("invalid trafic light color");

        }
    }

}



  public class Main {
    public static void main(String[] args) {

        TrafficLightSimulator simulation = new TrafficLightSimulator(TraficLight.red);

        for (;;){
            System.out.println(simulation);
            simulation.changeColor(simulation.currentColor);
        }

    }
}