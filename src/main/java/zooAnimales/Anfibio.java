package zooAnimales;

import java.util.ArrayList;
import java.util.List;
import gestion.Zona;

public class Anfibio extends Animal {
	
	public Anfibio(int totalAnimales, String nombre, int edad, String habitat, String genero, List<Zona> zona) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
	}
	
	public List<Anfibio> getListado() {
		return listado;
	}
	public void setListado(List<Anfibio> listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	private List<Anfibio> listado = new ArrayList<>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	public int cantidadAnfibios() {
		return listado.size();
	}
	public void movimiento() {

	}
	public void crearRanas() {

	}
	public void crearSalamandra() {

	}
}
