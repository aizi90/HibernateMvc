package peaksoft.repositories.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import peaksoft.entities.Appointment;
import peaksoft.repositories.AppointmentRepository;

import java.util.List;
@Repository//ichinde component annotasiya bar pod kapotom ,bean tuzup beret
@Transactional


public class AppointmentRepositoryImpl implements AppointmentRepository {
    //save кылыш учун EntityManager алып келип алабыз
     @PersistenceContext//konteiner mn  управление болот
    private EntityManager entityManager;
    @Override
    public void saveAppointment(Appointment appointment) {
        entityManager.persist(appointment);

    }

    @Override
    public void getAppointmentById(Long id) {

    }

    @Override
    public List<Appointment> getAllAppointments() {
        return entityManager.createQuery("select a from Appointment a",Appointment.class).getResultList();
    }

    @Override
    public void updateAppointment(Long id, Appointment appointment) {

    }

    @Override
    public void deleteAppointmentById(Long id) {

    }

}