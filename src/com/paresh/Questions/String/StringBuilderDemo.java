package com.paresh.String;
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder Str = new StringBuilder("Hello ");
        
        //It Is Used To Connect To String Together OR Adding Two String 
        Str.append("Paresh");
        System.out.println(Str);//Hello Paresh

        //Replace Any Character In String
        Str.setCharAt(2, 'y');
        System.out.println(Str);//Heylo Paresh

        //Add Character In Existing String
        Str.insert(3,'l');
        System.out.println(Str);//Heyllo Paresh

        //Delete Character From Existing String
        Str.delete(2,3);
        System.out.println(Str);//Hello Paresh

        //Reverse String 
        StringBuilder Str1 = new StringBuilder("JAVA");
        Str1.reverse();
        System.out.println(Str1);//AVAJ

        

    }
}
