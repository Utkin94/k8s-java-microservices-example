package ru.nutkin.microservice.business.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nutkin.microservice.business.response.Response;
import ru.nutkin.microservice.business.service.CounterService;

@RestController
@RequiredArgsConstructor
public class GatewayController {

    private final CounterService counterService;

    @GetMapping("/employee")
    public Response getEmployee() {
        return counterService.getEmployees();
    }

    @GetMapping
    public String greetings() {
        return "Gateway greetings.";
    }
}
