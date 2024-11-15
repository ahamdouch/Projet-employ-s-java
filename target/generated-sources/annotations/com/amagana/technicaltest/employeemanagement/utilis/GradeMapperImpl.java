package com.amagana.technicaltest.employeemanagement.utilis;

import com.amagana.technicaltest.employeemanagement.dtos.GradeDtoRequest;
import com.amagana.technicaltest.employeemanagement.dtos.GradeDtoResponse;
import com.amagana.technicaltest.employeemanagement.entity.Grade;
import java.util.Date;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-15T15:37:59+0100",
    comments = "version: 1.6.0.RC1, compiler: Eclipse JDT (IDE) 3.40.0.z20241023-1306, environment: Java 17.0.13 (Eclipse Adoptium)"
)
public class GradeMapperImpl implements GradeMapper {

    @Override
    public GradeDtoResponse gradeToGradeDtoResponse(Grade grade) {
        if ( grade == null ) {
            return null;
        }

        Long id = null;
        String gradeName = null;
        Date fromDate = null;
        Date toDate = null;

        id = grade.getId();
        gradeName = grade.getGradeName();
        fromDate = grade.getFromDate();
        toDate = grade.getToDate();

        GradeDtoResponse gradeDtoResponse = new GradeDtoResponse( id, gradeName, fromDate, toDate );

        return gradeDtoResponse;
    }

    @Override
    public Grade gradeDtoRequestToGrade(GradeDtoRequest gradeDtoRequest) {
        if ( gradeDtoRequest == null ) {
            return null;
        }

        Grade.GradeBuilder grade = Grade.builder();

        grade.fromDate( gradeDtoRequest.fromDate() );
        grade.gradeName( gradeDtoRequest.gradeName() );
        grade.id( gradeDtoRequest.id() );
        grade.toDate( gradeDtoRequest.toDate() );

        return grade.build();
    }
}
