package com.gamesOfEarth.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gamesOfEarth.backend.entitybeans.Team;
@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
