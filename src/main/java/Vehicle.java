public abstract class Vehicle {
    public float oil;
    public float speed;
    
    public boolean CheckOil(){
        if (oil < 10) {
            System.out.println("주유량을 확인해라.");
            return false;
        }
        return true;
    }
    
    public void accelerate(float speed){
        if(!CheckOil())
            return;
        this.speed += speed;
    }
}
