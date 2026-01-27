# HashSet

- **HashSet** is a class in Java that implements the Set interface, backed by a hash table (actually a HashMap instance). It is part of the Java Collections Framework and is used to store unique elements.

---

## The characteristics of Set Interface `Good to know`

1. Set does not allow duplicate elements.
2. Set does not guarantee any specific order of elements (except for LinkedHashSet and TreeSet).
3. Set allows null elements (except for TreeSet which does not allow null if it uses natural ordering, TreeSet only allows generic types that are comparable).
4. Set does not follow indexing to access elements.
5. Treeset internally uses Data structure called tree to store elements in sorted order

---

### Syntax of HashSet

```java
HashSet<GenericType> setName = new HashSet<>();
```

### Example

```java

HashSet<Integer> numbers = new HashSet<>();
numbers.add(10);
numbers.add(20);
numbers.add(null);
numbers.add(10); // Duplicate, will not be added
System.out.println(numbers); // Output: [null, 20, 10] (order may vary)
```

### Syntax of TreeSet

```java
TreeSet<GenericType> setName = new TreeSet<>();
```

### Example

```java
TreeSet<Integer> sortedNumbers = new TreeSet<>();
sortedNumbers.add(30);
sortedNumbers.add(10);
sortedNumbers.add(20);
System.out.println(sortedNumbers); // Output: [10, 20, 30]
```

## Priority Queue

## The characteristics of PriorityQueue `Good to know`

1. PriorityQueue does not allow null elements.
2. PriorityQueue orders its elements based on their natural ordering or by a specified comparator.
3. Priority Queue allows duplicate elements.
4. Priority Queue does not follow indexing to access elements.
