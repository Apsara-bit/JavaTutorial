
public class singleclass {
	void samemethod(int a,int b) {
		System.out.println(a+b);
	}
	void samemethod(String string,String string2,String string3) {
		System.out.println(string+string2+string3);
	}

	public static void main(String args[]) {
		singleclass obj=new singleclass();
		obj.samemethod(10, 20);
		obj.samemethod("ABC", "HI","HOW ARE U");

		}
	}



//Method overloading
//same method name with different arguments