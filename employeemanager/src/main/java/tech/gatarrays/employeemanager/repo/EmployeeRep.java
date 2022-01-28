package tech.gatarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.gatarrays.employeemanager.model.Employee;

import java.util.Optional;

//add <Employee> mean this jpa repository for class Employee
//extends to be able to access functions in jparepository file
public interface EmployeeRep extends JpaRepository<Employee,Long> {
    //no need to declare the function body because spring will know the aim of it from it is naming
    // find employee by id
    Optional<Employee> findEmployeeById(Long id);
}
