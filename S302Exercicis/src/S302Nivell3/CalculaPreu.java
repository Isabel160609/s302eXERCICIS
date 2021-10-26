package S302Nivell3;

public class CalculaPreu {
	double preu;
	String moneda;
	
	public CalculaPreu(String moneda,double preu){
		this.preu=preu;
		this.moneda=moneda;
	}
	
	public double preuCanvi() {
		double nouPreu=0;
		if(moneda.equalsIgnoreCase("dolar")) {
			nouPreu=preu*1.16;
		}else if(moneda.equalsIgnoreCase("libra")) {
			nouPreu=preu*0.84;
		}else if(moneda.equalsIgnoreCase("yen")) {
			nouPreu=preu*132.27;
		}else if(moneda.equalsIgnoreCase("€")) {
			nouPreu=preu;
		}
		return nouPreu;
	}

}
