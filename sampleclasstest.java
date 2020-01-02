class sampleclassparent{

	final int a=100; int b=100;

        void sum() {
		int c=a+b;
		System.out.println(c);
	}
	     void mul() {
	     int d=a*b;
	     System.out.println(d);
	}
 }
 class sampleclasstest extends sampleclassparent{
		void show() {
			System.out.println("show");
		}
		public static void main(String args[]) {
			sampleclasstest object=new sampleclasstest();
			object.sum();
			object.mul();
			object.show();
		
	}
		
	}
 
 
 //single inheritance