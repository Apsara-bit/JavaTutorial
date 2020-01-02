
class Upcastingdemo1 {
	void parentclassmethod1() {
		System.out.println("parent class");
	}
}

	  class Upcastingdemo{
     void childclassmethod2() {
    	 System.out.println("child class");
     }
     
     public static void main(String args[]) {
    	 Upcastingdemo obj=new Upcastingdemo();
    	 Upcastingdemo1 obj1=new Upcastingdemo1();
    	 obj.childclassmethod2();
    	 //System.out.println();
     }
}

