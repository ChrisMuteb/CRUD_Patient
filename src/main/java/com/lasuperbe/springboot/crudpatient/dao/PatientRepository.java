package com.lasuperbe.springboot.crudpatient.dao;

import com.lasuperbe.springboot.crudpatient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    // that's it
}
