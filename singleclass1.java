
public class singleclass1 {
	void samemethod(int a,int b) {
		System.out.println(a+b);
	}
	void samemethod(String strings, String strings1, String strings2) {
		System.out.println(strings+strings1+strings2);
	}

	public static void main(String args[]) {
		singleclass obj=new singleclass();
		obj.samemethod(10,20);
		obj.samemethod("axnc","b","ckkxlkz");

		}
	}



//Method overloading
//same method name with different no of arguments