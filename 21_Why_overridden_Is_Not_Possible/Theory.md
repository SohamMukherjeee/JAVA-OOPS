### Are Static and non static members overridable or not? and Why & why not?

---

## Key Concepts

**Method Overriding:** When a child class provides a specific implementation of a method that is already defined in its parent class. Overriding is based on the actual object type at runtime (dynamic polymorphism).

**Method Hiding:** When a child class defines a static method with the same signature as a static method in the parent class. Method hiding is based on the reference type at compile time.

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
	 public static void m1() {
		 System.out.println("clss b & method m1");
	 }
	 public void m2() {
		 System.out.println("clss b & method m4");

	 }

}
```

**Main Class:**

```java
package pack6;

public class A_B_User1 {

	public static void main(String[] args) {
		A obj=new B();
		obj.m1(); // Method Hiding - calls A's m1()
		obj.m2(); // Method Overriding - calls B's m2()
	}

}
```

**Output:**

```
clss A & method m1
clss b & method m4
```

---

## Why Static Methods Cannot Be Overridden (Method Hiding)

### 1. Static Methods Belong to the Class, Not the Object

- Static methods are resolved at compile time based on the reference type, not at runtime based on the object type
- In `A obj = new B()`, the reference type is A, so A's static method m1() is called
- This is called **Method Hiding**, not overriding

### 2. No Dynamic Binding for Static Methods

- Overriding requires dynamic polymorphism (runtime method resolution)
- Static methods use static binding (compile-time resolution)
- The method call is determined by the reference type (A), not the object type (B)

### 3. Static Methods Are Class-Level

- Static methods are associated with the class itself, not with instances
- When you call `obj.m1()`, it's equivalent to `A.m1()` because obj's reference type is A
- The actual object being B doesn't matter for static method calls

---

## Why Non-Static (Instance) Methods Can Be Overridden

### 1. Instance Methods Belong to Objects

- Instance methods are resolved at runtime based on the actual object type
- In `A obj = new B()`, even though reference is A, the actual object is B
- At runtime, JVM checks the actual object type and calls B's m2() method

### 2. Dynamic Binding (Late Binding)

- Instance methods use dynamic binding - method resolution happens at runtime
- JVM uses the actual object type (B) to determine which method to call
- This enables polymorphism - same method call, different behavior based on object type

### 3. Overriding Enables Polymorphism

- The overridden method in child class replaces the parent's implementation for that object
- When `obj.m2()` is called, JVM looks at the actual object (new B()) and executes B's version
- This is the core of runtime polymorphism in Java

---

## Summary Table

| Aspect              | Static Methods (m1)   | Instance Methods (m2) |
| ------------------- | --------------------- | --------------------- |
| Binding Type        | Static (Compile-time) | Dynamic (Runtime)     |
| Resolution Based On | Reference Type (A)    | Object Type (B)       |
| Behavior            | Method Hiding         | Method Overriding     |
| Output in Example   | "clss A & method m1"  | "clss b & method m4"  |
| Polymorphism        | No                    | Yes                   |

---

## Conclusion

**Static methods cannot be overridden because:**

- They are bound at compile time, not runtime
- They belong to the class, not to objects
- Method resolution is based on reference type, not object type
- This is called method hiding, not overriding

**Instance methods can be overridden because:**

- They are bound at runtime (dynamic binding)
- They belong to objects, not classes
- Method resolution is based on actual object type
- This enables true polymorphism in Java
