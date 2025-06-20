package main;

import repository.CustomerRepository;
import repository.CustomerRepositoryImpl;
import service.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerRepository cr=new CustomerRepositoryImpl();
        CustomerService cs=new CustomerService(cr);
        cs.getcustomer(1);
        cs.getcustomer(2);
    }
    
}
