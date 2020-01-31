package ru.nutkin.microservice.business.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nutkin.microservice.business.repository.EmployeeRepository;
import ru.nutkin.utils.EmployeeDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;

    public List<EmployeeDto> getEmployees() {
        return repository.findAll().stream()
                .map(employee -> EmployeeDto.builder()
                        .firstName(employee.getFirstName())
                        .lastName(employee.getLastName())
                        .age(employee.getAge())
                        .address(employee.getAddress().getName())
                        .build())
                .collect(Collectors.toList());
    }
}
