package peaksoft.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.entities.Doctor;
import peaksoft.entities.Hospital;
import peaksoft.repositories.DoctorRepository;

import java.util.List;

@Repository
@Transactional
public class DoctorRepositoryImpl  implements DoctorRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveDoctor(Long id, Doctor doctor) {
        Hospital hospital = entityManager.find(Hospital.class, id);
        hospital.setDoctor(doctor);
        doctor.setHospital(hospital);
        entityManager.persist(doctor);

    }


    @Override
    public void getDoctorById(Long id) {
         entityManager.find(Doctor.class, id);
    }



    @Override
    public List<Doctor> getAllDoctors(Long id) {
        return entityManager.createQuery("select d from Doctor d where d.hospital.id=:id", Doctor.class)
                .setParameter("id",id).getResultList();
    }


    @Override
    public void updateDoctor(Long id, Doctor doctor) {
        Doctor oldDoctor = entityManager.find(Doctor.class, id);
        oldDoctor.setFirstName(doctor.getFirstName());
        oldDoctor.setLastName(doctor.getLastName());
        oldDoctor.setEmail(doctor.getEmail());
        oldDoctor.setPosition(doctor.getPosition());
        entityManager.persist(oldDoctor);


    }

    @Override
    public void deleteDoctorById(Long id) {
        Doctor doctor = entityManager.find(Doctor.class, id);
        entityManager.remove(doctor);


    }
}
