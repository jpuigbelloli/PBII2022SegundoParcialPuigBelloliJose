package ar.edu.unlam.pb2;

public class CuentaVirtual extends Transferible {

	String cvu;

	public CuentaVirtual(String cvu, String entidad, String titular) {
		super(cvu, entidad, titular);
		this.cvu = cvu;
	}

	public String getCvu() {
		return cvu;
	}

	public void setCvu(String cvu) {
		this.cvu = cvu;
	}

}
