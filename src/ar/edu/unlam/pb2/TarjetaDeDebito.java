package ar.edu.unlam.pb2;

public class TarjetaDeDebito extends Pagadora {

	private double Saldo;

	public TarjetaDeDebito(Long numero, String titular, Integer CodigoDeSeguridad, String FechaDeVencimiento) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.CodigoDeSeguridad = CodigoDeSeguridad;
		this.FechaDeVencimiento = FechaDeVencimiento;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

}
