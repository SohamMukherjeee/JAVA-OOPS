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


//Hatchback class will cause a compilation error because it doesn’t implement all the abstract methods from Car.
// Car has two abstract methods:

// abstract void seat();
// abstract int milege();


// Hatchback only overrides seat(), but it does not override milege().

//Since Hatchback is a concrete class (not marked as abstract), it must implement both abstract methods.
