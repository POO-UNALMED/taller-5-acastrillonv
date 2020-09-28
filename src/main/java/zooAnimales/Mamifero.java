package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal {

	public Mamifero(String nombre, int edad, String habitat, String genero,boolean pelaje,int patas) {
		super();
		
	}
	public Mamifero() {
		
	}
	public int cantidadMamiferos(){
		return listado.size();
	}
	public List<Mamifero> getListado() {
		return listado;
	}
	public void setListado(List<Mamifero> listado) {
		this.listado = listado;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}

	private List<Mamifero> listado = new ArrayList<>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;

	public void crearCaballo() {

	}

	public void crearLeon() {

	}


}
