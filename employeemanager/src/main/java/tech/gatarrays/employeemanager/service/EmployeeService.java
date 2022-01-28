package tech.gatarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.gatarrays.employeemanager.exception.UserNotFoundException;
import tech.gatarrays.employeemanager.model.Employee;
import tech.gatarrays.employeemanager.repo.EmployeeRep;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRep employeeRep;

    @Autowired
    public EmployeeService(EmployeeRep employeeRep) {
        this.employeeRep = employeeRep;
    }
    public Employee addEmployee(Employee employee)
    {
        return employeeRep.save(employee);
    }

    public List<Employee> findAllEmployee()
    {
        return employeeRep.findAll();
    }
    public Employee updateEmployee(Employee employee)
    {
        return employeeRep.save(employee);
    }
    public Employee findEmployeeById(Long id)
    {
        //orElseThrow will throw an exception when the employee is not found
        //create usernotfoundException
        //define findemployeebyid in the interface because it is not jpa function
        return employeeRep.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("User by id"+id+" was not found"));
    }
    public void deleteEmployee(Long id){
        employeeRep.deleteById(id);
    }
}
