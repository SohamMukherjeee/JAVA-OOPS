public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();              // Base pizza
        pizza = new CheeseTopping(pizza);                 // Add Cheese
        pizza = new OlivesTopping(pizza);                 // Add Olives

        System.out.println(pizza.getDescription());       // Margherita Pizza, Cheese, Olives
        System.out.println("Total Cost: ₹" + pizza.getCost());  // ₹135.0
    }
}
