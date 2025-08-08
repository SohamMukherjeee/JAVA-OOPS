
// An interface in Java is a blueprint for classes. It is used to achieve abstraction and multiple inheritance in Java.

// ----------------------------------------------------------------------------------------------------------
// All methods are implicitly public abstract (unless default or static)

// All fields are implicitly public static final (i.e., constants)



interface Car {
   void seat();  // abstract by default
}

class suzuki implements Car{
    public void seat(){
        System.out.println("Four seats");
    }
}
