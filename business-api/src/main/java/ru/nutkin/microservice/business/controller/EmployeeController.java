package ru.nutkin.microservice.business.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nutkin.microservice.business.service.EmployeeService;
import ru.nutkin.utils.EmployeeDto;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/employee")
    public List<EmployeeDto> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping
    public String greetings() {
        return "Business api greetings.";
    }
}
