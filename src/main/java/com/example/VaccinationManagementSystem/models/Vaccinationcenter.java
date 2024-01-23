package com.example.VaccinationManagementSystem.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "Vaccination_center")
@Data
public class Vaccinationcenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String centerName;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private String address;
    private int dosecapacity;

    @OneToMany(mappedBy = "vaccinationcenter" , cascade = CascadeType.ALL)
    List<Doctor> doctorList;



}
