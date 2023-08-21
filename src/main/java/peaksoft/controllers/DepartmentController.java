package peaksoft.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.services.DepartmentService;

@Controller
@RequestMapping("/departments")
@RequiredArgsConstructor

public class DepartmentController {
    private final DepartmentService departmentService;
}


