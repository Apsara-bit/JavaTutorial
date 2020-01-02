class Parent{
	void display() {
		System.out.println("dispaaly parent class");
	}
}

class Vehicles extends Parent{
	void display1() {
		
System.out.println("display child class");
	}
	public static void main(String args[]) {
		Vehicles obj = new Vehicles();
		obj.display();
		obj.display1();
		//Parent obj1 = new Parent();
		//obj1.display();
	}
}

//Single Inheritance
//using properties and methods of parent class from child class by object of child class