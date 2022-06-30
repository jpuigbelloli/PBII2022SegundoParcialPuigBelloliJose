package ar.edu.unlam.pb2;

import java.util.Objects;

public class Comercio {

	private String nombre;
	private Long Cuit;

	public Comercio(Long cuit, String nombre) {
		super();
		this.nombre = nombre;
		Cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCuit() {
		return Cuit;
	}

	public void setCuit(Long cuit) {
		Cuit = cuit;
	}

}
