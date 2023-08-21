package peaksoft.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import peaksoft.entities.Hospital;
import peaksoft.repositories.HospitalRepository;
import peaksoft.services.HospitalService;

import java.util.List;
@Service
@Transactional

public class HospitalServiceImpl implements HospitalService {
    private EntityManager entityManager;



    @Override
    public void saveHospital(Hospital hospital) {
        entityManager.persist(hospital);

    }

    @Override
    public void getHospitalById(Long id) {

    }





    @Override
    public List<Hospital> getAllHospital() {
        return entityManager.createQuery("select a from Hospital a ",Hospital.class).getResultList();
    }

    @Override
    public void updateHospital(Long id, Hospital hospital) {

    }

    @Override
    public void deleteHospitalById(Hospital hospital) {


    }
}
