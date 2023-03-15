package StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class BankManager implements Employee {

    private final int id;
    private final String name;
    private final double salary;

    public BankManager(int id,String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    List<Employee> employees = new ArrayList<>();
    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }
    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }
    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }
    @Override
    public int getId()  {
        return id;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getSalary() {
        return salary;
    }
    @Override
    public void print() {
        System.out.println("=============Bank Manager=============");
        System.out.println("Id = "+getId());
        System.out.println("Name = "+getName());
        System.out.println("Salary = "+getSalary());
        System.out.println("==========================");

        for (Employee employee : employees) {
            employee.print();
        }
    }
}
