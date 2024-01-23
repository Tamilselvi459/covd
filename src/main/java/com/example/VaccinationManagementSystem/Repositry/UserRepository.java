package com.example.VaccinationManagementSystem.Repositry;

import com.example.VaccinationManagementSystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
