package com.example.democonsultorio.repository.repositories;

import com.example.democonsultorio.model.entities.ConsultingRoomModel;
import com.example.democonsultorio.model.entities.DoctorModel;
import com.example.democonsultorio.repository.Jpa.ConsultingRoomModelRepository;
import com.example.democonsultorio.repository.Jpa.DoctorModelRepository;
import com.example.democonsultorio.repository.ports.PortConsultingRoom;
import com.example.democonsultorio.repository.ports.PortDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ConsultoringRepository implements PortConsultingRoom {

    @Autowired
    private ConsultingRoomModelRepository consultingRoomModelRepository;

    @Override
    public ConsultingRoomModel saveOrUpdate(ConsultingRoomModel object) {
        return consultingRoomModelRepository.save(object);
    }

    @Override
    public List<ConsultingRoomModel> saveAll(List<ConsultingRoomModel> object) {
        return consultingRoomModelRepository.saveAll(object);
    }

    @Override
    public Optional<ConsultingRoomModel> findById(Long aLong) {
        return PortConsultingRoom.super.findById(aLong);
    }

    @Override
    public void safeDeleteById(Long aLong) {
        PortConsultingRoom.super.safeDeleteById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        PortConsultingRoom.super.deleteById(aLong);
    }

    @Override
    public Iterable<ConsultingRoomModel> findAll() {
        return consultingRoomModelRepository.findAll();
    }
}
