package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Reptil extends Animal {
	
	public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, List<Zona> zona) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		// TODO Auto-generated constructor stub
	}
	public List<Reptil> getListado() {
		return listado;
	}
	public void setListado(List<Reptil> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	private List<Reptil> listado = new ArrayList<>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;

	public int cantidadReptiles() {
		return listado.size();
	}
	public void movimiento() {

	}
	public void crearIguana() {

	}
	public void crearSerpiente() {

	}
}
