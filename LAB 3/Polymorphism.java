class Animal{
	public void makeSound(){
		System.out.println("Animal making sound");
	}
}
class Dog extends Animal{
	@Override
	public void makeSound(){
		System.out.println("Barking...");
		super.makeSound();
	}
}
public class Polymorphism{
	public static void main(String... args){
		Dog d = new Dog();
		d.makeSound();
	}
}
