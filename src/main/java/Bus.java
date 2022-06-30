enum busState{
    running, inGarage
}

public class Bus extends Vehicle{

    public int maxPassenger = 0;
    public int nowPassenger = 0;
    public int charge = 0;
    public int busNum;
    public float oil = 0;
    public float speed = 0;
    public busState state = busState.running;

    Bus() {
        this.busNum = (int) (Math.random() * 10000 + 1);
        System.out.println("버스번호:" + busNum);
    }


    public void setState(busState nextState) {
        state = nextState;
    }

    public void run (float distance){
        oil -= distance / 120;
        if (oil < 10)
            System.out.println("주유가 필요합니다.");
        if (oil <= 0)
            setState(busState.inGarage);
    }

    public void take(int passenger){
        if(!(state == busState.running))
            return;
        if(curPassenger + passenger <= maxPassenger)
            curPassenger += passenger;
        else
            curPassenger = maxPassenger;
        charge += 1200;
    }

}