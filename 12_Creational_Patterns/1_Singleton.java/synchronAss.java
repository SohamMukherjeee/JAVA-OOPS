public class synchronAss {
    private static synchronAss instance;

    private synchronAss() {}

    public static synchronized synchronAss getInstance() {
        if (instance == null)
            instance = new synchronAss();
        return instance;
    }
}

/*
 * 
 * 
 * 
 * | Feature                 | Thread-safe Singleton (`synchronized`) | Double-Checked Locking (DCL)     |
| ----------------------- | -------------------------------------- | -------------------------------- |
| Thread-safe             | ✅ Yes                                  | ✅ Yes                            |
| Performance after init  | ❌ Slower (sync every time)             | ✅ Fast (sync only once)          |
| Complexity              | ✅ Simple                               | ❌ More complex                   |
| Lazy initialization     | ✅ Yes                                  | ✅ Yes                            |
| Suitable for production | ⚠️ Only for small apps or rare access  | ✅ Preferred for high performance |
| `volatile` needed       | ❌ No                                   | ✅ Yes                            |

 */