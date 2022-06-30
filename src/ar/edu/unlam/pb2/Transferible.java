package ar.edu.unlam.pb2;

public class Transferible {

	private String Entidad;
	private String Titular;

	public Transferible(String cbu, String entidad, String titular) {
		super();
		Entidad = entidad;
		Titular = titular;
	}

	public String getEntidad() {
		return Entidad;
	}

	public void setEntidad(String entidad) {
		Entidad = entidad;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

}
