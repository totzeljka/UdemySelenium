

		//klasa pravougaonik izvedena iz klase Povrs  <--nasledjivanje povrs je parent klasa a Pravougaonik je shild koja je nasledila sve parametre parent klase

	class Pravougaonik extends Povrs{
	    private double a;
	    private double b;
	    
	  //konstruktor
	    public Pravougaonik(double a, double b) {
	        // super();
	        this.a = a;
	        this.b = b;
	    }
	    // implementacija apstraktnog polimorfnog metoda za racunanje obima pravougaonika (P = 2*a + 2*b)
	     public double obim(){
	        return 2*a+2*b;
	    }
	    // implementacija apstraktnog polimorfnog metoda za racunanje povrsine pravougaonika (P = a*b)
	     public double povrsina(){
	        return a*b;
	    }
	}
