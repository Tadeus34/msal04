package com.urbanisationsi.microservicesassure.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.urbanisationsi.microservicesassure.entity.Assure;

public interface AssureRepository extends CrudRepository<Assure, Integer> {
	
	List<Assure> findByNomAndPrenom (String nom, String prenom);
	List<Assure> findByNumeroPersonne (Long numeroPersonne);
	
}
