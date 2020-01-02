class Parent1{
	void display() {
		System.out.println("display parent class");
	}
}
	
	class Child extends Parent1{
		void display1() {
			System.out.println("display child class");
		}
}

class Vehicless extends Child{
	void display2() {
		
System.out.println("display child of child class");
	}
	public static void main(String args[]) {
		Vehicless obj = new Vehicless();
		obj.display();
		obj.display1();
		obj.display2();

		//Parent obj1 = new Parent();
		//obj1.display();
	}
}

//Multilevel Inheritance
//1 parent -child - child of child
//using properties and methods of parent class from child class by object of child class