package peaksoft.services.impl;

import org.springframework.stereotype.Service;
import peaksoft.entities.Department;
import peaksoft.repositories.DepartmentRepository;
import peaksoft.services.DepartmentService;

import java.util.List;
@Service


public class DepartmentServiceImpl  implements DepartmentService {
    private  DepartmentRepository departmentRepository;



    @Override
    public void saveDepartment(Long id, Department department) {

    }

    @Override
    public void getDepartmentById(Long id) {

    }

    @Override
    public List<Department> getAllDepartment(Long id) {
        return null;
    }

    @Override
    public void updateDepartment(Long id, Department department) {

    }

    @Override
    public void deleteDepartmentById(Long id) {

    }

    @Override
    public void assignDoctor(Long doctorId, Long departmentId) {

    }
}
