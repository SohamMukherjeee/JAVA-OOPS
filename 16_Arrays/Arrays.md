# Arrays in Java

## 📚 What is an Array?

An **array** is a fundamental data structure in Java with the following characteristics:

- It is an **object** that stores multiple elements of the same data type
- Elements are stored **contiguously** in memory
- Provides indexed access to elements (starting from index 0)
- Has a **fixed size** once created

---

## 📝 Array Declaration Syntax

There are three valid ways to declare and initialize arrays in Java:

### Syntax 1: Array bracket after variable name

```java
datatype variableName[] = {element1, element2, ..., elementN};
```

### Syntax 2: Array bracket after datatype (Preferred)

```java
datatype[] variableName = {element1, element2, ..., elementN};
```

### Syntax 3: Array bracket with space

```java
datatype[] variableName = {element1, element2, ..., elementN};
```

### Example:

```java
int numbers[] = {10, 20, 30, 40, 50};
String[] names = {"Alice", "Bob", "Charlie"};
double[] prices = {9.99, 19.99, 29.99};
```

---

## ⚠️ Array Index Exception

Arrays in Java are zero-indexed, meaning the first element is at index 0. Attempting to access an index outside the valid range will throw an **ArrayIndexOutOfBoundsException**.

### Example:

```java
int array[] = {1, 2, 4, 5};
System.out.println(array[4]); // ❌ ArrayIndexOutOfBoundsException
// Valid indices: 0, 1, 2, 3 (length is 4)
```

### Iterating Through an Array:

```java
char arr[] = {'S', 'o', 'h', 'a', 'm'};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

**Output:**

```
S
o
h
a
m
```

---

## 🆕 Creating Arrays Using the `new` Keyword

When you don't know the values at declaration time, you can create an array using the `new` keyword and assign values later.

### Syntax:

```java
datatype[] variableName = new datatype[size];
```

### Example:

```java
int a[] = new int[6];  // Creates an array of size 6 with default values (0)

// Assigning values to specific indices
a[0] = 1;
a[1] = 5;
a[2] = 12;
a[3] = 7;

System.out.println(a[2]);  // Output: 12
```

### Default Values:

- **Numeric types** (int, double, etc.): `0` or `0.0`
- **boolean**: `false`
- **char**: `'\u0000'` (null character)
- **Object references**: `null`

---

## 💡 Key Points to Remember

1. **Fixed Size**: Once an array is created, its size cannot be changed
2. **Zero-Indexed**: The first element is at index 0, and the last element is at index `length - 1`
3. **Length Property**: Use `array.length` to get the number of elements
4. **Type Safety**: Arrays can only store elements of the declared type
5. **Reference Type**: Arrays are objects in Java, stored in the heap memory

---

## 📊 Common Array Operations

### Finding the length:

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println("Length: " + numbers.length);  // Output: 5
```

### Traversing an array:

```java
// Using traditional for loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Using enhanced for loop (for-each)
for (int num : numbers) {
    System.out.println(num);
}
```

---

## 🔄 Dynamic Value Assignment Using Scanner

When you need to take array values as input from the user, you can use the `Scanner` class with various methods based on the data type.

### Scanner Methods for Different Data Types:

1. **`nextByte()`** - Reads a byte value
2. **`nextShort()`** - Reads a short value
3. **`nextInt()`** - Reads an integer value
4. **`nextLong()`** - Reads a long value
5. **`nextFloat()`** - Reads a float value
6. **`nextDouble()`** - Reads a double value
7. **`nextBoolean()`** - Reads a boolean value
8. **`next()`** - Reads a single word (String)
9. **`nextLine()`** - Reads a complete line (String)

### Example: Reading Array Values from User

#### Method 1: Local Scanner (Recommended for small programs)

```java
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example 1: Reading integers
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display the array
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
```

#### Method 2: Static Scanner (For multiple methods)

When you need to use Scanner across multiple methods in a class, declare it as a `static` member variable:

```java
import java.util.Scanner;

public class ArrayOperations {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = readIntArray();
        displayArray(arr1);

        double[] arr2 = readDoubleArray();
        displayDoubleArray(arr2);

        sc.close();
    }

    // Method to read integer array
    public static int[] readIntArray() {
        System.out.print("Enter size for integer array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

}
```

**Benefits of Static Scanner:**

- ✅ Can be accessed from any static method without passing as parameter
- ✅ Single Scanner instance for entire class
- ✅ Cleaner code when working with multiple methods
- ✅ No need to create Scanner in each method

**When to Use Each Approach:**

- **Local Scanner**: Simple programs with one method
- **Static Scanner**: Programs with multiple methods needing input

### Sample Input/Output:

**Input:**

```
Enter the size of array: 5
Enter 5 integers:
10 20 30 40 50
```

**Output:**

```
Array elements:
10 20 30 40 50
```

---
