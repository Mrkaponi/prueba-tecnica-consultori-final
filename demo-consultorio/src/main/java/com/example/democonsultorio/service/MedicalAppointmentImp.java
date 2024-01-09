package com.example.democonsultorio.service;

import com.example.democonsultorio.model.entities.MedicalAppointmentModel;
import com.example.democonsultorio.repository.Jpa.JpaMedicalAppointmentModelRepository;
import com.example.democonsultorio.repository.repositories.MedicalAppointmentRepository;
import com.example.democonsultorio.service.ussecase.MedicalAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalAppointmentImp implements MedicalAppointmentService {


    @Autowired
    private MedicalAppointmentRepository jpaMedicalAppointmentModelRepository;

    @Override
    public MedicalAppointmentModel save(MedicalAppointmentModel model) {
        if (isDoctorAlreadyBooked(model) || isRoomAlreadyBooked(model)) {
            throw new IllegalStateException("El doctor o la sala de consulta ya están reservados para ese horario.");
        }


        return jpaMedicalAppointmentModelRepository.saveOrUpdate(model);
    }

    private boolean isDoctorAlreadyBooked(MedicalAppointmentModel model) {
        return jpaMedicalAppointmentModelRepository.existsByDoctor_IdAndAppointmentTime(model.getDoctor().getId(), model.getAppointmentTime());
    }

    private boolean isRoomAlreadyBooked(MedicalAppointmentModel model) {
        return jpaMedicalAppointmentModelRepository.existsByConsultingRoomAndAppointmentTime(model.getConsultingRoom(), model.getAppointmentTime());
    }



    public List<MedicalAppointmentModel> findAll(){

        return jpaMedicalAppointmentModelRepository.findAll();
    }
}
