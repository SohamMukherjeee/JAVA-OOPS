# Stack in java

- Stack is a class in Java's Collection Framework that represents a last-in-first-out (LIFO) stack of objects. It extends the `Vector` class and provides methods to push, pop, and peek elements.

`List<I> -> vector<Class> -> stack`

## some important methods of Stack class

- `push(E item)`: Pushes an item onto the top of the stack.
- `pop()`: Removes and returns the item at the top of the stack.
- `peek()`: Returns the item at the top of the stack without removing it.
- `isEmpty()`: Checks if the stack is empty.
- stack does not have a method to directly access elements by index, as it is designed to operate in a LIFO manner.

### Difference between stack and Callstack

| Stack (Java Collection)            | Call Stack (Program Execution)        |
| ---------------------------------- | ------------------------------------- |
| Data structure for storing objects | Mechanism for managing function calls |

## Syntax

```java
Stack<Type> stackName = new Stack<>();
```
