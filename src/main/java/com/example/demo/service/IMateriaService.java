package com.example.demo.service;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaService {
	
	public Materia seleccionarPorMateria(String asignatura);
	
	public void registrar(Materia materia);
	
	
}
