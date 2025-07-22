
public class ThreadSafe {
private static ThreadSafe instance;

   private ThreadSafe() {
   }

   public static ThreadSafe getInstance() {
      if (instance == null) {
        // Two thread can entry here (T1 & T2)
        synchronized(ThreadSafe.class){
            // But here only one Thread(T1) can entry, other thread(T2) need to wait until T1 finish the job
            if(instance==null){
                instance = new ThreadSafe();
            }
        }
      }

      return instance;
   }

}

// Double-Checked Locking