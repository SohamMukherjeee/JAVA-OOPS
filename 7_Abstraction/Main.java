// Abstraction is an Object-Oriented Programming (OOP) concept that hides complex implementation details 
//and only shows essential features of an object.




public class Main {
    public static void main(String[] args) {
        Suv car1=new Suv();
        car1.seat();
        System.out.println("milege "+ car1.milege());
        Hatchback car2=new Hatchback();
        car2.seat();
    }
}
