package pe.edu.unsch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.AutorDao;
import pe.edu.unsch.entities.Libro;

@Service
public class AutorServiceImpl implements AutorService {
	
	@Autowired
	private AutorDao autorDao;
	
	@Override
	public List<Libro> listarLibros() {
		return autorDao.listarLibros();
	}

}
