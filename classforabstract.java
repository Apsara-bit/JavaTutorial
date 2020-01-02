
abstract class classforabstract1 {                                                           //parent class
	
	abstract void method1();                                                          //abstract methods declared inside parent class
	abstract void method2();
}
	
class classforabstract extends classforabstract1{                                     //child class extends parent class - so we can share prop and methods variables
	void show() {
		System.out.println("this is normal method of child class classforabstract");
	}
		
	void method1(){
		System.out.println("this is the first abstarct method1 of parent class");
	
	}
	void method2() {
		System.out.println("this is second abstarct method of parent class");
	
	}

	
	
	public static void main(String args[]) {
		
		
		
		classforabstract obj=new classforabstract();
		obj.method1();
		obj.method2();
		obj.show();
		
	}

}


//cannot create an object for the child class when it is an abstract class

//Abstract methods in a abstract 

