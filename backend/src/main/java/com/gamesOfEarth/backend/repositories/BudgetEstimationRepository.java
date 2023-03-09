package com.gamesOfEarth.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamesOfEarth.backend.entitybeans.BudgetEstimation;
@Repository
public interface BudgetEstimationRepository extends JpaRepository<BudgetEstimation, Integer> {

}
