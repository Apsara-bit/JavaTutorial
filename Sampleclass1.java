
 class Sampleclass2 {
	void sum(int a) {
		System.out.println(a);
	}
}
	class Sampleclass1 extends Sampleclass2{
	  
	   void sum(int b,int c) {
		   System.out.println(b+c);
	   }
		   public static void main(String args[]) {
			   Sampleclass1 obj= new Sampleclass1();
			   //obj.sum(10);
			   obj.sum(20,30);
		   }

}





//Method overriding
	//Same method name with different number of arguements in both parent and child class
	//it wont go to parent class unless and until the argument matched
	














//Method overriding
//same method name with same number of arguements or no arguement in both parent and child
