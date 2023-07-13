package com.example.demo.repository;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {
	
	public Materia seleccionarPorNombre(String nombre);
	
	public void insertar(Materia materia);
	
}
