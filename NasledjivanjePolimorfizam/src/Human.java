
public class Human extends Animal {
//polimorfizam - overloading
	public void eat(String typeOfFood) {
		System.out.println("This human is also eating "+ typeOfFood);
	}
	 
	public void move() {
		System.out.println("This human is moving using 2 legs.");
	}
}
