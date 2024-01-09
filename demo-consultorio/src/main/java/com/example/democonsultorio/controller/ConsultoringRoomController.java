package com.example.democonsultorio.controller;

import com.example.democonsultorio.model.entities.ConsultingRoomModel;
import com.example.democonsultorio.service.ussecase.ConsultoringRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consultoring-room")
public class ConsultoringRoomController {

    @Autowired
    private ConsultoringRoomService consultoringRoomService;

    @GetMapping
    public List<ConsultingRoomModel> findAll() {

        return consultoringRoomService.findAll();
    }

}
