package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public List<Estudiante> buscarEstudiantes() {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("Select e from Estudiante e", Estudiante.class);
		return myQuery.getResultList();
	}


	@Override
	public Estudiante ingresarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return this.entityManager.persist(estudiante);
	}

	
}
