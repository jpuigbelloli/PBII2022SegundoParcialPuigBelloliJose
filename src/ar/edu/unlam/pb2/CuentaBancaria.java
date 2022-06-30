package ar.edu.unlam.pb2;

public class CuentaBancaria extends Transferible {

	private String cbu;

	public CuentaBancaria(String cbu, String entidad, String titular) {
		super(cbu, entidad, titular);
		this.cbu = cbu;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

}
