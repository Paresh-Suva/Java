package com.paresh.Threads;

class WhiteBoard {
	
	String Text;
	int numberOfStudent = 0;
	int count = 0;
	
	public void attendance() {
		numberOfStudent++;
	}
	
	synchronized public void write(String text) {
		
		System.out.println("Teacher Is Writing..."+Text);
		while (count!=0) {
			
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		Text = text;
		count = numberOfStudent;
		notifyAll();
	}
	
	synchronized public String read(){
		
		while (count==0) {
			
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
		String T = Text;
		count--;
		if (count==0) {
			notify();
		}
		
		return T;
	}

}

class Teacher extends Thread {

	WhiteBoard whiteBoard;
	String Notes[] = {"First Line...","Second Line...","Done"};

	public Teacher(WhiteBoard whiteBoard) {
		this.whiteBoard = whiteBoard;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < Notes.length; i++) {
			whiteBoard.write(Notes[i]);
		}
	}
}

class Student extends Thread {

	WhiteBoard whiteBoard;
	String Name;

	public Student(String Name, WhiteBoard whiteBoard) {
		this.whiteBoard = whiteBoard;
		this.Name = Name;
	}
	
	@Override
	public void run() {
		
		String Text;
		whiteBoard.attendance();
		
		do {
			Text = whiteBoard.read();
			System.out.println(Name + " Reading "+ Text);
			System.out.flush();
		} while (!Text.equals("Done"));
		
	}
}

public class StudentTeacher {
	public static void main(String[] args) {

		WhiteBoard whiteBoard = new WhiteBoard();
		
		Teacher teacher = new Teacher(whiteBoard);
		
		Student student1 = new Student("Paresh", whiteBoard);
		Student student2 = new Student("Mark", whiteBoard);
		Student student3 = new Student("Mukesh", whiteBoard);
		Student student4 = new Student("James", whiteBoard);
		Student student5 = new Student("Newton", whiteBoard);
		
		teacher.start();
		student1.start();
		student2.start();
		student3.start();
		student4.start();
		student5	.start();

	}
}
