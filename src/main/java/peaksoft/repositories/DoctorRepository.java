package peaksoft.repositories;

import peaksoft.entities.Doctor;

import java.util.List;

public interface DoctorRepository {
    void saveDoctor(Long id, Doctor doctor);

    void getDoctorById(Long id);

    List<Doctor> getAllDoctors(Long id);

    void updateDoctor(Long id, Doctor doctor);

    void deleteDoctorById(Long id);
}

