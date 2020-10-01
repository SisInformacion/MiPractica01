package pe.edu.unsch.entities;

public class Autor {
	
	private int idautor;
	private String nombre;
	public int getIdautor() {
		return idautor;
	}
	public void setIdautor(int idautor) {
		this.idautor = idautor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Autor(int idautor, String nombre) {
		super();
		this.idautor = idautor;
		this.nombre = nombre;
	}
	
	public Autor() {
	}
	@Override
	public String toString() {
		return "Autor [idautor=" + idautor + ", nombre=" + nombre + "]";
	}
	
	
}	
