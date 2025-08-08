abstract class Car {
    abstract void seat();
    abstract int milege();
}
class Suv extends Car{
    void seat(){
        System.out.println("Suv : 6 seats");
    }
    int milege(){
        return 34;
    }
}

// When a class extends an abstract class, it must either:

// Implement all the abstract methods, OR

// Be declared abstract itself


class Hatchback extends Car {
     void seat(){
        System.out.println("Hatchback: 4 sets");
     }
}