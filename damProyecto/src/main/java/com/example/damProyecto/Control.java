package com.example.damProyecto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
	
	@RequestMapping (value="/prim")
	public String lanzarPrimero(Model model) {
		
		model.addAttribute("titulo","Titulo de primero con model");//model.addAttribute(nombre que luego llamamos, que queremos poner)
		model.addAttribute("par","parrafo de primero con model");
		return "primero";//Nombre del html que quiero que lance
	}
	@RequestMapping (value="/")
	public String lanzarIndex(Model model) {
		
		model.addAttribute("titulo2","Titulo de primero con model");//model.addAttribute(nombre que luego llamamos, que queremos poner)
		model.addAttribute("par2","parrafo de primero con model");
		return "index";//Nombre del html que quiero que lance
	}
}
