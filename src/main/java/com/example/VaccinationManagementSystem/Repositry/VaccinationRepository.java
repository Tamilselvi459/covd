package com.example.VaccinationManagementSystem.Repositry;

import com.example.VaccinationManagementSystem.models.Vaccinationcenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinationRepository extends JpaRepository<Vaccinationcenter , Integer> {

}
