package com.amagana.technicaltest.employeemanagement.utilis;

import com.amagana.technicaltest.employeemanagement.dtos.EmployeeDtoRequest;
import com.amagana.technicaltest.employeemanagement.dtos.EmployeeDtoResponse;
import com.amagana.technicaltest.employeemanagement.entity.Employee;
import com.amagana.technicaltest.employeemanagement.enums.Gender;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-15T15:37:59+0100",
    comments = "version: 1.6.0.RC1, compiler: Eclipse JDT (IDE) 3.40.0.z20241023-1306, environment: Java 17.0.13 (Eclipse Adoptium)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDtoResponse employeeToEmployeeDtoResponse(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDtoResponse.EmployeeDtoResponseBuilder employeeDtoResponse = EmployeeDtoResponse.builder();

        employeeDtoResponse.contractEndDate( employee.getContractEndDate() );
        employeeDtoResponse.contractStartDate( employee.getContractStartDate() );
        employeeDtoResponse.department( employee.getDepartment() );
        employeeDtoResponse.firstName( employee.getFirstName() );
        employeeDtoResponse.gender( employee.getGender() );
        employeeDtoResponse.grade( employee.getGrade() );
        employeeDtoResponse.id( employee.getId() );
        employeeDtoResponse.jobTitle( employee.getJobTitle() );
        employeeDtoResponse.lastName( employee.getLastName() );

        return employeeDtoResponse.build();
    }

    @Override
    public Employee employeeDtoRequestToEmployee(EmployeeDtoRequest employeeDtoRequest) {
        if ( employeeDtoRequest == null ) {
            return null;
        }

        Employee.EmployeeBuilder employee = Employee.builder();

        employee.contractEndDate( employeeDtoRequest.contractEndDate() );
        employee.contractStartDate( employeeDtoRequest.contractStartDate() );
        employee.createdUserName( employeeDtoRequest.createdUserName() );
        employee.firstName( employeeDtoRequest.firstName() );
        if ( employeeDtoRequest.gender() != null ) {
            employee.gender( Enum.valueOf( Gender.class, employeeDtoRequest.gender() ) );
        }
        employee.id( employeeDtoRequest.id() );
        employee.jobTitle( employeeDtoRequest.jobTitle() );
        employee.lastName( employeeDtoRequest.lastName() );

        return employee.build();
    }
}
