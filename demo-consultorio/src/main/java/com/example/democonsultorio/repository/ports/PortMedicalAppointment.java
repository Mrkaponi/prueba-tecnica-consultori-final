package com.example.democonsultorio.repository.ports;

import com.example.democonsultorio.model.entities.ConsultingRoomModel;
import com.example.democonsultorio.model.entities.MedicalAppointmentModel;

import java.time.LocalDateTime;
import java.util.List;

public interface PortMedicalAppointment extends BaseCrudPort<MedicalAppointmentModel, Long> {

    boolean existsByDoctor_IdAndAppointmentTime(Long id, LocalDateTime appointmentTime);

    boolean existsByConsultingRoomAndAppointmentTime(ConsultingRoomModel consultingRoom, LocalDateTime appointmentTime);

    List<MedicalAppointmentModel>findAll();
}
