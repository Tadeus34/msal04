package com.urbanisationsi.microservicesassure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assure extends Personne {
	
	private String dossierMEdical;
	
	private Long numeroAssure;

	public String getDossierMEdical() {
		return dossierMEdical;
	}

	public void setDossierMEdical(String dossierMEdical) {
		this.dossierMEdical = dossierMEdical;
	}

	public Long getNumeroAssure() {
		return numeroAssure;
	}

	public void setNumeroAssure(Long numeroAssure) {
		this.numeroAssure = numeroAssure;
	}
	
	

}
