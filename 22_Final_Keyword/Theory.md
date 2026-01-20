## FInal Keyword

1. it's a keyword in java .
2. it's used to restrict the user.
   (Final vs static ): Final is a restriction while static is a modifier.

Questions:

1. Can we give "final" to a class,method,variable?

   Ans: Yes we can give final to class,method,variable.

2. can we give "final" to static variable,static method,static class?

   Ans: Yes we can give final to static variable,static method but we can't give final to static class.

```java
   final int x=10; // constant variable
   x=30; // not possible,CTE

   final int b; // blank final variable( no compiler error + no runtime error)
    b=20; // initialized (final keyword allows initialization only once)
    b-30; // not possible,CTE

```

```java
public class A {
	static final  int x=20;
	x=30; // not possible,CTE

	static int y=20;
	static{
		 y=44;
	}
	public static void main(String[] args) {
	}
}

```

```java
public class A {
	static final int y=20;
	static{
		 y=44; // not possible,CTE
	}
	public static void main(String[] args) {
	}
}

```

### Final + variable Inheritance

```java

class A {
final int x = 10;
}

class B extends A {
void show() {
System.out.println(x); //  inherited
// x = 20; error
}
}
```

### Final + method Inheritance

```java

class A {
    final void m1() {
        System.out.println("A m1");
    }
}

class B extends A {
    // void m1() {} compile-time error
}

```

### final class + inheritance

```java
final class A {
    void m1() {}
}

// class B extends A {}  compile-time error

```
