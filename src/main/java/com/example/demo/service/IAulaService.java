package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Aula;

public interface IAulaService {

	public void registrar(Aula aula);

	public void actualizar(Aula aula);
	
	public void actualizarParalelo(String paraleloOld, String paraleloNew);

	public Aula buscar(String paralelo);

	public List<Aula> filtrar(String tipo);

	public void borrar(Integer id);

}
