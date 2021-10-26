package S302Nivell2;

public class Main {

	public static void main(String[] args) {

		

		
		int opcionPago =Teclado.leerInt("Como desea pagar? marque:"
																	+ " \n 1-PayPal "
																	+ "\n 2-Tarjeta de Credito "
																	+ "\n 3- Número de Cuenta");

		SolicitarPago solicitudDEPago = new SolicitarPago();
		
		TipoPago pagoEfectuado = new TipoPago(opcionPago);
		// pasar solicitar pago a operacion por defecto
		solicitudDEPago.efectuado(pagoEfectuado);

		SolicitarPago solicitudDEPago1 = new SolicitarPago();
		// pasar la interface para implementar nuestra operacion
		
		solicitudDEPago1.efectuado(new Transaccion() {
			@Override
			public void Pago() {
				System.out.println("Pago Efectuado");
			}
		});
	}
}
