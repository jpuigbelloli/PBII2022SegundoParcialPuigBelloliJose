package ar.edu.unlam.pb2;

public class TarjetaDeCredito extends Pagadora {

	private double LimiteDeCompraEnPesos;
	private double LimiteDeCompraEnDolares;

	// NUMERO_ESPERADO, TITULAR_ESPERADO, FECHA_DE_VENCIMIENTO_ESPERADO,
	// CODIGO_DE_SEGURIDAD_ESPERADO, LIMITE_COMPRA_EN_PESOS,
	// LIMITE_DE_COMPRA_EN_DOLARES

	public TarjetaDeCredito(Long numero, String titular, Integer CodigoDeSeguridad, String FechaDeVencimiento,
			double LimiteDeCompraEnPesos, double LimiteDeCompraEnDolares) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.CodigoDeSeguridad = CodigoDeSeguridad;
		this.FechaDeVencimiento = FechaDeVencimiento;
		this.LimiteDeCompraEnPesos = LimiteDeCompraEnPesos;
		this.LimiteDeCompraEnDolares = LimiteDeCompraEnDolares;
	}

	public double getLimiteDeCompraEnPesos() {
		return LimiteDeCompraEnPesos;
	}

	public void setLimiteDeCompraEnPesos(double limiteDeCompraEnPesos) {
		LimiteDeCompraEnPesos = limiteDeCompraEnPesos;
	}

	public double getLimiteDeCompraEnDolares() {
		return LimiteDeCompraEnDolares;
	}

	public void setLimiteDeCompraEnDolares(double limiteDeCompraEnDolares) {
		LimiteDeCompraEnDolares = limiteDeCompraEnDolares;
	}

}
