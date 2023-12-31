package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.modelo.Materia;
@Service
public class MateriaService implements IMateriaService {
	
	@Autowired
	private IMateriaRepository iMateriaRepository;
	
	
	@Override
	public Materia seleccionarPorMateria(String asignatura) {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.seleccionarPorNombre(asignatura);
	}

	@Override
	public void registrar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.insertar(materia);
	}

}
