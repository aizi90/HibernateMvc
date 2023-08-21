package peaksoft.repositories;

import peaksoft.entities.Appointment;

import java.util.List;

public interface AppointmentRepository {
    void saveAppointment(Appointment appointment);

   void getAppointmentById(Long id);

    List<Appointment> getAllAppointments();

    void updateAppointment(Long id, Appointment appointment);

    void deleteAppointmentById(Long id);
}

