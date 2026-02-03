abstract class vehicle{
    abstract int move();
} 

class Car extends vehicle{
  int move(){
    return 1;
  }
}
public class Question {
    public static void main(String[] args) {
        Car v=new Car();
        System.out.println(v.move());
    }
}
