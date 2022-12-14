
public class CallingMain {

	public static void main(String[] args) {

		
		Dog dogObj =new Dog();
		Human humanObj= new Human();
		
		
		
		dogObj.eat();
		dogObj.move();
		dogObj.sleep();
		
		humanObj.eat();
		humanObj.eat("meat");
		humanObj.eat("vegetables");
		humanObj.move();
		humanObj.sleep();
		
	}

}
