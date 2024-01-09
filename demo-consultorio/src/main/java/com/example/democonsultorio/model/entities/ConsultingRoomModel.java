package com.example.democonsultorio.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ConsultingRoomModel {

    @Id
    private Long id;
    private int roomNumber;
    private int floor;
    public ConsultingRoomModel() {

    }
}
