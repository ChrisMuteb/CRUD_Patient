package com.lasuperbe.springboot.crudpatient.rest;

import com.lasuperbe.springboot.crudpatient.entity.Patient;
import com.lasuperbe.springboot.crudpatient.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PatientRestController {
    private PatientService patientService;

    public PatientRestController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients")
    public List<Patient> findAll(){
        return patientService.findAll();
    }

    @GetMapping("/patients/{patientId}")
    public Patient getPatient(@PathVariable long patientId){
        Patient thePatient = patientService.findById(patientId);
        if(thePatient == null)
            throw new RuntimeException("Patient id not found - " + patientId);
        return thePatient;
    }

    @PostMapping("/patients")
    public Patient addPatient(@RequestBody Patient thePatient){
        thePatient.setPatNumHC(0);
        Patient dbPatient = patientService.save(thePatient);
        return dbPatient;
    }

    @PutMapping("/patients")
    public Patient updatePatient(@RequestBody Patient thePatient){
        Patient dbPatient = patientService.save(thePatient);
        return dbPatient;
    }

    @DeleteMapping("/patients/{patientId}")
    public String deletePatient(@PathVariable long patientId){
        Patient thePatient = patientService.findById(patientId);

        if(thePatient == null)
            throw new RuntimeException("Patient id not found - " + patientId);
        patientService.deleteById(patientId);
        return "Deleted patient id - " + patientId;
    }
}
