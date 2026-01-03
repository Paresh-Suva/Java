package com.paresh.CollectionFreamwork.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        // Syntax:
        Map<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("Jimmy", 21); // name is key, and age is value;
        map.put("Robin", 22);
        map.put("Lucas", 18);
        map.put("John", 30);
        map.put("Manish", 25);

        // Getting value of key from the hashmap;
        System.out.println("Age: "+map.get("Jimmy")); // Answer: 21
        System.out.println("Age: "+map.get("jocky")); // Answer: null

        // Update:
        // if Exist: Override
        // else: create/insert new one
        map.put("Jimmy", 19);
        System.out.println("Age: "+map.get("Jimmy")); // Answer: 19

        // Remove:
        System.out.println("Age: "+map.remove("Manish")); // Answer: 25
        System.out.println("Age: "+map.get("Manish")); // Answer: null

        // Checking if key is exist in map ??
        System.out.println("Is exist: "+ map.containsKey("John")); // Answer: true
        System.out.println("Is exist: "+ map.containsKey("Manish")); // Answer: false

        // If not exist then enter it otherwise leave it
        map.putIfAbsent("Rishi", 20);
        System.out.println("Age: "+map.get("Rishi"));

        // Get all keys
        System.out.println(map.keySet());

        // Get all values
        System.out.println(map.values());

        System.out.println(map.entrySet());
    }
}
