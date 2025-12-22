package com.paresh.Constructors;

class Student{    
    int id;    
    String name;  
    
    // Constructor to initialize integer and string    
    Student(int i,String n){    // Parameterized Constructor
    id = i;    
    name = n;    
    }    
    
    // Constructor to initialize another object    
    Student(Student s){    
    id = s.id;    
    name =s.name;    
    }    
    void display(){System.out.println(id+" "+name);}    
}

public class CopyConstructorDemo{
	public static void main(String[] args) {
		Student s1 = new Student(01,"Paresh");    
	    Student s2 = new Student(s1);    
	    s1.display();    
	    s2.display(); 
	}

}   