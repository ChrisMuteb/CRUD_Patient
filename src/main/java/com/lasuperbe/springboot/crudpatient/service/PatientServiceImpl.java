package com.lasuperbe.springboot.crudpatient.service;

import com.lasuperbe.springboot.crudpatient.dao.PatientRepository;
import com.lasuperbe.springboot.crudpatient.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService{
    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient findById(long patientId) {
        Optional<Patient> result = patientRepository.findById(patientId);

        Patient thePatient = null;

        if(result.isPresent())
            thePatient = result.get();
        else
            throw new RuntimeException("Did not find patient id - " + patientId);
        return thePatient;
    }

    @Override
    public Patient save(Patient thePatient) {
        return patientRepository.save(thePatient);
    }

    @Override
    public void deleteById(long patientId) {
        patientRepository.deleteById(patientId);
    }
}
