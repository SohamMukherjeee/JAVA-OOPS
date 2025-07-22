
// What is the Singleton Pattern?
// The Singleton Design Pattern ensures that a class has only one instance and provides a
// global point of access to that instance.



class Singleton {

    // Static Instance	Holds the single instance of the class.
    private static Singleton instance;
    
    // Private Constructor Prevents instantiation from outside the class.
   private Singleton() {
       // private constructor
   }
  
   // object of this class
   public static Singleton getInstance() {
       if (instance == null) {
           instance = new Singleton();
       }
       return instance;
   }
}

 /*This is Lazy Initialization
 Instance is created when it's first needed (can improve performance).*/


 /*
  * Important thing to remember -> Not safe for multi-threading
  */
