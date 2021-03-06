package com.alaythiaproduction.managementapp.repositories;

import com.alaythiaproduction.managementapp.models.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Long> {
}
