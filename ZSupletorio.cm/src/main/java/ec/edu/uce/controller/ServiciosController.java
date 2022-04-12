package ec.edu.uce.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.edu.uce.repository.modelo.Registro;
import ec.edu.uce.service.IBodegaService;
import ec.edu.uce.service.IProductoService;
import ec.edu.uce.service.IRegistroService;
import ec.edu.uce.service.IGestorService;

@Controller
@RequestMapping("/sistema")
public class ServiciosController {
	
	@Autowired
	private IGestorService gestorService;
	
	
		
}
