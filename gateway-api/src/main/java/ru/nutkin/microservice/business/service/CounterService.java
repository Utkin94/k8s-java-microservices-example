package ru.nutkin.microservice.business.service;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import ru.nutkin.microservice.business.client.BusinessClient;
import ru.nutkin.microservice.business.response.Response;

@Service
@RequiredArgsConstructor
public class CounterService {

    private final BusinessClient businessClient;

    private Long businessRequestCounter = 0L;

    public Response getEmployees() {
        val employees = businessClient.getEmployees();
        return Response.builder()
                .employees(employees)
                .requestCount(++businessRequestCounter)
                .build();
    }
}
