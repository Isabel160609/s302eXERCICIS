package S302Nivell1;
import java.util.*;

public class Subject {
	
	private List<Observador> observadors= new ArrayList<Observador>();
	private int estado;
	
	public int getEstado() {
		return estado;
		
	}
	public void setEstado(int estado) {
		this.estado=estado;
		notificarTodosObservadores();
	}
	public void agregar(Observador observador) {
		observadors.add(observador);
	}

	public void notificarTodosObservadores() {
		observadors.forEach(x->x.actualizar());
	}
}
