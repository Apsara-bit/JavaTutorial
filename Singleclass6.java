
public class Singleclass6 {
	Singleclass6(int a, int b){
		System.out.println(a+b);
	}
	Singleclass6(int a, int b, int c){
		this(1,2);
		System.out.println(a+b+c);
	}

	Singleclass6(int a){
		this(10,20,30);
		System.out.println(a);
	}
	public static void main(String args[]) {
		Singleclass6 obj=new Singleclass6(50);
	}
}

//this function
//call constructor from another constructor
