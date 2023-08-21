package peaksoft.services;

import peaksoft.entities.Patient;

import java.util.List;

public interface PatientService {

    void savePatient(Long hospitalId, Patient patient);
    Patient getPatientById(Long id);
    List<Patient> getAllPatient(Long id);
    void updatePatient(Long id, Patient patient);
    void deletePatientById(Long id);
}

