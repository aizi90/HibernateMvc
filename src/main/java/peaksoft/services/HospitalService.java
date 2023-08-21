package peaksoft.services;

import peaksoft.entities.Hospital;

import java.util.List;

public interface HospitalService {
    void saveHospital(Hospital hospital);
    void getHospitalById(Long id);

    List<Hospital> getAllHospital();

    void updateHospital(Long id, Hospital hospital);

    void deleteHospitalById(Hospital hospital);
}

