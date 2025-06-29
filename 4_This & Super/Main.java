//this: Refers to current class object
class Car{
    String model;
    Car(String model){
        this.model=model;
        System.out.println(model);
    }
    void number(){
        System.out.println("seat is 4");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car1=new Car("suzuki");
    }
}
