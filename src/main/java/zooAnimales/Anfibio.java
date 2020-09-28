package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal {
	
	
	
	public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel,boolean venenoso) {
		super();
		
	}
	public Anfibio() {
		
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
