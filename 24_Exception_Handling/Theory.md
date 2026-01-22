# Exception Handling in Java

### `Exception`

    An event that occurs during the execution of a program that disrupts the normal flow of instructions.

### Example of Exception:

```java
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        System.out.println("Result: " + (a/b)); // ArithmeticException
    }
}
```

- To handle exceptions in java, we use the `try`- `catch` block and `throws` keywords.

- we can't resolve the exception but we can handle it using exception handling.

### 1. Syntax of try-catch block:

```java
try {
    // code that may throw an exception
} catch (ExceptionType1 e1) {
    // handle ExceptionType1
}
```

### solving the above using try-catch block:

1. `ArithmeticException`

```java
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println(e.getMessage()); // getMessage() method to get details of exception
            e.printStackTrace(); // printStackTrace() method to print the exception details
        }
    }
}
```

2.  `NullPointerException`

```java
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a method on a null object.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
```

3. `NumberFormatException`

```java
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int num = Integer.parseInt(str);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

```

4. `ClassCastException`

```java
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = new Integer(10);
        try {
            String str = (String) obj; // This will throw ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Error: Invalid type casting.");
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
```

5. `ArrayIndexOutOfBoundsException`

```java
public class AIOBE {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,51};
	try {
		System.out.println(arr[6]);
	} catch (ArrayIndexOutOfBoundsException  e) {
		System.out.println(e.getMessage());
	}
}
}


```

6. `StringIndexOutOfBoundsException`

```java
public class SIOBE {
public static void main(String[] args) {
    String str="Hello";
    try {
        System.out.println(str.charAt(10));
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
    }
}
}

```

7. `NegativeArraySizeException`

```java
public class NegativeArraySizeExceptionExample {
    public static void main(String[] args) {
        try {
            int size = -5;
            int[] arr = new int[size];
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

```

8.  `inputMismatchException`

```java
import java.util.Scanner;
public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        }
}

```

### Throwable class

- In Java, `Throwable` is the superclass of all errors and exceptions in the Java language. It has two main subclasses: `Error` and `Exception`.

it divides between two categories:

1. Errors
   - StackOverflowError
2. Exceptions
   - ### Checked Exceptions (Compile-time Exceptions)
     - ClassNotFoundException `(When the JVM tries to load a class and the class is not found in the classpath.)`
     - FileNotFoundException `(When an attempt to access a file that does not exist on the disk.)`
     - SQLException `(When there is an error in database access or other database-related issues.)`
     - IOException `(When an I/O operation fails or is interrupted.)`
   - ### Unchecked Exceptions (Runtime Exceptions)
     - ClassNotFoundException `(When the JVM tries to load a class and the class is not found in the classpath.)`
     - ArithmeticException `(When an exceptional arithmetic condition has occurred, such as division by zero.)`
     - NullPointerException `(When an application attempts to use `null` in a case where an object is required.)`
     - NumberFormatException `(When an attempt is made to convert a string to a numeric type, but the string does not have the appropriate format.)`
     - ClassCastException `(When an object is cast to a class of which it is not an instance.)`
     - IndexOutOfBoundsException `(When an index is out of range for a collection or array.)`
       - ArrayIndexOutOfBoundsException
       - StringIndexOutOfBoundsException
     - NoSuchElementException `(When one tries to access an element that does not exist.)`

#### Exception Hierarchy Flowchart

```plaintext
                Throwable
                   /   \
                 /       \
              Error     Exception
                        /      \
               Checked      Unchecked
             Exceptions    Exceptions
             /   |   \         /   |   \     \
            CNE FNE SQLE  Arit. NPE NFE CCE IOOBE
                                            /   \
                                         AIOBE  SIOBE
```

### Types of Exception Handling Mechanisms in Java

1. try-catch block
2. try-multi catch block
3. try-catch-finally block
4. try-multi catch-finally block
5. try-finally block

---

important notes about try-catch-finally block:

1. for `try` block there must be at least one `catch` block or `finally` block.
2. for `catch` block there must be a `try` block.
3. for `finally` block there must be a `try` block.

---

### finally

- the `finally` block is used to execute important code such as closing resource, regardless of whether an exception is handled or not.
- used to close all the costly resources like database connections, file streams, etc. Example: scanner.close()

FLowchart of try-catch-finally block:

1. wrong exception type in catch block

```java
public class User {
	    public static void main(String[] args) {
	        int a=10;
	        int b=0;
	        try {
	            System.out.println(a/b);
	        } catch (NumberFormatExceptio e) {
	            System.out.println(e.getMessage());
	            e.printStackTrace();
	        }finally {
				System.out.println("Success");
			}
	    }

}


```

output:

```
Success
Exception in thread "main" java.lang.ArithmeticException: / by zero at exceptionHandling.User.main(User.java:8)


```

2. correct exception type in catch block

```java
public class User {
        public static void main(String[] args) {
            int a=10;
            int b=0;
            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }finally {
                System.out.println("Success");
            }
        }

}

```

output:

```
/ by zero
Success
```

#### Flow chart :

```
 try -> (wrong exception) ->  finally ->catch -> end

     -> (correct exception) -> catch -> finally -> end
```

---

# Throws

- Used to explicitly throw an exception from a method or any block of code.

### FileNotFoundException Example

```java

package exceptionHandling;

import java.io.*;

public class FileUser {

    public static void m1() throws FileNotFoundException {
        m2();
    }

    public static void m2() throws FileNotFoundException {
        m3();
    }

    public static void m3() throws FileNotFoundException {
    	FileInputStream fin =new FileInputStream("C:\\CG_Java\\cgjava\\src\\exceptionHandling\\Text.txt");
        System.out.println("successfull");
    }

    public static void main(String[] args) throws FileNotFoundException {
        m1();
    }
}

```

- In the above example, the `FileNotFoundException` is thrown from the `m3` method, propagated through `m2` and `m1`, and finally handled in the `main` method.

---

### Custom Exception

`Example.java`

```java
package exceptionHandling;

public class Example {
	public static void main(String[] args) {
		int age = 12;
		if (age >= 18) {
			System.out.println("Eligible");
		} else {
			throw new AgeMismatchException("Age is missing...!!!");
		}
	}
}


```

`AgeMismatchException.java`

```java
package exceptionHandling;

public class AgeMismatchException extends RuntimeException{
   public AgeMismatchException(String str) {
	   super(str);
   }
}

```

`output:`

```
Exception in thread "main" exceptionHandling.AgeMismatchException: Age is missing...!!!
	at exceptionHandling.Example.main(Example.java:9)

```
