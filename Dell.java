interface computer{
	abstract void application();
	
}
interface laptop extends computer{
	abstract void application1();

}
interface desktop extends computer{
	abstract void application2();

}


public class Dell implements laptop,desktop {

	public void application() {
		System.out.println("used to work in excel");
		
	}
	
	public void application1() {
		System.out.println("used to work in fb");

}
	
	public void application2() {
		System.out.println("used to work in gmail");

		
	}
	public static void main(String args[]) {
		Dell obj = new Dell();
		obj.application();
		obj.application1();
		obj.application2();
	}
	}


//Hybrid Interface
//1 parent interface computer
//1st child interface laptop inherits parent
//2nd child interface desktop also inherits parent
//child class for the interfaces of parent and child
//Fetching data of parent and child interfaces by using child class object
//implements should have public keyword
