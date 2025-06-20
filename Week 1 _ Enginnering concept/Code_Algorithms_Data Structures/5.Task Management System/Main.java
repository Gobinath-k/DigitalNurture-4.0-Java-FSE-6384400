public class Main {
    public static void main(String[] args) {
        TaskLinkedList t=new TaskLinkedList();
         t.addNode(new Task(1, "Design UI", "Pending"));
          t.addNode(new Task(2, "Develop Backend", "In Progress"));
          t.addNode(new Task(3, "Testing", "Pending"));

        System.out.println("All tasks");
        t.traverse();

        System.out.println("serach task id=2");
        System.out.println(t.search(2));

        System.out.println("delete the task id=3");
        t.delete(3);
        System.out.println("After Deleting");
        t.traverse();
    }
}
