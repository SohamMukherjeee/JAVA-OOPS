# Map interface

- It is an interface in Java Collection Framework that represents a collection of (key-value) pairs.
- key-value is present in Entry<K,V> interface. And Entry interface is present in Map interface.
  - getKey(): returns the key corresponding to this entry.
  - getValue(): returns the value corresponding to this entry.
- It does not allow duplicate keys, but allows duplicate values.
- It consists of various classes that implement the Map interface, each with its own characteristics and use cases.
  - Hashtable `class` implements Map interface. (Legacy class, synchronized)
  - HashMap `class` implements Map interface.
  - TreeMap `class` implements Map interface.

## some important methods of Map interface

- `put(key,value)`: Adds a key-value pair to the map.
- `putAll(Map)`: Adds all key-value pairs from the specified map to the current map.
- `remove(object key)`: Removes the key-value pair associated with the specified key.
- `remove(object key, object value)`: Removes the key-value pair only if it is currently mapped to the specified value.
- `containsKey(object key)`: Checks if the map contains the specified key.
- `containsValue(object value)`: Checks if the map contains the specified value.
- `keySet()`: Returns a set view of the keys contained in the map.
- `values()`: Returns a collection view of the values contained in the map.
- `entrySet()`: Returns a `set interface` of the key-value pairs contained in the map.

## syntax of

```java

  Map<KeyType, ValueType> mapName = new HashMap<>(); // using HashMap class

```

## Hashing mechanism in Map interface

Hashing is a technique used to efficiently store and retrieve data in a map by using a hash function to compute an index (hash code) for each key.

### Steps involved in hashing mechanism:

1. suppose there's a 16 sized array to store key-value pairs.
2. Hash Table

   | Key | value | Hash Code | Index |
   | --- | ----- | --------- | ----- |
   | 101 | "A"   | 123456    | 0     |
   | 102 | "B"   | 789012    | 4     |
   | 103 | "C"   | 345678    | 2     |

3. Then it uses the hash code to determine the index in the array where the key-value pair should be stored.

### Collision Handling

When two different keys produce the same hash code (collision), the map needs to handle it to avoid data loss. Common collision resolution techniques include:

**Hash Chaining**: Each index in the array points to a linked list of key-value pairs that hash to the same index.

## Question
1. find the first duplicate in the array
2. find the freqency of each element in the array