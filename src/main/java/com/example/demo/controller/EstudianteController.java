package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

	@Autowired IEstudianteService estudianteService;
	
	public ResponseEntity<Estudiante> insertarEstudiante(@RequestBody Estudiante estudiante) {
		return ResponseEntity.status(200).body(this.estudianteService.insertarEstudiante(estudiante));
	}
}
