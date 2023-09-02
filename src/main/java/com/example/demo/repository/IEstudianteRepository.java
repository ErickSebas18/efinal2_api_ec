package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {

	public Estudiante ingresarEstudiante(Estudiante estudiante);
	
	public List<Estudiante> buscarEstudiantes();
}
