package S302Nivell1;

public class BBVAObservador extends Observador{

	private double valorAccion=5.60;
	
	public BBVAObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {
		if(sujeto.getEstado()<valorAccion) {
			System.out.println("las acciones de BBVA han bajado: " + (valorAccion-sujeto.getEstado())+" puntos");
		}else if(sujeto.getEstado()>valorAccion){
			System.out.println("las acciones de BBVA han subido: " + (sujeto.getEstado()-valorAccion)+" puntos");
		}else {
			System.out.println("las acciones de BBVA no han cambiado");
		}
	}

}
