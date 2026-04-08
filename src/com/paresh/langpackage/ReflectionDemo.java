package com.paresh.langpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class MyClass {

    public int c = 10;
    protected int b = 10;
    int d = 10;
    private final int a = 10;

    public MyClass() {
    }

    public MyClass(int e, int f) {
    }

    public void display() {
    }

    public int show(int g, int h) {
        return 0;
    }

}

public class ReflectionDemo {
    static void main(String[] args) {
        Class c = MyClass.class;
        System.out.println(c.getName() + "\n");

        System.out.println("All fields: ");
        Field[] field = c.getDeclaredFields();
        for (Field f : field) {
            System.out.println(f);
        }

        System.out.println("\nAll constructors: ");
        Constructor[] constructor = c.getConstructors();
        for (Constructor con : constructor) {
            System.out.println(con);
        }

        System.out.println("\nAll Methods: ");
        Method[] method = c.getMethods();
        for (Method meth : method) {
            System.out.println(meth);
        }

        System.out.println("\nAll Parameter: ");
        Parameter[] parameter = method[0].getParameters();
        for (Parameter param : parameter) {
            //System.out.println(param);
            System.out.println(param);
        }

    }
}
