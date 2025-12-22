            //Convert Uppercase To Lowercase And Vise-Versa
package com.paresh.String;
import java.util.*;
public class StringBuilderToggle {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Your String Here: ");
        StringBuilder Str = new StringBuilder(Sc.nextLine());//Taking Input

        for(int i = 0; i<Str.length(); i++){

            int ASCII = (int)Str.charAt(i);//Converting Ch To Int(ASCII) Value

            if (ASCII > 64 && ASCII < 97) {//Character Is Capital
                ASCII += 32;//Addinig 32 To Increase Their ASCII Value 
                char Set = (char)ASCII;//Converting Int To Ch
                Str.setCharAt(i, Set);//Replacing Capital To Small
            }
            else if(ASCII >=97 && ASCII <=122){//Character Is Small
                ASCII -= 32;//Substracting 32 To Decrease Their ASCII Value
                char Set = (char)ASCII;//Converting Int To Ch
                Str.setCharAt(i, Set);//Replacing Capital To Small
            }
            continue;//Otherwise Skip Iteration
        }
        System.out.println(Str);//Printing String
        Sc.close();//Closing Scanner

    }
}
