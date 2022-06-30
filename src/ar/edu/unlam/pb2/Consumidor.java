package ar.edu.unlam.pb2;

public class Consumidor {

	private String nombre;
	private Integer dni;

	public Consumidor(Integer dni, String nombre) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	
	
}
