package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Ave extends Animal {

	public Ave(int totalAnimales, String nombre, int edad, String habitat, String genero, List<Zona> zona) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		// TODO Auto-generated constructor stub
	}
	public List<Ave> getListado() {
		return listado;
	}
	public void setListado(List<Ave> listado) {
		this.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	private List<Ave> listado = new ArrayList<>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;

	public int cantidadAves() {
		return listado.size();
	}

	public void movimiento() {

	}
	public void crearHalcon() {

	}
	public void crearAguila() {

	}
}
