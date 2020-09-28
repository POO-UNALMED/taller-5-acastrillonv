package zooAnimales;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal {

	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		super();
		
	}
	public Ave() {
		
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
