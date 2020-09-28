package gestion;

import java.util.ArrayList;
import java.util.List;

import zooAnimales.Animal;

public class Zona {
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public List<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales = new ArrayList<>();
	
	public Zona(String nombre, Zoologico zoo, List<Animal> animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	
	public Zona() {
		
	}

}
