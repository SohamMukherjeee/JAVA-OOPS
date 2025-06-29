class Car{
     Car(){
        System.out.println("Default Constructor");
    }
     Car(String model){
        System.out.println("Parameterized Constructor "+model);
    }
    
}
public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
         Car car2= new Car("Suzuki");
       // Car car2=new Car("Suz");
    }
}
