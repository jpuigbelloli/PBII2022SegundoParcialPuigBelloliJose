package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Billetera {

	private String nombre;
	private Set<Comercio> comercios;
	private Set<Consumidor> consumidores;
	private Set<Pagadora> mediosDePago;
	private Set<Transferible> mediosDePagoTransferibles;

	
	public Billetera(String nombre) {
		super();
		this.nombre = nombre;
		comercios = new HashSet<Comercio>();
		consumidores = new HashSet<Consumidor>();
		mediosDePago = new HashSet<Pagadora>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Comercio> getComercios() {
		return comercios;
	}

	public void setComercios(Set<Comercio> comercios) {
		this.comercios = comercios;
	}

	public Integer getCantidadDeComercios() {

		return comercios.size();
	}

	public void agregarComercio(Comercio comercio) throws CuitInvalidoException {
		if (comercios.contains(comercio)) {
			throw new CuitInvalidoException();
		} else {
			comercios.add(comercio);
		}

	}

	public void agregarConsumidor(Consumidor consumidor) throws DniInvalidoException {
		if (consumidores.contains(consumidor)) {
			throw new DniInvalidoException();
		} else {
			consumidores.add(consumidor);
		}

	}

	public Integer getCantidadDeConsumidores() {

		return consumidores.size();
	}

	public void agregarMedioDePago(int i, Pagadora medioDePago) throws MedioDePagoDuplicadoException, NumeroDeTarjetaInvalidoException, CBUInvalidoException, CVUInvalidoException, NoCoincideTitularException{
		if (mediosDePago.contains(medioDePago)) {
			throw new MedioDePagoDuplicadoException();
		} else {
			mediosDePago.add(medioDePago);
		}
	}
	
	public void agregarMedioDePago(int i, Transferible medioDePago) throws MedioDePagoDuplicadoException {
		if (mediosDePagoTransferibles.contains(medioDePago)) {
			throw new MedioDePagoDuplicadoException();
		} else {
			mediosDePagoTransferibles.add(medioDePago);
		}
		
	}

	public Integer getCantidadDeMediosDePago(int i) {
		
		return mediosDePago.size();
	}
	
	public Consumidor traerConsumidor(Integer dniConsumidor) {
		for (Consumidor consumidor : consumidores) {
			if (consumidor.getDni().equals(dniConsumidor)) {
				return consumidor;
			}
		}
		return null;
	}
	
}
