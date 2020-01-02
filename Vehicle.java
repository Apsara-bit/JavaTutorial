
class Vehicle1 {
	Vehicle1(int a) {
		System.out.println(a);
	}
}
	class Vehicle extends Vehicle1{
		Vehicle() {
	      super(10);
		System.out.println("child");
}
		public static void main(String args[]) {
			Vehicle b = new Vehicle();
			
			}
	}
	
	
	//Super Function
	//call parent class constructor from child class constructor when it should have an arg./;....;l