package com.example.VaccinationManagementSystem.models;

import com.example.VaccinationManagementSystem.Enum.Gender;
import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_name")
    private String name;

    @Column(unique = true)
    private String emailId;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne(mappedBy = "user" , cascade = CascadeType.ALL)
    private Dose1 dose1;

    public Dose1 getDose1() {
        return dose1;
    }

    public void setDose1(Dose1 dose1) {
        this.dose1 = dose1;
    }

    private String mobileNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
