package main;

import controller.StudentController;
import model.Student;
import view.StudentView;

public class Main {
    public static void main(String[] args) {

        Student s=new Student(1,"JOHN","A");
        
        StudentView sv=new StudentView();

        StudentController sc=new StudentController(s,sv);
       
        sc.updateview();
        
        sc.setname("Don");
        sc.setgrade("A+");
        System.out.println("After Updating");
        sc.updateview();
    }
}
