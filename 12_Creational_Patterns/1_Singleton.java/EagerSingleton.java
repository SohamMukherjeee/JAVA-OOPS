/*
 * 
 * What is Eager Initialization?
  Eager Initialization is a way to create a Singleton instance at the time of class loading,
 rather than delaying creation until it's needed.
  
| Feature             | Eager Initialization       | Lazy Initialization                 |
| ------------------- | -------------------------- | ----------------------------------- |
| Instance creation   | At class loading time      | On first use                        |
| Thread safety       | Yes (implicitly)           | Needs extra handling                |
| Performance         | Faster on access           | Slower if synchronization is needed |
| Resource efficiency | Can waste memory if unused | Memory-efficient if rarely used     |




**Cons
Wastes resources if the instance is never used. ( biggest fallback + important one)

No control over when the object is created.

 */


public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton(); // Eagerly created

    private EagerSingleton() {
        // private constructor
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}
