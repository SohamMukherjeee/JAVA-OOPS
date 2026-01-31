# Queue in java

- Queue is an interface in Java's Collection Framework that represents a collection designed for holding elements prior to processing. It follows the First-In-First-Out (FIFO) principle, meaning that the element added first will be the first one to be removed.

## We can implement Queue using the following classes:

- LinkedList
  syntax:

  ```java
    Queue<Type> queueName = new LinkedList<>();
  ```

- PriorityQueue
  syntax:

  ```java
    Queue<Type> queueName = new PriorityQueue<>();
  ```

- Deque (Double Ended Queue)
  syntax:

  ```java
    Deque<Type> dequeName = new ArrayDeque<>();
  ```

- ArrayDeque
  syntax:

  ```java
    Deque<Type> dequeName = new ArrayDeque<>();
  ```

-

##

```java
 class CustomQueue{
    int size;
    int[] queue;
    int front;
    int rear;

    customQueue(int size){
        this.size=size;
        queue=new int[size];
        front=-1;
        rear=-1;
    }

    void enqueue(int data){
        if(rear==size-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear]=data;
        if(front==-1){
            front=0;
        }
    }

    void dequeue(){
        if(front==-1 || front>rear){
            System.out.println("Queue is empty");
            return;
        }
        front++;
    }
 
 }
```
