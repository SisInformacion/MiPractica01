package pe.edu.unsch.entities;

public class Libro {
	private int idlibro;
	private String titulo;

	private Autor autor;

	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Libro(int idlibro, String titulo, Autor autor) {
		super();
		this.idlibro = idlibro;
		this.titulo = titulo;
		this.autor = autor;
	}

	public Libro() {

	}

	@Override
	public String toString() {
		return "Libro [idlibro=" + idlibro + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
	
}
