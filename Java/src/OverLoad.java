class Vehicle{
    int speed;
    int dist;

    public Vehicle(){
        this.speed = 10;
    }
    public Vehicle(int speed){
        this.speed = speed;
    }

    public Vehicle(int speed, int dist){
        this.speed = speed;
        this.dist = dist;
    }
}



public class OverLoad {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        System.out.println("Speed : "+v1.speed+" and Distance: "+v1.dist);
        Vehicle v2 = new Vehicle(30);
        System.out.println("Speed : "+v2.speed+" and Distance: "+v2.dist);
        Vehicle v3 = new Vehicle(20,2);
        System.out.println("Speed : "+v3.speed+" and Distance: "+v3.dist);
    }
}
