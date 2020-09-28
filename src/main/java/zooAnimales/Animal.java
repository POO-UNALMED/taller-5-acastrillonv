package zooAnimales;

import java.util.ArrayList;
import java.util.List;

import gestion.Zona;

public class Animal {

	public int getTotalAnimales() {
		return totalAnimales;
	}
	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<Zona> getZona() {
		return zona;
	}
	public void setZona(List<Zona> zona) {
		this.zona = zona;
	}
	
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private List<Zona> zona = new ArrayList<>();

	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	
	public Animal() {
		
	}
	
	public void movimiento() {

	}
	public int totalPorTipo() {
		return 0;
	}
	public String toString() {
		return "";
	}
}
