
  class Staticdemo1 {
	 static void display(String sname) {
		 System.out.println(sname);
		System.out.println("method 1 in static of staticdemo parent class");
	}
}
	
	 class Staticdemo extends Staticdemo1{
		 static void display(String sname1) {
			 System.out.println(sname1);
			System.out.println("method 2 in static of staticdemo1 child class");

		}
		public static void main(String args[]) {
			//staticdemo obj=new Staticdemo();
			//obj.display();
			//obj.display();
			Staticdemo1.display("hi");
			Staticdemo1.display("Aps");
		}
		
	}


//static method overriding not possible since static is in class level 