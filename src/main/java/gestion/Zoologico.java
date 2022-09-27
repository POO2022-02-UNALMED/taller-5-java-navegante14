package gestion;
import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas= new ArrayList<Zona>();
	
	public Zoologico() {
		
	}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zonas) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.zonas=zonas;
	}
	public void agregarZonas(Zona zonas) {
		this.zonas.add(zonas);
	}
	public int cantidadTotalAnimales() {
		int total=0;
		for (Zona i: this.zonas) {
			total+=i.cantidadAnimales();
		}
		return total;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
}
