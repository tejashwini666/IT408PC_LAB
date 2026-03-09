abstract class Animal1{
	abstract void sound();
}
class Abstraction{
	public static void main(String...args){
		Lion l = new Lion();
		l.sound();
		Tiger t = new Tiger();
		t.sound();
	}
}
class Lion extends Animal1{
	public void sound(){
		System.out.println("Lion Roaring...");
	}
}
class Tiger extends Animal1{
	public void sound(){
		System.out.println("Tiger Roaring...");
	}
}
