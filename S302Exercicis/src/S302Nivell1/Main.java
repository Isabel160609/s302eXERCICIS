package S302Nivell1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject subject =new Subject();
		
		new LaCaixaObservador(subject);
		new BBVAObservador(subject);
		
		
		subject.setEstado(5);
		subject.setEstado(2);
	}

}
