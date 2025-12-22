package com.paresh.String;

import java.util.Scanner;

public class StringBuilderReverseWord {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("NOTE: Case Sensitive...");
        System.out.print("Enter Your First String Here: ");//Taking Input
        String Original = Sc.nextLine();//Storing input
        Sc.close();//Sc(Scanner) Close

       
        String Answer = "";//Creating Answer(Empty) String 
        StringBuilder Temporary  = new StringBuilder();//Creating Temporary StringBuilder 

        for(int i = 0; i<Original.length(); i++){//Upto String Length

            char Ch = Original.charAt(i);//Storing Character present At i th Index into Ch

            if (Ch != ' ') {//Ch != Space then
                Temporary .append(Ch);//Add into Temporary StringBuilder
            }

            else{// Ch == Space then

                Temporary.reverse();//Reversing Word Which Is Stored In Temporary StringBuilder 
                Answer += Temporary ;//Adding Reverse String Into Answer
                Answer += " ";//Adding 1 Space In Answer String
                Temporary  = new StringBuilder("");//Empty Temporary StringBuilder
            }
        }

        Temporary .reverse();//Reversing Last Word 
        Answer += Temporary ;//Adding Las Reverrsed Word Into Answer
        System.out.println(Answer);//Printing Final Answer

    }
}