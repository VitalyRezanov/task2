package com.netcracker.tasks.two.part.three;

public class Employee implements Measurable{
    private double salary;
    private String name;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }


}
