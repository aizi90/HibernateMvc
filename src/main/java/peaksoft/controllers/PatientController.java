package peaksoft.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.services.PatientService;

@Controller
@RequestMapping("/patients")
@RequiredArgsConstructor

public class PatientController {
    private PatientService patientService;
}

