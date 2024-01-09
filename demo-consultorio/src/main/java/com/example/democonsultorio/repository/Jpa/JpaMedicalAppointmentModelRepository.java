package com.example.democonsultorio.repository.Jpa;

import com.example.democonsultorio.model.entities.ConsultingRoomModel;
import com.example.democonsultorio.model.entities.MedicalAppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface JpaMedicalAppointmentModelRepository extends JpaRepository<MedicalAppointmentModel, Long> {
    boolean existsByDoctor_IdAndAppointmentTime(Long id, LocalDateTime appointmentTime);

    boolean existsByConsultingRoomAndAppointmentTime(ConsultingRoomModel consultingRoom, LocalDateTime appointmentTime);



}