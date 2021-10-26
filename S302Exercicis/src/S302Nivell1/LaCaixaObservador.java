package S302Nivell1;

public class LaCaixaObservador extends Observador{

	private double valorAccion=2.50;
	
	public LaCaixaObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {
		if(sujeto.getEstado()<valorAccion) {
			System.out.println("las acciones de CaixaBank han bajado: " + (valorAccion-sujeto.getEstado())+" puntos");
		}else if(sujeto.getEstado()>valorAccion){
			System.out.println("las acciones de CaixaBank han subido: " + (sujeto.getEstado()-valorAccion)+" puntos");
		}else {
			System.out.println("las acciones de CaixaBank no han cambiado");
		}
		
		
	}

}
