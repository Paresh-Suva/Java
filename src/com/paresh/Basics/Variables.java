package com.paresh.Basics;

public class Variables {
 // Instance variable
 int instanceVar = 10;
 
 // Static variable
 static int staticVar = 20;

 public void displayInstanceVariable() {
     System.out.println("Instance Variable: " + instanceVar);
 }

 public static void displayStaticVariable() {
     System.out.println("Static Variable: " + staticVar);
 }

 public static void main(String[] args) {
     // Local variable
     int localVar = 30;
     System.out.println("Local Variable: " + localVar);

     Variables obj = new Variables();
     obj.displayInstanceVariable();
     
     displayStaticVariable();

     // Final variable (constant)
     final int finalVar = 40;
     System.out.println("Final Variable: " + finalVar);
 }
}
