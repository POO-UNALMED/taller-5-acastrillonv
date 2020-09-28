package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal {
	
	public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas,int cantidadAletas) {
		super();
		
	}
	public Pez() {
		
	}
	public List<Pez> getListado() {
		return listado;
	}
	public void setListado(List<Pez> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	private List<Pez> listado = new ArrayList<>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;

	public int cantidadPeces() {
		return listado.size();
	}
	public void movimiento() {

	}
	public void crearSalmon() {

	}
	public void crearBacalao() {

	}
}
