package com.example.democonsultorio.model.domains;

import com.example.democonsultorio.model.entities.MedicalAppointmentModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Doctor {

    private Long id;
    private String firstName;
    private String lastName; // Apellido paterno
    private String middleName; // Apellido Materno
    private String specialty;  // Especialidad
    private List<MedicalAppointment> medicalAppointmentModelList;

}
