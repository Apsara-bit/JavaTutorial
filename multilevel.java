interface interface1{
	abstract void methodabstract1();
}
interface interface2{
	abstract void methodabstract3();

}
interface interface3{
	abstract void methodabstract2();
}
public class multilevel implements interface1, interface2,interface3 {
 public void methodabstract1(){
	System.out.println("definotion of method abstarct1");
}
  public void methodabstract3(){
		System.out.println("definotion of method abstarct1");

}
 public void methodabstract2(){
		System.out.println("definotion of method abstarct2");

 }
 public static void main(String args[]) {
	 multilevel obj=new multilevel();
	 obj.methodabstract1();
	 obj.methodabstract2();
 }
}




//Multiple inheritance
//2 or more parent interfaces
//1child class