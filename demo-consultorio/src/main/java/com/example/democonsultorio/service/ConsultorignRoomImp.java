package com.example.democonsultorio.service;

import com.example.democonsultorio.model.entities.ConsultingRoomModel;
import com.example.democonsultorio.model.entities.DoctorModel;
import com.example.democonsultorio.repository.repositories.ConsultoringRepository;
import com.example.democonsultorio.repository.repositories.DoctorRepository;
import com.example.democonsultorio.service.ussecase.ConsultoringRoomService;
import com.example.democonsultorio.service.ussecase.DoctorService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ConsultorignRoomImp implements ConsultoringRoomService {

    @Autowired
    private ConsultoringRepository consultoringRepository;

    public List<ConsultingRoomModel> findAll() {

        return (List<ConsultingRoomModel>) consultoringRepository.findAll();
    }


    @PostConstruct
    public void initializeConsultingRooms() {
        List<ConsultingRoomModel> consultingRooms = Arrays.asList(
                new ConsultingRoomModel(1L, 101, 1),
                new ConsultingRoomModel(2L, 102, 1),
                new ConsultingRoomModel(3L, 201, 2),
                new ConsultingRoomModel(4L, 202, 2),
                new ConsultingRoomModel(5L, 301, 3)
        );

        consultoringRepository.saveAll(consultingRooms);
    }
}
