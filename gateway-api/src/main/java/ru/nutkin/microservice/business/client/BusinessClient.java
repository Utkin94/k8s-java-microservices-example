package ru.nutkin.microservice.business.client;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.nutkin.utils.EmployeeDto;

import java.util.List;

@Component
@Slf4j
public class BusinessClient {

    private final RestTemplate restTemplate;

    public BusinessClient(@Autowired RestTemplateBuilder restTemplateBuilder,
                          @Value("${business.api.hostname}") String businessHostname) {
        log.info("businessHostname === " + businessHostname);
        this.restTemplate = restTemplateBuilder.rootUri(businessHostname).build();
    }

    public List<EmployeeDto> getEmployees() {
        val employees = restTemplate.getForObject("/employee", EmployeeDto[].class);
        return List.of(employees);
    }
}
