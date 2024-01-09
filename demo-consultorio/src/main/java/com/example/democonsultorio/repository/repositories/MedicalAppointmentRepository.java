package com.example.democonsultorio.repository.repositories;

import com.example.democonsultorio.model.entities.ConsultingRoomModel;
import com.example.democonsultorio.model.entities.MedicalAppointmentModel;
import com.example.democonsultorio.repository.Jpa.JpaMedicalAppointmentModelRepository;
import com.example.democonsultorio.repository.ports.PortMedicalAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class MedicalAppointmentRepository implements PortMedicalAppointment {

    @Autowired
    private JpaMedicalAppointmentModelRepository jpaMedicalAppointmentModelRepository;

    @Override
    public MedicalAppointmentModel saveOrUpdate(MedicalAppointmentModel object) {
        return jpaMedicalAppointmentModelRepository.save(object);
    }

    @Override
    public List<MedicalAppointmentModel> saveAll(List<MedicalAppointmentModel> object) {
        return jpaMedicalAppointmentModelRepository.saveAll(object);
    }

    @Override
    public Optional<MedicalAppointmentModel> findById(Long aLong) {
        return jpaMedicalAppointmentModelRepository.findById(aLong);
    }

    @Override
    public void safeDeleteById(Long aLong) {
        jpaMedicalAppointmentModelRepository.deleteById(aLong);
    }


    @Override
    public boolean existsByDoctor_IdAndAppointmentTime(Long id, LocalDateTime appointmentTime) {
        return false;
    }

    @Override
    public boolean existsByConsultingRoomAndAppointmentTime(ConsultingRoomModel consultingRoom, LocalDateTime appointmentTime) {
        return jpaMedicalAppointmentModelRepository.existsByConsultingRoomAndAppointmentTime(consultingRoom,appointmentTime);
    }

    @Override
    public List<MedicalAppointmentModel> findAll() {
        return jpaMedicalAppointmentModelRepository.findAll();
    }


}
