package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal {
	
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas,int largoCola) {
		super();
		
	}
	public Reptil() {
		
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
