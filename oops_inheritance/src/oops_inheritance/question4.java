package oops_inheritance;

public class question4 {
	public static void main(String[] args) {
		Animal animal=new Animal();
		Bird bird=new Bird();
		System.out.println(animal.getParentClassName()+" "+animal.eat());
		System.out.println(animal.getParentClassName()+" "+animal.sleep());
		System.out.println(bird.getChildClassName()+" "+bird.eat());
		System.out.println(bird.getChildClassName()+" "+bird.sleep());
		System.out.println(bird.getChildClassName()+" "+bird.fly());
	}
}
class Animal{
	String getParentClassName() {
		return "Animal";
	}
	String eat() {
		return("is Eating.");
	}
	String sleep() {
		return("is Sleping.");
	}
}
class Bird extends Animal{
	String getChildClassName() {
		return "Bird";
	}
	String fly() {
		return("is Flying.");
	}
}
