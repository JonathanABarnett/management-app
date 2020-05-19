package com.alaythiaproduction.managementapp.repositories;

import com.alaythiaproduction.managementapp.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
