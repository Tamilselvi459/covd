package com.example.VaccinationManagementSystem.Repositry;

import com.example.VaccinationManagementSystem.models.Dose1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoseRepository extends JpaRepository<Dose1, Integer> {


}
