package com.example.VaccinationManagementSystem.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity

@Table(name = "dose1")
public class Dose1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String doseId;

    @CreationTimestamp
    private Date VaccinationDate;


   @OneToOne
   @JoinColumn
   private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoseId() {
        return doseId;
    }

    public void setDoseId(String doseId) {
        this.doseId = doseId;
    }

    public Date getVaccinationDate() {
        return VaccinationDate;
    }

    public void setVaccinationDate(Date vaccinationDate) {
        VaccinationDate = vaccinationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
