class Vehicle{
    int wheels;
    int speed;
    int seats;
}
class PowerVehicle extends Vehicle{
    int engine;
}
class AirVehicle extends PowerVehicle{
    int wings;
}
public class InheritanceTwo {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        PowerVehicle p=new PowerVehicle();
        AirVehicle a=new AirVehicle();
        a.engine=5;
    }
}
