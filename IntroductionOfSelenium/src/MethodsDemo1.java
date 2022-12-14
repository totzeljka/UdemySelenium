
public class MethodsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pravim objekat za klasu:

		MethodsDemo1 d = new MethodsDemo1();

		String name = getData(); // sa static dole ne moram pisati objekt, bez static dole mora da se dodeli
									// objhekat : String name = d.getData();

		System.out.println(name);

		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();

	}

	// u ovom bloku pisemo metod koji se nece izvrsavati ali koji kad pozovemo gore
	// hoce, kristi se u slucaju kad jedan isti kod zelimo da iskoristimo puno puta,
	// u gornjem bloku ne mogu da se definisu metodi

	public static String getData() // ako ovo napisem kao public static String onda gore ne moram da kreiram object
									// tako mi sve metode pripajaju klasi a ne objektu pisem sting name= getData, ne
									// treba mi d.getData()
	{
		System.out.println("hello world");
		return "Rahul Shety"; // ?????a je return?
	}
}
