// class & object

//Class: Blueprint for objects
 class Car {
    String color;
    void drive(){
        System.out.println("Car is driving");
    }
}

//Object: Instance of class
 public class Main {
 
    public static void main(String[] args) {
        Car car1=new Car();
        car1.color="red";
        car1.drive();
    }
 }