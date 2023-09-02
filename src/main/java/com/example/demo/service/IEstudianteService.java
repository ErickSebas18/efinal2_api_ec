package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {

	public Estudiante insertarEstudiante(Estudiante estudiante);
	
	public List<Estudiante> estudiantes();
}
