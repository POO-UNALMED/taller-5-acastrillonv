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
	public List<Zona> getZonas() {
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
	public Zoologico(String nombre, String ubicacion, List<Zona> zonas) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	
	
	public void agregarZonas() {

	}
	public void cantidadTotalAnimales() {
		
	}

}

