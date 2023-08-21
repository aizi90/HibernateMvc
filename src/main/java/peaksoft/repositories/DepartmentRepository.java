package peaksoft.repositories;

import peaksoft.entities.Department;

import java.util.List;

public interface DepartmentRepository {
    void saveDepartment(Long id, Department department);

     void getDepartmentById(Long id);

    List<Department> getAllDepartment(Long id);

    void updateDepartment(Long id, Department department);

    void deleteDepartmentById(Long id);

    void assignDoctor(Long doctorId, Long departmentId);

}
