class Parents1{
	void display() {
		System.out.println("display parent class");
	}
}
	
	class Child1 extends Parents1{
		void display1() {
			System.out.println("first child class");
		}
}

class Vehiclesss extends Parents1{
	void display2() {
		
System.out.println("second child class");
	}
	public static void main(String args[]) {
		Vehiclesss obj = new Vehiclesss();
		obj.display();
		//obj.display1();
		obj.display2();

		//Parent obj1 = new Parent();
		//obj1.display();
	}
}

//Hierarcial Inheritance
//1 parent -two or more child
//using properties and methods of parent class from child1  and class2 
//no interconnection between child