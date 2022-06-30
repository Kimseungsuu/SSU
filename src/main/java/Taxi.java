enum busState{
    running, inGarage
}

public class Taxi extends Vehicle{

    public int maxPassenger = 0;
    public int nowPassenger = 0;
    public int charge = 0;
    public int taxiNum;
    public float oil = 0;
    public float speed = 0;
    public busState state = busState.running;
