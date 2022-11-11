package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Car car=new Car();
        GasStation g=new GasStation();
        car.run();
        g.refuel(car);
        car.run();
    }
}
