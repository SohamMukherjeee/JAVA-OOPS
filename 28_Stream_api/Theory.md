# Stream api in Java 8

stream api is a datatype in java which is used to process collections of objects. It provides a functional programming approach to processing data. Stream api allows us to perform operations on collections of data in a declarative way, without having to write explicit loops or iterators.

Stream api is a pipeline of operations that can be performed on a collection of data.
It consists of three main components:

- source (Stream creation) : Arrays.stream(), CollectionReference.stream()
- intermediate operation : filter(), map(), sorted(), distinct(), limit(), skip()
- terminal operations : toList(), toSet(), forEach(), count()

## syntax of stream api

```java
CollectionReference.stream()
    .intermediateOperation1()
    .intermediateOperation2()
    ...
    .terminalOperation();
```

## Example of stream api

```java

List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
List<String> filteredNames = names.stream()
    .filter(name -> name.startsWith("J"))
    .collect(Collectors.toList());

```
