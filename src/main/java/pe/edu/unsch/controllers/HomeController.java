package pe.edu.unsch.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.unsch.entities.Libro;
import pe.edu.unsch.services.AutorService;

@Controller
@RequestMapping
public class HomeController {
	
	@Autowired
	private AutorService autorService;
	
	@GetMapping
	public String index(Model model) {

		String nombre = "Fera mrd";

		List<String> nombres = new ArrayList<String>();

		nombres.add("Jose");
		nombres.add("Jourdy");
		nombres.add("Illanes");
		nombres.add("Vampiro Cmtre :V ga");

		model.addAttribute("nombreMayor", nombre).addAttribute("listanombres", nombres)
			.addAttribute("libros", autorService.listarLibros());
		
		// Alt + Shift + S - shorcut
		// Listar libros los autores
		
		for (Libro libro : autorService.listarLibros()) {
			System.out.println(libro);
		}
		
		
		return "views/home/index";
	}

}
