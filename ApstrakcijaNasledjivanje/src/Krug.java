
class Krug extends Povrs{
	
	//klasa Krug izvedena iz klase Provs <--nasledjivanje

	
	    private double r;
	    
	    //konstruktor:
	    public Krug(double r) {
	            this.r = r;
	        }
	    
	    
	    // implementacija apstraktnog polimorfnog metoda za racunanje obima kruga (P = 2*r*Pi); overwrite
	    public double obim(){
	        return 2 * r * Math.PI;
	    }
	    
	    
	    // implementacija apstraktnog polimorfnog metoda za racunanje povrsine kruga (P = r^2*Pi); overwrite
	    public double povrsina(){
	        return r * r * Math.PI;
	    }
	}
	 

