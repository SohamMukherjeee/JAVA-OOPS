## Non-primitive Type Casting -> address/reference types

Types of non-primitive type casting:

1. Upcasting (Widening)
2. Explicit Downcasting (Narrowing)

---

## Class Structure

**Parent Class A:**

```java
package pack6;

public class A {
 public static void m1() {
	 System.out.println("clss A & method m1");
 }
 public void m2() {
	 System.out.println("clss A & method m2");

 }

}
```

**Child Class B:**

```java
package pack6;

public class B extends A{
	 public static void m3() {
		 System.out.println("clss b & method m3");
	 }
	 public void m4() {
		 System.out.println("clss b & method m4");

	 }

}
```

---

## 1. Upcasting (Widening)

Upcasting is the process of converting a child class reference to a parent class reference. It is implicit and automatic.

### Example 1: Child Object with Child Reference

```java
B obj = new B();
// Automatic upcasting: A obj = (A)obj (done implicitly by compiler)
obj.m1();  // Can access parent static method
obj.m3();  // Can access own static method
obj.m2();  // Can access parent non-static method
obj.m4();  // Can access own non-static method
```

**Key Points:**

- Child class object can access both parent and child class members
- Upcasting happens automatically when needed
- All methods (static and non-static) from both classes are accessible

### Example 2: Implicit Upcasting

```java
B obj4 = new B();           // Original child object
A obj1 = obj4;              // Upcasting (implicit) - Child to Parent
obj1.m1();                  // Can access parent static method
obj1.m2();                  // Can access parent non-static method
// obj1.m3();               // Compile-time error: method not in parent class
// obj1.m4();               // Compile-time error: method not in parent class
```

**Key Points:**

- Upcasting is automatic and doesn't require explicit casting
- Parent reference can only access parent class members
- Child class methods are not accessible through parent reference
- The object is still of type B in memory, but reference type restricts access

### Example 3: Parent Reference to Parent Object (No Casting)

```java
A obj1 = new A();
obj1.m1();  // Can access static method
obj1.m2();  // Can access non-static method
// obj1.m3(); // Compile-time error: method not found in class A
// obj1.m4(); // Compile-time error: method not found in class A
```

**Key Points:**

- No casting involved - parent reference to parent object
- Can only access parent class members
- Cannot access child class methods as they don't exist in parent class

---

## 2. Explicit Downcasting (Narrowing)

Downcasting is the process of converting a parent class reference to a child class reference. It requires explicit casting and only works if the object was originally a child class instance.

### Example 1: Invalid Direct Downcasting

```java
B obj3 = (B) new A(); // Compiles but fails at runtime
obj3.m4();
// ClassCastException at runtime
```

**Key Points:**

- Direct downcasting from parent to child class is not allowed
- Compiles successfully but throws ClassCastException at runtime
- Reason: Parent class object doesn't contain child class members in memory
- JVM cannot convert a parent object into a child object

### Example 2: Valid Downcasting (After Upcasting)

```java
B obj4 = new B();           // Step 1: Create child object
A obj1 = obj4;              // Step 2: Upcasting (implicit)
B obj5 = (B)obj1;           // Step 3: Downcasting (explicit)
obj5.m3();                  // Works fine
obj5.m4();                  // Works fine
```

**Key Points:**

- Downcasting is valid only when the object was originally created as a child class
- The object must have been upcasted before it can be downcasted
- Explicit casting `(B)` is required for downcasting
- This works because obj1 internally refers to a B object, not an A object
- The reference type changes but the actual object type remains B

---

## Summary

**Upcasting (Widening):**

- Implicit and automatic
- Child to Parent conversion
- Always safe
- Restricts access to only parent class members

**Downcasting (Narrowing):**

- Explicit casting required
- Parent to Child conversion
- Only valid if object was originally a child instance
- Direct downcasting causes ClassCastException
- Valid only after upcasting the same object
