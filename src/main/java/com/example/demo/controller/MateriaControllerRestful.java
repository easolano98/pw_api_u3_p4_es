package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IMateriaService;

@RestController
@RequestMapping("/materias")
public class MateriaControllerRestful {

	@Autowired
	private IMateriaService iMateriaService;

	@GetMapping(path = "/buscar")
	public Materia consultarNombreMateria() {
		String asignatura = "programacion web";
		return this.iMateriaService.seleccionarPorMateria(asignatura);
	}
	
	@PostMapping(path = "/guardar")
	public void guardar (@RequestBody Materia materia) {
		this.iMateriaService.registrar(materia);
	}
	
	@PutMapping(path="/actualizar")
	public void actualizar() {
		
	}
	@PatchMapping(path="/actualizarParcial")
	public void actualizarParcial() {
		
	}
	
	@DeleteMapping(path="/eliminar")
	public void borrar() {
		
	}
	
}
