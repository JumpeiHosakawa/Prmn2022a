package lecture02;

public class Car {
    int fuel;
    Tire[] tires;
    Engine engine;
    Car(Tire[] tires, Engine engine){
                this.tires=tires;

        this.engine=engine;
        fuel=0;
    }
    void run(){
        if(fuel==0){
            System.out.println("燃料が足りないため走れませんでした。");
        }
        else{
            fuel=fuel-1;
            System.out.println("燃料を1消費して走りました。");
        }

    }
    void startEngine(){
        Engine e=new Engine(400);
        e.start();
    }
}
