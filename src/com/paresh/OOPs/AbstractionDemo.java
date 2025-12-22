package com.paresh.OOPs;

// com.paresh.Abstract class representing a generic College
abstract class College {
    private String collegeName;

    // Constructor to set college name
    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Concrete method
    public void displayCollegeName() {
        System.out.println("College Name: " + collegeName);
    }

    // com.paresh.Abstract method
    public abstract void conductExam();
}

// Subclass representing an Engineering College
class EngineeringCollege extends College {
    public EngineeringCollege(String collegeName) {
        super(collegeName);
    }

    @Override
    public void conductExam() {
        System.out.println("Conducting exams for engineering students...");
    }
}

// Subclass representing a Medical College
class MedicalCollege extends College {
    public MedicalCollege(String collegeName) {
        super(collegeName);
    }

    @Override
    public void conductExam() {
        System.out.println("Conducting exams for medical students...");
    }
}

// Subclass representing a Management College
class ManagementCollege extends College {
    public ManagementCollege(String collegeName) {
        super(collegeName);
    }

    @Override
    public void conductExam() {
        System.out.println("Conducting exams for management students...");
    }
}

// Main class
public class AbstractionDemo {
    public static void main(String[] args) {
        // Engineering College example
        College engineeringCollege = new EngineeringCollege("ABC Engineering College");
        engineeringCollege.displayCollegeName();
        engineeringCollege.conductExam();

        // Medical College example
        College medicalCollege = new MedicalCollege("XYZ Medical College");
        medicalCollege.displayCollegeName();
        medicalCollege.conductExam();

        // Management College example
        College managementCollege = new ManagementCollege("LMN Management College");
        managementCollege.displayCollegeName();
        managementCollege.conductExam();
    }
}
