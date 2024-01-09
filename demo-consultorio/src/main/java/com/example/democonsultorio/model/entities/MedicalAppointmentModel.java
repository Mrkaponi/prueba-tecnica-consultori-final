package com.example.democonsultorio.model.entities;

import com.example.democonsultorio.model.domains.ConsultingRoom;
import com.example.democonsultorio.model.domains.Doctor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table
@AllArgsConstructor
@Builder
@Getter
@Setter
public class MedicalAppointmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private ConsultingRoomModel consultingRoom;
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private DoctorModel doctor;
    private LocalDateTime appointmentTime;
    private Boolean activated;


    public MedicalAppointmentModel() {


    }
    @PostPersist
    private void activatedPostPersist(){
        activated=true;
    }

}
