package peaksoft.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import peaksoft.entities.Appointment;
import peaksoft.repositories.DoctorRepository;
import peaksoft.services.AppointmentService;
import peaksoft.services.DepartmentService;
import peaksoft.services.DoctorService;
import peaksoft.services.PatientService;

@Controller
@RequestMapping("/appointments")
@RequiredArgsConstructor//DI

public class AppointmentController {
    //aldyn mainge chakyrat elek emi controllergo chakyrabyz serviceti

}




