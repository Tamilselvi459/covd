package com.example.VaccinationManagementSystem.models;

import com.example.VaccinationManagementSystem.Enum.Gender;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int docid;

    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(unique = true)
    private String emailId;

    @ManyToOne
    @JoinColumn
    Vaccinationcenter vaccinationcenter;

}
