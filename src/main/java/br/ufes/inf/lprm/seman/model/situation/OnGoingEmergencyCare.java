package br.ufes.inf.lprm.seman.model.situation;

import br.ufes.inf.lprm.seman.model.Patient;
import br.ufes.inf.lprm.situation.Role;
import br.ufes.inf.lprm.situation.SituationType;

public class OnGoingEmergencyCare extends SituationType {
	
	@Role(label="patient")
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	

}
