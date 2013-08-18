package br.ufes.inf.lprm.seman.model.situation;

import br.ufes.inf.lprm.seman.model.Patient;
import br.ufes.inf.lprm.seman.model.Volunteer;
import br.ufes.inf.lprm.situation.Role;
import br.ufes.inf.lprm.situation.SituationType;

public class HelpRequest extends SituationType {
	
	@Role(label="patient")
	private Patient patient;
	
	@Role(label="volunteer")	
	private Volunteer volunteer;

	public Volunteer getVolunteer() {
		return volunteer;
	}

	public void setVolunteer(Volunteer volunteer) {
		this.volunteer = volunteer;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
