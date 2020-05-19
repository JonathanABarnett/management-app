package com.alaythiaproduction.managementapp.repositories;

import com.alaythiaproduction.managementapp.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Long> {
}
