public class Main {
    public static void main(String[] args) {
        EmployeeManager e=new EmployeeManager();
        e.addemployee(new Employee(1, "Alice", "Developer", 60000));
        e.addemployee(new Employee(2, "Bob", "Manager", 80000));
        e.addemployee(new Employee(3, "Charlie", "Tester", 50000));
        
        System.out.println("All employee details");
        e.print();
        
        System.out.println("search employee= 3");
         System.out.println( e.search(3));

        System.out.println("delete employee= 2");
        e.delete(2);

        System.out.println("After deleting the employee");
        e.print();


    }
}
