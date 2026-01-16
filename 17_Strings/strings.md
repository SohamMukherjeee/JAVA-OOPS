### String

1. class & object
2. group/collection of characters
3. presents in "lang"(default) package
4. it's a final class, we can't create subclass
5. String extends Objects,String implements Comparable and serializable
6. String is immutable ( if it's created & can't modified later )
7. toString(),equals(object o),hasCode()
8. String literal & new keyword
9. String constant pool Area (special memory area in heap memory)
10. Syntax:

```java
String str="hello"; //string literal
String str=new String("hello"); //new keyword
```

11.

```java
    String s1="hello";
    String s2="hello";
    System.out.println(s1==s2); //true (both refers to same object in SCP)

```

12.

```java
    String s1=new String("hello");
    String s2=new String("hello");
    System.out.println(s1==s2); //false (both refers to different objects in heap memory)

```

13. String methods:

- length()
- charAt(int index)
- toUpperCase()
- toLowerCase()
- toCharArray()
- equals(Object o)
- split(String regex)
- substring(int beginIndex)
- substring(int beginIndex, int endIndex)
- contains(CharSequence s)
- concat(String str)
- trim()
- equalsIgnoreCase(String anotherString)
- compareTo(String anotherString)
- replace(char oldChar, char newChar)
- indexOf(int ch)
- lastIndexOf(int ch)
- startsWith(String prefix)
- endsWith(String suffix)
- valueOf(dataType value)
- format(String format, Object... args)
- join(CharSequence delimiter, CharSequence... elements)
- isEmpty()

---

# StringBuilder

- mutable class
- present in "java.lang" package
  syntax:

```java
StringBuilder sb=new StringBuilder("hello");
sb.append(" world");
System.out.println(sb); //hello world
```

- stringbuffer capacity increases automatically when we append more data
- default capacity is 16
- when we create stringbuffer with string then capacity is (string length + 16)

  example

1. ```java
   StringBuilder sb=new StringBuilder();
   System.out.println(sb.capacity()); //16
   ```
2. ```java
   StringBuilder sb=new StringBuilder("hello");
   System.out.println(sb.capacity()); //21 (5+16)
   ```

3. ```java
   StringBuilder sb=new StringBuilder();
   sb.append("abcdefghijklmnopqrs");
   System.out.println(sb.capacity()); //34 (16*2+2)
   ```
4. ```java
   StringBuilder sb=new StringBuilder("hello");
   sb.append("abcdefghijklmnopqrs");
   System.out.println(sb.capacity()); //44(21*2+2)
   ```

5. formula to calculate new capacity:
   new capacity = (old capacity \* 2) + 2
