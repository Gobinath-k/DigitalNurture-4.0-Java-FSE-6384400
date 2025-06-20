class TaskNode{
    Task task;
    TaskNode next;
    TaskNode(Task task){
        this.task=task;
        next=null;
    }

}
public class TaskLinkedList {
    TaskNode head;

    public void addNode(Task  t){
        TaskNode newNode=new TaskNode(t);
        if(head==null){
            head=newNode;
        }
        else{
            TaskNode curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }

    }
    public  Task search(int id){
        TaskNode curr=head;
        while(curr!=null){
          if(curr.task.taskId==id){
            return curr.task;
          }
          curr=curr.next;
        }
        return null;
    }
    public void delete(int id){
        TaskNode curr=head;
        if(curr.task.taskId==id){
            
            head=curr.next;
            
            return;
        }
        while(curr.next!=null && curr.next.task.taskId!=id){
            curr=curr.next;
        }
        if(curr.next!=null){
            curr.next=curr.next.next;
        }
        else{
            System.out.println("Task  not Found");
        }
       
    }
    public void traverse(){
        TaskNode curr=head;
        while(curr!=null){
            System.out.println(curr.task);
            curr=curr.next;
        }
    }

}
