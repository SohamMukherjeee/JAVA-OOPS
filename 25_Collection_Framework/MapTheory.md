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

## syntax

```java

```
