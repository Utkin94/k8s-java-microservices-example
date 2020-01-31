package ru.nutkin.microservice.business.response;

import lombok.Builder;
import lombok.Data;
import ru.nutkin.utils.EmployeeDto;

import java.util.List;

@Data
@Builder
public class Response {
    private Long requestCount;
    private List<EmployeeDto> employees;
    private String version = "v1";
}
