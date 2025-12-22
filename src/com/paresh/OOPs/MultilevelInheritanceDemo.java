             //MULTI LEVEL INHERITANCE//
package com.paresh.OOPs;		
	 
//CLASS 1 OR BASE Class		 
class grandParent{
	//METHOD OF CLASS 1
	void Method(){
		System.out.println("This Is Grand-Parent Class Method: ");
	}
}

//CLASS 2 INHERITE THE PROPERTY OF CLASS 1
class parent extends grandParent{
	//METHOD OF CLASS 2
	void Method1(){
		Method();
		System.out.println("This Is Parent Class Method:");
	}
}

//CLASS 3 INHERITE THE PROPERTY OF CLASS 2
class child extends parent{
	//METHOD OF CLASS 3
	void Method2(){
		Method1();
		System.out.println("This Is Child Class Method:");
	}
}
class MultilevelInheritanceDemo{
	public static void main(String[] args){
		child C1 = new child();
		C1.Method2();
	}
}
