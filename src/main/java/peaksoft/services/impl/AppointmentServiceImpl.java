package peaksoft.services.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entities.Appointment;
import peaksoft.repositories.AppointmentRepository;
import peaksoft.services.AppointmentService;

import java.util.List;
@Service
@RequiredArgsConstructor

public class AppointmentServiceImpl implements AppointmentService {
private  final AppointmentRepository appointmentRepository;

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public void saveAppointment(Appointment appointment) {
        entityManager.persist(appointment);

    }

    @Override
    public void getAppointmentById(Long id) {
         entityManager.find(Appointment.class, id);

    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.getAllAppointments();
    }

    @Override
    public void updateAppointment(Long id, Appointment appointment) {
        Appointment ollAppointment = entityManager.find(Appointment.class, id);
        ollAppointment.setDate(appointment.getDate());
        entityManager.merge(ollAppointment);
    }


@Transactional
    @Override
    public void deleteAppointmentById(Long id) {
    entityManager.createQuery("delete from Appointment  a where a.id=:id").setParameter("id",id).executeUpdate();


}
}
