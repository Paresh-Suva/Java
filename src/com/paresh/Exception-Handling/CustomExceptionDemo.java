package com.paresh.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
class CustomException extends Exception {

	public CustomException(String Message) {
		super(Message);
	}
	
}

public class CustomExceptionDemo {
	
	public static void main(String[] args){
		Scanner Sc = new Scanner(System.in);
		
		
		try {
			System.out.print("Enter your Age: ");
			int Age = Sc.nextInt();
			AgeValidater(Age);
		} catch (InputMismatchException e){
			System.out.println("Please Enter Age In Numeric: ");
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		Sc.close();
	}
	
	public static void AgeValidater(int Age) throws CustomException {
		
		if (Age==0) {
			throw new CustomException("Age can never be ZERO");
		} else if (Age < 0) {
			throw new CustomException("Age can never be NEGATIVE");
		}else if(Age>0 && Age<18){
			throw new CustomException("Your not eligable for voting...");
		}else {
			throw new CustomException("You can VOTE...");
		}
	}
}
