package com.paresh.Basics;

public class Strings {

    public static void main(String[] args) {
        // Sample String
        String str = "Hello, Paresh Suva";
        String str2 = "   Leading and trailing spaces   ";
        String str3 = "Hello";
        String str4 = "HELLO";

        // Length of a string
        System.out.println("Length of the string: " + str.length());

        // Character at a specific index
        System.out.println("Character at index 7: " + str.charAt(7));

        // Substring
        System.out.println("Substring (7 to 11): " + str.substring(7, 13));

        // Concatenation
        System.out.println("Concatenated string: " + str.concat(" Let's learn Java."));

        // Equality check
        System.out.println("Equals check (case-sensitive): " + str3.equals(str4));
        System.out.println("Equals check (ignore case): " + str3.equalsIgnoreCase(str4));

        // Compare strings
        System.out.println("Comparison result: " + str3.compareTo(str4));
        System.out.println("Comparison result (ignore case): " + str3.compareToIgnoreCase(str4));

        // Check if string contains a substring
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // Starts with and ends with
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with 'World!': " + str.endsWith("World!"));

        // Index of a character or substring
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // Is empty
        System.out.println("Is the string empty: " + str.isEmpty());

        // Trim spaces
        System.out.println("Trimmed string: '" + str2.trim() + "'");

        // Replace characters or substrings
        System.out.println("Replaced 'Paresh' with 'Amit': " + str.replace("Paresh", "Amit"));

        // Split string
        String[] words = str.split(" ");
        System.out.println("Split string into words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Convert to lower case and upper case
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());

        // Joining Strings
        String joinedString = String.join(" - ", "Hello", "Java", "World");
        System.out.println("Joined string: " + joinedString);

        // Value of (convert data type to string)
        int number = 25;
        String numberStr = String.valueOf(number);
        System.out.println("Converted integer to string: " + numberStr);

        // String to char array
        char[] charArray = str.toCharArray();
        System.out.println("Character array:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
