package com.lasuperbe.springboot.crudpatient.service;

import com.lasuperbe.springboot.crudpatient.entity.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> findAll();
    Patient findById(long patientId);
    Patient save(Patient thePatient);
    void deleteById(long patientId);
}
