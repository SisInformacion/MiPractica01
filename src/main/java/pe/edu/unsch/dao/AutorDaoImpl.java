package pe.edu.unsch.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Autor;
import pe.edu.unsch.entities.Libro;

@Repository
public class AutorDaoImpl implements AutorDao {

	private List<Libro> libros = new ArrayList<Libro>();;

	@Override
	public List<Libro> listarLibros() {
		libros.add(new Libro(1, "Libro 1", new Autor(1, "Autor 1")));
		libros.add(new Libro(2, "Libro 2", new Autor(1, "Autor 2")));
		libros.add(new Libro(3, "Libro 3", new Autor(1, "Autor 3")));

		return libros;
	}

}
