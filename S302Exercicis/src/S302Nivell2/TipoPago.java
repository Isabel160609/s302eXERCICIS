package S302Nivell2;

class TipoPago implements Transaccion {

	public TipoPago(int opcionPago) {

		if (opcionPago == 1) {

			System.out.println("ha procedido al pago con PayPal");
		} else if (opcionPago == 2) {

			System.out.println("ha procedido al pago con tarjeta de Credito");
		} else if (opcionPago == 3) {

			System.out.println("ha procedido al pago con número de Cuenta");
		}

	}

	@Override
	public void Pago() {// Pago handleClick
		// TODO Auto-generated method stub

	}
}