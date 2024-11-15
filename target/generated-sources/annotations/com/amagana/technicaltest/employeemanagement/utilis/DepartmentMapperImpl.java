package com.amagana.technicaltest.employeemanagement.utilis;

import com.amagana.technicaltest.employeemanagement.dtos.DepartmentDtoRequest;
import com.amagana.technicaltest.employeemanagement.dtos.DepartmentDtoResponse;
import com.amagana.technicaltest.employeemanagement.entity.Department;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-15T15:37:58+0100",
    comments = "version: 1.6.0.RC1, compiler: Eclipse JDT (IDE) 3.40.0.z20241023-1306, environment: Java 17.0.13 (Eclipse Adoptium)"
)
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public DepartmentDtoResponse departmentToDepartmentDtoResponse(Department department) {
        if ( department == null ) {
            return null;
        }

        Long id = null;
        String name = null;

        id = department.getId();
        name = department.getName();

        DepartmentDtoResponse departmentDtoResponse = new DepartmentDtoResponse( id, name );

        return departmentDtoResponse;
    }

    @Override
    public Department departmentDtoRequestToDepartment(DepartmentDtoRequest departmentDtoRequest) {
        if ( departmentDtoRequest == null ) {
            return null;
        }

        Department.DepartmentBuilder department = Department.builder();

        department.id( departmentDtoRequest.id() );
        department.name( departmentDtoRequest.name() );

        return department.build();
    }
}
