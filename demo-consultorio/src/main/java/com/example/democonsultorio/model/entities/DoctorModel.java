package com.example.democonsultorio.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DOCTOR")
@AllArgsConstructor
@Builder
@Getter
@Setter
public class DoctorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName; // Apellido paterno
    private String middleName; // Apellido Materno
    private String specialty;  // Especialidad
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<MedicalAppointmentModel> medicalAppointmentModelList;

    public DoctorModel() {
        medicalAppointmentModelList = new ArrayList<>();

    }

    public DoctorModel(String firstName, String lastName, String middleName, String specialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.specialty = specialty;
        this.medicalAppointmentModelList = new ArrayList<>();
    }


}
