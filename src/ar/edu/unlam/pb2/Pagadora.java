package ar.edu.unlam.pb2;

public class Pagadora {

	protected Long numero;
	protected String titular;
	protected Integer CodigoDeSeguridad;
	protected String FechaDeVencimiento;

	public Pagadora() {
		super();
	}

	public Pagadora(Long numero, String titular, Integer CodigoDeSeguridad, String FechaDeVencimiento) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.CodigoDeSeguridad = CodigoDeSeguridad;
		this.FechaDeVencimiento = FechaDeVencimiento;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getCodigoDeSeguridad() {
		return CodigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer CodigoDeSeguridad) {
		this.CodigoDeSeguridad = CodigoDeSeguridad;
	}

	public String getFechaDeVencimiento() {
		return FechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String FechaDeVencimiento) {
		this.FechaDeVencimiento = FechaDeVencimiento;
	}

}
