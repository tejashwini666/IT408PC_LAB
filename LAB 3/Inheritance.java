class A {
	static int view;
	public static void display(){
		System.out.println("This is a static method from A");
		System.out.println(view);
	}
	public int show(){
		System.out.println("This is a non-static method");
		return view;
	}
}
class B extends A {
	static int neu;
	
	public static void display(){
		System.out.println(neu+view);
	}
	@Override
	public int show(){
		return neu+view;
	}
	public void pearl(){
		System.out.println("Iam B, Child of A");
	}
	public void displayA(){
		super.display();
	}
}
public class Inheritance{
	public static void main(String...args){
		B b = new B();
		b.display();
		System.out.println(b.show());
		b.pearl();
		b.displayA();
	}
}
