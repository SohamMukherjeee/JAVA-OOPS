interface Flyable{
 void Fly();
}
class Bird implements Flyable{
     public void Fly(){
        System.out.println("Flyyy");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Bird b=new Bird();
        b.Fly();
    }
}
