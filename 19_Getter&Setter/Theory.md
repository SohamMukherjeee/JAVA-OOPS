# Getter and Setter

## What are Getters and Setters?

- Methods to access and modify private fields
- Part of **Encapsulation** principle

## Getter (Accessor)

- Returns the value of a private field
- Naming: `get + FieldName` (camelCase)
- Example: `getName()`, `getAge()`

```java
public String getName() {
    return name;
}
```

## Setter (Mutator)

- Sets/updates the value of a private field
- Naming: `set + FieldName` (camelCase)
- Example: `setName()`, `setAge()`

```java
public void setName(String name) {
    this.name = name;
}
```

## Why Use Them?

- **Data Hiding**: Keep fields private
- **Validation**: Add checks before setting values
- **Read-Only/Write-Only**: Control access (getter only or setter only)
- **Flexibility**: Change internal implementation without affecting external code

## Example

```java
class Student {
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter with validation
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}
```

## Key Points

- Always use getters/setters for private fields
- Never make fields public in OOP
- Boolean fields use `is` instead of `get`: `isActive()`
- Return type = field type for getter
- Void return for setter
