// Method Overloading means having multiple methods in the same class with the same name but different parameters (type, number, or order).

// It is resolved at compile time, so it's called Compile-Time Polymorphism.
 class calc{
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a, String b){
        return a+b;
    }
 }

public class MethodOverload {
    public static void main(String[] args) {
        calc calcul=new calc();
        
        System.out.println(calcul.add(2, 2));
        System.out.println(calcul.add(2.0, 3.0));
        System.out.println(calcul.add(2, 2,5));
        System.out.println(calcul.add("bheem ", "chutki"));
    }
    
}
