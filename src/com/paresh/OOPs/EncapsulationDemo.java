package com.paresh.OOPs;

import java.util.Scanner;

class Student {
    private String Name;
    private String Email;
    private int Number;

    public void setDetails(String Name, String Email, int Number) {
        this.Name = Name;
        this.Email = Email;
        this.Number = Number;
    }

    public void getDetails() {
        System.out.println("Student's Number: " + Number);
        System.out.println("Student's Name: " + Name);
        System.out.println("Student's Email: " + Email);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
    	Student S1 = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Number: ");
        int Number = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String Name = scanner.nextLine();

        System.out.print("Enter Student Email: ");
        String Email = scanner.nextLine();

        S1.setDetails(Name, Email, Number);
        S1.getDetails();

        scanner.close();
    }
}
