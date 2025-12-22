package com.paresh.OOPs;

// Parent class
class Employee {
    public void work() {
        System.out.println("Employee is working...");
    }
}

// Child class 1
class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Manager is managing the team...");
    }
}

// Child class 2
class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Developer is writing code...");
    }
}

// Class demonstrating compile-time polymorphism
class Department {
    // Overloaded method to display department information
    public void showInfo(String deptName) {
        System.out.println("Department Name: " + deptName);
    }

    public void showInfo(String deptName, int empCount) {
        System.out.println("Department Name: " + deptName + ", Employee Count: " + empCount);
    }

    public void showInfo(String deptName, int empCount, String location) {
        System.out.println("Department Name: " + deptName + ", Employee Count: " + empCount + ", Location: " + location);
    }
}

// Main class
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Runtime polymorphism demonstration
        Employee employee;

        employee = new Manager();  // Parent reference pointing to Manager
        employee.work();           // Calls Manager's work method

        employee = new Developer(); // Parent reference pointing to Developer
        employee.work();            // Calls Developer's work method

        // Compile-time polymorphism demonstration
        Department department = new Department();
        department.showInfo("HR");                       // Calls showInfo(String)
        department.showInfo("Engineering", 50);          // Calls showInfo(String, int)
        department.showInfo("Sales", 30, "Mumbai");      // Calls showInfo(String, int, String)
    }
}
