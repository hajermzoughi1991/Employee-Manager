package tech.gatarrays.employeemanager;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.gatarrays.employeemanager.model.Employee;
import tech.gatarrays.employeemanager.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee") //this controller should be accessed only with http that start with /employee
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //responseEntity is http response including headers, body and status
    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee()
    {
        List<Employee> employees=employeeService.findAllEmployee();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> findEmployeeById(@PathVariable("id") Long id)
    {
        Employee employee=employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
    //post is used to add data
    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
    {
        Employee newemployee=employeeService.addEmployee(employee);
        return new ResponseEntity<>(newemployee, HttpStatus.CREATED);
    }
    //put is used for update
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee)
    {
        Employee updateemployee=employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateemployee, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) //? because it will not return anything
    {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
