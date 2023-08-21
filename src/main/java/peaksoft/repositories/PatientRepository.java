package peaksoft.repositories;

import peaksoft.entities.Hospital;
import peaksoft.entities.Patient;

import java.util.List;

public interface PatientRepository  {
    void savePatient(Patient patient);//erten

    void getPatientById(Long id);

    List<Patient> getAllPatient(Long id);

    void updatePatient(Long id, Patient patient);

    void deletePatientById(Long id);
}
