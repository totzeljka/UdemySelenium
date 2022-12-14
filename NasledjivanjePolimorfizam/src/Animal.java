
public abstract class Animal {

	public void move() {
		System.out.println("This animal is moving using 4 legs.");
	}
	
	public void eat () {
		System.out.println("This animal is eating food.");

	}
	
	public void sleep() {
		
		System.out.println("This animal is sleeping at night.");
	}
	
	
	//u aprstraktnoj metodi nemamo objekt , ako je metoda abstraktna i klasa mora biti abstraktna, ako ne prevedem klasu u abstract javlja gresku!
	//koristi se samo kao definicija da ima zvuk ali ce svaka podklasa tj child klasa imati svoje vrednosti, prosto trazice da da se implementira
	public abstract void makesound();
	
}
