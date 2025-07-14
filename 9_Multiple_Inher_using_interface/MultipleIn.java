interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}
// we can achieve multiple inheritence using Interface
class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies");
    }

    public void swim() {
        System.out.println("Duck swims");
    }
}
