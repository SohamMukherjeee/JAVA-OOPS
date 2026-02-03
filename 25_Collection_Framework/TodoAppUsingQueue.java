import java.util.Queue;

public class TodoAppUsingQueue {
    Queue<String> todoQue;
    public TodoAppUsingQueue(Queue<String> todoQue) {
        this.todoQue = todoQue;
    }
     public void addTask(String task){
        todoQue.add(task);
     }
     public void getNextTask(){
        String task=todoQue.peek();
        if(task!=null){
            System.out.println("Next Task: "+task);
     }

     public void completeTask(){
      
     }
}
