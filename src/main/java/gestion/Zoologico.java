package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Zona> getZona() {
		return zonas;
	}
	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}
	
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<>();
	
	public Zoologico() {
		
	}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
		((Zona)zona).setZoo(this);
	}
	public int cantidadTotalAnimales() {
		int cantidad = 0;
		for (Zona zona : zonas) {
			cantidad += zona.cantidadAnimales();
		}
		return cantidad;
	}

}

