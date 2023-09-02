package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Autowired
	private IEstudianteRepository estudianteRepository;
	
	@Override
	public Estudiante insertarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return this.estudianteRepository.ingresarEstudiante(estudiante);
	}

	@Override
	public List<Estudiante> estudiantes() {
		// TODO Auto-generated method stub
		return this.estudianteRepository.buscarEstudiantes();
	}

	
}
