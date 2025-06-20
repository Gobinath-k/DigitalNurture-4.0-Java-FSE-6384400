public class EmployeeManager {
    Employee employee[]=new Employee[100];
    int c=0;

    public void addemployee(Employee e){
        if(c<employee.length){
            employee[c]=e;
            c++;
        }
        else{
            System.out.println("List is full");
        }
    }
    public void delete(int id){
        for(int i=0;i<c;i++){
            if(employee[i].employeeId==id){
                for(int j=i;j<c-1;j++){
                    employee[j]=employee[j+1];
                }
                employee[c-1]=null;
                c--;
                System.out.println("employee deleted");
                return;

            }
        }
        System.out.println("employee not found");
    }
    public Employee search(int id){
        for(int i=0;i<c;i++){
            if(employee[i].employeeId==id){
                return employee[i];
            }

        }
        return null;
    }
    public void print(){
        for(int i=0;i<c;i++){
            System.out.println(employee[i]);
        }
    }

}
